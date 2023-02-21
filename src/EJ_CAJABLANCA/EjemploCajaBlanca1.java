package EJ_CAJABLANCA;

import java.util.Scanner;

public class EjemploCajaBlanca1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un numero mayor que 0:  ");
		int num = entrada.nextInt();
		System.out.print(CompruebaNumeroPerfecto(num));
	}
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