package algoritmos;
/**
 * 
 * @author speedemon -> Antonio Ruiz Benito                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
 *
 */
public class NumeroMenorDe3Numeros {
	
	/**
	 * Metodo con el algoritmo para obtener el menor de
	 * 3 valores numericos
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int minimo3(int a, int b, int c) {
		// Variables donde guardar los valores
		int min2, min3;
		
		// Si a es menor que b
		if (a < b) {
		
			min2 = a;
		// En caso contrario
		} else {
			
			min2 = b;
		}
		
		// Si min2 es menor que c
		if (min2 < c) {
			
			min3 = min2;
		// En caso contrario
		} else {
			min3 = c;
		}
		
		// Retorno el valor minimo
		return min3;
		
	}
	

	/**
	 * Metodo para obtener el menor de 3 numeros
	 * @param num1 -> Valor de tipo                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
	 * @param num2 -> Valor de tipo int
	 * @param num3 -> Valor de tipo int
	 * @return -> Valor minimo
	 */
	public static int getTheSmallestOf3Numbers(int num1, int num2, int num3) {
		// Variable donde guardare el valor minimo
		int minNumber;
		// Si num1 es menor a num2 Y num1 es menor a num3
		if (num1 < num2 && num1 < num3) {
			// Asigno a la variable el valor de num1
			minNumber = num1;
		// Si num2 es menor a num1 Y num2 es menor a num3                         
		} else if (num2 < num1 && num2 < num3) {
			// Asigno a la variable el valor de num2
			minNumber = num2;
		// En caso contrario
		} else {
			// Asigno a la variable el valor de num3
			minNumber = num3;
		}
		
		// Retorno el valor minimo
		return minNumber;
		
	}                     
	
}
