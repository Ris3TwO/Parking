/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controlador.button_control;
import views.Main;

/**
 *
 * @author Ris3TwO
 */
public class home {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main view = new Main();
        view.setVisible(true);
        view.setLocationRelativeTo(null);
         button_control control = new button_control(view);
    }
    
}
