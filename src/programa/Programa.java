
package programa;

import javax.swing.JOptionPane;


public class Programa {

    public static void main(String[] args) {
        Conta contaUm;
        contaUm = new Conta(1000.0);// se tem new um construtor
                                    // 1000 limite dado
        Cliente cliente;
        cliente = new Cliente();
        
        Gerente gerente;
        gerente = new Gerente();
        
        Diretor diretor;
        diretor = new Diretor();
        
        //Cadastra Diretor
        diretor.setNome("João");
        diretor.setCpf("12450560537");
        diretor.setSalario(200.0);
        diretor.setSenha(1234);
        
        //Cadastro Diretor
        gerente.setNome("Kleber");
        gerente.setCpf("471023050912");
        gerente.setSalario(100.0);
        gerente.setSenha(3217);
        
        //Cadastra Clientes
        cliente.setNome(JOptionPane.showInputDialog("Digite seu nome :"));
        cliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
        cliente.setEndereco(JOptionPane.showInputDialog("Digite seu endereço: "));
        cliente.setCpf(JOptionPane.showInputDialog("Digite seu CPF: "));
        
        //Criar Conta
        contaUm.setAgencia(JOptionPane.showInputDialog("Digite Agencia: "));//JoptionPane + Ctrl = scanf 
        contaUm.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digiite o numero: ")));//set + Ctrl = variavel que quer q seja editada
        contaUm.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Escreva a Saldo: ")));
        contaUm.setDataDeAbertura(JOptionPane.showInputDialog("Digite a data de abertura :"));
        contaUm.depositar(50.0);
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Saldo de conta: "+ contaUm.getSaldo());
        System.out.println("Redimento: "+ contaUm.calcularRedimento());//por nao retorna nada tem que colocar os parenteses
        
        System.out.println(diretor.getNome());
        System.out.println(diretor.getSalario());
        
        System.out.println(gerente.getNome());
        System.out.println(gerente.getSalario());
    }
    
}
