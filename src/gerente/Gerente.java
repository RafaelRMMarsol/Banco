package gerente;
import funcionarios.Funcionarios;

public class Gerente extends Funcionarios {
	
	public Gerente(){
		this.bonificacao = 1.8;		
	}
	
	public Gerente(double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	@Override
	public double getBonificacao() {
		return this.bonificacao;
	}
	
	@Override
	public void setBonificacao(Double salario) {
		this.salario = this.salario * this.bonificacao;	
	}

}
