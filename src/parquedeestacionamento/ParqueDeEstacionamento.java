/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parquedeestacionamento;

import Controller.CarroDao;
import model.UniversalModel.Carro;
import view.RecebeDados;
import view.TelaPrincipal_1;
import Controller.CarroDaoDelete;
import Controller.PrecoLigeiroDao;
import Controller.*;
import Controller.PrecoPesadoDao;
import model.UniversalModel.*;
import view.Login2;
import view.RegistroForm2;

/**
 *
 * @author Jaime Rungo
 */
public class ParqueDeEstacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarroDao carroBd = new CarroDao();
        CarroDaoDelete carrobdd = new CarroDaoDelete();
        PrecoLigeiroDao pld = new PrecoLigeiroDao();
        PrecoPesadoDao ppd = new PrecoPesadoDao();
        PrecoMotoDao pmd = new PrecoMotoDao();
        ClienteDao clid =  new ClienteDao();
        clid.CaminhoPrincipal();
        carroBd.CaminhoPrincipal();
        carrobdd.CaminhoPrincipal();
        
        pld.CaminhoPrincipal();
        ppd.CaminhoPrincipal();
        pmd.CaminhoPrincipal();
        CarroDao c = new CarroDao();
       // view.Menu t = new view.Menu();
        //t.setVisible(true);
        
        Login2 lg = new Login2();
        lg.setVisible(true);
        
        //RegistroForm2 rf = new RegistroForm2();
        for (PrecoLigeiro e : PrecoLigeiroDao.lista()) {
        System.out.println("preco"+e.getLig15());
        }
       
    }
    
}
