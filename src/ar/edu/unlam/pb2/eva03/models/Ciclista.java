package ar.edu.unlam.pb2.eva03.models;

import ar.edu.unlam.pb2.eva03.Deportista;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista {

	private TipoDeBicicleta tipoDeBicicleta;

	public Ciclista(Integer nroDeSocio, String nombre) {
		super(nroDeSocio, nombre);
		this.tipoDeBicicleta= TipoDeBicicleta.RUTA;
	}

	public Ciclista(Integer nroDeSocio, String nombre, String tipoDeBicicleta) {
		super(nroDeSocio, nombre);
		this.tipoDeBicicleta=definirTipoDeBicicleta(tipoDeBicicleta);
	}

	public TipoDeBicicleta definirTipoDeBicicleta(String tipoDeBicicleta) {
		switch(tipoDeBicicleta.toLowerCase()) {
		case "ruta":
			return TipoDeBicicleta.RUTA;
		case "montaña":
			return TipoDeBicicleta.MOUNTAIN;
		case "trialtlon":
			return TipoDeBicicleta.TRIA;
		case "bmx":
			return TipoDeBicicleta.BMX;
		}
		return null;
	}
	
	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

}
