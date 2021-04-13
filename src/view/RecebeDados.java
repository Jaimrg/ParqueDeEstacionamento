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
import static java.awt.image.ImageObserver.ABORT;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.UniversalModel.Carro;

/**
 *
 * @author Jaime Rungo
 */
public class RecebeDados extends JFrame {
    
    JTextField marcaF;
    JTextField modeloF;
    JTextField matF;
    JTextField corF;
    JTextField dEntradaF;
    JTextField dSaidaF;
    JTextField hEntradaF;
    JTextField hSaidaF;
    
    public RecebeDados(){
        InitComponents();
    }
    
    public void limpa(){
        
        marcaF.setText("");
        modeloF.setText("");
        matF.setText("");
        corF.setText("");
        dEntradaF.setText("");
        dSaidaF.setText("");
        hEntradaF.setText("");
        hSaidaF.setText("");
            
    }
    
    public void InitComponents(){
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setPreferredSize(new Dimension(1100,700));
        setVisible(true);
        setLocation(150,30);
        
        JPanel principalPanel0 = new JPanel();
        principalPanel0.setBackground(new Color(255,255,255));
        principalPanel0.setLayout(new GridLayout(2,1));
        setContentPane(principalPanel0);
                
        
        JPanel principalPanel = new JPanel();
        principalPanel.setLayout(new GridLayout(2,1));
        principalPanel.setBackground(Color.white);
        
        
        JPanel panelUp = new JPanel();
        panelUp.setBackground(new Color(255,255,255));
        panelUp.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JPanel panelUp2 = new JPanel();
        panelUp2.setBackground(new Color(255,255,255));
        panelUp2.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JPanel panelUp3 = new JPanel();
        panelUp3.setBackground(new Color(255,255,255));
        panelUp3.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JPanel panelUp41 = new JPanel();
        panelUp41.setBackground(new Color(255,255,255));
        panelUp41.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JPanel panelUp4 = new JPanel();
        panelUp4.setBackground(new Color(255,255,255));
        panelUp4.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JPanel panelUp5 = new JPanel();
        panelUp5.setBackground(new Color(255,255,255));
        panelUp5.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JPanel panelUp6 = new JPanel();
        panelUp6.setBackground(new Color(255,255,255));
        panelUp6.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        Border lineBorder = BorderFactory.createLineBorder(new Color(34,102,255));
        
        JPanel panelUp7 = new JPanel();
        panelUp7.setBackground(new Color(255,255,255));
        panelUp7.setLayout(new FlowLayout(FlowLayout.LEFT));
       // panelUp7.setBorder(lineBorder);
       
       
        JPanel panelDown = new JPanel();
        panelDown.setBackground(Color.white);
        panelDown.setLayout(new GridLayout(1,0));
        
        
        JLabel imagem = new JLabel(new ImageIcon(getClass().getResource("/imgs/car.png")));
        panelUp.add(imagem);
        
        JLabel marcaL = new JLabel(" Marca ");
        marcaL.setPreferredSize(new Dimension(130,40));
        marcaL.setForeground(new java.awt.Color(10, 10, 10));
        marcaL.setFont(new Font(Font.MONOSPACED, Font.ROMAN_BASELINE, 20));
        panelUp2.add(marcaL);
        
        marcaF = new JTextField();
        marcaF.setPreferredSize(new Dimension(250,30));
        panelUp2.add(marcaF);
        
        panelUp2.add(new JLabel("                   "));
        
        JLabel modeloL = new JLabel("Modelo");
        modeloL.setPreferredSize(new Dimension(90,40));
        modeloL.setForeground(new java.awt.Color(10, 10, 10));
        modeloL.setFont(new Font(Font.MONOSPACED, Font.ROMAN_BASELINE, 20));
        panelUp2.add(modeloL);
        
        modeloF = new JTextField();
        modeloF.setPreferredSize(new Dimension(250,30));
        panelUp2.add(modeloF);
        
        JLabel matL = new JLabel(" Matricula");
        matL.setPreferredSize(new Dimension(130,40));
        matL.setForeground(new java.awt.Color(10, 10, 10));
        matL.setFont(new Font(Font.MONOSPACED, Font.ROMAN_BASELINE, 20));
        panelUp3.add(matL);
        
        matF = new JTextField();
        matF.setPreferredSize(new Dimension(250,30));
        panelUp3.add(matF);
        
        panelUp3.add(new JLabel("                   "));
        
        JLabel corL = new JLabel("Cor");
        corL.setPreferredSize(new Dimension(90,40));
        corL.setForeground(new java.awt.Color(10, 10, 10));
        corL.setFont(new Font(Font.MONOSPACED, Font.ROMAN_BASELINE, 20));
        panelUp3.add(corL);
        
        corF = new JTextField();
        corF.setPreferredSize(new Dimension(250,30));
        panelUp3.add(corF);
        
        JLabel dEntradaL = new JLabel(" D.Entrada");
        dEntradaL.setPreferredSize(new Dimension(130,40));
        dEntradaL.setForeground(new java.awt.Color(10, 10, 10));
        dEntradaL.setFont(new Font(Font.MONOSPACED, Font.ROMAN_BASELINE, 20));
        panelUp4.add(dEntradaL);
        
        dEntradaF = new JTextField();
        dEntradaF.setPreferredSize(new Dimension(250,30));
        panelUp4.add(dEntradaF);
        
        panelUp4.add(new JLabel("                   "));
        
        JLabel dSaidaL = new JLabel("D.Saida");
        dSaidaL.setPreferredSize(new Dimension(90,40));
        dSaidaL.setForeground(new java.awt.Color(10, 10, 10));
        dSaidaL.setFont(new Font(Font.MONOSPACED, Font.ROMAN_BASELINE, 20));
        panelUp4.add(dSaidaL);
        
        dSaidaF = new JTextField();
        dSaidaF.setPreferredSize(new Dimension(250,30));
        panelUp4.add(dSaidaF);
        
        
        
        JLabel hEntradaL = new JLabel(" H.Entrada");
        hEntradaL.setPreferredSize(new Dimension(130,40));
        hEntradaL.setForeground(new java.awt.Color(10, 10, 10));
        hEntradaL.setFont(new Font(Font.MONOSPACED, Font.ROMAN_BASELINE, 20));
        panelUp5.add(hEntradaL);
        
        hEntradaF = new JTextField();
        hEntradaF.setPreferredSize(new Dimension(250,30));
        panelUp5.add(hEntradaF);
        
        panelUp5.add(new JLabel("                   "));
        
        JLabel hSaidaL = new JLabel("H.Saida");
        hSaidaL.setPreferredSize(new Dimension(90,40));
        hSaidaL.setForeground(new java.awt.Color(10, 10, 10));
        hSaidaL.setFont(new Font(Font.MONOSPACED, Font.ROMAN_BASELINE, 20));
        panelUp5.add(hSaidaL);
        
        hSaidaF = new JTextField();
        hSaidaF.setPreferredSize(new Dimension(250,30));
        panelUp5.add(hSaidaF);
        
        panelUp7.add(new JLabel("                                                                                                               "));
        
        JButton add = new JButton(new ImageIcon(getClass().getResource("/imgs/addCar.png")));
        add.setBackground(new Color(153,217,234));
        add.setForeground(new Color(255,255,255));
        add.setPreferredSize(new Dimension(125,30));
        add.setText("Adicionar");
        panelUp7.add(add);
        
        panelUp7.add(new JLabel("                   "));
        
        JButton refresh = new JButton(new ImageIcon(getClass().getResource("/imgs/refresh.png")));
        refresh.setBackground(new Color(153,217,234));
        refresh.setForeground(new Color(255,255,255));
        refresh.setPreferredSize(new Dimension(125,30));
        refresh.setText("Refresh");
        panelUp7.add(refresh);
        
        
        String[] colunas={"Marca","Modelo","Matricula","Cor","Tempo","Valor Total"};
        JTable table=new JTable();
        table.setModel(new DefaultTableModel(colunas,ABORT));
        JScrollPane scroll=new JScrollPane(table);
        panelDown.add(scroll);
        
        
        principalPanel0.add(principalPanel);
        principalPanel.add(panelUp);
        principalPanel.add(panelUp2);
        principalPanel.add(panelUp3);
        principalPanel.add(panelUp4);
        principalPanel.add(panelUp5);
        principalPanel.add(panelUp6);
        principalPanel.add(panelUp7);
        principalPanel0.add(panelDown);
        
        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                limpa();
            }
        });
        
        
        add.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               Carro car = new Carro();
               
               if(!marcaF.getText().toUpperCase().equals("")){
                   
               car.setMarca(marcaF.getText().toUpperCase());
               car.setModelo(modeloF.getText().toUpperCase());
               car.setMatricula(matF.getText().toUpperCase());
               car.setCor(corF.getText().toUpperCase());
               car.setDataEntrada(dEntradaF.getText().toUpperCase());
               car.setDataSaida(dSaidaF.getText().toUpperCase());
               car.setHoraEntrada(hEntradaF.getText().toUpperCase());
               car.setHoraSaida(hSaidaF.getText().toUpperCase());
               System.out.println("Carro :"+car.toString());
               JOptionPane.showMessageDialog(null, "Dados Salvos");
               limpa();
//               car.tempo();
               }
               else {
                  JOptionPane.showMessageDialog(null, "Campos Vazios");
               }
           }
               
       });
        
        pack();
    }
    
}
