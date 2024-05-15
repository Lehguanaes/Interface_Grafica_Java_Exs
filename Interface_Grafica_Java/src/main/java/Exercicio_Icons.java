/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Letícia Guanaes Moreira
 */

//Formulário com Icones!
public class Exercicio_Icons extends JFrame {
    // CRIAÇÃO DE VARIÁVEIS DE INSTANCIA
    // JLABEL - USADO PARA CRIAR ESPAÇO DE JANELA
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6,rotulo7;
   
    // JTEXTFIELD - CAIXA DE TEXTO
    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7;
    
    //Botões
    JButton botao1, botao2;
    
    //icone botão
    ImageIcon icone_logout, icone_deletar;
    
    // CRIAÇÃO DO MÉTODO CONSTRUTOR
    public Exercicio_Icons(){
         
        // TITULO DA PÁGINA
        super("Cadastro");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();
        
        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
      
        /* CRIAÇÃO DOS OBJETOS */
        // JLabel's e JTextField's
        
        //Definindo o título da janela
        JLabel titleLabel = new JLabel("Cadastro do Cliente", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 21));
        titleLabel.setForeground(Color.blue);
        titleLabel.setBounds(0, 0, 400, 60);
        tela.add(titleLabel);
        
        // VARIÁVEL = NOVO OBJETO JLABEL ("NOME DO CAMPO")
        rotulo1 = new JLabel ("Nome:");
        rotulo2 = new JLabel ("CPF:");
        rotulo3 = new JLabel ("RG:");
        rotulo4 = new JLabel ("Endereço:");
        rotulo5 = new JLabel ("Cidade:");
        rotulo6 = new JLabel ("Estado:");
        rotulo7 = new JLabel ("CEP:");
        
        // VARIÁVEL = NOVO OBJETO JTextField (QUANTIDADE DE CARACTERES QUE SUPORTA)
        texto1 = new JTextField (50);
        texto2 = new JTextField (3);
        texto3 = new JTextField (10);
        texto4 = new JTextField (50);
        texto5 = new JTextField (40);
        texto6 = new JTextField (30);
        texto7 = new JTextField (8);
        
        //Icone da janela 
        ImageIcon icone = new ImageIcon("form_icone.png");
        setIconImage(icone.getImage());
        
        //Icone dos botões
        icone_logout = new ImageIcon("abrir-cadeado.png");
        icone_deletar = new ImageIcon("deletar_icone.png");
        
        //Botões
        botao1 = new JButton ("Abrir",icone_logout);
        botao2 = new JButton ("Deletar", icone_deletar);
        
        //Adicionando cores nos botões
        botao1.setForeground(Color.blue);
        botao2.setForeground(Color.blue);
       
        // UTILIZAÇÃO DOS OBJETOS
        // setBounds SERVE PARA DEFINIR O LOCAL DE CADA ELEMENTO, (X,Y) - (LINHA,COLUNA)
        rotulo1.setBounds(50,50,80,20);
        rotulo2.setBounds(50,90,80,20);
        rotulo3.setBounds(50,130,80,20);
        rotulo4.setBounds(50,170,80,20);
        rotulo5.setBounds(50,210,80,20);
        rotulo6.setBounds(50,250,80,20);
        rotulo7.setBounds(50,290,80,20);
        texto1.setBounds(50,70,240,20);
        texto2.setBounds(50,110,140,20);
        texto3.setBounds(50,150,120,20);
        texto4.setBounds(50,190,220,20);
        texto5.setBounds(50,230,190,20);
        texto6.setBounds(50,270,70,20);
        texto7.setBounds(50,310,110,20);
        botao1.setBounds(70,345,110,20);
        botao2.setBounds(230,345,110,20);
        
        //COM O O OBJETO "TELA" CRIADO NO CONTAINER, ADICIONAMOS OS OBJETOS NA TELA
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        tela.add(botao1);
        tela.add(botao2);
        
        //Tela
        setSize(420,430);
        setVisible(true);
        setLocationRelativeTo(null);   
    }
     public static void main(String[] args) {
        //INSTANCIAMENTO DA CLASSE 
        Exercicio_Icons start = new  Exercicio_Icons();
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 