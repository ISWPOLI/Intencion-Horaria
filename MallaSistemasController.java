package interfaz;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MallaSistemasController implements Initializable {
 
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
   public Button btnHerramientas;
   public Button btnConstitucion;
   public Button btnEstructuras;
   public Button btnElementos;
   public Button btnCalculo2;
   public Button btnFisica1;
   public Button btnParadigmas;
   public Button btnAutomatas;
   public Button btnBases;
   public Button btnCalculo3;
   public Button btnFisica2;
   public Button btnElectiva1;
   public Button btnIngesoft1;
   public Button btnProceso;
   public Button btnMetodos;
   public Button btnProbabilidad;
   public Button btnElectiva2;
   public Button btnOper;
   public Button btnTeleco;
   public Button btnPractica;
   public Button btnDigitales;
   public Button btnCultura;
   public Button btnQuimica;
   public Button btnIngesoft2;
   public Button btnOperacionales;
   public Button btnAnalisis;
   public Button btnEnfasis1;
   public Button btnArquitectura;
   public Button btnElectiva3;
   public Button btnGerencia;
   public Button btnDistribuidos;
   public Button btnEnfasis2;
   public Button btnEnfasis3;
   public Button btnElectiva4;
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