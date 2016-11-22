/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficintencionhorarialogestudiante;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author mauricio
 */
public class Ventana extends Application {
    
    private Stage stagePrincipal;
    private AnchorPane rootPane;
    @Override
    public void start(Stage stagePrincipal) throws Exception {
        this.stagePrincipal=stagePrincipal;
        mostrarVentanaPrincipal();
    }

   
        public void mostrarVentanaPrincipal(){
        try{
            FXMLLoader loader = new FXMLLoader(Ventana.class.getResource("LogEstudiante.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene ( rootPane);
            stagePrincipal.setTitle("Acceso Estudiante");
            stagePrincipal.setScene(scene);
            LogEstudianteController controller = loader.getController();
            controller.setProgramaPrincipal(this);
            stagePrincipal.show();
        }catch(IOException e){
            
        }
    }
         public void mostrarVentanaLog2(){
        try{
            FXMLLoader loader = new FXMLLoader(Ventana.class.getResource("MallaEstudiante.fxml"));
            AnchorPane ventanaMateria = (AnchorPane) loader.load();
            Stage ventana = new Stage();
            ventana.setTitle("Malla Estudiante");
            ventana.initOwner(stagePrincipal);
            Scene scene = new Scene (ventanaMateria);
            ventana.setScene(scene);
            MallaEstudianteController controller = loader.getController();
            controller.setStagePrincipal(ventana);
            ventana.show();
            
        }catch(IOException e){
            
        }
    }
    
    
}
