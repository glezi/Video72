/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video72;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 *
 * @author gleez
 */
public class Video72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoRaton mimarco = new MarcoRaton(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
    }
}

class MarcoRaton extends JFrame{
    public MarcoRaton(){
        setVisible(true); 
        setBounds(700,300,600,450); 
        
        EventosDeRaton EventoRaton = new EventosDeRaton(); 
        addMouseListener(EventoRaton); 
    }
}

class EventosDeRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
       System.out.println("Has hecho click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Acabas de presionar");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Acabas de levantar");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       System.out.println("ACABAS DE ENTRAR");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Acabas de salir ");
    }


}