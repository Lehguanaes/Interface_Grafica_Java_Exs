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
public class Exercicio_Ocultar_Exibir extends JFrame{
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    //Label´s
    JLabel rotulo1, rotulo2;
    
    //Botão
    JButton ocultar, exibir;
    
    //icone botão
    ImageIcon exibir_icon, ocultar_icon;
    
    public Exercicio_Ocultar_Exibir(){
        // TITULO DA PÁGINA
        super("Textos");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();
        
        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        //Definindo o título da janela
        JLabel titleLabel = new JLabel("Ocultar ou Exibir", SwingConstants.CENTER);
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
        ocultar_icon = new ImageIcon("ocultar2_icon.png");
        exibir_icon = new ImageIcon("exibir_icon.png");
        
        //Botões
        ocultar = new JButton("ocultar",ocultar_icon);
        exibir = new JButton("exibir",exibir_icon);
        
        //Posicionando os Botões na Tela
        ocultar.setBounds(80, 155, 120, 23);
        exibir.setBounds(210, 155, 120, 23);
        
        //Adicionando Cor aos Botões
        ocultar.setBackground(Color.WHITE);
        exibir.setBackground(Color.WHITE);
        
         //Ações que o programa fará
        // Método para o botão de ocultar
        ocultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               rotulo1.setVisible(false);
               rotulo2.setVisible(false);
            }
        });
        
        // Método para o botão de exibir
        exibir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               rotulo1.setVisible(true);
               rotulo2.setVisible(true);
            }
        });
        
        //Adicionando os Elementos na Tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(ocultar);
        tela.add(exibir);
        
        //Tela
        setSize(420,270);
        setVisible(true);
        setLocationRelativeTo(null); 
  }
     public static void main(String[] args) {
        //INSTANCIAMENTO DA CLASSE 
        Exercicio_Ocultar_Exibir start = new  Exercicio_Ocultar_Exibir();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 