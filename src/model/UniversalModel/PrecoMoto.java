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

public class PrecoMoto implements Serializable {
    
    private int id;
    private double motoMinC;
    private double motoMinE;
    private double moto15;
    private double moto30;
    private double moto45;
    private double moto59;
    private double motoPernoite;
    private double motoDiario;
    private double motoQuinzena;
    private double motoMensal;
    
    public PrecoMoto(double motoMinC,double motoMinE,double moto15,double moto30,double moto45,double moto59,double motoPernoite, double motoDiario,double motoQuinzena,double motoMensal,int id){
        
        
             this.motoMinC = motoMinC;
             this.motoMinE = motoMinE;
             this.moto15 = moto15;
             this.moto30 = moto30;
             this.moto45 = moto45;
             this.moto59 = moto59;
             this.motoPernoite = motoPernoite;
             this.motoDiario = motoDiario;
             this.motoQuinzena = motoQuinzena;
             this.motoMensal = motoMensal;
             this.id = id;
    }
    
    public PrecoMoto(){
        
    }

    public double getMotoMinC() {
        return motoMinC;
    }

    public void setMotoMinC(double motoMinC) {
        this.motoMinC = motoMinC;
    }

    public double getMotoMinE() {
        return motoMinE;
    }

    public void setMotoMinE(double motoMinE) {
        this.motoMinE = motoMinE;
    }

    public double getMoto15() {
        return moto15;
    }

    public void setMoto15(double moto15) {
        this.moto15 = moto15;
    }

    public double getMoto30() {
        return moto30;
    }

    public void setMoto30(double moto30) {
        this.moto30 = moto30;
    }

    public double getMoto45() {
        return moto45;
    }

    public void setMoto45(double moto45) {
        this.moto45 = moto45;
    }

    public double getMoto59() {
        return moto59;
    }

    public void setMoto59(double moto59) {
        this.moto59 = moto59;
    }

    public double getMotoPernoite() {
        return motoPernoite;
    }

    public void setMotoPernoite(double motoPernoite) {
        this.motoPernoite = motoPernoite;
    }

    public double getMotoDiario() {
        return motoDiario;
    }

    public void setMotoDiario(double motoDiario) {
        this.motoDiario = motoDiario;
    }

    public double getMotoQuinzena() {
        return motoQuinzena;
    }

    public void setMotoQuinzena(double motoQuinzena) {
        this.motoQuinzena = motoQuinzena;
    }

    public double getMotoMensal() {
        return motoMensal;
    }

    public void setMotoMensal(double motoMensal) {
        this.motoMensal = motoMensal;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PrecoMoto{" + "motoMinC=" + motoMinC + ", motoMinE=" + motoMinE + ", moto15=" + moto15 + ", moto30=" + moto30 + ", moto45=" + moto45 + ", moto59=" + moto59 + ", motoPernoite=" + motoPernoite + ", motoDiario=" + motoDiario + ", motoQuinzena=" + motoQuinzena + ", motoMensal=" + motoMensal + '}';
    }
    
    
        
    
}
