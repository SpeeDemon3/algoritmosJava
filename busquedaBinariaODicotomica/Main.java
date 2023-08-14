package busquedaBinariaODicotomica;
/**
 * 
 * @author speedemon --> Antonio Ruiz Benito
 *
 */
public class Main {

	public static void main(String[] args) {

		// Array numerico donde realizare la busqueda
		int[] numbers = { 1, 2, 3, 4, 5, 10, 20, 100};
		
		Function.binarySearch(numbers, 9);
		
		
		// Array de tipo char
		char[] letters = {'a', 'v', 'r', 'l', 'z', 'e', 'y'};
		// Compruebo si los valores estan dentro del array
		System.out.println(Function.findCharacter(letters, 'a'));
		System.out.println(Function.findCharacter(letters, 'x'));
	}
	
}
