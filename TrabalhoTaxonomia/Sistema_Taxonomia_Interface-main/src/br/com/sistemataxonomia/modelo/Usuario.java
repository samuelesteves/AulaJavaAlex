
package br.com.sistemataxonomia.modelo;
import java.util.Scanner;

public class Usuario {
    Scanner scan = new Scanner(System.in);
    
    private String codUsuario;
    private String nome;
    private String cpf;
    private String area;

    public Usuario() {
        
    }
    
    public Usuario(String CodUsuario,String nomeUsu,String cpfUsu,String areaUsu){
        this.codUsuario = CodUsuario;
        this.nome = nomeUsu;
        this.cpf = cpfUsu;
        this.area = areaUsu;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public void CadastrarUsuario(){
        System.out.println("Nome: ");
        this.nome = scan.nextLine();
        
        System.out.println("CPF: ");
        this.cpf = scan.nextLine();
        
        System.out.println("Área: ");
        this.area = scan.nextLine();
    }
    
    public void ImprimirUsuario(){
        System.out.println("Nome: "+this.nome);
        
        System.out.println("CPF: "+this.cpf);
        
        System.out.println("Área: "+this.area);
    }
    
    
}
