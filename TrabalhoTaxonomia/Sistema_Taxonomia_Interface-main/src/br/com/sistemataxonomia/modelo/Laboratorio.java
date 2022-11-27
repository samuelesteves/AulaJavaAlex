
package br.com.sistemataxonomia.modelo;
import java.util.Scanner;


public class Laboratorio {
    Scanner scan = new Scanner(System.in);

    
   
    
    private String cod;
    private String nome;
    private Endereco endereco;
    private String cnpj;
    private String areaDePesquisa;
    private String telefone;
    
    public Laboratorio() {
        
    }
    
     public Laboratorio(String cod, String nome, Endereco endereco, String cnpj, String areaDePesquisa, String telefone) {
        this.cod = cod;
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.areaDePesquisa = areaDePesquisa;
        this.telefone = telefone;
    }
    
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAreaDePesquisa() {
        return areaDePesquisa;
    }

    public void setAreaDePesquisa(String areaDePesquisa) {
        this.areaDePesquisa = areaDePesquisa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
 
}
