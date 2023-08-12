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
		for(int n : numbers) {
			System.out.println(n);
		}
		System.out.println("-------------------------------------------");
		
		System.out.println("Ordenacion por insercion (insertion sort):");
		
		int[] listInsertionSort = Function.insertionSort(numbers);
		
		for (int n : listInsertionSort) {
			System.out.println(n);
		}
		System.out.println("-------------------------------------------");

		
		
	}

}
