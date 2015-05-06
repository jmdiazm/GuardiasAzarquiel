package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage Principal) throws Exception{
			Parent dise�oprincipal = FXMLLoader.load(getClass().getResource("Dise�o.fxml"));
			Scene ventanaprincipal = new Scene(dise�oprincipal);
			Principal.setScene(ventanaprincipal);
			Principal.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}