package br.com.sistemataxonomia.rdn;

import br.com.sistemataxonomia.modelo.SeresVivos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class serVivoRdn {
    
    public int inserirSerVivo(SeresVivos entidade) {
                try {

            int linhasAfetadas = 0;

            StringBuilder str = new StringBuilder();

            str.append("INSERT INTO dbo.seresVivos\n" +
                        "(reino\n" +
                        ",filo\n" +
                        ",classe\n" +
                        ",ordem\n" +
                        ",familia\n" +
                        ",genero\n" +
                        ",especie\n" +
                        ",nomeComum)\n" +
                        " VALUES\n" +
                        "(\n" +
                        "?\n" +
                        ",?\n" +
                        ",?\n" +
                        ",?\n" +
                        ",?\n" +
                        ",?\n" +
                        ",?\n" +
                        ",?\n" +
                        ")");
           
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString(), Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, entidade.getReino());
            stmt.setString(2, entidade.getFilo());
            stmt.setString(3, entidade.getClasse());
            stmt.setString(4, entidade.getOrdem());
            stmt.setString(5, entidade.getFamilia());
            stmt.setString(6, entidade.getGenero());
            stmt.setString(7, entidade.getEspecie());
            stmt.setString(8, entidade.getNomeComum());
            
            linhasAfetadas = stmt.executeUpdate();      
                                          

            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (SQLException ex) {
            System.out.println("ERRO: " + ex.getMessage());
            return 0;
        }
    }
    
    public List<SeresVivos> obterSeresVivos() {
        try {

            List<SeresVivos> lstEntidade = new ArrayList<SeresVivos>();

            StringBuilder str = new StringBuilder();

                        str.append("SELECT \n" +
                       "codSeresVivos\n" +
                       ",reino\n" +
                       ",filo\n" +
                       ",classe\n" +
                       ",ordem\n" +
                       ",familia\n" +
                       ",genero\n" +
                       ",especie\n" +
                       ",nomeComum\n" +
                       "FROM dbo.seresVivos");
                        
            Connection conn = new ConnectionFactory().getConnection();

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(str.toString());
             
            while (rs.next()) {                
                SeresVivos entidade = new SeresVivos(rs.getString("codSeresVivos"),
                        rs.getString("reino"),
                        rs.getString("filo"),
                        rs.getString("classe"),
                        rs.getString("ordem"),
                        rs.getString("familia"),
                        rs.getString("genero"),
                        rs.getString("especie"),
                        rs.getString("nomeComum"));

                lstEntidade.add(entidade);

            }
            return lstEntidade;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }
    
    public SeresVivos obterPorCod(String codSeresVivos) {
        try {

            SeresVivos ret = null;

            StringBuilder str = new StringBuilder();

                         str.append("SELECT \n" +
                       "codSeresVivos\n" +
                       ",reino\n" +
                       ",filo\n" +
                       ",classe\n" +
                       ",ordem\n" +
                       ",familia\n" +
                       ",genero\n" +
                       ",especie\n" +
                       ",nomeComum\n" +
                       "FROM dbo.seresVivos\n" +
                       "WHERE codSeresVivos = ?");

            Connection conn = new ConnectionFactory().getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());
          
            stmt.setString(1, codSeresVivos);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                
                ret = new SeresVivos(rs.getString("codSeresVivos"),
                        rs.getString("reino"),
                        rs.getString("filo"),
                        rs.getString("classe"),
                        rs.getString("ordem"),
                        rs.getString("familia"),
                        rs.getString("genero"),
                        rs.getString("especie"),
                        rs.getString("nomeComum"));

                

            }
            return ret;

        } catch (SQLException ex) {

            System.out.println("ERRO:" + ex.getMessage());
            return null;
        }
    }
    
    public int deletarSerVivo(String codSeresVivos) {
        try {

            int linhasAfetadas = 0;

            String str = "DELETE FROM seresVivos WHERE codSeresVivos = ?";
            
            ConnectionFactory factory = new ConnectionFactory();
            
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());
            stmt.setString(1, codSeresVivos);

            linhasAfetadas = stmt.executeUpdate();

            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            return 0;
        }

    }
    
    public int alterarSerVivo(SeresVivos entidade) {

        try {
            int linhasAfetadas = 0;
            StringBuilder str = new StringBuilder();

            str.append("update seresVivos\n" +
                        "set  \n" +
                        "reino = ?\n" +
                        ",filo = ?\n" +
                        ",classe = ?\n" +
                        ",ordem = ?\n" +
                        ",familia = ?\n" +
                        ",genero = ?\n" +
                        ",especie = ?\n" +
                        ",nomeComum = ?\n" +
                        "where codSeresVivos = ?");
            
            ConnectionFactory factory = new ConnectionFactory();
            Connection conn = factory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(str.toString());

            stmt.setString(1, entidade.getReino());
            stmt.setString(2, entidade.getFilo());
            stmt.setString(3, entidade.getClasse());
            stmt.setString(4, entidade.getOrdem());
            stmt.setString(5, entidade.getFamilia());
            stmt.setString(6, entidade.getGenero());
            stmt.setString(7, entidade.getEspecie());
            stmt.setString(8, entidade.getNomeComum());           
            stmt.setString(9, entidade.getCodSeresVivos());

            linhasAfetadas = stmt.executeUpdate();

            stmt.close();
            conn.close();

            return linhasAfetadas;

        } catch (SQLException ex) {
            System.out.println("ERRO:" + ex.getMessage());
            return 0;
        }

    }
    
}
