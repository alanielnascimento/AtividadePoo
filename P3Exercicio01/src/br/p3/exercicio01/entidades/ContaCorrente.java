package br.p3.exercicio01.entidades;

public final class ContaCorrente extends Conta {

	private static final double TAXA_SAQUE = 0.1;

	public ContaCorrente(int agencia, int numConta, String titular, double limite, double valorLimite) {
		super(agencia, numConta, titular, limite, valorLimite);
	}

	public void sacar(double valor) {
		if (valor > getLimite() && valor <= getValorLimite()) {
			valor += TAXA_SAQUE;
			super.sacar(valor);
		} else {
			super.sacar(valor);
		}

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
