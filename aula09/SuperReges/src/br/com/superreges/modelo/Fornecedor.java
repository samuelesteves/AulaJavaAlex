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
public class Fornecedor extends Pessoa {
    
    
    private String representacao; //marcas que o fornecedor representa    
    
    
     public Fornecedor(int id, String nome, Calendar dataNascimento, String documento, 
            String telefone, String email, Endereco endereco, String representacao)
    {
       
        super(id, nome, dataNascimento, documento, telefone, email, endereco);
        this.representacao = representacao;
              
        
    }
    
    
    
     public String getRepresentacao() {
        return representacao;
    }

    public void setRepresentacao(String representacao) {
        this.representacao = representacao;
    }

   /* private String nome;
    private String cnpj;
    
    private String email;
    private String telefone;    
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRepresentacao() {
        return representacao;
    }

    public void setRepresentacao(String representacao) {
        this.representacao = representacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }*/
    
  
}
