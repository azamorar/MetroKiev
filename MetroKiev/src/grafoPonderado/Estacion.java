package grafoPonderado;

import java.util.ArrayList;

import kiev.Geografia;

public class Estacion implements Comparable<Estacion> {
	
	public Estacion raiz = null;

	public ArrayList<Conexion> vecinos;

	public int id;
	
	private final static double MAXIMO = Double.MAX_VALUE;
	public double f = MAXIMO;
	public double g = MAXIMO;
	public double h; 
	public double latitud;
	public double longitud;

	public Estacion(int id, double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
		this.id = id;
		this.vecinos = new ArrayList<>();
	}
	

    @Override
    public int compareTo(Estacion n) {
          return Double.compare(this.f, n.f);
    }
    
	public int getId() {
		return id;
	}

	public void nuevaConexion(Estacion estacion){
		double distancia = Geografia.distanciaEntre2Puntos(this.latitud, this.longitud, estacion.latitud, estacion.longitud);
		Conexion conexion1 = new Conexion(distancia, estacion);
		vecinos.add(conexion1);
	}
	
	/*
	 * El valor heurístico se calcula como la distancia más corta entre la estación
	 * en cuestión y el destino.
	 */
	public double getH(Estacion destino) {
		return Geografia.distanciaEntre2Puntos(this.latitud, this.longitud, destino.latitud, destino.longitud);
	}

}
