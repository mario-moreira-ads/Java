
public class ContaEspecial extends Conta
{
    private double limiteCredito;
    
    public ContaEspecial(){
      super("","");
      limiteCredito = 1000; 
      //setAgencia("abc");
    }
    public ContaEspecial(String agencia, String numero){
      super(agencia,numero);
      limiteCredito = 1000; 
      //setAgencia("abc");
    }
    
    @Override
    public void sacar(double valorSaque){
       if (valorSaque <= (saldo+limiteCredito)){ 
           saldo -= valorSaque; 
       }
    }
        
    public void setLimiteCredito(double limiteCredito){
       this.limiteCredito = limiteCredito;       
    }
    
    public double getLimiteCredito(){
       return limiteCredito;       
    }
    
}
