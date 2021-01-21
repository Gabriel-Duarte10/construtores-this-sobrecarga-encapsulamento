package entities;

public class Banco {
	
	public static final int Taxa = 5;
	
	private String name;
	private int conta;
	private double extrato;
	
	public Banco(){
		
	}
	public Banco(String name, int conta, double depositoincial) {
		this.name = name;
		this.conta = conta;
		Deposito(depositoincial);
	}
	public Banco(String name, int conta) {
		this.name = name;
		this.conta = conta;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getConta() {
		return conta;
	}
	public double getExtrato() {
		return extrato;
	}
	
	public void Deposito(double dep) {
		 extrato += dep;
	}
	public void Saque(double saq) {
		 extrato -= saq+Taxa;
	}
	
	
	
	
}
