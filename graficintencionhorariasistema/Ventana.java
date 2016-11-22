/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficintencionhorariasistema;

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
            FXMLLoader loader = new FXMLLoader(Ventana.class.getResource("VentanaPrincipal.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene ( rootPane);
            stagePrincipal.setTitle("Ventana Principal");
            stagePrincipal.setScene(scene);
            VentanaPrincipalController controller = loader.getController();
            controller.setProgramaPrincipal(this);
            stagePrincipal.show();
        }catch(IOException e){
            
        }
    }
    
    public void mostrarVentanaMateria(){
        try{
            FXMLLoader loader = new FXMLLoader(Ventana.class.getResource("VentanaMateria.fxml"));
            AnchorPane ventanaMateria = (AnchorPane) loader.load();
            Stage ventana = new Stage();
            ventana.setTitle("Registro Materia");
            ventana.initOwner(stagePrincipal);
            Scene scene = new Scene (ventanaMateria);
            ventana.setScene(scene);
            VentanaMateriaController controller = loader.getController();
            controller.setStagePrincipal(ventana);
            ventana.show();
            
        }catch(IOException e){
            
        }
    }
     

    public void mostrarVentanaPrograma(){
        try{
            FXMLLoader loader = new FXMLLoader(Ventana.class.getResource("VentanaPrograma.fxml"));
            AnchorPane ventanaPrograma= (AnchorPane) loader.load();
            Stage ventana = new Stage();
            ventana.setTitle("Registro Programa");
            ventana.initOwner(stagePrincipal);
            Scene scene = new Scene (ventanaPrograma);
            ventana.setScene(scene);
            VentanaProgramaController controller = loader.getController();
            controller.setStagePrincipal(ventana);
            ventana.show();
            
        }catch(IOException e){
            
        }
    }
    
     public void mostrarVentanaFacultad(){
        try{
            FXMLLoader loader = new FXMLLoader(Ventana.class.getResource("VentanaFacultad.fxml"));
            AnchorPane ventanaFacultad= (AnchorPane) loader.load();
            Stage ventana = new Stage();
            ventana.setTitle("Registro Facultad");
            ventana.initOwner(stagePrincipal);
            Scene scene = new Scene (ventanaFacultad);
            ventana.setScene(scene);
            VentanaFacultadController controller = loader.getController();
            controller.setStagePrincipal(ventana);
            ventana.show();
            
        }catch(IOException e){
            
        }
    }
}
 
   