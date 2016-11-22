package interfaz;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MallaMatematicasController implements Initializable {
 
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
   public Button btnEstadistica;
   public Button btnAbstracta1;
   public Button btnLogica;
   public Button btnCalculo3;
   public Button btnFisica2;
   public Button btnElectiva1;
   public Button btnEcuaciones;
   public Button btnAbstracta2;
   public Button btnMetodos;
   public Button btnProbabilidad;
   public Button btnElectiva2;
   public Button btnOper;
   public Button btnDocente1;
   public Button btnDocente2;
   public Button btnVariable;
   public Button btnCultura;
   public Button btnQuimica;
   public Button btnTopologia;
   public Button btnFuncional;
   public Button btnAnalisisReal;
   public Button btnEnfasis1;
   public Button btnElectiva3;
   public Button btnGeometria;
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