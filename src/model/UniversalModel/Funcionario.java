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
public class Funcionario extends Pessoa implements Serializable {
    
    protected int id;
    protected double salario;
    protected int  numeroReg;
    
    public Funcionario(String nome,String morada,String bi,String dataDeNascimento,String contacto, String email,int id,double salario,int numeroReg){
        
        super( nome, morada, bi,dataDeNascimento,contacto,email);
        this.id= id;
        this.salario = salario;
        this.numeroReg = numeroReg;
        
    }
    public Funcionario(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumeroReg() {
        return numeroReg;
    }

    public void setNumeroReg(int numeroReg) {
        this.numeroReg = numeroReg;
    }
    
    
    
}
