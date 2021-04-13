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
import model.UniversalModel.Cliente;


/**
 *
 * @author Jaime Rungo
 */
public class ClienteDao {
     File directorio=new File("C:\\ParqueDeEstacionamento");
     File bancoDados=new File("C:\\ParqueDeEstacionamento\\Cliente.dat");
      
    
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
                
                ArrayList<Cliente> lista=new ArrayList();
              
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
             

              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    
     public static void create(Cliente p){
        ArrayList<Cliente> lista=new ArrayList();
        
         lista= (ArrayList<Cliente>)lista().clone();
         lista.add(p);
        
          try {
              File bancoDados=new File("C:\\ParqueDeEstacionamento\\Cliente.dat");
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
            
              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
              
              
              
              System.out.println("Salvo com sucesso");
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    
    public static void delete(String nome){
        ArrayList<Cliente> lista=new ArrayList();
        
         lista= (ArrayList<Cliente>)lista().clone();
         
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getNome().equalsIgnoreCase(nome)){
                lista.remove(i);
            }
        }
        
          try {
              File bancoDados=new File("C:\\ParqueDeEstacionamento\\Cliente.dat");
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
            
              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
              
              
              
              System.out.println("Salvo com sucesso");
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
          }
          System.out.println("Cheguei kkkk");
    }
    
    
     public static void edit(String nome,Cliente p){
        ArrayList<Cliente> lista=new ArrayList();
        
         lista= (ArrayList<Cliente>)lista().clone();
         
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getNome().equalsIgnoreCase(nome)){
                lista.remove(i);
                lista.add(p);
            }
        }
        
          try {
              File bancoDados=new File("C:\\ParqueDeEstacionamento\\Cliente.dat");
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
            
              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
              
              
              
              System.out.println("Salvo com sucesso");
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    
     public static  ArrayList<Cliente> search(String mat){
        ArrayList<Cliente> lista=new ArrayList();
         ArrayList<Cliente> nova=new ArrayList();
         
         lista= (ArrayList<Cliente>)lista().clone();
         
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getNome().startsWith(mat)){
                
                nova.add(lista.get(i));
            }
        }
          return nova;
    }
     
     public static  ArrayList<Cliente> filtrar(String filtro){
        ArrayList<Cliente> lista=new ArrayList();
         ArrayList<Cliente> nova=new ArrayList();
         lista= (ArrayList<Cliente>)lista().clone();
         
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getTipo().equals(filtro)){
                
                nova.add(lista.get(i));
            }
        }
          return nova;
    }
     
     
    
    public static ArrayList<Cliente> lista(){
        ArrayList<Cliente> lista=new ArrayList();
       
        
          try {
            
            FileInputStream readData = new FileInputStream("C:\\ParqueDeEstacionamento\\Cliente.dat");
            ObjectInputStream os = new ObjectInputStream(readData);
              
              lista=(ArrayList<Cliente>)os.readObject();
                   
             os.close();
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) { 
              Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
             Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
         }
        
          return lista;
        
    }
    
    public static void  listas(){
        
       
        
          try {
            
            FileInputStream readData = new FileInputStream("C:\\ParqueDeEstacionamento\\Cliente.dat");
            ObjectInputStream os = new ObjectInputStream(readData);
              
              ArrayList<Cliente> lista=(ArrayList<Cliente>)os.readObject();
              
              os.close();
                  
              
            
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) { 
              Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
             Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
         }
        
         
    }
    
}
