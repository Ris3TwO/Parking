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
import views.RegistroVehiculo;
/**
 *
 * @author stalker
 */
public class button_control implements ActionListener{
    
    private Main vista = new Main();
    private registro model;
    private RegistroVehiculo reg;
    private int contador = 0;
    
    @SuppressWarnings("LeakingThisInConstructor")
    public button_control(Main vista, RegistroVehiculo reg){
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
        contador = 0;
    }
    
    public void InicioReg(){
        reg.setLocationRelativeTo(vista);
        contador++;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.getBtnSalir()) {
            System.exit(0);
        }   
        
        if (contador == 0){
            if (e.getSource() == vista.getBtnPuesto10()) {
                reg = new RegistroVehiculo(vista, true);
                button_control control = new button_control(vista,reg);
                control.InicioReg();
                reg.setVisible(true);
                model.setPuesto(10);
                System.out.println("Que te pasa cv"+ model.getPuesto()); 
            }
        }
        
        if (e.getSource() == reg.getBtn_save()) {
          
            JOptionPane.showInputDialog("Confirmed");
            System.out.println("Que te pasa cv");
        }
        
        if (e.getSource() == reg.getBtnCancelar()){
            if (contador != 0){
                reg.dispose();
            } 
        }
    }  
}
