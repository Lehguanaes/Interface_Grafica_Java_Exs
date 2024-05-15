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
//Calculadora
//Eventos ligados aos botões
public class Exercicio_Evento_Soma extends JFrame{
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    //Label´s
    JLabel rotulo1, rotulo2, exibir;
    
    //Campos
    JTextField texto1, texto2;
    
    //Botões
    JButton somar, dividir, multiplicar, subtrair;
    
    //icone botão
    ImageIcon somar_icon, subtrair_icon, multiplicar_icon, dividir_icon;
    
    // CRIAÇÃO DO MÉTODO CONSTRUTOR
    public Exercicio_Evento_Soma(){
        
        // TITULO DA PÁGINA
        super("Calculadora");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();
        
        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        //Definindo o título da janela
        JLabel titleLabel = new JLabel("Calculadora", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        titleLabel.setForeground(Color.black);
        titleLabel.setBounds(0, 10, 355, 60);
        tela.add(titleLabel);
        
        //Icone da janela 
        ImageIcon icone = new ImageIcon("calculadora_icon.png");
        setIconImage(icone.getImage());
 
        //JLABEL - Nome do Campo
        rotulo1 = new JLabel("1° Número:");
        rotulo2 = new JLabel("2° Número:");
        rotulo1.setBounds(50, 70, 100, 23);
        rotulo2.setBounds(50, 120, 100, 23);
        
        //JTextField - campo
        texto1 = new JTextField(10);
        texto2 = new JTextField(10);
        texto1.setBounds(50, 95, 250, 23);
        texto2.setBounds(50, 140, 250, 23);
   
        //Icone dos botões
        somar_icon = new ImageIcon("somar_icon.png");
        subtrair_icon = new ImageIcon("subtrair_icon.png");
        multiplicar_icon = new ImageIcon("multiplicar_icon.png");
        dividir_icon = new ImageIcon("dividir_icon.png");
        
        //Botões
        somar = new JButton("Somar     ",somar_icon);
        subtrair = new JButton("Subtrair  ", subtrair_icon);
        multiplicar = new JButton("Multiplicar", multiplicar_icon);
        dividir = new JButton("Dividir   ", dividir_icon);
        
        //Posicionando os Botões na Tela
        somar.setBounds(50, 175, 120, 23);
        subtrair.setBounds(180, 175, 120, 23);
        multiplicar.setBounds(50, 210, 120, 23);
        dividir.setBounds(180, 210, 120, 23);
        
        //Adicionando Cor aos Botões
        somar.setBackground(Color.WHITE);
        subtrair.setBackground(Color.WHITE);
        dividir.setBackground(Color.WHITE);
        multiplicar.setBackground(Color.WHITE);
        
        //Exibe o Resultado
        exibir = new JLabel("");
        exibir.setBounds(130, 260, 300, 20);
 
        //Ações que o programa fará
        // Método para o botão de somar
        somar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                int numero2 = Integer.parseInt(texto2.getText());
 
                int soma = numero1 + numero2;
                exibir.setText("A soma é: " + soma);
            }
        });
        
        // Método para o botão de subtração
        subtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                int numero2 = Integer.parseInt(texto2.getText());
 
                int subtracao = numero1 - numero2; 
                exibir.setText("A subtração é: " + subtracao);
            }
        });
 
        // Método para o botão de multiplicação
        multiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                int numero2 = Integer.parseInt(texto2.getText());
 
                int multiplicacao = numero1 * numero2;
                exibir.setText("A multiplicação é: " + multiplicacao);
            }
        });
 
        //Método para o botão de divisão
        dividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                int numero2 = Integer.parseInt(texto2.getText());
 
                if (numero2 != 0) {
                    double divisao = (double) numero1 / numero2;
                    exibir.setText("A divisão é: " + divisao);
                } else {
                    exibir.setText("Erro: Divisão por zero");
                }
            }
        });
        exibir.setVisible(true);
 
        //Adicionando os Elementos na Tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(exibir);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);
        tela.add(texto1);
        tela.add(texto2);

       //Tela
        setSize(370,320);
        setVisible(true);
        setLocationRelativeTo(null); 
    }
     public static void main(String[] args) {
        //INSTANCIAMENTO DA CLASSE 
        Exercicio_Evento_Soma start = new  Exercicio_Evento_Soma();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}