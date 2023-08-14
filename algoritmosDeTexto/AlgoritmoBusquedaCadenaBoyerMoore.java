package algoritmosDeTexto;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class AlgoritmoBusquedaCadenaBoyerMoore {
	
	private static final int NUM_CHARS = 256;
	
	/**
	 * Metodo para crear y llenar la tabla de 
	 * ultimas posiciones
	 * @param pattern -> Patron
	 * @return -> Tabla
	 */
	public static int[] lastPositionTable(String pattern) {
		
		int[] lastPosition = new int[NUM_CHARS];
		
		// Inicializa la tabla con -1 en todas las posiciones
		for (int i = 0; i < NUM_CHARS; i++) {
			lastPosition[i] = -1;
		}
		
		// Llena la tabla con las últimas posiciones de cada carácter en el patrón
		for (int j = 0; j < pattern.length(); j++) {
			
			lastPosition[pattern.charAt(j)] = j;
			
		}
		
		return lastPosition; 
		
	}
	
	/**
	 * Metodo que Realiza la búsqueda del patrón en 
	 * el texto utilizando el algoritmo de Boyer-Moore
	 * @param text -> Cadena donde buscar
	 * @param sought -> Patron 
	 * @return -> Resultado de la busqueda
	 */
	public static List<Integer> search(String text, String sought) {
		
		List<Integer> solution = new ArrayList<>();
		
		int longText = text.length();
		
		int longSought = sought.length();
		
		// Obtengo la tabla de últimas posiciones para el patron
		int[] lastPosition = lastPositionTable(sought);
		
		int i = 0;
		
		// Compara los caracteres del patrón y el texto en sentido inverso
		while(i <= longText - longSought) {
			
			int j = longSought - 1;
			
			while(j >= 0 && sought.charAt(j) == text.charAt(i + j)) {
				
				j--;
				
			}
			
			if (j < 0) {
				// Coincidencia encontrada, agrega la posición a la solucion
				solution.add(i);
				
				// Desplaza el indice segun la regla de desplazamiento
				if (i + longSought < longText) {
					
					i += longSought - lastPosition[text.charAt(i + longSought)];
					
				} else {
				
					i++;
				
				}
				
			} else {
				// No hay coincidencia, calcula el desplazamiento
				if (j - lastPosition[text.charAt(i + j)] > 1) {
					i += j - lastPosition[text.charAt(i + j)];
				}else { 
					i++;
				}
			}
			
		}
		
		return solution;
	}

}
