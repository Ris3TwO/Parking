/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import views.Main;
/**
 *
 * @author stalker
 */
public class button_control implements ActionListener{
    private Main vista;
    
    public button_control(Main vista){
        this.vista = vista;
        this.vista.getBtnSalir().addActionListener(this);
        this.vista.getBtnPuesto1().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.getBtnSalir()) {
            System.exit(0);
        }
        
        if (e.getSource() == vista.getBtnPuesto1()) {
            JOptionPane.showInputDialog("Por favor confirme");
        } else {
        }
    }  
}
