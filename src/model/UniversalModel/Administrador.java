/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.UniversalModel;

/**
 *
 * @author Jaime Rungo
 */
public class Administrador extends Funcionario {
    
    public Administrador(String nome,String morada,String bi,String dataDeNascimento,String contacto, String email,int id,double salario,int numeroReg){
      super(nome, morada, bi, dataDeNascimento, contacto, email, id, salario, numeroReg);
    }
    
    public Administrador(){
        
    }
    
    
}
