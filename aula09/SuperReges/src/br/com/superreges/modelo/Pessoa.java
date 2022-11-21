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
public abstract class Pessoa {

    protected int id;
    protected String nome;
    protected Calendar dataNascimento;
    //private String cpf;
    protected String documento;
    
    protected String telefone;
    protected String email;
    protected Endereco endereco;
    
        
    public Pessoa(int id, String nome, Calendar dataNascimento, String documento, 
            String telefone, String email, Endereco endereco)
    {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.documento = documento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        
    }
    
    
     public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
   
 
    
}
