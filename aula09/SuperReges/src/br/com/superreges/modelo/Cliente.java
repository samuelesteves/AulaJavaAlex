/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.superreges.modelo;

import java.util.Calendar;

/**
 *
 * @author NB004
 */
public class Cliente extends Pessoa {

    
    private String cartaoFidelidade;
    
    
    
    public Cliente(int id, String nome, Calendar dataNascimento, String documento, 
            String telefone, String email, Endereco endereco)
    {
       
        super(id, nome, dataNascimento, documento, telefone, email, endereco);
              
        
    }
    
    
    
    
   /* private String nome;
    private Calendar dataNascimento;
    private String cpf;
    private String telefone;
    private String email;
    private Endereco endereco;*/
    
    
    //analisar depois...

    /*public void setNome(String value) {
        nome = value;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDataNascimento(Calendar value) {
        this.dataNascimento = value;
    }

    public Calendar getDataNascimento() {
        return this.dataNascimento;
    }

    public void setCpf(String value) {
        this.cpf = value;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setTelefone(String value) {
        this.telefone = value;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEndereco(Endereco value) {
        this.endereco = value;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }*/

    public String getCartaoFidelidade() {
        return cartaoFidelidade;
    }

    public void setCartaoFidelidade(String cartaoFidelidade) {
        this.cartaoFidelidade = cartaoFidelidade;
    }
}
