
import java.util.ArrayList;

public class Empresa
{
    private Funcionario[] funcionarios;
    private ArrayList<Funcionario> funcionariosList;
    private String nome;
    
    public Empresa(){
       funcionarios = new Funcionario[10];  
       funcionariosList = new ArrayList<>();
    }
    
    public ArrayList<Funcionario> getFuncionariosList(){
      return  funcionariosList;  
    }
    
    public Funcionario[] getFuncionarios(){
      return  funcionarios;  
    }
    
    public void setFuncionarios(int posicao, 
                    Funcionario funcionario){
        this.funcionarios[posicao] = funcionario;
    }
    
    public void addFuncionario(Funcionario funcionario){
        this.funcionariosList.add(funcionario);
    }
    
    public String getNome(){
      return nome;   
    }
    
    public void setNome(String nome){
       this.nome = nome;   
    }
    
    public double totalSalarios(){
        double total = 0;
        for(int i = 0; i < funcionarios.length; i++  ){            
            Funcionario f = funcionarios[i];
            if (f != null){
               total += f.salario();                
            }
        }     
        return total;
    }
    
    public double totalSalariosList(){
        double total = 0;
        /*
        for(int i = 0; i < funcionariosList.size(); i++  ){            
            Funcionario f = funcionariosList.get(i);
            total += f.salario(); 
        }  */
        
        for(Funcionario f : funcionariosList){
           total += f.salario();  
        }
        
        return total;
    }
    
    
}
