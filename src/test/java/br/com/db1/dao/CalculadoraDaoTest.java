package br.com.db1.dao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculadoraDaoTest {
	
	CalculadoraDao dao = new CalculadoraDao();
	
	
	@Test
	public void dividirTest() {
		assertTrue(4d == dao.dividir(8d,2d));
		assertFalse(5d == dao.dividir(8d,2d));
	}
	
	@Test
	public void multiplicarTest() {
		assertTrue(20d == dao.multiplicar(10d,2d));
		assertFalse(21d == dao.multiplicar(10d,2d));
	}
	
	@Test
	public void somarTest() {
		assertTrue(170d == dao.somar(80d,90d));
		assertFalse(169.5 == dao.somar(80d,90d));
	}
	
	@Test
	public void subtrairTest() {
		assertTrue(3d == dao.subtrair(13d,10d));
		assertFalse(2.99 == dao.subtrair(13d,10d));
	}
}
