package busquedaBinariaODicotomica;
/**
 * 
 * @author speedemon --> Antonio Ruiz Benito
 *
 */
public class Function {
	
	
	public static int binarySearch(int[] list, int element) {
		
		return binarySearchAux(list, element, 0, list.length);
		
	}
	

	public static int binarySearchAux(int[] list, int element, int start , int end) {
		
		final int notFound = -1;
		
		int center = Math.floorDiv(end - start, 2) + start;
		
		int centralValue = list[center];
		
		if (centralValue == element) {
			
			System.out.println("Elemento " + element + " encontrado " + " en la posición " + center);
			
			return center;
			
		}
		
		if (end - start <= 1) {
			
			System.out.println("Elemento " + element + " no encontrado.");
			
			return notFound;
			
		}
		
		if (centralValue < element) {
			
			System.out.println("Elemento " + element + " encontrado " + " en la posición " + center);
			
			return binarySearchAux(list, element, center, end);
		} else {
			
			System.out.println("Elemento " + element + " encontrado " + " en la posición " + center);
			
			return binarySearchAux(list, element, start, center);			
			
		}
		

	}
	
	/**
	 * Metodo de busqueda lineal para encontrar un caracter dentro 
	 * de un array de tipo char
	 * @param letters -> Array de tipo char
	 * @param element -> Elemento que se desea encontrar
	 * @return -> Verdadero o falso dependiendo del valor
	 */
	public static boolean findCharacter(char[] letters, char element) {

		for (char letter : letters) {
			// Si el codigo unicode es igual			
			if (letter == element) {
				return true;
			}
						
		}
		// Caso contrario
		return false;
		
	}
	
	
}
