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
public class Pessoa implements Serializable{
    
    protected String nome;
    protected String morada;
    protected String bi;
    protected String dataDeNascimento;
    protected String contacto;
    protected String email;
    
    public Pessoa(String nome,String morada,String bi,String dataDeNascimento,String contacto, String email ){
         this.nome = nome;
         this.morada = morada;
         this.bi = bi;
         this.dataDeNascimento = dataDeNascimento;
         this.contacto = contacto;
         this.email = email;
    }
    
    public Pessoa(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
