package ar.edu.unlam.pb2.eva03.models;

import ar.edu.unlam.pb2.eva03.Deportista;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor {

	private Integer kilometrosEntrenados,distanciaPreferida;

	public Corredor(Integer nroDeSocio, String nombre) {
		super(nroDeSocio, nombre);
		this.kilometrosEntrenados=0;
		distanciaPreferida=0;
	}

	public Corredor(Integer nroDeSocio, String nombre, Integer distanciaPreferida) {
		super(nroDeSocio, nombre);
		kilometrosEntrenados=0;
		this.distanciaPreferida=distanciaPreferida;

	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		kilometrosEntrenados=km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return kilometrosEntrenados;
	}

	public Integer getDistanciaPreferida() {
		return this.distanciaPreferida;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}
	

}
