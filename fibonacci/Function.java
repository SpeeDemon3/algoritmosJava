package algoritmosLibro.fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author speedemon
 *
 */
public class Function {

	/**
	 * Algoritmo para determinar cuantos numeros hay
	 * en la serie de fibonacci menores al que el limite
	 * recibido
	 * 
	 * @param limit -> Limite hasta el que llegara la sucesion
	 * @return -> Numero de numeros menores que el limite 
	 */
	public static int countSmallerNumbers(int limit) {
		// Varible inicial para la sucesion
		int penultimate = 0;
		// Varible inicial para la sucesion
		int last = 1;
		// Varible indice para contar los numeros
		int i = 2;
		// Variable para controlar el bucle
		boolean reached = false;

		// Mientras la variable reached no sea igual a true
		while(!reached) {
			// Variable que va sumando las 2 variables para continuar la sucesion
			int aux = penultimate + last;
			// Asigno a la variable el resultado de comparar si aux es mayor a limit
			reached = aux > limit;
			
			if (!reached) {
				// Asigno el valor de last
				penultimate = last;
				// Asigno el valor de aux
				last = aux;
				// Sumo 1 al contador
				i++;
				
			}
			
		}
		// Retorno el valor del contador
		return i;
	}

}
