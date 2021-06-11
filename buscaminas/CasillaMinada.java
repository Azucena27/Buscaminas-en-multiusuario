/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import javax.swing.JOptionPane;
/**
 *
 * @author Azucena
 */

public class CasillaMinada extends Casilla {

    public CasillaMinada(int coorX, int coorY, JuegoFrame ventana) {
        super(coorX, coorY, ventana);
    }

    @Override
    public void destapar(){
        this.estado = 1;
        ventana.reiniciarDestapadas();
        ventana.destaparMinadas(this.coorX, this.coorY);
        perder();
    }
    
    public void perder(){                      
        int respuesta = JOptionPane.showConfirmDialog(null, "                ¡Perdiste! :( \nDesea jugar una nueva partida?", "¿Qué desea hacer?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
        
        if(respuesta == JOptionPane.NO_OPTION){
            System.exit(0);
        }else{
            this.ventana.perder();
            DificultadFrame f = new DificultadFrame();
            f.setVisible(true);
        } 
    }
}