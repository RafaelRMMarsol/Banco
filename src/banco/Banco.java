package banco;
import conta.Conta;
import funcionarios.Fcaixa;
import funcionarios.Funcionarios;
import gerente.Gerente;
import java.util.*;
import cliente.Cliente;

import javax.swing.JOptionPane;

public class Banco {
	
	private static ArrayList<Cliente> dadosCliente = new ArrayList<Cliente>(); 
	private static ArrayList<Conta> dadosContas = new ArrayList<Conta>();
	public static String usu;
	private static ArrayList<Funcionarios> dadosFuncionarios = new ArrayList<Funcionarios>();

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		Funcionarios gerente = new Gerente();

		gerente.setNome("adm");
		gerente.setSenha("123");
		gerente.setUsu("adm");
		dadosFuncionarios.add(gerente);
		
		String nomeE = JOptionPane.showInputDialog("Digite seu nome");
		String senha = JOptionPane.showInputDialog("Digite sua senha");
		for(Funcionarios f: dadosFuncionarios) {
			if(f.getNome().equals(nomeE) && f.getSenha().equals(senha)) {
				usu = f.getUsu();
			}
		}
		
		boolean sair = false;
		if(usu.equals("adm")) {
		do {
			int menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha : \n"));
			switch(menu) {
				case 1: 
					banco.cadastrarCliente ();
					break;
				case 2:
					banco.cadastrarConta ();
					break;
				case 3:
					banco.exibirCliente();
					break;
				case 4:
					banco.exibirContas();
					break;
				case 5:
					banco.cadastraFuncionario();
					break;
				case 6:
					sair = true;
					break;
			}
	}while (!sair);
		
	}else {
		JOptionPane.showMessageDialog(null, "Algo deu errado");
	}
		
	}
	
	public void cadastrarCliente () {
		Cliente cliente = new Cliente();
		
		String nome = JOptionPane.showInputDialog("Digite o nome");
		cliente.setNome(nome);
		String cpf = JOptionPane.showInputDialog("Digite o cpf");
		cliente.setCpf(cpf);
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		cliente.setIdade(idade);
		String dataDeAbertura = JOptionPane.showInputDialog("Digite a data de abertura");
		cliente.setDataDeAbertura(dataDeAbertura);
		String email = JOptionPane.showInputDialog("Digite o email");
		cliente.setEmail(email);
		String senha = JOptionPane.showInputDialog("Digite a senha");
		cliente.setSenha(senha);
		
		dadosCliente.add(cliente);
	}
	
	public void cadastrarConta () {
		Conta conta = new Conta();
		
		String nome = JOptionPane.showInputDialog("Digite o nome do titular para pesquisa: ");
				
		for(Cliente cliente: dadosCliente) {
			if(cliente.getNome().equalsIgnoreCase(nome)) {
				conta.setTitular(cliente);
			}
		else {
			JOptionPane.showMessageDialog(null, "Cliente não encontrado");
			cadastrarCliente();
		}
		}
		
		String agencia = JOptionPane.showInputDialog("Digite a agencia");
		conta.setAgencia(agencia);
		double limites = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite"));
		conta.setlimites(limites);
		int numeroC = Integer.parseInt(JOptionPane.showInputDialog("Digite Numero da conta"));
		conta.setNumeroC(numeroC);
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo"));
		conta.setSaldo(saldo);
		
		dadosContas.add(conta);
	}
	
	public void exibirCliente() {
		for(Cliente cliente: dadosCliente) {
			JOptionPane.showMessageDialog(null, "\n Nome: " + cliente.getNome() 
			+ "\n CPF: "+ cliente.getCpf() 
			+ "\n Email: "+ cliente.getEmail()
			+ "\n Data de abertura: "+ cliente.getDataDeAbertura());
		}
	}
	
	public void exibirContas() {
		for(Conta conta: dadosContas) {
			JOptionPane.showMessageDialog(null, "\n Numero Conta: " + conta.getNumeroC()
			+ "\nAgencia: " + conta.getAgencia());
		}
	}
	
	public void cadastraFuncionario() {
		Funcionarios func = new Fcaixa();
		
		String nome = JOptionPane.showInputDialog("Digite o nome");
		func.setNome(nome);
		String cpf = JOptionPane.showInputDialog("Digite o cpf");
		func.setCpf(cpf);
		String registro = JOptionPane.showInputDialog("Digite o registro");
		func.setRegistro(registro);
		String email = JOptionPane.showInputDialog("Digite o email");
		func.setEmail(email);
		String senha = JOptionPane.showInputDialog("Digite a senha do funcionario");
		func.setSenha(senha);
		Double boni = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da bonificaçao"));
		func.setBonificacao(boni);
		String usuario = JOptionPane.showInputDialog("Digite o que ele e");
		func.setUsu(usuario);
		dadosFuncionarios.add(func);
	}
}

