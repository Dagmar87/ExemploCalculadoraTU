package com.teste;

public class CalculadoraT {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		int vUm = 5;
		int vDois = 5;
		
		double vT = c.somar(vUm, vDois);
		
		if(vT == 10){
			System.out.println("Valor Correto!!!");
		}
		else{
			System.out.println("Valor Errado!!!");
		}

	}

}
