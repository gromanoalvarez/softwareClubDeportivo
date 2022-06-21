package ar.edu.unlam.pb2.eva03.models;

import ar.edu.unlam.pb2.eva03.Deportista;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor {

	private int kilometrosEntrenados;
	private TipoDeEvento distanciaPreferida;

	public Corredor(Integer nroDeSocio, String nombre) {
		super(nroDeSocio, nombre);
		this.kilometrosEntrenados=0;
		distanciaPreferida=TipoDeEvento.CARRERA_5K;
	}

	public Corredor(Integer nroDeSocio, String nombre, Integer kilometrosEntrenados) {
		super(nroDeSocio, nombre);
		this.kilometrosEntrenados=kilometrosEntrenados;
		distanciaPreferida=TipoDeEvento.CARRERA_5K;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		kilometrosEntrenados=km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return kilometrosEntrenados;
	}

	public TipoDeEvento getDistanciaPreferida() {
		return this.distanciaPreferida;
	}

	public void setDistanciaPreferida(TipoDeEvento distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}
	

}
