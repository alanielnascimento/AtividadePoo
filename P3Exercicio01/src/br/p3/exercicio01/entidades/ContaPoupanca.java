package br.p3.exercicio01.entidades;

public final class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numConta, String titular, double limite, double valorLimite) {
		super(agencia, numConta, titular, limite, valorLimite);
	}

	@Override
	public boolean encerrarConta() {
		if (getSaldo() == 0) {
			return true;
		} else {
			return false;
		}

	}

}
