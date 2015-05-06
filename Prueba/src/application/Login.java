package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Login extends Application {
	public static void main(String[] args) {
		Application.launch(Login.class, (java.lang.String[]) null);
	
	}
	
	@Override
	public void start(Stage Login) throws Exception{
			Parent diseņoLogin = FXMLLoader.load(Login.class.getResource("Login.fxml"));
			Scene ventanaLogin = new Scene(diseņoLogin);
			Login.setTitle("Prueba login y botones");
			Login.setScene(ventanaLogin);
			Login.show();
	}
}