package br.p3.exercicio01.entidades;

public abstract class Conta {

	private int agencia;
	private int numConta;
	private String titular;
	private double limite;
	private double saldo;
	private double valorLimite;

	public Conta(int agencia, int numConta, String titular, double limite, double valorLimite) {
		if (limite < 0) {
			limite = 0;
		}
		this.agencia = agencia;
		this.numConta = numConta;
		this.titular = titular;
		this.limite = limite;
		this.valorLimite = valorLimite;
	}

	public void sacar(double valor) {
		if (valor > 0 && valor <= (saldo + limite)) {
			saldo -= valor;
		}
	}

	public final void depositar(double valor) {
		saldo += valor;
	}

	public abstract boolean encerrarConta();

	public double getLimite() {
		return limite;
	}

	public final void setLimite(double limite) {
		this.limite = limite;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public final void setValorLimite(double valor) {
		this.valorLimite = valor;
	}

}
