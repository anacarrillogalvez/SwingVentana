/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.codigo;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author HP_All_in_One
 */
public class EventoVentana implements WindowListener{

   
    @Override
    public void windowOpened(WindowEvent arg0) {
        System.out.println("Abir ventana...");
    }

    @Override
    public void windowClosing(WindowEvent arg0) {
        System.out.println("Cierre de  ventana...");
    }

    @Override
    public void windowClosed(WindowEvent arg0) {
        System.out.println("Cerrada...");
    }

    @Override
    public void windowIconified(WindowEvent arg0) {
        System.out.println("Minimizar...");
    }

    @Override
    public void windowDeiconified(WindowEvent arg0) {
        System.out.println("Maximizar...");
    }

    @Override
    public void windowActivated(WindowEvent arg0) {
        System.out.println("Activa...");
    }

    @Override
    public void windowDeactivated(WindowEvent arg0) {
        System.out.println("Desactivar...");
    }
    
}
