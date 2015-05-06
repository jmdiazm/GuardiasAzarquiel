package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class ControladorLogin {

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
    	estado.setText("correcto");
    }/*
    
    private int factorial(int i) {
    	return i*i;
    }

    @FXML
    void initialize() {
        assert resultado != null : "fx:id=\"resultado\" was not injected: check your FXML file 'VistaFactorial.fxml'.";
        assert numero != null : "fx:id=\"numero\" was not injected: check your FXML file 'VistaFactorial.fxml'.";
        assert calcular != null : "fx:id=\"calcular\" was not injected: check your FXML file 'VistaFactorial.fxml'.";

        resultado.setText("Esperando...");
        
    }*/
}

