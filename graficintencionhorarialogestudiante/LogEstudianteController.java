/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficintencionhorarialogestudiante;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author mauricio
 */
public class LogEstudianteController implements Initializable {
    private Ventana ProgramaPrincipal;
    
     
    @FXML
    private void nuevaVentanaLog2(ActionEvent event){
        ProgramaPrincipal.mostrarVentanaLog2();
    }
    
     public void setProgramaPrincipal (Ventana ProgramaPrincipal){
        this.ProgramaPrincipal=ProgramaPrincipal;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
