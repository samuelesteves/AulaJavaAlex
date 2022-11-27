
package br.com.sistemataxonomia.modelo;


public class Endereco {

    public Endereco(String endereco, String estado, String numero, String bairro, String cep) {
        this.endereco = endereco;
        this.estado = estado;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
    }
    
    private String endereco;
    private String estado;
    private String numero;
    private String bairro;
    private String cep;
    
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
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
    
    
    
    
}
