package contabancaria;

public class ContaBancaria {
	private int numeroConta;
	private String nomeTitular;
	private double depositoInicial;
	private double saldo;

	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.depositoInicial = 0;
	}
	
	public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.depositoInicial = depositoInicial;
		depositar(this.depositoInicial);
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double deposito) {
		saldo = getSaldo()+deposito;
	}
	
	public void sacar(double saque) {
		double taxa = 5.00;
		saldo = saldo - saque - taxa;
	}
	
	@Override
	public String toString() {
		return "Conta: " + numeroConta 
				+ ", Titular: " + nomeTitular
				+ ", Saldo: R$ " + String.format("%.2f", saldo);
	}

}