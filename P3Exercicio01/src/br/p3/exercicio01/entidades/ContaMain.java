package br.p3.exercicio01.entidades;

public class ContaMain {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(44427, 2357947, "Maria", 1000.0, 5000.0);
		cc.depositar(2000);
		System.out.println("SALDO APÓS DEPOSITO: " + cc.getSaldo());
		cc.sacar(1100);
		System.out.println("SALDO APÓS SAQUE: " + cc.getSaldo());

		System.out.println("CONTA ENCERRADA: " + cc.encerrarConta());

		ContaPoupanca cp = new ContaPoupanca(22205, 0135725, "João", 1000.0, 5000.0);
		cp.depositar(2000);
		System.out.println("SALDO APÓS DEPOSITO: " + cp.getSaldo());
		cp.sacar(2000);
		System.out.println("SALDO APÓS SAQUE: " + cp.getSaldo());
		
		System.out.println("CONTA ENCERRADA: " + cp.encerrarConta());

	}

}
