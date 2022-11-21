/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.superreges.modelo;

import java.util.Calendar;

/**
 *
 * @author USER
 */
public class Funcionario extends Pessoa {

      
    
    private String numeroCartaoPonto;
    
    
  
    public Funcionario(int id, String numeroCartaoPonto, String nome, Calendar dataNascimento, String documento, String telefone, String email, Endereco endereco) {
        super(id, nome, dataNascimento, documento, telefone, email, endereco);
        this.numeroCartaoPonto = numeroCartaoPonto;
    }

    public String getNumeroCartaoPonto() {
        return numeroCartaoPonto;
    }

    public void setNumeroCartaoPonto(String numeroCartaoPonto) {
        this.numeroCartaoPonto = numeroCartaoPonto;
    }

    /*private String nome;
    private Endereco endereco;   
    private String cpf;
    private String telefone;
    private String email;*/

 /* public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNumeroCartaoPonto() {
        return numeroCartaoPonto;
    }

    public void setNumeroCartaoPonto(String numeroCartaoPonto) {
        this.numeroCartaoPonto = numeroCartaoPonto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    }*/
}
