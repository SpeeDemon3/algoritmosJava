package algoritmoDeOrdenacion;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class Main {

	public static void main(String[] args) {

		// Array con la serie de numeros a ordenar
		int[] numbers = { 2, 33, 1, 1000, 3, 50, 1987, 7, 29 };
		
		// Imprimo los valores con la ordenacion original
		Function.printList(numbers);
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Ordenación por inserción (insertion sort):");
		
		// Array con la serie de numeros a ordenar
		int[] numbers2 = { 2, 33, 1, 1000, 3, 50, 1987, 7, 29 };
		
		int[] listInsertionSort = Function.insertionSort(numbers2);
		
		Function.printList(listInsertionSort);
		
		System.out.println("-------------------------------------------");

		// Array con la serie de numeros a ordenar
		int[] numbers3 = { 2, 33, 1, 1000, 3, 50, 1987, 7, 29 };
		
		System.out.println("Ordenación de burbuja (bubble sort):");

		Function.bubbleSort(numbers3);
		
		Function.printList(numbers3);

		System.out.println("-------------------------------------------");

		// Algoritmo ordenacion por mezcla (merge sort)
		int[] numbers4 = { 2, 33, 1, 1000, 3, 50, 1987, 7, 29 };

		System.out.println("Ordenación por mezcla (merge sort)");
		
		int[] newList = Function.mergeSort(numbers4);
		
		Function.printList(newList);

		System.out.println("-------------------------------------------");
		
		
		// Algoritmo Ordenacion rapida (quicksort)
		
		System.out.println("Ordenación rapida (quicksort):");
		
		List<Integer> numbers5 = new ArrayList<Integer>();
		
		// Añado elementos a la lista
		numbers5.add(32);
		numbers5.add(1);
		numbers5.add(45);
		numbers5.add(100);
		numbers5.add(4);
		numbers5.add(205);
		numbers5.add(29);
		numbers5.add(1987);
		numbers5.add(13);
		numbers5.add(45);
		
		System.out.println("Lista sin ordenar:");
		
		for (int i : numbers5) {
			
			System.out.println(i);
		}
		
		System.out.println();
		
		List<Integer> orderedNumbers = Function.quickSort(numbers5);
		
		System.out.println("Lista ordenada:");
		
		for (int i : orderedNumbers) {
			
			System.out.println(i);
			
		}
		
		System.out.println("-------------------------------------------");

	}

}
