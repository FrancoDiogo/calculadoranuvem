package br.com.db1.dao;

public class DivisaoDAO implements OperacaoMatematicaDAO {

	
	// @Override?
	public Double calcula(Double valor1, Double valor2) {
		return valor1 / valor2;
	}
}
