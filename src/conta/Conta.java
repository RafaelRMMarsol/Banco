package conta;
import cliente.Cliente;

public class Conta {

	private int numeroC;
	private String agencia;
	private double saldo;
	private Cliente titular;
	private double limites;
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public int getNumeroC(){
		return numeroC;
	}
	
	public void setNumeroC(int numeroC) {
		this.numeroC = numeroC;		
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo; 
	}
	
	public double getlimites() {
		return limites;
	}
	
	public void setlimites(double limites) {
		this.limites = limites;
	}
	

	public void sacar(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
		
		if(saldo <= 0) {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	public void tranferir(Conta destino, double valor) {
		this.saldo = this.saldo - valor;
		destino.saldo = this.saldo;
		if(this.saldo <= 0) {
			System.out.println("Saldo insuficiente para essa operação");
		}		
	}
	
	public double calcularRendimento() {
		this.saldo = this.saldo  * 1.02;		
		return this.saldo;
	}
	
	
	
	
	
}
