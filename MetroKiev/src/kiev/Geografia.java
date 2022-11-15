package kiev;

import java.util.ArrayList;

import grafoPonderado.Estacion;

public class Geografia {
	
	// De Internet sale este valor
	private static final double kievMetroSpeed = 10.03056;
	
	/*
	 * https://en.wikipedia.org/wiki/Haversine_formula
	 * @returns distancia entre 2 lats y 2 longs en metros
	 */
	public static double distanciaEntre2Puntos(double lat1, double lon1, double lat2, double lon2) {
		
		double R, dLat, dLon, a, c, d;
		
		R = 6378.137;
		dLat = lat2 * Math.PI / 180 - lat1 * Math.PI / 180;
		dLon = lon2 * Math.PI / 180 - lon1 * Math.PI / 180;
		
		a = Math.sin(dLat/2) * Math.sin(dLat/2) +
			    Math.cos(lat1 * Math.PI / 180) * Math.cos(lat2 * Math.PI / 180) *
			    Math.sin(dLon/2) * Math.sin(dLon/2);
		
		c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
	    d = R * c;
	    
	    return d * 1000;
		
	}
	
	
	/*
	 * @returns una distancia en metros
	 */
	public static double getDistancia(ArrayList<Estacion> trayecto) {
		double res = 0;
		for (int i = 0; i < trayecto.size()-1; i++) {
			res += distanciaEntre2Puntos(trayecto.get(i).latitud, trayecto.get(i).longitud,
					trayecto.get(i+1).latitud, trayecto.get(i+1).longitud);
		}
		return res;
	}
	
	/*
	 * Asumimos que el metro se para unos 45 segundos en cada parada/estación.
	 * @returns un tiempo en segundos.
	 */
	public static double getTiempo(double distancia, int numeroParadas) {
		return distancia/kievMetroSpeed + numeroParadas*45;
	}
	
}
