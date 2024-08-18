package controller;

public class SerieFatorial {

	public SerieFatorial() {
		super();
	}
	
	public static double calcularSerieFatorial(int n) {
		// Condição de parada: quando n é igual a 1, retorna 1
		if(n == 1) {
			return 1.0;
		} 
			return (1.0 / calcularFatorial(n)) + calcularSerieFatorial(n - 1);
	}
	
		
	public static int calcularFatorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n * calcularFatorial(n - 1);
		}
	}
}

