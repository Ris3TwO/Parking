/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import mvc.registro;
import views.Main;
import views.RegisterVehicle;
/**
 *
 * @author stalker
 */
public class button_control implements ActionListener{
    
    private Main vista = new Main();
    private registro model;
    private RegisterVehicle reg;
    
    public button_control(Main vista, RegisterVehicle reg){
        this.model=new registro();
        this.vista = vista;
        this.reg = reg;
        
        //Botones de vista Main
        this.vista.getBtnSalir().addActionListener(this);
        this.vista.getBtnPuesto10().addActionListener(this);
        
        //Botones de vista Registro
        this.reg.getBtn_save().addActionListener(this);
        this.reg.getBtnCancelar().addActionListener(this);
    }
    
    public void Inicio(){
        vista.setLocationRelativeTo(null);
        reg.setLocationRelativeTo(vista);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.getBtnSalir()) {
            System.exit(0);
        }   
       
        if (e.getSource() == vista.getBtnPuesto10()) {
            reg = new RegisterVehicle(vista, true);
            button_control control = new button_control(vista,reg);
            control.Inicio();
            reg.setVisible(true);
            model.setPuesto(10);
            System.out.println("Que te pasa cv"+ model.getPuesto());
        }
        
        if (e.getSource() == reg.getBtn_save()) {
          
            JOptionPane.showInputDialog("Confirmed");
            System.out.println("Que te pasa cv");
        }
        
        if (e.getSource() == reg.getBtnCancelar()){
            reg.dispose();
        }
        
        
    }  
}
