/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficintencionhorariasistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


/**
 *
 * @author mauricio
 */
public class VentanaPrincipalController implements Initializable {
    private Ventana ProgramaPrincipal;
    
    @FXML
    private void nuevaVentanaMateria(ActionEvent event){
        ProgramaPrincipal.mostrarVentanaMateria();
    }
     @FXML
    private void nuevaVentanaPrograma(ActionEvent event){
        ProgramaPrincipal.mostrarVentanaPrograma();
    }
       @FXML
    private void nuevaVentanaFacultad(ActionEvent event){
        ProgramaPrincipal.mostrarVentanaFacultad();
    }
    
    public void setProgramaPrincipal (Ventana ProgramaPrincipal){
        this.ProgramaPrincipal=ProgramaPrincipal;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
