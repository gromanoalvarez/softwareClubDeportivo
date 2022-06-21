package ar.edu.unlam.pb2.eva03.models;

import ar.edu.unlam.pb2.eva03.Deportista;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements INadador{

	private String estiloPreferido;

	public Nadador(Integer nroDeSocio, String nombre, String estiloPreferido) {
		super(nroDeSocio, nombre);
		this.estiloPreferido=estiloPreferido;
	}

	public String getEstiloPreferido() {
		return estiloPreferido;
	}

}
