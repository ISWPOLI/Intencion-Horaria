package interfaz;

import java.io.IOException;
import javax.swing.JOptionPane;
import basededatos.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Login extends Application {

    private static Stage stage;
    private AnchorPane rootPane;
    private static ConectarBD basededatos;
    
    @Override
    public void start(Stage stage) throws Exception {
        Login.stage=stage;
        Login.stage.setTitle("Ventana Login");
        mostrarLogin();
    }

    public void mostrarLogin() throws IOException{
        try{
            FXMLLoader loader=new FXMLLoader(Login.class.getResource("Login.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene=new Scene(rootPane);
            stage.setTitle("Ventana Login");
            stage.setScene(scene);
           	LoginController controller=loader.getController();
            controller.setLogin(this);
            stage.show();  
            }
            catch (IOException e) {
				
			}
    }  
    
    public static void mostrarMallaSistemas(){
        try{
            FXMLLoader loader = new FXMLLoader(Login.class.getResource("MallaSistemas.fxml"));
            AnchorPane ventanaMalla= (AnchorPane) loader.load();
            Stage ventana = new Stage();
            ventana.setTitle("Malla de estudiante");
            ventana.initOwner(stage);
            Scene scene = new Scene (ventanaMalla);
            ventana.setScene(scene);
            MallaSistemasController controller = loader.getController();
            controller.setStagePrincipal(ventana);
            ventana.show();
            
        }catch(IOException e){
            
        }
    }

    public static void mostrarMallaIndustrial(){
        try{
            FXMLLoader loader = new FXMLLoader(Login.class.getResource("MallaIndustrial.fxml"));
            AnchorPane ventanaMalla= (AnchorPane) loader.load();
            Stage ventana = new Stage();
            ventana.setTitle("Malla de estudiante");
            ventana.initOwner(stage);
            Scene scene = new Scene (ventanaMalla);
            ventana.setScene(scene);
            MallaIndustrialController controller = loader.getController();
            controller.setStagePrincipal(ventana);
            ventana.show();
            
        }catch(IOException e){
            
        }
    }
    public static void mostrarMallaMatematicas(){
        try{
            FXMLLoader loader = new FXMLLoader(Login.class.getResource("MallaMatematicas.fxml"));
            AnchorPane ventanaMalla= (AnchorPane) loader.load();
            Stage ventana = new Stage();
            ventana.setTitle("Malla de estudiante");
            ventana.initOwner(stage);
            Scene scene = new Scene (ventanaMalla);
            ventana.setScene(scene);
            MallaMatematicasController controller = loader.getController();
            controller.setStagePrincipal(ventana);
            ventana.show();
            
        }catch(IOException e){
            
        }
    }
    public static void mostrarMallaTelecomunicaciones(){
        try{
            FXMLLoader loader = new FXMLLoader(Login.class.getResource("MallaTelecomunicaciones.fxml"));
            AnchorPane ventanaMalla= (AnchorPane) loader.load();
            Stage ventana = new Stage();
            ventana.setTitle("Malla de estudiante");
            ventana.initOwner(stage);
            Scene scene = new Scene (ventanaMalla);
            ventana.setScene(scene);
            MallaTelecomunicacionesController controller = loader.getController();
            controller.setStagePrincipal(ventana);
            ventana.show();
            
        }catch(IOException e){
            
        }
    }
    
    public static void mostrarMallaSoftware(){
        try{
            FXMLLoader loader = new FXMLLoader(Login.class.getResource("MallaSoftware.fxml"));
            AnchorPane ventanaMalla= (AnchorPane) loader.load();
            Stage ventana = new Stage();
            ventana.setTitle("Malla de estudiante");
            ventana.initOwner(stage);
            Scene scene = new Scene (ventanaMalla);
            ventana.setScene(scene);
            MallaSoftwareController controller = loader.getController();
            controller.setStagePrincipal(ventana);
            ventana.show();
            
        }catch(IOException e){
            
        }
    }
    
    public static void mostrarMallaIndustrialVirtual(){
        try{
            FXMLLoader loader = new FXMLLoader(Login.class.getResource("MallaIndustrialVirtual.fxml"));
            AnchorPane ventanaMalla= (AnchorPane) loader.load();
            Stage ventana = new Stage();
            ventana.setTitle("Malla de estudiante");
            ventana.initOwner(stage);
            Scene scene = new Scene (ventanaMalla);
            ventana.setScene(scene);
            MallaIndustrialVirtualController controller = loader.getController();
            controller.setStagePrincipal(ventana);
            ventana.show();
            
        }catch(IOException e){
            
        }
    }
    
    public static void validarLogin(String codigo, String identificacion, String sede) throws IOException {
		if(basededatos.validarLogin(codigo, identificacion, sede)) {
			System.out.println("Inicio de sesión exitoso");
			Login.cerrarVentana();
			int a =basededatos.getPrograma(codigo, identificacion, sede);
			System.out.println(a);
			if(a==10)Login.mostrarMallaMatematicas();
			else if(a==20)Login.mostrarMallaIndustrial();
			else if(a==30)Login.mostrarMallaTelecomunicaciones();
			else if(a==40)Login.mostrarMallaSistemas();
			else if(a==50)Login.mostrarMallaIndustrialVirtual();
			else if(a==60)Login.mostrarMallaSoftware();
		}
		else{
			JOptionPane.showMessageDialog(null, "Verifique código e identificación","Error de inicio de sesión",JOptionPane.ERROR_MESSAGE);
		}		
	}	
    public static void cerrarVentana() {
		stage.close();
	}     
    public int traerPrograma(String codigo, String identificacion, String sede) throws IOException {
    	return basededatos.getPrograma(codigo, identificacion, sede);
    }    
    public static void main(String[] args) throws Exception {
        basededatos=new ConectarBD();
    	Login.launch();
    }    
}