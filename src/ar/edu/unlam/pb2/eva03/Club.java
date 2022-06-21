package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.exceptions.NoEstaPreparado;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;
import ar.edu.unlam.pb2.eva03.models.Ciclista;
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

	public Integer inscribirEnEvento(String nombreDelEvento, Deportista deportista) throws NoEstaPreparado{
		//que si el deportista no esta preparado no se pueda anotar al evento
		//busco el nombreDelEvento dentro de las competencias
		if(competencias.get(nombreDelEvento).getTipo().equals(TipoDeEvento.CARRERA_10K) || 
				competencias.get(nombreDelEvento).getTipo().equals(TipoDeEvento.CARRERA_21K)||
				competencias.get(nombreDelEvento).getTipo().equals(TipoDeEvento.CARRERA_42K)||
				competencias.get(nombreDelEvento).getTipo().equals(TipoDeEvento.CARRERA_5K)) {
			if(deportista instanceof ICorredor) {
				competencias.get(nombreDelEvento).aniadirParticipante(competencias.get(nombreDelEvento).getNumeroDeInscripcion(), deportista);
				return 1;
			}else {
				throw new NoEstaPreparado();
			}
		}
		
		if(competencias.get(nombreDelEvento).getTipo().equals(TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS) ||
				competencias.get(nombreDelEvento).getTipo().equals(TipoDeEvento.CARRERA_NATACION_EN_PICINA)) {
			if(deportista instanceof INadador) {
				competencias.get(nombreDelEvento).aniadirParticipante(competencias.get(nombreDelEvento).getNumeroDeInscripcion(), deportista);
				return 1;
			}else {
				throw new NoEstaPreparado();
			}
		}
		
		if(competencias.get(nombreDelEvento).getTipo().equals(TipoDeEvento.DUATLON)){
			if(deportista instanceof ICiclista && deportista instanceof ICorredor) {
				competencias.get(nombreDelEvento).aniadirParticipante(competencias.get(nombreDelEvento).getNumeroDeInscripcion(), deportista);
				return 1;
			}else {
				throw new NoEstaPreparado();
			}
		}
		
		
		if(	competencias.get(nombreDelEvento).getTipo().equals(TipoDeEvento.TRIATLON_IRONMAN) ||
			competencias.get(nombreDelEvento).getTipo().equals(TipoDeEvento.TRIATLON_MEDIO) ||
			competencias.get(nombreDelEvento).getTipo().equals(TipoDeEvento.TRIATLON_OLIMPICO) || 
			competencias.get(nombreDelEvento).getTipo().equals(TipoDeEvento.TRIATLON_SHORT) ){
				if(deportista instanceof ICiclista && deportista instanceof ICorredor && deportista instanceof INadador) {
					competencias.get(nombreDelEvento).aniadirParticipante(competencias.get(nombreDelEvento).getNumeroDeInscripcion(), deportista);
					return 1;
				}else {
					throw new NoEstaPreparado();
				}
		}
		return 0;
		 
	}

	//crear metodo crearCompetencia(){} y eliminarCompetencia(){}
	
	
	
}
