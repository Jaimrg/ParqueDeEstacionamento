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
public class Veiculo implements Serializable{
    protected int id;
    protected String marca;
    protected String modelo;
    protected String matricula;
    protected String cor;
    protected int ano;
    protected String dataEntrada;
    protected String dataSaida;
    protected String horaEntrada;
    protected String horaSaida;
    protected String proprietario;
    protected String obs;
    protected String contacto;
    protected String endereco;
    protected double valor;
    protected int dias;
    protected int meses;
    protected int minutos;
    protected int horas;
    
    public Veiculo(int id,String marca, String modelo, String matricula,int ano,String cor, String dataEntrada, String dataSaida
            ,String horaEntrada, String horaSaida,String proprietario,String obs,String contacto,String endereco,int dias,int meses,int minutos,int horas){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cor = cor;
        this.ano = ano;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.horaEntrada = horaEntrada;
        this.dataSaida = horaSaida;
        this.proprietario = proprietario;
        this.obs = obs;
        this.contacto = contacto;
        this.endereco = endereco;
        this.dias = dias;
        this.meses = meses;
        this.minutos = minutos;
        this.horas = horas;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    
    public Veiculo(){
        
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
    
    
    
     
    
    
}
