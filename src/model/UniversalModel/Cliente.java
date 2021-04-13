/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.UniversalModel;

import java.io.Serializable;

/**
 *
 * @author Jaime Rungo
 */
public class Cliente extends Pessoa implements Serializable{
    
    
    protected Carro veiculo;
    protected double valorPago;
    protected double divida;
    protected String tipo;
    
    public Cliente(String nome,String morada,String bi,String dataDeNascimento,String contacto, String email,Carro veiculo ,double valorPago,double Divida,String tipo){
        
        super(nome, morada, bi, dataDeNascimento, contacto, email);
        this.veiculo = veiculo;
        this.divida = divida;
        this.valorPago = valorPago;
        this.tipo = tipo;
        
    }
    
    public Cliente(){
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    public Carro getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Carro veiculo) {
        this.veiculo = veiculo;
    }
    
    

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }
    
    
    
}
