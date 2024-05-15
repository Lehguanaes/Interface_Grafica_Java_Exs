/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_grafica_java;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import java.text.*;
import java.awt.*;
/**
 *
 * @author Letícia Guanaes Moreira
 */

//Máscara e definição de formatos!
public class Exercicio_Mascara extends JFrame{
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    //Label dos campos
    JLabel rotulo_cep,rotulo_tel,rotulo_cpf,rotulo_data;
    
    //Campos
    JFormattedTextField cep, tel, cpf, data;
    
    //Mascara dos Campos
    MaskFormatter  mascara_cep, mascara_tel ,mascara_cpf,mascara_data;
    
    // CRIAÇÃO DO MÉTODO CONSTRUTOR
    public Exercicio_Mascara(){
        // TITULO DA PÁGINA
        super("Mascara");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();
        
        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        //Definindo o título da janela
        JLabel titleLabel = new JLabel("Cadastro do Cliente", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 22));
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setBounds(0, 0, 400, 60);
        tela.add(titleLabel);
        
        //Icone da janela 
        ImageIcon icone = new ImageIcon("mascara_icon.png");
        setIconImage(icone.getImage());
        
        //Adicionando Nomes aos Label's
        rotulo_cep = new JLabel ("*CEP:");
        rotulo_tel = new JLabel ("*Telefone:");
        rotulo_cpf = new JLabel ("*CPF:");
        rotulo_data = new JLabel ("*Data:");
       
        //Definindo as Mascaras dos Campos
        try{
            mascara_cep = new MaskFormatter ("#####-###");
            mascara_tel = new MaskFormatter ("##)####-####");
            mascara_cpf = new MaskFormatter ("#########-##");
            mascara_data = new MaskFormatter ("##/##/####");
            mascara_cep.setPlaceholderCharacter('_');
            mascara_tel.setPlaceholderCharacter('_');
            mascara_cpf.setPlaceholderCharacter('_');
            mascara_data.setPlaceholderCharacter('_');
        }
        catch(ParseException excp){}
        
        //Adicinando as Mascaras aos Campos
        cep = new JFormattedTextField (mascara_cep);
        tel = new JFormattedTextField (mascara_tel);
        cpf = new JFormattedTextField (mascara_cpf);
        data = new JFormattedTextField (mascara_data);
        
        //Posicionando os Elementos
        //Rótulos
        rotulo_cep.setBounds(50, 65, 120, 20);
        rotulo_tel.setBounds(200, 65, 120, 20);
        rotulo_cpf.setBounds(50, 115, 120, 20);
        rotulo_data.setBounds(200, 115, 120, 20);
        
        //Campos
        cep.setBounds(50, 85, 120, 20);
        tel.setBounds(200, 85, 120, 20);
        cpf.setBounds(50, 135, 120, 20);
        data.setBounds(200, 135, 120, 20);

        //Adicionando Cor as Mascaras
        cep.setForeground(Color.red);
        tel.setForeground(Color.red);
        cpf.setForeground(Color.red);
        data.setForeground(Color.red);
        
        //Adicionando na Tela
        tela.add(rotulo_cep);
        tela.add(rotulo_tel);
        tela.add(rotulo_cpf);
        tela.add(rotulo_data);
        tela.add(cep);
        tela.add(tel);
        tela.add(cpf);
        tela.add(data);
        
        //Tela
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null); 
   }
     public static void main(String[] args) {
        //INSTANCIAMENTO DA CLASSE 
        Exercicio_Mascara start = new  Exercicio_Mascara();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 