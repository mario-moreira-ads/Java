
import java.util.ArrayList;

public class Cliente
{
    private String nome;
    private ArrayList<Conta> contas;
    
    public Cliente(){
     contas = new ArrayList<>();
    }
    
    public Cliente(String nome){
      this.nome  = nome; 
      contas = new ArrayList<>();  
    }
    
    public double saldoContas(){
       double saldo = 0;
       for (Conta c : contas){
           saldo += c.getSaldo();
        }
        
       return saldo;   
    }
    
    
    public ArrayList<Conta> getContas(){
       return contas;       
    }
    public void addConta(Conta conta){
        this.contas.add( conta );
    }
    
    public String getNome(){
       return nome;       
    }
    public void setNome(String nome){
        this.nome  = nome;
    }
    
}
