package funcionarios;

public abstract class Funcionarios {
	
	protected String nome;
	protected String cpf;
	protected String registro;
	protected double salario = 1000;
	protected String email;
	protected String senha;
	protected double bonificacao;
	protected String usu;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRegistro() {
		return registro;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha(){
		return senha;
	}
	
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setUsu(String usu) {
		this.usu = usu;
	}
	
	public String getUsu(){
		return usu;
	}
	
	public abstract double getBonificacao();
	public abstract void setBonificacao(Double bonificacao);
	
	
	
}
