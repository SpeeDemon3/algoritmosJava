package algoritmosDeTexto;
/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class AlgoritmoCifradoCesar {

	// Variables constantes para el cifrado
	private static final int MAJOR_BASE = (int) 'A'; // Valor ASCII de 'A'
	private static final int BASE_MINOR = (int) 'a'; // Valor ASCII de 'a'
	private static final int LONG_ABC = 26; // Longitud del alfabeto
	
	/**
	 * Metodo principal para cifrar una cadena de texto
	 * @param text -> Cada que se desea cifrar
	 * @param displacement -> Desplazamiento entre letras
	 * @return -> Cadena cifrada
	 */
	public static String cipher(String text, int displacement) {
		
		String encryption = "";
		
		// Utilizando el metodo toCharArray() convierto la cadena en un array de chars
		for (char letter : text.toCharArray()) {
			
			encryption += cipher(letter, displacement);
		
		}
		
		return encryption;
	}
	
	/**
	 * Metodo privado para cifrar un caracter individual
	 * @param letter -> Caracter que se desea cifrar
	 * @param displacement -> Desplazamiento
	 * @return -> caracter cifrado
	 */
	private static char cipher(char letter, int displacement) {
		
		int base;
		
		// Comprobacion de si esta el caracter en mayuscula
		if (Character.isUpperCase(letter)) {
		
			base = MAJOR_BASE;
	
		// Comprobacion de si esta el caracter en minuscula
		} else if (Character.isLowerCase(letter)) {
		
			base = BASE_MINOR;
	
		// Si no es una letra 
		} else {
			// Se retorna sin cambios
			return letter;
			
		}

		// Aplicar el cifrado César y asegurarse de que el resultado esté en el rango del alfabeto
		return (char)(((int) letter - base + displacement) % LONG_ABC + base);
		
	}
	
}
