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
public class TelaPrincipal_1 extends JFrame{
    
    
    public TelaPrincipal_1(){
        InitComponents();
    }
    
    
    public void InitComponents(){
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setPreferredSize(new Dimension(1100,700));
        setVisible(true);
        setLocation(150,30);
        
        
        JPanel principalPanel = new JPanel();
        principalPanel.setLayout(new GridLayout(1,4));
        principalPanel.setBackground(Color.white);
        setContentPane(principalPanel);
        
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(255,255,255));
        leftPanel.setLayout(new GridLayout(1,2));
        
        JPanel leftPanelIn = new JPanel();
        leftPanelIn.setBackground(new Color(153,217,234));
        leftPanelIn.setLayout(new GridLayout(1,2));
        leftPanel.add(leftPanelIn);
        
        JPanel leftPanelIn2 = new JPanel();
        leftPanelIn2.setBackground(new Color(153,217,234));
        leftPanelIn2.setLayout(new GridLayout(1,2));
        leftPanel.add(leftPanelIn2);
        
        
        JPanel leftPanelIN = new JPanel();
        leftPanelIN.setBackground(new Color(255,255,255));
        leftPanelIN.setLayout(new GridLayout(6,1));
        leftPanel.add(leftPanelIN);
        
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(3,1));
        rightPanel.setBackground(new Color(255,255,255));
        
        JPanel rightPanel2 = new JPanel();
        rightPanel2.setBackground(new Color(255,255,255));
        rightPanel2.setLayout(new GridLayout(3,1));
        
        JPanel rightPanel3 = new JPanel();
        rightPanel3.setBackground(new Color(255,255,255));
        rightPanel3.setLayout(new GridLayout(4,1));
        
        //primeiro rightpanel
        JPanel rightPanelUp = new JPanel();
        rightPanelUp.setBackground(new Color(255,255,255) );
        rightPanelUp.setLayout(new FlowLayout(FlowLayout.LEFT));
        rightPanel.add(rightPanelUp);
        
        JLabel imagem = new JLabel(new ImageIcon(getClass().getResource("/imgs/car.png")));
        rightPanelUp.add(imagem);
        
        JPanel rightPanelMeio = new JPanel();
        rightPanelMeio.setBackground(new Color(255,255,255) );
        rightPanelMeio.setLayout(new FlowLayout(FlowLayout.LEFT));
        rightPanel.add(rightPanelMeio);
        
        JPanel rightPanelBaixo = new JPanel();
        rightPanelBaixo.setBackground(new Color(255,255,255) );
        rightPanelBaixo.setLayout(new FlowLayout(FlowLayout.LEFT));
        rightPanel.add(rightPanelBaixo);
        
        //JLabel fundo= new JLabel(new ImageIcon(getClass().getResource("/imgs/fundo.png")));
        //rightPanelBaixo.add(fundo);
        
        JButton bt = new JButton(new ImageIcon(getClass().getResource("/imgs/add.png")));
        bt.setBackground(new Color(153,217,234));
        bt.setPreferredSize(new Dimension(250,130));
        rightPanelMeio.add(bt);
        
        JLabel btLabel = new JLabel(" Registrar Entrada");
        btLabel.setPreferredSize(new Dimension(500,40));
        btLabel.setForeground(new java.awt.Color(0, 165, 0));
        btLabel.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        rightPanelMeio.add(btLabel);
        
        // segundo rightpanel
        
        JPanel rightPanelUp2 = new JPanel();
        rightPanelUp2.setBackground(new Color(255,255,255) );
        rightPanelUp2.setLayout(new FlowLayout(FlowLayout.LEFT));
        rightPanel2.add(rightPanelUp2);
        
        JLabel titulo = new JLabel("Parque de estacionamento JR");
        titulo.setPreferredSize(new Dimension(500,40));
        titulo.setForeground(new java.awt.Color(0, 165, 0));
        titulo.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        rightPanelUp2.add(titulo);
        
        JPanel rightPanelMeio2 = new JPanel();
        rightPanelMeio2.setBackground(new Color(255,255,255) );
        rightPanelMeio2.setLayout(new FlowLayout(FlowLayout.LEFT));
        rightPanel2.add(rightPanelMeio2);
        
        JPanel rightPanelBaixo2 = new JPanel();
        rightPanelBaixo2.setBackground(new Color(255,255,255) );
        rightPanelBaixo2.setLayout(new FlowLayout(FlowLayout.LEFT));
        rightPanel2.add(rightPanelBaixo2);
        
        JButton bt2 = new JButton(new ImageIcon(getClass().getResource("/imgs/out.png")));
        bt2.setBackground(new Color(153,217,234));
        bt2.setPreferredSize(new Dimension(250,130));
        rightPanelMeio2.add(bt2);
        
        JLabel bt2Label = new JLabel("   Registrar Saida");
        bt2Label.setPreferredSize(new Dimension(500,40));
        bt2Label.setForeground(new java.awt.Color(0, 165, 0));
        bt2Label.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        rightPanelMeio2.add(bt2Label);      
        
        
        
                
        principalPanel.add(leftPanel);
        principalPanel.add(rightPanel);
        principalPanel.add(rightPanel2);
       // principalPanel.add(rightPanel3);
       
       
       bt.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              RecebeDados rd = new RecebeDados();
           }
       });
       
       bt2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              Saida s = new Saida();
           }
       });
        
        
        pack();
    }
}
