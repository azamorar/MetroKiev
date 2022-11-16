package aEstrella;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

import grafoPonderado.Conexion;
import grafoPonderado.Estacion;

public class Busqueda {
	
	/*
	 * Método de búsqueda principal
	 * Usa un algoritmo basado en 2 listas que se van rellenando y vaciando 
	 * a medida que avanza este.
	 */
	public static Estacion aEstrella(Estacion origen, Estacion destino) {
		PriorityQueue<Estacion> listaCerrada = new PriorityQueue<Estacion>();
	    PriorityQueue<Estacion> listaAbierta = new PriorityQueue<Estacion>();

	    
	    origen.f = origen.g + origen.getH(destino);
	    listaAbierta.add(origen);

	    while(!listaAbierta.isEmpty()){
	        Estacion n = listaAbierta.peek();
	        if(n == destino) return n;
	        

	        for(Conexion c : n.vecinos) {
	            Estacion estacion = c.estacion;
	            double pesoTotal = n.g + c.distancia;
	            

	            if(!listaAbierta.contains(
	                estacion.g = pesoTotal;
	                estacion.f = estacion.g + estacion.getH(destino);
	                listaAbierta.add(estacion);
	            } else {
	                if(pesoTotal < estacion.g){
	                    estacion.raiz = n;
	                    estacion.g = pesoTotal;
	                    estacion.f = estacion.g + estacion.getH(destino);

	                    if(listaCerrada.contains(estacion)){
	                        listaCerrada.remove(estacion);
	                        listaAbierta.add(estacion);
	                    }
	                }
	            }
	        }

	        listaAbierta.remove(n);
	        listaCerrada.add(n);
	    }

	    
	    return null;
	}

	/*
	 * Genera un ArrayList con los resultados del método anterior
	 */
	public static ArrayList<Estacion> printPath(Estacion destino) {
		Estacion e = destino;

	    if(e==null) return null;
estacion) && !listaCerrada.contains(estacion)){
	                estacion.raiz = n;
	    ArrayList<Estacion> ids = new ArrayList<>();

	    while(e.raiz != null){
	        ids.add(e);
	        e = e.raiz;
	    }
	    ids.add(e);
	    Collections.reverse(ids);
	    
	    return ids;
	    
	}
	

	


}
