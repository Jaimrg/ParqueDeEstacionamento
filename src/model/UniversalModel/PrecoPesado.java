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
public class PrecoPesado implements Serializable{
    
    private int id;
    private double pesMinC;
    private double pesMinE;
    private double pes15;
    private double pes30;
    private double pes45;
    private double pes59;
    private double pesPernoite;
    private double pesDiario;
    private double pesQuinzena;
    private double pesMensal;
    
    public PrecoPesado(double pesMinC,double pesMinE,double pes15,double pes30,double pes45,double pes59,double pesPernoite, double pesDiario,double pesQuinzena,double pesMensal,int id){
          this.pesMinC =pesMinC;
          this.pesMinE = pesMinE;
          this.pes15 = pes15;
          this.pes30 = pes30;
          this.pes45= pes45;
          this.pes59 = pes59;
          this.pesPernoite=pesPernoite;
          this.pesDiario=pesDiario;
          this.pesQuinzena = pesQuinzena;
          this.pesMensal =pesMensal;
          this.id = id;
    }
    
    public PrecoPesado(){
        
    }

    public double getPesMinC() {
        return pesMinC;
    }

    public void setPesMinC(double pesMinC) {
        this.pesMinC = pesMinC;
    }

    public double getPesMinE() {
        return pesMinE;
    }

    public void setPesMinE(double pesMinE) {
        this.pesMinE = pesMinE;
    }

    public double getPes15() {
        return pes15;
    }

    public void setPes15(double pes15) {
        this.pes15 = pes15;
    }

    public double getPes30() {
        return pes30;
    }

    public void setPes30(double pes30) {
        this.pes30 = pes30;
    }

    public double getPes45() {
        return pes45;
    }

    public void setPes45(double pes45) {
        this.pes45 = pes45;
    }

    public double getPes59() {
        return pes59;
    }

    public void setPes59(double pes59) {
        this.pes59 = pes59;
    }

    public double getPesPernoite() {
        return pesPernoite;
    }

    public void setPesPernoite(double pesPernoite) {
        this.pesPernoite = pesPernoite;
    }

    public double getPesDiario() {
        return pesDiario;
    }

    public void setPesDiario(double pesDiario) {
        this.pesDiario = pesDiario;
    }

    public double getPesQuinzena() {
        return pesQuinzena;
    }

    public void setPesQuinzena(double pesQuinzena) {
        this.pesQuinzena = pesQuinzena;
    }

    public double getPesMensal() {
        return pesMensal;
    }

    public void setPesMensal(double pesMensal) {
        this.pesMensal = pesMensal;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PrecoPesado{" + "pesMinC=" + pesMinC + ", pesMinE=" + pesMinE + ", pes15=" + pes15 + ", pes30=" + pes30 + ", pes45=" + pes45 + ", pes59=" + pes59 + ", pesPernoite=" + pesPernoite + ", pesDiario=" + pesDiario + ", pesQuinzena=" + pesQuinzena + ", pesMensal=" + pesMensal + '}';
    }
    
    
    
}
