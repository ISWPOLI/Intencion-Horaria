package interfaz;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MallaTelecomunicacionesController implements Initializable {
 
   private Stage stage;
   public Button btnSalir;
   public Button btnGrabar;
   public Button btnPensamiento;
   public Button btnMatematicas;
   public Button btnCatedra;
   public Button btnIntro;
   public Button btnLecto;
   public Button btnProgramacion;
   public Button btnEtica;
   public Button btnCalculo1;
   public Button btnAlgebra;
   public Button btnIntroRedes;
   public Button btnConstitucion;
   public Button btnEnrutamiento;
   public Button btnDiseno;
   public Button btnElectricos1;
   public Button btnFisica1;
   public Button btnInterconexion;
   public Button btnElectricos2;
   public Button btnElectronicos1;
   public Button btnCalculo3;
   public Button btnFisica2;
   public Button btnElectiva1;
   public Button btnElectronicos2;
   public Button btnDigitales;
   public Button btnEcuaciones;
   public Button btnProbabilidad;
   public Button btnElectiva2;
   public Button btnOper;
   public Button btnRedes;
   public Button btnSeguridad;
   public Button btnFundamentos;
   public Button btnCultura;
   public Button btnQuimica;
   public Button btnMedios;
   public Button btnSenales;
   public Button btnAntenas;
   public Button btnEnfasis1;
   public Button btnTelevision;
   public Button btnElectiva3;
   public Button btnGestion;
   public Button btnEvaluacion;
   public Button btnEnfasis2;
   public Button btnEnfasis3;
   public Button btnElectiva4;
   public Button btnCalculo2;
   public Button btnGrado;
          
    public void setStagePrincipal(Stage stagePrincipal) {
    	this.stage=stagePrincipal;
    }
    @FXML
    private void oprimirBotonSalir(ActionEvent event) throws Exception {
        stage.close();
    }
    @FXML
    private void clickMateria(ActionEvent e) throws Exception{
    	System.out.println(e.getSource().toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
}