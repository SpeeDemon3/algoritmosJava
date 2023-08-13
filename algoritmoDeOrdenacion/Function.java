package algoritmoDeOrdenacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class Function {
	
	/**
	 * Metodo para imprimir los valores de un array
	 * de una dimension
	 * @param list
	 */
	public static void printList(int[] list) {
		for(int n : list) {
			System.out.println(n);
		}
	}

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
	
	
	/**
	 * Algoritmo ordenacion de burbuja (bubble sort)
	 * con complejidad cuadratica
	 * @param list -> Lista de tipo int para ordenar
	 * @return -> Lista ordenada
	 */
	public static int[] bubbleSort(int[] list) {
		
		for (int i = 1; i < list.length; i++) {
			
			for (int j = 0; j < list.length - i; j++) {
				// Si list[posicion actual] es mayor a list[siguiente posicion]
				if (list[j] > list[j + 1]) {
					// Guardamos list[j] en una variable auxiliar
					int aux = list[j];
					// Asignamos a list[posicion actual] el valor de la siguiente posicion
					list[j] = list[j + 1];
					// Asignamos a la siguiente posicion el valor de la variable temporal
					list[j + 1] = aux;
					
				}
				
			}
			
		}
		// Retorno el valor de la lista ya ordenada
		return list;
	}
	
	
	/* Algoritmo ordenacion por mezcla (merge sort) */
	
	/**
	 * Metodo para partir un array en 
	 * 2 arrays utilizando la recursividad
	 * @param list -> Lista de tipo int para ordenar
	 * @return -> Lista ordenada
	 */
	public static int[] mergeSort(int[] list) {
		// Comprobacion si el array tiene 0 o 1 elemento
		if (list.length <= 1) {
			// Retornamos la lista
			return list;
		}
		
		// Guardamos el valor de partir la lista
		int center = list.length / 2;
		// Creamos un array con la parte izquierda de la lista
		int[] left = Arrays.copyOfRange(list, 0, center); // Empezando por el elemento 0 y terminando por la mitad
		// Creamos un array con la parte derecha de la lista
		int[] right = Arrays.copyOfRange(list, center, list.length); //// Empezando por el elemento en la posicion center hasta el final de list
		
		// Utilizando la recursividad volvemos a partir las listas en 2
		left = mergeSort(left);
		right = mergeSort(right);
		
		// Retornamos la lista ordenado uniendo las 2 listas llamando al metodo mix2List()
		return mix2List(left, right);
		
	}
	
	/**
	 * Metodo para juntar 2 arrays
	 * obteniendo un unico array ordenado 
	 * @param listLeft
	 * @param listRight
	 * @return
	 */
	public static int[] mix2List(int[] listLeft, int[] listRight) {
		
		// Indices ha utilizar en cada lista
		int indexLeft = 0;
		int indexRight = 0;
		int indexSolution = 0;
		
		// Lista donde se guardara el array ordenado
		int[] listSolution = new int[listLeft.length + listRight.length];
		
		// Mientras los 2 indices sean menores al de las longitudes de las listas
		while (indexLeft < listLeft.length && indexRight < listRight.length) {
			
			// El siguiente elemento sera el mas pequeño de cada mitad
			if (listLeft[indexLeft] < listRight[indexRight]) {
				listSolution[indexSolution++] = listLeft[indexLeft++];
			} else {
				listSolution[indexSolution++] = listRight[indexRight++];
			}
		}
		
		
		// Copiamos los elementos que faltan de cada cadena
		while (indexLeft < listLeft.length) {
			listSolution[indexSolution++] = listLeft[indexLeft++];
		}
		
		while (indexRight < listRight.length) {
			listSolution[indexSolution++] = listRight[indexRight++];
		}
		
		// Retornamos el valor de la lista ordenada
		return listSolution;
		
	}
	
	/* Ordenacion rapida (quicksort) */
	
	/**
	 * Metodo para ordenar una lista de enteros
	 * @param list -> Lista que se desea ordenar
	 * @return -> Lista ordenada
	 */
	public static List<Integer> quickSort(List<Integer> list) {
		
		// Compruebo si la lista solo tiene un elemento
		if(list.size() <= 1) {
			
			return list;
			
		// En caso contrario
		} else {
			
			// Asigno el numero del elemento que hara de pivote
			Integer pivot = choosePivot(list);
			
			// Creo 3 listas para poder partir la lista
			List<Integer> minorNumbers = new ArrayList<Integer>();
			List<Integer> equalNumbers = new ArrayList<Integer>();
			List<Integer> largerNumbers = new ArrayList<Integer>();
			
			// Utilizando el bucle for-each recorro la lista
			for (Integer number : list) {
				
				// Compruebo si number es menor al pivote
				if (number < pivot) {
					// Lo añado a la lista de numeros mas pequeños que el pivote
					minorNumbers.add(number);
				
				// En caso de que number sea mayor al pivote
				} else if (number > pivot) {
					// Lo añado a la lista de numeros mayores que el pivote
					largerNumbers.add(number);
					
				// En caso de que number sea igual que el pivote
				} else {
					// Lo añado a la lista de los numeros iguales a pivote
					equalNumbers.add(number);
					
				}
				
			}
			
			
			// Utilizando la recursividad voy ordenando las listas
			minorNumbers = quickSort(minorNumbers);
			largerNumbers = quickSort(largerNumbers);
			
			// Añado los elementos ordenados a la lista de los menores
			minorNumbers.addAll(equalNumbers);
			minorNumbers.addAll(largerNumbers);
			
			// Retornamos la lista ordenada
			return minorNumbers;
			
		}
		
		
	}
	
	/**
	 * Metodo para obtener una posicion
	 * aleatoria
	 * @param list -> Lista para obtener una posicion
	 * @return -> Posicion de la lista
	 */
	protected static Integer choosePivot(List<Integer> list) {
		
		int position = (int) (Math.random() * list.size());
		
		return list.get(position);
		
	}
	
}
