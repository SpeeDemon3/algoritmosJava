package algoritmosDeTexto;
/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class Main {

	public static void main(String[] args) {

		String origin = "Hello Antonio!!!";
		int displacement = 10;
		String textCihper = AlgoritmoCifradoCesar.cipher(origin, displacement);
		
		System.out.println("Texto original -> " + origin);
		System.out.println("Texto cifrado Cesar -> " + textCihper);
		
	}

}
