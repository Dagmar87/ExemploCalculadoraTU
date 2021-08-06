package com.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	public CalculadoraTest() {
		
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testSomar() {
		
		System.out.println("somar");
		int n1 = 5;
		int n2 = 5;
		Calculadora instancia = new Calculadora();
		double expRes = 10.0;
		double res = instancia.somar(n1, n2);
		assertEquals(expRes, res, 0);
		
	}

	@Test
	public void testSubtrair() {
		
		System.out.println("subtrair");
		int n1 = 5;
		int n2 = 3;
		Calculadora instancia = new Calculadora();
		double expRes = 2;
		double res = instancia.subtrair(n1, n2);
		assertEquals(expRes, res, 0);
		
	}

	@Test
	public void testMultiplicar() {
		
		System.out.println("multiplicar");
		int n1 = 2;
		int n2 = 3;
		Calculadora instancia = new Calculadora();
		double expRes = 6;
		double res = instancia.multiplicar(n1, n2);
		assertEquals(expRes, res, 0);
		
	}

	@Test
	public void testDividir() {
		
		System.out.println("dividir");
		int n1 = 5;
		int n2 = 2;
		Calculadora instancia = new Calculadora();
		double expRes = 2.5;
		double res = instancia.dividir(n1, n2);
		assertEquals(expRes, res, 0);
		
	}

}
