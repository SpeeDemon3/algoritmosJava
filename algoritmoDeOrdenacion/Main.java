package algoritmoDeOrdenacion;
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
		
		
	}

}
