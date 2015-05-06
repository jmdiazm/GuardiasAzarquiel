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
    PasswordField contraseņa;

    @FXML
    void enviar(ActionEvent event) {
    	if ((usuario.getText()).equals(contraseņa.getText())) {
    		estado.setText("Contraseņa Correcta");    		
    	}
    	else if (!(usuario.getText()).equals(contraseņa.getText())) {
    		estado.setText("Error, la contraseņa y el nombre no coinciden");
    	}
    	else {
    		estado.setText("Introduzca un nombre de usuario y contraseņa");
    	}
    }
    
}

