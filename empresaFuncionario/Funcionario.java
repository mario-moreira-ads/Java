
public class Funcionario
{
    //1ª atributos
    private String nome;
    private int numeroFilhos;
    private double salarioBase, totalVenda;
    private boolean usaValeTransporte, ehTrabalhoNoite, ehVendedor;
            
    private double inss(){
      return salarioBase * 0.13;
    }
    
    public double bonusPorFilhos(){
      return (numeroFilhos <= 3)? numeroFilhos * 50 : 150 ; 
       /*
       if (numeroFilhos <= 3){
         salarioBruto += numeroFilhos * 50;
       }else{
          salarioBruto += 150; 
       }
       */   
    }
    
    public double descontoUsoVale(){
      return (usaValeTransporte)? salarioBase * 0.03 : 0 ;      
    }
    
    public double bonusTrabalhadorNoturno(){
      return (ehTrabalhoNoite)? salarioBase * 0.05 : 0 ;      
    }
    
    public double bonusVendas(){
      return (ehVendedor)? totalVenda * 0.02 : 0 ;     
    }
    
    //4º Metodo
    public double salario(){
        return salarioBase - inss() + bonusPorFilhos() -  descontoUsoVale()
         + bonusTrabalhadorNoturno() + bonusVendas();
    }
    
    //2º Construtor
    public Funcionario(){
      nome = "";
      numeroFilhos = 0;
      salarioBase = totalVenda = 0;
      usaValeTransporte = ehTrabalhoNoite = ehVendedor = false;
    }
    public Funcionario(String novoNome){
      nome = novoNome;
      numeroFilhos = 0;
      salarioBase = totalVenda = 0;
      usaValeTransporte = ehTrabalhoNoite = ehVendedor = false;      
    }
    public Funcionario(double salario){
      nome = "";
      numeroFilhos = 0;
      salarioBase = salario;
      totalVenda = 0;
      usaValeTransporte = ehTrabalhoNoite = ehVendedor = false;      
    }
    public Funcionario(String nNome, int nFilhos, double sal, double vendas,
        boolean vale, boolean noite, boolean vend){
      nome = nNome;
      numeroFilhos = nFilhos;
      salarioBase = sal;
      usaValeTransporte = vale;
      ehTrabalhoNoite = noite;
      ehVendedor = vend; 
      totalVenda = vendas;     
    }

    
    //3º Metodo de Acesso
    public void setNome(String novoNome){
        this.nome = novoNome;        
    }
    public String getNome(){
       return nome;   
    }
    
    public void setNumeroFilhos(int novoNumeroFilhos){
        if (novoNumeroFilhos >= 0){
           this.numeroFilhos = novoNumeroFilhos;        
        }
    }
    public int getNumeroFilhos(){
       return numeroFilhos;   
    }
    
    public void setSalarioBase(double SalarioBase){
        salarioBase = SalarioBase;        
    }
    public double getSalarioBase(){
       return salarioBase;   
    }
    
    public void setTotalVenda(double totalVenda){
        this.totalVenda = totalVenda;        
    }
    public double getTotalVenda(){
       return this.totalVenda;   
    }
    
    public void setUsaValeTransporte(boolean usaValeTransporte){
        this.usaValeTransporte = usaValeTransporte;        
    }
    public boolean getUsaValeTransporte(){
       return this.usaValeTransporte;   
    }
    
    public void setEhTrabalhoNoite(boolean ehTrabalhoNoite){
        this.ehTrabalhoNoite = ehTrabalhoNoite;        
    }
    public boolean getEhTrabalhoNoite(){
       return this.ehTrabalhoNoite;   
    }
    
    public void setEhVendedor(boolean ehVendedor){
        this.ehVendedor = ehVendedor;        
    }
    public boolean getEhVendedor(){
       return this.ehVendedor;   
    }
    
    
    
}
