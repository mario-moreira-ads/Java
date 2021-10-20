
public class Poupanca extends Conta
{
    private double taxaJuros;
        
    public Poupanca(){
     super("","");   
    }
    
    public void rendimento(){
        depositar(saldo * taxaJuros);   
    }
    
    public double getTaxaJuros(){
       return taxaJuros;       
    }
    public void setTaxaJuros(double taxaJuros){
        this.taxaJuros  = taxaJuros;
    }
    
}
