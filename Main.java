import algoritmos.NumeroMenorDe3Numeros;
import algoritmos.SucesionDeFibonacci;

/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class Main {

	public static void main(String[] args) {
		
		// Valor minimo de 3 numeros
		int reult = NumeroMenorDe3Numeros.getTheSmallestOf3Numbers(500, 0, -20);
		
		System.out.println(reult);
		
		// Sucesion de Fibonacci hasta (n)
		System.out.println(SucesionDeFibonacci.fibonacciSequence(1000));
		
	}

}
