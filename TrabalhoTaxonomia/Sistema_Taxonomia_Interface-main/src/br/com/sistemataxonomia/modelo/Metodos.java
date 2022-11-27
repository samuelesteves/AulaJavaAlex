
package br.com.sistemataxonomia.modelo;

//import java.util.HashSet;
import java.util.Scanner;
//import java.util.Set;


public class Metodos {
    
    //Menu
    
    Scanner scan = new Scanner(System.in);
    Laboratorio lab = new Laboratorio();
    Usuario usu = new Usuario();
    SeresVivos seres = new SeresVivos();
    
    public void menu() {
    
        System.out.println("Sitema Taxonomia");
        System.out.println("-------------");
        System.out.println("1 - Laboratório");
        System.out.println("-------------");
        System.out.println("2 - Usuário");
        System.out.println("-------------");
        System.out.println("3 - Consulta e Cadastro Taxonômico");
        System.out.println("-------------");
        System.out.println("Digite a opção desejada");
        
        int escolha = scan.nextInt();
        String string1 = scan.nextLine();
        
        if (escolha == 1) {
            this.escolhalab();
        } else if (escolha == 2) {
            this.escolhausu();
        }else if (escolha == 3){
            this.EscolhaSeresVivos();
        } else{
            System.out.println("Escolha uma opção certa");
        }
}
    
    //Escolhas Menu
    
     public void escolhalab() {
            System.out.println("-------------");
            System.out.println("1 - Imprimir Laboratório");
            System.out.println("-------------");
            System.out.println("2 - Cadastrar Laboratório");
            System.out.println("-------------");
            System.out.println("3 - Voltar");
            System.out.println("Digite a opção desejada");
            int escolha = scan.nextInt();
            String string1 = scan.nextLine();
            
            if (escolha == 1) {
                this.imprimirLaboratorio();
            } else if (escolha == 2) {
                this.cadastrarLaboratorio();
            }  else if (escolha == 3) {
                System.out.println("Menu");
                this.menu();
            } else {
                System.out.println("Escolha uma opção certa");
                this.escolhalab();
            } 
        }
     
     public void escolhausu() {
         System.out.println("-------------");
         System.out.println("1 - Imprimir Usuário");
         System.out.println("-------------");
         System.out.println("2 - Cadastrar Usuário");
         System.out.println("-------------");
         System.out.println("3 - Voltar");
         int escolha = scan.nextInt();
         String string1 = scan.nextLine();
         
         if (escolha == 1) {
             this.ImprimirUsuario();
         } else if (escolha == 2) {
             this.CadastrarUsuario();
         } else if (escolha == 3) {
             System.out.println("Menu");
             this.menu();
         } else {
             System.out.println("Escolha uma opção certa");
             this.escolhausu();
         }
    }
     public void EscolhaSeresVivos(){
         System.out.println("-------------");
         System.out.println("1 - Cadastrar Seres Vivos");
         System.out.println("-------------");
         System.out.println("2 - Consultar Seres Vivos");
         int escolhaSeresVivos = scan.nextInt();
         String string1 = scan.nextLine();
         
         if (escolhaSeresVivos == 1){
                this.cadastrarSeresVivos();       
         }else if(escolhaSeresVivos == 2){
                this.imprimirSeresVivos();
         }
         
     }
     //Métodos Seres Vivos
     public void cadastrarSeresVivos(){
        System.out.println("1 - Cadastrar Seres Vivos");
        System.out.println("-------------------------");
        
        System.out.println("Reino: ");
        seres.setReino(scan.nextLine());
        
        System.out.println("Filo: ");
        seres.setFilo(scan.nextLine());
        
        System.out.println("Classe: ");
        seres.setClasse(scan.nextLine());
        
        System.out.println("Ordem: ");
        seres.setOrdem(scan.nextLine());
        
        System.out.println("Família: ");
        seres.setFamilia(scan.nextLine());
        
        System.out.println("Gênero: ");
        seres.setGenero(scan.nextLine());
        
        System.out.println("Espécie: ");
        seres.setEspecie(scan.nextLine());
        
        System.out.println("Nome comum: ");
        seres.setNomeComum(scan.nextLine());
        
        System.out.println("Deseja voltar ao menu?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int escolhamenu = scan.nextInt();
        String string1 = scan.nextLine();
        if (escolhamenu == 1) {
            this.menu();
        }
     }
     
     public void imprimirSeresVivos(){
        System.out.println("Reino: "+seres.getReino());
        System.out.println("Filo: "+seres.getFilo());
        System.out.println("Classe: "+seres.getClasse());
        System.out.println("Ordem: "+seres.getOrdem());
        System.out.println("Família: "+seres.getFamilia());
        System.out.println("Gênero: "+seres.getGenero());
        System.out.println("Espécie: "+seres.getEspecie());
        System.out.println("Nome comum: "+seres.getNomeComum());
        
        System.out.println("Deseja voltar ao menu?");
           System.out.println("1 - Sim");
           System.out.println("2 - Não");
           int escolhamenu = scan.nextInt();
           String string1 = scan.nextLine();
           if (escolhamenu == 1) {
               this.menu();
           }
     }
     
     //Métodos Laboratório
     
      public void cadastrarLaboratorio() {
          
          System.out.println("Cadastro de Laboratório");
          System.out.println("-------------");
          
          System.out.println("Nome: ");
          lab.setNome(scan.nextLine());
          
          System.out.println("Cnpj: ");
          lab.setCnpj(scan.nextLine());

          System.out.println("Área de Pesquisa: ");
          lab.setAreaDePesquisa(scan.nextLine());


          System.out.println("Telefone: ");
          lab.setTelefone(scan.nextLine()); 

          System.out.println("Deseja voltar ao menu?");
          System.out.println("1 - Sim");
          System.out.println("2 - Não");
        int escolhamenu = scan.nextInt();
        String string1 = scan.nextLine();
        if (escolhamenu == 1) {
            this.menu();
        }

    }
       public void imprimirLaboratorio() {
        System.out.println("Nome: " + lab.getNome());
        System.out.println("-------------");
        System.out.println("Cnpj: " + lab.getCnpj());
        System.out.println("-------------");
        System.out.println("Área de Pesquisa: " + lab.getAreaDePesquisa());
        System.out.println("-------------");
        System.out.println("Telefone: " + lab.getTelefone());
        
        
           System.out.println("Deseja voltar ao menu?");
           System.out.println("1 - Sim");
           System.out.println("2 - Não");
           int escolhamenu = scan.nextInt();
           String string1 = scan.nextLine();
           if (escolhamenu == 1) {
               this.menu();
           }
    }
       
       //Métodos Usuário
       
       
        public void CadastrarUsuario(){
        System.out.println("Nome: ");
        usu.setNome (scan.nextLine());
        
        System.out.println("CPF: ");
        usu.setCpf (scan.nextLine());
        
        System.out.println("Área: ");
        usu.setArea (scan.nextLine());
        
        System.out.println("Deseja voltar ao menu?");
           System.out.println("1 - Sim");
           System.out.println("2 - Não");
           int escolhamenu = scan.nextInt();
           String string1 = scan.nextLine();
           if (escolhamenu == 1) {
               this.menu();
           }
    }
        public void ImprimirUsuario(){
        System.out.println("Nome: "+usu.getNome());
        
        System.out.println("CPF: "+usu.getCpf());
        
        System.out.println("Área: "+usu.getArea());
        
        System.out.println("Deseja voltar ao menu?");
           System.out.println("1 - Sim");
           System.out.println("2 - Não");
           int escolhamenu = scan.nextInt();
           String string1 = scan.nextLine();
           if (escolhamenu == 1) {
               this.menu();
           }
    }
}

        //Métodos Seres Vivos
