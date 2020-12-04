/*
Escribir un programa que pase un nº de decimal a binario usando recursividad:


*/
public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcularBinario(4));
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
