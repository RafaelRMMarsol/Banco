package funcionarios;

public class Fcaixa extends Funcionarios {//Cadastra Cliente
	
	public Fcaixa() {
		this.bonificacao = 1.2;		
	}
	
	public Fcaixa(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	@Override
	public double getBonificacao() {
		return this.bonificacao;
	}
	
	@Override
	public void setBonificacao(Double salario) {
		this.salario = this.salario * this.bonificacao ;	
	}
	
}
