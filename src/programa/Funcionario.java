
package programa;

public class Funcionario {
    
    protected String nome; //protected só fica visivel somente para a sub classe 
    protected String cpf;
    protected double salario;
    
    public double getBonificação(){
        return this.salario * 0.10;
        
    }
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario( double salario){
        this.salario = salario;
        
    }
}