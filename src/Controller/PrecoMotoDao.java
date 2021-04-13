/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.UniversalModel.*;


/**
 *
 * @author Jaime Rungo
 */
public class PrecoMotoDao {
     File directorio=new File("C:\\ParqueDeEstacionamento");
     File bancoDados=new File("C:\\ParqueDeEstacionamento\\PrecoMoto.dat");
      
    
    //
    public void CaminhoPrincipal(){
      
      
        
        if(directorio.exists()){
           System.out.print("Direcorio OK!");
        }else{
            directorio.mkdir();
        }
        
        if(bancoDados.exists()){
           System.out.print("Banco de dados OK!");
           
        }else{
            try {
                bancoDados.createNewFile();
                
                ArrayList<PrecoMoto> lista=new ArrayList();
              
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
             

              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(PrecoMotoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    
     public static void create(PrecoMoto p){
        ArrayList<PrecoMoto> lista=new ArrayList();
        
         lista= (ArrayList<PrecoMoto>)lista().clone();
         lista.add(p);
        
          try {
              File bancoDados=new File("C:\\ParqueDeEstacionamento\\PrecoMoto.dat");
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
            
              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
              
              
              
              System.out.println("Salvo com sucesso");
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(PrecoMoto.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(PrecoMoto.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    
    public static void delete(int id){
        ArrayList<PrecoMoto> lista=new ArrayList();
        
         lista= (ArrayList<PrecoMoto>)lista().clone();
         
        for (int i = 0; i < lista.size(); i++) {
            
            
                lista.remove(i);
            
        }
        
          try {
              File bancoDados=new File("C:\\ParqueDeEstacionamento\\PrecoMoto.dat");
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
            
              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
              
              
              
              System.out.println("Salvo com sucesso");
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(PrecoMoto.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(PrecoMoto.class.getName()).log(Level.SEVERE, null, ex);
          }
          System.out.println("Cheguei kkkk");
    }
    
    
     public static void edit(int id,PrecoMoto p){
        ArrayList<PrecoMoto> lista=new ArrayList();
        
         lista= (ArrayList<PrecoMoto>)lista().clone();
         
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getId()==id){
                lista.remove(i);
                lista.add(p);
            }
        }
        
          try {
              File bancoDados=new File("C:\\ParqueDeEstacionamento\\PrecoMoto.dat");
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
            
              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
              
              
              
              System.out.println("Salvo com sucesso");
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(PrecoMoto.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(PrecoMoto.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    
     /*public static  ArrayList<PrecoLigeiro> search(int id){
        ArrayList<PrecoLigeiro> lista=new ArrayList();
         ArrayList<PrecoLigeiro> nova=new ArrayList();
         
         lista= (ArrayList<PrecoLigeiro>)lista().clone();
         
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getId().startsWith(id)){
                
                nova.add(lista.get(i));
            }
        }
          return nova;
    }*/
     
    /* public static  ArrayList<Carro> filtrar(String filtro){
        ArrayList<PrecoLigeiro> lista=new ArrayList();
         ArrayList<PrecoLigeiro> nova=new ArrayList();
         lista= (ArrayList<PrecoLigeiro>)lista().clone();
         
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getTipo().equals(filtro)){
                
                nova.add(lista.get(i));
            }
        }
          return nova;
    }*/
     
     
    
    public static ArrayList<PrecoMoto> lista(){
        ArrayList<PrecoMoto> lista=new ArrayList();
       
        
          try {
            
            FileInputStream readData = new FileInputStream("C:\\ParqueDeEstacionamento\\PrecoMoto.dat");
            ObjectInputStream os = new ObjectInputStream(readData);
              
              lista=(ArrayList<PrecoMoto>)os.readObject();
                   
             os.close();
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(PrecoMoto.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) { 
              Logger.getLogger(PrecoMoto.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
             Logger.getLogger(PrecoMoto.class.getName()).log(Level.SEVERE, null, ex);
         }
        
          return lista;
        
    }
    
    public static void  listas(){
        
       
        
          try {
            
            FileInputStream readData = new FileInputStream("C:\\ParqueDeEstacionamento\\PrecoMoto.dat");
            ObjectInputStream os = new ObjectInputStream(readData);
              
              ArrayList<PrecoMoto> lista=(ArrayList<PrecoMoto>)os.readObject();
              
              os.close();
                  
              
            
          } catch (FileNotFoundException ex) {
              Logger.getLogger(PrecoMoto.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) { 
              Logger.getLogger(PrecoMoto.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
             Logger.getLogger(PrecoMoto.class.getName()).log(Level.SEVERE, null, ex);
         }
        
         
    }
    
}
