package br.com.sistemataxonomia.modelo;
import java.util.Scanner;

public class SeresVivos {
    Scanner scan = new Scanner(System.in);   
    
    private String codSeresVivos;
    private String reino;
    private String filo;
    private String classe;
    private String ordem;
    private String familia;
    private String genero;
    private String especie;
    private String nomeComum;
    
    public SeresVivos() {
    }
    
    public SeresVivos(String codSeresVivos, String reino, String filo, String classe, String ordem, String familia, String genero, String especie, String nomeComum) {
        this.codSeresVivos = codSeresVivos;
        this.reino = reino;
        this.filo = filo;
        this.classe = classe;
        this.ordem = ordem;
        this.familia = familia;
        this.genero = genero;
        this.especie = especie;
        this.nomeComum = nomeComum;
    }

    public String getCodSeresVivos() {
        return codSeresVivos;
    }

    public void setCodSeresVivos(String codSeresVivos) {
        this.codSeresVivos = codSeresVivos;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getFilo() {
        return filo;
    }

    public void setFilo(String filo) {
        this.filo = filo;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNomeComum() {
        return nomeComum;
    }

    public void setNomeComum(String nomeComum) {
        this.nomeComum = nomeComum;
    }
    
    public void CadastrarSeresVivos()
    {
        System.out.println("Reino: ");
        this.reino = scan.nextLine();
        
        System.out.println("Filo: ");
        this.filo = scan.nextLine();
        
        System.out.println("Classe: ");
        this.classe = scan.nextLine();
        
        System.out.println("Ordem: ");
        this.ordem = scan.nextLine();
        
        System.out.println("Família: ");
        this.familia = scan.nextLine();
        
        System.out.println("Gênero: ");
        this.genero = scan.nextLine();
        
        System.out.println("Espécie: ");
        this.especie = scan.nextLine();
        
        System.out.println("Nome comum: ");
        this.nomeComum = scan.nextLine();
    }
    
    public void Imprimir(){
        System.out.println("Reino: "+this.reino);
        System.out.println("Filo: "+this.filo);
        System.out.println("Classe: "+this.classe);
        System.out.println("Ordem: "+this.ordem);
        System.out.println("Família: "+this.familia);
        System.out.println("Gênero: "+this.genero);
        System.out.println("Espécie: "+this.especie);
        System.out.println("Nome comum: "+this.nomeComum);
        
        
        
        
        
    }
    
            
}
