
package programa;

/**
 *
 * @author rafam
 */
public class Gerente extends Funcionario {
   
    private int senha;
    private int funcionariosGeridos;
    
//    public boolean autenticarSenha(int senha){
//        if(this.senha == senha){// Se a senha escrita for igual a senha salva retorna a verdadeiro
//            System.out.println("Acesso confirmado");
//            return true;
//        }
//        else{   
//            System.out.println("Acesso Negado");
//            return false;
//        }
//    }
//
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

//    public int getFuncionariosGeridos() {
//        return funcionariosGeridos;
//    }
//
//    public void setFuncionariosGeridos(int funcionariosGeridos) {
//        this.funcionariosGeridos = funcionariosGeridos;
//    }
    
 
}
