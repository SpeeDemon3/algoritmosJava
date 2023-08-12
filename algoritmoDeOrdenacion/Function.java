package algoritmoDeOrdenacion;
/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class Function {

	/**
	 * Algoritmo ordenacion por insercion (insertion sort)
	 * con complejidad cuadratica
	 * @param list -> Lista de tipo int para ordenar
	 * @return -> Lista ordenada
	 */
	public static int[] insertionSort(int[] list) {
		// Recorro la lista
		for (int i = 0; i < list.length; i++) {
			// Asigno a num el primer elemento de la lista y los sucesivos en cada iteracion
			int num = list[i];
			// Asigno a j el valor de i en cada iteracion
			int j = i;
			// Mientras j sea mayor que 0 Y num sea menor al valor del elemento de la lista en la posicion j menos 1
			while(j > 0 && num < list[j -1]) { // El bucle seguira iterando
				// Asigno a la posicion el valor anterior
				list[j] = list[j - 1];
				// Resto uno a j
				--j;
				
			}
			// Asigno a la posicion j el valor de num
			list[j] = num;
		}
		// Retorno la lista ordenada
		return list;
	}
	
	
	/* Ordenacion de burbuja (bubble sort) */
	
}
