package view;

import controller.SerieFatorial;

public class Principal {

	public static void main(String[] args) {
		int n = 2;
		
		if(n < 1) {
			System.out.println("Número Inválido! Insira um número mais ou igual a 1.");
			return;
		}
		
		double resultadoSerie = SerieFatorial.calcularSerieFatorial(n);
		System.out.println("O resultado da série até 1/" + n + "! é: " + resultadoSerie);
	}
}
