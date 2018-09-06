
package programa;

public class Conta {
    //Variaveis fora da main são Obejetos ou atributos
    private int numero; 
    private Cliente titular;
    private double saldo;
    private String agencia;
    private String dataDeAbertura;
    private double limites;
    
    Conta(double limites){
        this.limites = limites;//COntrutor obriga o atributo quando for passado com informação  
    }
   
    
    public void sacar(double quantidade){
        double saldoNovo = this.saldo - quantidade;////Vai pegar o saldo e diminuir com valor dado
        this.saldo = saldoNovo; //Gera o novo saldo descontado
    }
    
    public boolean saca(double valor){
        if(this.saldo < valor){
            return false;
        }
        else{
            this.saldo = this.saldo - valor;
            return true;
        }    
    }
    
    public  void depositar(double quantidade){
        this.saldo += quantidade; //Vai somar com o valor salvo
    }
    
    public  void tranferirPara(Conta destino, double valor){
        this.saldo  = this.saldo - valor;//Vai pegar o saldo e diminuir com valor dado
        destino.saldo = this.saldo;// vai depositar o valor na conta dada
    }
   
    public boolean transfere(Conta destino, double valor){
        boolean retirou = this.saca(valor);
        if(retirou == false){
            return false;
        }
        else{
            destino.depositar(valor);
            return true;
        }
    }
    
    public double calcularRedimento(){
        this.saldo = this.saldo * 0.1;
        return this.saldo;
    }
   
    public int getNumero() { //Get busca o que ta armazenado
        return numero;
    }

    public void setNumero(int numero) { //armazena e edita
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public double getLimites() {
        return limites;
    }

    public void setLimites(double limites) {
        this.limites = limites;
    }
   
    
}