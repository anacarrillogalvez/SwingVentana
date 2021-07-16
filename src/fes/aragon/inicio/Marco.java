/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.codigo.EventoVentana;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author HP_All_in_One
 */
public class Marco extends JFrame {
    
    private final int ANCHURA = 300; //Constantes van en Mayusculas
    private final int ALTURA = 300;
    
    public Marco() {
        this.inicio();
        
    }
    
    public static void main(String[] args) {
        Marco Ventana = new Marco();
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Minimizar, maximizar y cerrar
        Ventana.setVisible(true);
        
    }
    
    private void inicio(){
        //Dimensines de la pantalla del usuario 
        Toolkit hr = Toolkit.getDefaultToolkit(); //Da la resolucion de la pantalla del usuario.
        Dimension tmVentana = hr.getScreenSize();
        int ancho = tmVentana.width;
        int alto = tmVentana.height;
        this.setSize(ancho/2, alto/2); //Este metodo realiza el cambio 
       
        //this.setSize(ANCHURA, ALTURA);
        this.setTitle("Los Michis");
        this.setResizable(false); //El usuario no puede cambiar el tamaño de la ventana
        this.setLocationRelativeTo(this);
        
        Image img = hr.getImage(getClass().getResource("/fes/aragon/inicio/michi.png"));
        this.setIconImage(img);
        //Agregando el oyente a JFrame 
        EventoVentana oyente = new EventoVentana();
        this.addWindowListener(oyente);
    }
    
    
}
