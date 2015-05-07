package application;
	
import applicacion.modelo.Profesor;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	private ObservableList<Profesor> datosprofesor = FXCollections.observableArrayList();
	
	/*No funciona*/
	
	public Main(){
		
		datosprofesor.add(new Profesor("Juan Pablo", "Garcia Lopez"));
		datosprofesor.add(new Profesor("Miguel", "Diaz Lopez"));
		datosprofesor.add(new Profesor("Rafael", "Torrej�n Lopez"));
		datosprofesor.add(new Profesor("Javier", "Moya Lopez"));
		datosprofesor.add(new Profesor("Angel", "Saez Lopez"));
		
		
	}
	
	@Override
	public void start(Stage Principal) throws Exception{
			Parent dise�oprincipal = FXMLLoader.load(getClass().getResource("vista/Dise�o.fxml"));
			Scene ventanaprincipal = new Scene(dise�oprincipal);
			Principal.setScene(ventanaprincipal);
			Principal.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}