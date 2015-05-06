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
    PasswordField contraseña;

    @FXML
    void enviar(ActionEvent event) {
    	if ((usuario.getText()).equals(contraseña.getText())) {
    		estado.setText("Contraseña Correcta");
    		/*Prueba del boton*/
    	}
    	else if (!(usuario.getText()).equals(contraseña.getText())) {
    		estado.setText("Error, la contraseña y el nombre no coinciden");
    	}
    	else {
    		estado.setText("Introduzca un nombre de usuario y contraseña");
    	}
    }
    
}

