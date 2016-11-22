package interfaz;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;


public class LoginController implements Initializable {
    public Button btnSalir;
    public Button btnEntrar;
    public TextField txtCodigo;
    public TextField txtIdentificacion;
    public ComboBox<String> boxSede;
    
    public void setLogin (Login login){
    }    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        boxSede.getItems().removeAll(boxSede.getItems());
        boxSede.getItems().addAll("Bogota", "Medellin", "Alianza SENA");
        boxSede.getSelectionModel().select("");
    }   
    @FXML
    private void oprimirBotonSalir(ActionEvent event) throws Exception {
        Login.cerrarVentana();
    } 
    @FXML
    private void oprimirBotonEntrar(ActionEvent event) throws Exception {
        Login.validarLogin(txtCodigo.getText(), txtIdentificacion.getText(), boxSede.getSelectionModel().getSelectedItem());
    } 
}