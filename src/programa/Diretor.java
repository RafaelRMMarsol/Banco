/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

public class Diretor extends Funcionario{
      private int senha;
//    private int funcionariosGeridos;
//    
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
//
//    public int getFuncionariosGeridos() {
//        return funcionariosGeridos;
//    }
//
//    public void setFuncionariosGeridos(int funcionariosGeridos) {
//        this.funcionariosGeridos = funcionariosGeridos;
//    }
    
}
