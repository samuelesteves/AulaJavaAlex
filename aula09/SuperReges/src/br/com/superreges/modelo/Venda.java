/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.superreges.modelo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author NB004
 */
public class Venda {
 
    private Calendar dataVenda;
    private int numeroVenda;
    private int numeroNota;
    private Cliente cliente;                           
     
    //PERMITE RECEBER MAIS DE UM ITEM
     private ArrayList<ItemVenda> itens;
      

    private double valorTotal;
    private Funcionario funcionario;
    
    public Calendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Calendar dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getNumeroVenda() {
        return numeroVenda;
    }

    public void setNumeroVenda(int numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }    
   

    public double getValorTotal() {
        return valorTotal;
    }

    /*public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }*/

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
     
    
    public void imprimir(){
    
        System.out.println("Venda: " + this.numeroVenda);        
        System.out.println("Cliente:");
        System.out.println(this.getCliente().getNome());
        System.out.println(this.getCliente().getDocumento());
        
        System.out.println("----------Itens--------");
        
       /* for (int i = 0; i < 10; i++) {
            
        }
        */
        //para cada item do array
        for(ItemVenda item : this.itens)
        {
            System.out.println(item.getProduto().getCodigoDeBarra());
            System.out.println(item.getProduto().getDescricao());
            System.out.println(item.getProduto().getMarca());
            System.out.println(item.getValorTotal());
        }
        
    
    }
    
    
}
