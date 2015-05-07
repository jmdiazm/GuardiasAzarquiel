package applicacion.vista;

import applicacion.modelo.Aula;
import applicacion.modelo.Profesor;
import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/*No funciona*/

public class ControladorMain {
	
	@FXML
	private Label NombreUsuario;
	@FXML
	private Label Departamento;
	
	@FXML
	private ListView<Profesor> ProfesorSeleccionado;
	@FXML
	private ListView<Profesor> HoraProfesorSeleccionado;
	
	@FXML
	private ListView<Aula> SeleccionAula;
	@FXML
	private ListView<Aula> HoraSeleccionAula;
	@FXML
	private ListView<Aula> ProfesorSeleccionAula;
	@FXML
	private ListView<Aula> MateriaSeleccionAula;
	
	private Main main;
	
	public ControladorMain(){
		
		
		//inicializan las variables
		@FXML
		private void initialize() {
			
			ProfesorSeleccionado.setCellFactory(cellData -> getValue().nombreProperty());			
		}
		
		public void setMain(Main main) {
			this.main = main;
			//Se da informacion al main sobre el profesor
			
		}
		
		private void MuestraHorarioProfesor(Profesor profesor){
			if (profesor != null){
				ProfesorSeleccionado.SetText(profesor.getNombre());
				HoraProfesorSeleccionado.SetText(profesor.getHorario());
			}
		}
		
		private void MuestraHorarioAula(Aula aula){
			if (aula != null){
				SeleccionAula.SetText(aula.getNombre());
				HoraSeleccionAula.SetText(aula.getHora());
				ProfesorSeleccionAula.SetText(aula.getProfesor());
				MateriaSeleccionAula.SetText(aula.getMateria());
				
			}
		}
	}
}
