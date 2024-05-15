/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Exercicio_Habilitar_Desabilitar extends JFrame{
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    //Label´s
    JLabel rotulo1, rotulo2;
    
    //Botão
    JButton habilitar, desabilitar;
    
    //icone botão
    ImageIcon habilitar_icon, desabilitar_icon;
    
    public Exercicio_Habilitar_Desabilitar(){
        // TITULO DA PÁGINA
        super("Textos");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();
        
        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        //Definindo o título da janela
        JLabel titleLabel = new JLabel("Habilitar e Desabilitar", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 25));
        titleLabel.setForeground(Color.black);
        titleLabel.setBounds(0, 10, 400, 60);
        tela.add(titleLabel);
        
        //Icone da janela 
        ImageIcon icone = new ImageIcon("ocultar_icon.png");
        setIconImage(icone.getImage());
        
        //JLABEL - Nome do Campo
        rotulo1 = new JLabel("******************************************************");
        rotulo2 = new JLabel("******************************************************");
        rotulo1.setBounds(75, 70, 400, 20);
        rotulo2.setBounds(75 , 120, 400, 20);
        
        //Icone dos botões
        desabilitar_icon = new ImageIcon("ocultar2_icon.png");
        habilitar_icon = new ImageIcon("exibir_icon.png");
        
        //Botões
        desabilitar = new JButton("desabilitar",desabilitar_icon);
        habilitar = new JButton("habilitar",habilitar_icon);
        
        //Posicionando os Botões na Tela
        desabilitar.setBounds(80, 155, 120, 23);
        habilitar.setBounds(210, 155, 120, 23);
        
        //Adicionando Cor aos Botões
        desabilitar.setBackground(Color.WHITE);
        habilitar.setBackground(Color.WHITE);
        
         //Ações que o programa fará
        // Método para o botão de Desabilitar
        desabilitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               rotulo1.setEnabled(false);
               rotulo2.setEnabled(false);
            }
        });
        
        // Método para o botão de Habilitar
        habilitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               rotulo1.setEnabled(true);
               rotulo2.setEnabled(true);
            }
        });
        
        //Adicionando os Elementos na Tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(desabilitar);
        tela.add(habilitar);
        
        //Tela
        setSize(420,270);
        setVisible(true);
        setLocationRelativeTo(null); 
  }
     public static void main(String[] args) {
        //INSTANCIAMENTO DA CLASSE 
        Exercicio_Habilitar_Desabilitar start = new  Exercicio_Habilitar_Desabilitar();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 