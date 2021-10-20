
import java.util.Scanner;

public class Principal
{
    
    public static void main(String args[]){
         
        Scanner le = new Scanner(System.in);
        
        Empresa emp = new Empresa();
        
        System.out.println("Informe o nome da Empresa:");
        emp.setNome( le.nextLine() );
        
        while(true){
            System.out.println("#### Funcionario");
            Funcionario func = new Funcionario();
            System.out.println("Nome: ");
            func.setNome( le.nextLine() );
            System.out.println("Numero Filhos: ");
            func.setNumeroFilhos( le.nextInt() );
            System.out.println("Salario Base: ");
            func.setSalarioBase( le.nextDouble() );
            System.out.println("Usa Vale Transporte: (true ou false)");
            func.setUsaValeTransporte( le.nextBoolean() );
            System.out.println("Trabalha a noite: (S ou N)");
            func.setEhTrabalhoNoite( le.next().equalsIgnoreCase("S") );
            System.out.println("e Vendedor: (S ou N)");
            boolean vend = le.next().equalsIgnoreCase("S") ;
            func.setEhVendedor( vend );
            if (vend){
                System.out.println("Total de Vendas: ");
                func.setTotalVenda( le.nextDouble() );                
            }
            
            emp.addFuncionario( func );
            
            System.out.println("Deseja outro Funcionario? (S ou N)");
            if ( le.next().equalsIgnoreCase("n") ){
                break;
            }    
            le.nextLine();
        }
        
        System.out.println("Empresa :"+emp.getNome()+
        " Total Salarios R$ "+emp.totalSalariosList() );
    }
    
}
