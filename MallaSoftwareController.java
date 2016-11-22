package interfaz;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MallaSoftwareController implements Initializable {
 
   private Stage stage;
   public Button btnSalir;
   public Button btnGrabar;
   public Button btnPensamiento;
   public Button btnMatematicas;
   public Button btnTecnicas;
   public Button btnHerramientasPro;
   public Button btnIngles1;
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
   public Button btnPSP;
   public Button btnPersistencia;
   public Button btnBases;
   public Button btnFundamentos;
   public Button btnElectiva1;
   public Button btnIngesoft1;
   public Button btnTSP;
   public Button btnMetodos;
   public Button btnProbabilidad;
   public Button btnElectiva2;
   public Button btnOper;
   public Button btnTeleco;
   public Button btnPruebas;
   public Button btnDigitales;
   public Button btnCultura;
   public Button btnQuimica;
   public Button btnArqSoft;
   public Button btnOperacionales;
   public Button btnAnalisis;
   public Button btnEnfasis1;
   public Button btnArquitectura;
   public Button btnElectiva3;
   public Button btnGerencia;
   public Button btnDistribuidos;
   public Button btnEnfasis2;
   public Button btnEnfasis3;
   public Button btnEmprendimiento;
   public Button btnIngles2;
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