package algoritmos;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class SucesionDeFibonacci {

	/**
	 * Funcion para obtener la sucesion de fibonacci
	 * dando un limite en donde se detendra la sucesion
	 * @param maxNumber -> Numero maximo hasta el que se podra llegar
	 * @return -> Lista con la sucesion hasta un limite indicado
	 */
	public static List<Integer> fibonacciSequence(int maxNumber) {
		
		// Lista que albergara la secuencia
		List<Integer> list = new ArrayList<Integer>();
		
		// Añado los 2 primeros valores de la lista (0, 1)
		list.add(0);
		list.add(1);
		
		// Variable contador para controlar la posicion que estamos calculando
		int counter = 2;
		
		// Variable (alcanzado) para poder salir del bucle cuando se alcanze el numero limite
		boolean reached = false;
		
		// Mientras reached no sea distinta de false
		while(!reached) {
			
			// Variable auxiliar donde se guardara el tercer valor y los sucesivos valores
			// accedemos(al penultimo elemento) sumado al (ultimo elemento)
			int aux = list.get(counter - 2) + list.get(counter - 1);
			
			// Asignamos a la variable true o false dependiendo del resultado de la condicion
			reached = aux > maxNumber;
		
			// Mientras reached no sea distinta de false
			if (!reached) {
				// Añadimos el valor de aux a la lista
				list.add(aux);
			}
			
			// Sumamos uno al contador
			counter ++;
			
		}
		
		// Retornamos la lista
		return list;
		
	}
	
	
	
}
