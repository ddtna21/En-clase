/*
Escribir un programa que pase un nº de decimal a binario usando recursividad:
*/
package pratical;

import java.util.Scanner;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduc el numero");
		int n = scanner.nextInt();
		System.out.println(calcularBinario(n));
		scanner.close();
	}
	
	public static String calcularBinario(int decimal) {
		String salida = "";
		int cifra;
		if(decimal <2) {
			salida += decimal;
			
		}else {
			cifra = decimal % 2;
			salida = calcularBinario(decimal/2)+cifra;
		}
		return salida;
	}

}
