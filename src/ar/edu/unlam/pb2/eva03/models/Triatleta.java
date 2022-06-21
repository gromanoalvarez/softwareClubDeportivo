package ar.edu.unlam.pb2.eva03.models;

import ar.edu.unlam.pb2.eva03.Deportista;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements ICiclista, ICorredor, INadador {

	private String distanciaPreferida;
	private Integer kilometrosEntrenados;
	private TipoDeBicicleta tipoDeBicicleta;
	private String estiloPreferido;

	public Triatleta(Integer nroDeSocio, String nombre) {
		super(nroDeSocio, nombre);
		estiloPreferido="Aún debe cargar su estilo preferido";
		distanciaPreferida="Aún debe cargar su distancia preferida";
		kilometrosEntrenados=0;
		tipoDeBicicleta=TipoDeBicicleta.BMX;
	}

	public Triatleta(Integer nroDeSocio, String nombre, String distanciaPreferida, TipoDeBicicleta tipoDeBicicleta) {
									// 4, "Luna", "Olimpico", TipoDeBicicleta.TRIA
		super(nroDeSocio, nombre);
		estiloPreferido="Aún debe cargar su estilo preferido";
		this.distanciaPreferida=distanciaPreferida;
		this.tipoDeBicicleta=tipoDeBicicleta;
		kilometrosEntrenados=0;
	}

	@Override
	public String getEstiloPreferido() {
		return estiloPreferido;
	}

	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		kilometrosEntrenados =km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return kilometrosEntrenados;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}
	

}
