package application;


import javafx.scene.control.Button;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

public class ControlFX {
	
	
    @FXML
    private Button btnCerrar;
	
   @FXML
   void cerrar(MouseEvent event) {
   	System.exit(0);
   }
   
   @FXML
   void cerrarSegundaVentana(MouseEvent event ) {
	   
	   Stage thisStage = (Stage)  btnCerrar.getScene().getWindow();
	   thisStage.close();

	   }
     

   public void mostrarVentanaSecundaria() {
       try {
           FXMLLoader loader = new FXMLLoader(MainFX.class.getResource("../views/FreeSolo.fxml"));
           AnchorPane ventanaDos = (AnchorPane) loader.load();
           Stage ventana = new Stage();
           //ventana.setTitle("Venta Dos");
           Window stagePrincipal = null;
		   ventana.initOwner(stagePrincipal);
           Scene scene = new Scene(ventanaDos);
           ventana.initStyle(StageStyle.DECORATED);
           ventana.setScene(scene);
           ventana.show();

       } catch (Exception e) {
           //tratar la excepción
       }
   }

 
   
}
