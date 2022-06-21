package ar.edu.unlam.pb2.eva03;

public abstract class Deportista {

	private Integer nroDeSocio;
	private String nombre;

	public Deportista(Integer nroDeSocio, String nombre) {
		this.nroDeSocio=nroDeSocio;
		this.nombre=nombre;
	}

	public Integer getNumeroDeSocio() {
		return nroDeSocio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return "Deportista [nroDeSocio=" + nroDeSocio + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nroDeSocio == null) ? 0 : nroDeSocio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Deportista other = (Deportista) obj;
		if (nroDeSocio == null) {
			if (other.nroDeSocio != null)
				return false;
		} else if (!nroDeSocio.equals(other.nroDeSocio))
			return false;
		return true;
	}
	
	
}
