package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControladorLogin extends Main{

	@FXML
    Button enviar;
    @FXML
    Button cancelar;
    @FXML
    Label estado;
    @FXML
    TextField usuario;
    @FXML
    PasswordField contrase�a;

    @FXML
    void enviar(ActionEvent event) {
    	if ((usuario.getText()).equals(contrase�a.getText())) {
    		estado.setText("Contrase�a Correcta");
    		/*Prueba del boton*/
    	}
    	else if (!(usuario.getText()).equals(contrase�a.getText())) {
    		estado.setText("Error, la contrase�a y el nombre no coinciden");
    	}
    	else {
    		estado.setText("Introduzca un nombre de usuario y contrase�a");
    	}
    }
    
}

