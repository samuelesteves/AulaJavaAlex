/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.superreges.rdn;

import br.com.superreges.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Calendar;

/**
 *
 * @author alex.lopes
 */
public class ClienteRdn {

    public int inserirCliente(Cliente cli) {

        try {

            int linhasAfetadas = 0;

            StringBuilder str = new StringBuilder();

            str.append("INSERT INTO pessoa(                 ");
            str.append("            nome                    ");
            str.append("           ,dataNascimento          ");
            str.append("            ,documento              ");
            str.append("            ,telefone               ");
            str.append("            ,email                  ");
            str.append("            ,tipo)                  ");
            str.append("      VALUES(                       ");
            str.append("             ?                      ");
            str.append("            ,?                      ");
            str.append("            ,?                      ");
            str.append("            ,?                      ");
            str.append("            ,?                      ");
            str.append("            ,?                      ");
            str.append("         )                          ");

            //  Connection conn = new ConnectionFactory().getConnection();
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());

            stmt.setString(1, cli.getNome());
            stmt.setDate(2, new java.sql.Date(cli.getDataNascimento().getTimeInMillis()));
            stmt.setString(3, cli.getDocumento());
            stmt.setString(4, cli.getTelefone());
            stmt.setString(5, cli.getEmail());
            stmt.setInt(6, 1);

            linhasAfetadas = stmt.executeUpdate();

            //LIBERAR OS RECURSOS
            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (SQLException ex) {
            System.out.println("ERRO: " + ex.getMessage());
            return 0;
        }
    }

    public int alterarCliente(Cliente cli) {

        try {
            int linhasAfetadas = 0;
            StringBuilder str = new StringBuilder();

            str.append("UPDATE PESSOA SET NOME 			 = ?        ");
            str.append("                  ,DATANASCIMENTO        = ?        ");
            str.append("                  ,DOCUMENTO		 = ?        ");
            str.append("                 ,TELEFONE               = ?        ");
            str.append("                 ,EMAIL 		 = ?        ");
            str.append("WHERE	ID                         = ?        ");

            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());

            stmt.setString(1, cli.getNome());
            stmt.setDate(2, new java.sql.Date(cli.getDataNascimento().getTimeInMillis()));
            stmt.setString(3, cli.getDocumento());
            stmt.setString(4, cli.getTelefone());
            stmt.setString(5, cli.getEmail());
            stmt.setInt(6, cli.getId());

            linhasAfetadas = stmt.executeUpdate();

            //LIBERAR OS RECURSOS
            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (SQLException ex) {
            System.out.println("ERRO:" + ex.getMessage());
            return 0;
        }

    }

    public int deletarCliente(int idCliente) {
        try {

            int linhasAfetadas = 0;

            String str = "DELETE FROM PESSOA WHERE ID = ?";
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());
            stmt.setInt(1, idCliente);

            linhasAfetadas = stmt.executeUpdate();

            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            return 0;
        }

    }

    public List<Cliente> obterTodos() {
        try {

            List<Cliente> lstCli = new ArrayList<Cliente>();

            StringBuilder str = new StringBuilder();

            str.append("SELECT  ID               ");
            str.append("     ,NOME               ");
            str.append("     ,DATANASCIMENTO     ");
            str.append("     ,DOCUMENTO          ");
            str.append("     ,TELEFONE           ");
            str.append("     ,EMAIL              ");
            str.append("FROM PESSOA              ");
            str.append(" WHERE TIPO = 1           ");

            //ABRE A CONEXÃO
            Connection conn = new ConnectionFactory().getConnection();

            //CRIAR NOSSO STATEMENT            
            Statement stmt = conn.createStatement();

            //RECEBER OS DADOS NO RESULTSET
            ResultSet rs = stmt.executeQuery(str.toString());

            while (rs.next()) {

                //CONVERTER SQL DATE TO CALENDAR
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(rs.getDate("DATANASCIMENTO"));

                /*              
                public Cliente(int id, String nome, Calendar dataNascimento, String documento, 
                String telefone, String email, Endereco endereco, String cartaoFidelidade)
                 */
                Cliente cli = new Cliente(rs.getInt("ID"),
                        rs.getString("NOME"),
                        calendar,
                        rs.getString("DOCUMENTO"),
                        rs.getString("TELEFONE"),
                        rs.getString("EMAIL"),
                        null
                        );

                lstCli.add(cli);

            }
            return lstCli;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }
    
    public Cliente obterPorId(int id) {
        try {

            Cliente ret = null;

            StringBuilder str = new StringBuilder();

            str.append("SELECT  ID               ");
            str.append("     ,NOME               ");
            str.append("     ,DATANASCIMENTO     ");
            str.append("     ,DOCUMENTO          ");
            str.append("     ,TELEFONE           ");
            str.append("     ,EMAIL              ");
            str.append("FROM PESSOA              ");
            str.append(" WHERE TIPO = 1          ");
            str.append(" AND id = ?        ");

            //ABRE A CONEXÃO
            Connection conn = new ConnectionFactory().getConnection();

            //CRIAR NOSSO STATEMENT            
            PreparedStatement stmt = conn.prepareStatement(str.toString());

            //RECEBER OS DADOS NO RESULTSET
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                //CONVERTER SQL DATE TO CALENDAR
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(rs.getDate("DATANASCIMENTO"));

                /*              
                public Cliente(int id, String nome, Calendar dataNascimento, String documento, 
                String telefone, String email, Endereco endereco, String cartaoFidelidade)
                 */
                ret = new Cliente(rs.getInt("ID"),
                        rs.getString("NOME"),
                        calendar,
                        rs.getString("DOCUMENTO"),
                        rs.getString("TELEFONE"),
                        rs.getString("EMAIL"),
                        null
                        );
                

            }
            return ret;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }

}
