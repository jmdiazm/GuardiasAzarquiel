package applicacion.modelo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Profesor {
	
	private StringProperty nombre;
	private StringProperty apellidos;
	private StringProperty primeraHora;
	private StringProperty segundaHora;
	private StringProperty terceraHora;
	private StringProperty cuartaHora;
	private StringProperty quintaHora;
	private StringProperty sextaHora;
	
	public Profesor(){
		this(null, null);
	}
	
	
	public Profesor(String nombre, String apellidos){
		this.nombre = new SimpleStringProperty(nombre);
		this.apellidos = new SimpleStringProperty(apellidos);
		
		this.primeraHora = new SimpleStringProperty("Primera Hora");
		this.segundaHora = new SimpleStringProperty("Segunda Hora");
		this.terceraHora = new SimpleStringProperty("Tercera Hora");
		this.cuartaHora = new SimpleStringProperty("Cuarta Hora");
		this.quintaHora = new SimpleStringProperty("Quinta Hora");
		this.sextaHora = new SimpleStringProperty("Sexta Hora");
		
	}


	public StringProperty getNombre() {
		return nombre;
	}


	public void setNombre(StringProperty nombre) {
		this.nombre = nombre;
	}


	public StringProperty getApellidos() {
		return apellidos;
	}


	public void setApellidos(StringProperty apellidos) {
		this.apellidos = apellidos;
	}


	public StringProperty getPrimeraHora() {
		return primeraHora;
	}


	public void setPrimeraHora(StringProperty primeraHora) {
		this.primeraHora = primeraHora;
	}


	public StringProperty getSegundaHora() {
		return segundaHora;
	}


	public void setSegundaHora(StringProperty segundaHora) {
		this.segundaHora = segundaHora;
	}


	public StringProperty getTerceraHora() {
		return terceraHora;
	}


	public void setTerceraHora(StringProperty terceraHora) {
		this.terceraHora = terceraHora;
	}


	public StringProperty getCuartaHora() {
		return cuartaHora;
	}


	public void setCuartaHora(StringProperty cuartaHora) {
		this.cuartaHora = cuartaHora;
	}


	public StringProperty getQuintaHora() {
		return quintaHora;
	}


	public void setQuintaHora(StringProperty quintaHora) {
		this.quintaHora = quintaHora;
	}


	public StringProperty getSextaHora() {
		return sextaHora;
	}


	public void setSextaHora(StringProperty sextaHora) {
		this.sextaHora = sextaHora;
	}
}
