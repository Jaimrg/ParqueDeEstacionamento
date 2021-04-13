/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Jaime Rungo
 */
public class TelaPrincipal_2 extends JFrame {
    
    public TelaPrincipal_2(){
        InitComponents();
    }
    
    
    public void InitComponents(){
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setPreferredSize(new Dimension(1100,700));
        setVisible(true);
        setLocation(150,30);
        
        JPanel principalPanel = new JPanel();
        principalPanel.setLayout(new GridLayout(4,1));
        principalPanel.setBackground(Color.white);
        setContentPane(principalPanel);
        
        //Painel de cima boss
        JPanel upPanel = new JPanel();
        upPanel.setBackground(new Color(112,146,190));
        upPanel.setLayout(new GridLayout(1,2));
        //Agora vamos fazer um oainelsinho de lado, no total serao 3, esse eh o primeiro
        // o upPanel tera gridlayout(1,5) para ter muitos pedacinhos horizontais
        
        JPanel upPanel01 = new JPanel();
        upPanel01.setBackground(new Color(112,146,190));
        
        JPanel middlePanel = new JPanel();
        middlePanel.setBackground(new Color(255,255,255));
        middlePanel.setLayout(new GridLayout(1,2));
        
        JPanel downPanel = new JPanel();
        downPanel.setBackground(new Color(255,255,255));
        downPanel.setLayout(new GridLayout(1,2));
        
        principalPanel.add(upPanel);
        principalPanel.add(middlePanel);
        principalPanel.add(downPanel);
        
        pack(); 
    }

   
    
    

}
