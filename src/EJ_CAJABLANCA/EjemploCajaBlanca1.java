package EJ_CAJABLANCA;

import java.util.Scanner;
/**
 * 
 * Codigo de ejmplo de un ejercicio de caja blanca donde si un numero es perfecto
 * 
 * @version 1.0
 * @author dam115
 *
 */
public class EjemploCajaBlanca1 {
	/**
	 * 
	 * @hidden 
	 */
	
	public static void main(String[] args) {
		//Me creo la variable entrada para capturar por teclado
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un numero mayor que 0:  ");
		int num = entrada.nextInt();
		System.out.print(CompruebaNumeroPerfecto(num));
	}
	/**
	 * El metodo CompruebaNumeroPerfecto comprueba si la suma de sus divisores es igual a él mismo
	 * @param num Variable de tipo entero que representa el numero a comprobar si es perfecto
	 * @return Cadena de texto donde se indica si el numero introducido es perfecto
	 */
	static String CompruebaNumeroPerfecto(int num) {
		int divisor = 1, sumadivisores = 0;
		String Cadena = "";
		while (divisor <= num / 2) {
			if (num % divisor == 0) {
				sumadivisores += divisor;
			}
			divisor++;
		}
		if (num == sumadivisores) {
			Cadena = "El numero " + num + " es un numero perfecto";

		} else {
			Cadena = "El numero " + num + " no es un numero perfecto";
		}
		return Cadena;
	}
}