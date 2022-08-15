package exer3;

public class Exer3 {

    public static void main(String[] args) {
        ContaCorrente contac = new ContaCorrente(215,"215-215","samuel",215);
        
        ContaPoupanca contap = new ContaPoupanca(215,"215-215","samuel",215215);
        
        contac.depositar(215.0);
        
        contac.sacar(215.0);
        
        contac.investir();
        
        contap.depositar(215.0);
        
        contap.sacar(215.0);
        
        contap.investir();
       
       
    }
    
}
