package com.teste;

import javax.swing.JOptionPane;

public class CalculadoraP {

	public static void main(String[] args) {
		
		int x, y;
		String sX, sY;
		
		sX = JOptionPane.showInputDialog(null, "Digite o primeiro n?mero:", "Primeiro n?mero", JOptionPane.QUESTION_MESSAGE);
		x = Integer.parseInt(sX);
		
		sY = JOptionPane.showInputDialog(null, "Digite o segundo n?mero:", "Segundo n?mero", JOptionPane.QUESTION_MESSAGE);
		y = Integer.parseInt(sY);
		
		Calculadora calc = new Calculadora();
		
		JOptionPane.showMessageDialog(null, "somar: " + calc.somar(x, y));
		JOptionPane.showMessageDialog(null, "subtrair: " + calc.subtrair(x, y));
		JOptionPane.showMessageDialog(null, "multiplicar: " + calc.multiplicar(x, y));
		JOptionPane.showMessageDialog(null, "dividir: " + calc.dividir(x, y));
		
		System.exit(0);

	}

}
