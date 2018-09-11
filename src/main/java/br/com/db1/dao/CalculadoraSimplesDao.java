package br.com.db1.dao;

public class CalculadoraSimplesDao {
	
	public Integer dividir(Integer valor1, Integer valor2) {
		return valor1 / valor2;
	}
	
	public Integer multiplicar(Integer valor1, Integer valor2) {
		return valor1 * valor2;
	}
	
	public Integer somar(Integer valor1, Integer valor2) {
		return valor1 + valor2;
	}
	
	public Integer subtrair(Integer valor1, Integer valor2) {
		return valor1 - valor2;
	}
}
