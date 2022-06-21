package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	public Evento(TipoDeEvento tipoDeEvento) {
		tipo= tipoDeEvento;
		numeroDeInscripcion=0;
		participantes = new HashMap<Integer, Deportista>();
	}
	
	public void aniadirParticipante(Integer numeroDeInscripcion, Deportista participante) {
		this.numeroDeInscripcion=numeroDeInscripcion;
		participantes.put(numeroDeInscripcion, participante);
	}
	public Deportista getParticipante(Integer numeroDeInscripcion) {
		return participantes.get(numeroDeInscripcion);
	}
	
}
