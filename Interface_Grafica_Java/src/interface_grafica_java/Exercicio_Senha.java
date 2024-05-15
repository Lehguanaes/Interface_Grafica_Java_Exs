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

//Máscara na senha!
public class Exercicio_Senha extends JFrame{
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    //Label da caixa
    JLabel rotulo;
    
    //Caixa da senha
    JPasswordField caixa;
        
    // CRIAÇÃO DO MÉTODO CONSTRUTOR
    public Exercicio_Senha(){
        
        // TITULO DA PÁGINA
        super("Senha");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();
        
        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        //Definindo o título da janela
        JLabel titleLabel = new JLabel("Digite a senha:", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 23));
        titleLabel.setForeground(Color.red);
        titleLabel.setBounds(0, 10, 400, 60);
        tela.add(titleLabel);
        
        //Icone da janela 
        ImageIcon icone = new ImageIcon("senha_icon.png");
        setIconImage(icone.getImage());
        
        //Adicionando Nomes aos Label's
        rotulo = new JLabel ("Senha:");
        rotulo.setFont(new Font("Serif", Font.BOLD, 18));
        caixa = new JPasswordField (10);
        
        // UTILIZAÇÃO DOS OBJETOS
        // setBounds SERVE PARA DEFINIR O LOCAL DE CADA ELEMENTO, (X,Y) - (LINHA,COLUNA
        rotulo.setBounds(80, 70, 100, 20);
        caixa.setBounds(80, 100, 220, 20);
        
        //Adicionando cor aos campos
        caixa.setForeground(Color.red);
        caixa.setBackground(Color.black);
        
        //Adicionando na Tela
        tela.add(rotulo);
        tela.add(caixa);
        
        //Tela
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null); 
   }
     public static void main(String[] args) {
        //INSTANCIAMENTO DA CLASSE 
        Exercicio_Senha start = new  Exercicio_Senha();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 