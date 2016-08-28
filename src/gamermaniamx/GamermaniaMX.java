/*
Autor Mao rivera Sanchez Armas
Creado para GamerManiaMX
*/
package gamermaniamx;

import javax.swing.JFrame;


public class GamermaniaMX {

    
    public static void main(String[] args) {
      //Instanciamos la portada y la maximizamos
        Portada portada=new Portada();
        portada.setExtendedState(JFrame.MAXIMIZED_BOTH);
        portada.setDefaultCloseOperation(portada.EXIT_ON_CLOSE);
        portada.setVisible(true);
    }
    
}
