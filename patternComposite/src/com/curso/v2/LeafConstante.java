package com.curso.v2;

public class LeafConstante extends Component {
	
	private double valor;
	
	public LeafConstante(double valor) {
		this.valor = valor;
	}

	@Override
	double getValue() {
		return valor;
	}

}
