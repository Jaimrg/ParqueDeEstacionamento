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
public class Vaga {
    
    protected int idVaga;
    protected String setor;
    
    public Vaga(int idVaga,String setor){
        this.idVaga = idVaga;
        this.setor = setor;
                
    }
    
    public Vaga(){
        
    }

    public int getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(int idVaga) {
        this.idVaga = idVaga;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
     
    
    
}
