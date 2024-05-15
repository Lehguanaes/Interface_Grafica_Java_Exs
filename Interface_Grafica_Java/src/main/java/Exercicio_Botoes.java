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

//Diversos Botões! 
public class Exercicio_Botoes extends JFrame{
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    JButton botao1, botao2, botao3, botao4;
    
    // CRIAÇÃO DO MÉTODO CONSTRUTOR
    public Exercicio_Botoes(){
        // TITULO DA PÁGINA
        super("Botões");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();
        
        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        //Definindo o título da janela
        JLabel titleLabel = new JLabel("Botões", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 25));
        titleLabel.setForeground(Color.black);
        titleLabel.setBounds(0, 10, 400, 60);
        tela.add(titleLabel);
        
        //Icone da janela 
        ImageIcon icone = new ImageIcon("escolha_icon.png");
        setIconImage(icone.getImage());
        
        // CRIAÇÃO DOS OBJETOS
        //Botões
        botao1 = new JButton ("Procurar");
        botao2 = new JButton ("Voltar>>");
        botao3 = new JButton ("Próximo>>");
        botao4 = new JButton ("Abrir");
        
        //Adicionando cores nos botões
        botao1.setBackground(Color.black);
        botao2.setBackground(Color.black);
        botao3.setBackground(Color.black);
        botao4.setBackground(Color.black);
        botao1.setForeground(Color.WHITE);
        botao2.setForeground(Color.WHITE);
        botao3.setForeground(Color.WHITE);
        botao4.setForeground(Color.WHITE);
        
        //Adicionando Funcões aos botões
        botao1.setMnemonic(KeyEvent.VK_P);
        botao2.setMnemonic(KeyEvent.VK_V);
        botao3.setMnemonic(KeyEvent.VK_X);
        botao4.setMnemonic(KeyEvent.VK_S);
        //Foco Enter
        getRootPane().setDefaultButton(botao3);

        // UTILIZAÇÃO DOS OBJETOS
        // setBounds SERVE PARA DEFINIR O LOCAL DE CADA ELEMENTO, (X,Y) - (LINHA,COLUNA
        botao1.setBounds(90,90,110,20);
        botao2.setBounds(220,90,110,20);
        botao3.setBounds(90,120,110,20);
        botao4.setBounds(220,120,110,20);
        
        //COM O O OBJETO "TELA" CRIADO NO CONTAINER, ADICIONAMOS OS OBJETOS NA TELA
        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);
        tela.add(botao4);
        
        //Tela
        setSize(420,230);
        setVisible(true);
        setLocationRelativeTo(null); 
  }
     public static void main(String[] args) {
        //INSTANCIAMENTO DA CLASSE 
        Exercicio_Botoes start = new  Exercicio_Botoes();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 