/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.UniversalModel;

import com.sun.xml.internal.fastinfoset.EncodingConstants;
import java.io.Serializable;


/**
 *
 * @author Jaime Rungo
 */
public class Carro extends Veiculo implements Serializable{
    
    private String nChassi;
    private String tipo;
    
    
    public Carro(int id,String marca, String modelo, String matricula,int ano,String cor, String dataEntrada, String dataSaida
            ,String horaEntrada, String horaSaida,String proprietario,String nChassi,String tipo,String obs,String contacto,String endereco,int dias,int meses,int minutos,int horas){
      super(id, marca, modelo, matricula, ano, cor, dataEntrada, dataSaida, horaEntrada, horaSaida, proprietario, obs, contacto, endereco, dias, meses, minutos,horas);
      
      this.nChassi = nChassi;
      this.tipo = tipo;
    }
    
    public Carro(){
        
    }

    public String getnChassi() {
        return nChassi;
    }

    public void setnChassi(String nChassi) {
        this.nChassi = nChassi;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Carro{" + "nChassi=" + nChassi + ", tipo=" + tipo + '}';
    }

    
    
   
    
    
   
    
    
    
    
}
