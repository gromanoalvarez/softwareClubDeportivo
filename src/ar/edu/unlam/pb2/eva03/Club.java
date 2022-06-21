package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.models.Corredor;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	public Club(String nombre) {
		this.nombre=nombre;	
		socios= new HashSet<Deportista>();
		competencias = new HashMap<String, Evento>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Deportista> getSocios() {
		return (HashSet<Deportista>)socios;
	}
	
	public Integer getCantidadSocios() {
		return socios.size();
	}
	
	public void agregarDeportista(Deportista deportista) {
		socios.add(deportista);
	}
	
	//podria hacer un metodo como eliminarSocio(Deportista socio){}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void crearEvento(TipoDeEvento carreraNatacionEnAguasAbiertas, String nombreDelEvento) {
		// 		actual.crearEvento(TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS, "Maraton de aguas abiertas");
		Evento nuevoEvento = new Evento( carreraNatacionEnAguasAbiertas );
		//agregar evento a competencias
		competencias.put(nombreDelEvento, nuevoEvento);
	}

	public Object inscribirEnEvento(String nombreDelEvento, Deportista celeste) {
		//inscribir evento en competencias
		return null;
	}

	//crear metodo crearCompetencia(){} y eliminarCompetencia(){}
	
	
	
}
