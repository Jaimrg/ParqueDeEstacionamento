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
/**
 *
 * @author Jaime Rungo
 */
public class Login extends JFrame {
    
    
    public Login(){
        InitComponents();
    }
    
    public void InitComponents(){
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(900,700));
        setVisible(true);
        setLocation(250,30);

        // Paineis
        
        JPanel principalPanel = new JPanel();
        principalPanel.setLayout(new GridLayout(1,1));
        principalPanel.setBackground(Color.white);
        setContentPane(principalPanel);

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(255,255,255));
        leftPanel.setLayout(new GridLayout(3,1));
        leftPanel.setPreferredSize(new Dimension(100,600));
        
        
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(new Color(69,214,108));
        rightPanel.setLayout(new GridLayout(2,1));
        
        JPanel rightPanel2 = new JPanel();
        rightPanel2.setBackground(new Color(69,214,108));
        rightPanel2.setLayout(new GridLayout(2,1));
        
        
        JPanel leftPanelUp = new JPanel();
        leftPanelUp.setBackground(Color.white);
        leftPanelUp.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        JPanel leftPanelMiddle = new JPanel();
        leftPanelMiddle.setBackground(Color.white);
        leftPanelMiddle.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JPanel leftPanelDown = new JPanel();
        leftPanelDown.setBackground(Color.white);
        leftPanelDown.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        leftPanelUp.add(new JLabel("                                           "));
        leftPanelUp.add(new JLabel("                                           "));
        leftPanelUp.add(new JLabel("                                           "));
        leftPanelUp.add(new JLabel("                                           "));
        leftPanelUp.add(new JLabel("                                           "));
        leftPanelUp.add(new JLabel("                                           "));
        leftPanelUp.add(new JLabel("                                           "));
        leftPanelUp.add(new JLabel("                                           "));
        
        JLabel imagem = new JLabel(new ImageIcon(getClass().getResource("/imgs/login2.png")));
        leftPanelUp.add(imagem);
        
        
        JLabel nomeL = new JLabel("Usuário");
        nomeL.setPreferredSize(new Dimension(100,30));
        nomeL.setForeground(new java.awt.Color(0, 165, 0));
        nomeL.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
        leftPanelMiddle.add(nomeL);
        
        JTextField nomeT = new JTextField();
        nomeT.setPreferredSize(new Dimension(280,30));
        leftPanelMiddle.add(nomeT);
        
        JLabel senhaL = new JLabel("Senha");
        senhaL.setPreferredSize(new Dimension(100,30));
        senhaL.setForeground(new java.awt.Color(0, 165, 0));
        senhaL.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
        leftPanelMiddle.add(senhaL);
        
        JTextField senhaT = new JTextField();
        senhaT.setPreferredSize(new Dimension(280,30));
        leftPanelMiddle.add(senhaT);
        
        JButton novaC= new JButton("Criar Nova Conta");
        novaC.setPreferredSize(new Dimension(200,30));
        novaC.setForeground(Color.green);
        novaC.setBackground(Color.white);
        //leftPanelMiddle.add(novaC);
        
        JLabel ent = new JLabel("       ");
        ent.setPreferredSize(new Dimension(100,30));
        ent.setForeground(new java.awt.Color(0, 165, 0));
        ent.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
        leftPanelMiddle.add(ent);
        
        
        JButton entrar = new JButton("Entrar");
        entrar.setBackground(new Color(69,214,108));
        entrar.setPreferredSize(new Dimension(280,30));
        entrar.setForeground(Color.white);
        leftPanelMiddle.add(entrar);
        
        
                
        
        leftPanel.add(leftPanelUp);
        leftPanel.add(leftPanelMiddle);
        leftPanel.add(leftPanelDown);
        
        
        
        
        principalPanel.add(leftPanel);
        principalPanel.add(rightPanel);
        principalPanel.add(rightPanel2);
        pack();
        
    }
    
}
