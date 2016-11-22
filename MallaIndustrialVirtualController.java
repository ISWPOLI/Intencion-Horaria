package interfaz;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MallaIndustrialVirtualController implements Initializable {
 
   private Stage stage;   
   public Button btnGrabar;
   public Button btnSalir;
   public Button btnDibujo;
   public Button btnPensamiento;
   public Button btnMatematicas;
   public Button btnTecnicas;
   public Button btnIntroduccion;
   public Button btnHerramientas;
   public Button btnProgramacion;
   public Button btnEtica;
   public Button btnCalculo1;
   public Button btnAlgebra;
   public Button btnCalculo2;
   public Button btnFisica1;
   public Button btnOrganizacion;
   public Button btnConstitucion;
   public Button btnGestionInventarios;
   public Button btnProcesos;   
   public Button btnCostos;
   public Button btnFisica3;
   public Button btnEstadistica;
   public Button btnCalculo3;
   public Button btnFisica2;
   public Button btnElectiva1;
   public Button btnSistemas;
   public Button btnCompras;
   public Button btnFinancieras;
   public Button btnProbabilidad;
   public Button btnElectiva2;
   public Button btnOper;
   public Button btnGestionTransporte;
   public Button btnEstocastica;
   public Button btnLogistica;
   public Button btnCultura;
   public Button btnGestionTalento;
   public Button btnControl;
   public Button btnDistribucion;
   public Button btnSimulacion;
   public Button btnEnfasis1;
   public Button btnContabilidad;
   public Button btnElectiva3;
   public Button btnGerencia;
   public Button btnEnfasis2;
   public Button btnElectiva4;
   public Button btnIngles1;
   public Button btnIngles2;
   public Button btnQuimica;
   public Button btnPractica;
   public Button btnProduccion;
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