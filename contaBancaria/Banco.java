
public class Banco
{
    private String nome;
    private double taxaAdm;
    
    public Banco(){        
    }
    
    public Banco(String nome, double taxaAdm){
       this.nome = nome;
       this.taxaAdm = taxaAdm;
    }
    
    public String getNome(){
       return nome;       
    }
    public void setNome(String nome){
        this.nome  = nome;
    }
    
    public double getTaxaAdm(){
       return taxaAdm;       
    }
    public void setTaxaAdm(double taxaAdm){
        this.taxaAdm  = taxaAdm;
    }
    
}
