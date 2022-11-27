/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.superreges.modelo;

/**
 *
 * @author NB004
 */
public class Endereco {

    private int id;
    private String logradouro;
    private String cidade;
    private String numero;
    private String uf;
    private String bairro;
    private String cep;
    private int idPessoa;

    public Endereco(int id, String logradouro, String cidade, String numero, String uf,
            String bairro, String cep, int idPessoa) {
        this.id = id;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.numero = numero;
        this.uf = uf;
        this.bairro = bairro;
        this.cep = cep;
        this.idPessoa = idPessoa;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
}
