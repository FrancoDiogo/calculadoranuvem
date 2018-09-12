package br.com.db1.dao;

public class CalculadoraDao {
	
	public Double dividir(Double valor1, Double valor2) {
		return valor1 / valor2;
	}
	
	public Double multiplicar(Double valor1, Double valor2) {
		return valor1 * valor2;
	}
	
	public Double somar(Double valor1, Double valor2) {
		return valor1 + valor2;
	}
	
	public Double subtrair(Double valor1, Double valor2) {
		return valor1 - valor2;
	}
}