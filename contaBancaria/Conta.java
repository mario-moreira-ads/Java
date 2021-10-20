
public class Conta
{
    private String numero, agencia;
    protected double saldo;
    private Banco banco;
    private Cliente titular;
    
    /*public Conta(){  
        agencia = "xpto";
        saldo = 0;
    }*/
    public Conta(String agencia, String numero){
      this.agencia = agencia;
      //setAgencia(agencia);
      this.numero = numero;
      saldo = 0;
    }

    public void transferir(Conta contaDestino, 
        double valorTranferido){
        if (valorTranferido <= saldo){
           sacar(valorTranferido);   
           contaDestino.depositar(valorTranferido); 
        }
    }
    
    public void depositar(double valorDeposito){        
        if (valorDeposito >= 0){
           saldo += valorDeposito;
        }        
    }
    
    public void sacar(double valorSaque){
       if (valorSaque <= saldo){ 
           saldo -= valorSaque; 
       }
    }
    
    public Cliente getTitular(){
       return titular;       
    }
    public void setTitular(Cliente titular){
        this.titular  = titular;
    }
    
    public Banco getBanco(){
       return banco;       
    }
    public void setBanco(Banco banco){
        this.banco  = banco;
    }
    
    public String getNumero(){
       return numero;       
    }
    public void setNumero(String numero){
        this.numero  = numero;
    }
    
    public String getAgencia(){
       return agencia;       
    }
    public void setAgencia(String agencia){
        this.agencia  = agencia;
    }
    
    public double getSaldo(){
       return saldo;       
    }
    
    
    
}
