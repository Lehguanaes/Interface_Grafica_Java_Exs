/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_grafica_java;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Letícia Guanaes Moreira
 */
public class Exercicio_Limpar_Texto extends JFrame{
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    //Label´s
    JLabel rotulo1, rotulo2;
    
    //Campos
    JTextField texto1, texto2;
    
    //Botão
    JButton limpar;
    
    //icone botão
    ImageIcon limpar2_icon;
    
    public Exercicio_Limpar_Texto(){
        // TITULO DA PÁGINA
        super("Textos");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();
        
        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        //Definindo o título da janela
        JLabel titleLabel = new JLabel("Limpando textos", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 25));
        titleLabel.setForeground(Color.black);
        titleLabel.setBounds(0, 10, 400, 60);
        tela.add(titleLabel);
        
        //Icone da janela 
        ImageIcon icone = new ImageIcon("limpar_icon.png");
        setIconImage(icone.getImage());
 
        //JLABEL - Nome do Campo
        rotulo1 = new JLabel("1° Número:");
        rotulo2 = new JLabel("2° Número:");
        rotulo1.setBounds(75, 70, 100, 20);
        rotulo2.setBounds(75 , 120, 100, 20);
        
        //JTextField - campo
        texto1 = new JTextField(10);
        texto2 = new JTextField(10);
        texto1.setBounds(75, 95, 250, 20);
        texto2.setBounds(75, 140, 250, 20);
        
        //Icone dos botões
        limpar2_icon = new ImageIcon("limpar2_icon.png");
        
        //Botões
        limpar = new JButton("limpar",limpar2_icon);
        
        //Posicionando os Botões na Tela
        limpar.setBounds(135, 175, 100, 23);
        
        //Adicionando Cor aos Botões
        limpar.setBackground(Color.WHITE);
        
        //Ações que o programa fará
        // Método para o botão de limpar
        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto1.setText(null);
                texto2.setText(null);
                texto1.requestFocus();
            }
        });
        
        //Adicionando os Elementos na Tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(limpar);
       
        //Tela
        setSize(420,270);
        setVisible(true);
        setLocationRelativeTo(null); 
  }
     public static void main(String[] args) {
        //INSTANCIAMENTO DA CLASSE 
        Exercicio_Limpar_Texto start = new  Exercicio_Limpar_Texto();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 