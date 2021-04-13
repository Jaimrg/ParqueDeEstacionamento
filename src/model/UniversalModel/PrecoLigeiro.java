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
public class PrecoLigeiro implements Serializable{
    
    private int id;
    private double ligMinC;
    private double ligMinE;
    private double lig15;
    private double lig30;
    private double lig45;
    private double lig59;
    private double ligPernoite;
    private double ligDiario;
    private double ligQuinzena;
    private double ligMensal;
    
    public PrecoLigeiro(double ligMinC,double ligMinE,double lig15,double lig30,double lig45,double lig59,double ligPernoite, double ligDiario,double ligQuinzena,double ligMensal,int id){
             this.ligMinC = ligMinC;
             this.ligMinE = ligMinE;
             this.lig15 = lig15;
             this.lig30 = lig30;
             this.lig45 = lig45;
             this.lig59 = lig59;
             this.ligPernoite = ligPernoite;
             this.ligDiario = ligDiario;
             this.ligQuinzena = ligQuinzena;
             this.ligMensal = ligMensal;
             this.id = id;   
        
    }
    
    public PrecoLigeiro(){
        
    }

    public double getLigMinC() {
        return ligMinC;
    }

    public void setLigMinC(double ligMinC) {
        this.ligMinC = ligMinC;
    }

    public double getLigMinE() {
        return ligMinE;
    }

    public void setLigMinE(double ligMinE) {
        this.ligMinE = ligMinE;
    }

    public double getLig15() {
        return lig15;
    }

    public void setLig15(double lig15) {
        this.lig15 = lig15;
    }

    public double getLig30() {
        return lig30;
    }

    public void setLig30(double lig30) {
        this.lig30 = lig30;
    }

    public double getLig45() {
        return lig45;
    }

    public void setLig45(double lig45) {
        this.lig45 = lig45;
    }

    public double getLig59() {
        return lig59;
    }

    public void setLig59(double lig59) {
        this.lig59 = lig59;
    }

    public double getLigPernoite() {
        return ligPernoite;
    }

    public void setLigPernoite(double ligPernoite) {
        this.ligPernoite = ligPernoite;
    }

    public double getLigDiario() {
        return ligDiario;
    }

    public void setLigDiario(double ligDiario) {
        this.ligDiario = ligDiario;
    }

    public double getLigQuinzena() {
        return ligQuinzena;
    }

    public void setLigQuinzena(double ligQuinzena) {
        this.ligQuinzena = ligQuinzena;
    }

    public double getLigMensal() {
        return ligMensal;
    }

    public void setLigMensal(double ligMensal) {
        this.ligMensal = ligMensal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Override
    public String toString() {
        return "PrecoLigeiro{" + "ligMinC=" + ligMinC + ", ligMinE=" + ligMinE + ", lig15=" + lig15 + ", lig30=" + lig30 + ", lig45=" + lig45 + ", lig59=" + lig59 + ", ligPernoite=" + ligPernoite + ", ligDiario=" + ligDiario + ", ligQuinzena=" + ligQuinzena + ", ligMensal=" + ligMensal + '}';
    }
   
    
    
}
