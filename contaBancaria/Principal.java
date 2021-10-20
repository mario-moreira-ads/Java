
import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal
{
    
    private static DecimalFormat formatador;
    
    public static void main(String[] args){
        
        Scanner le = new Scanner(System.in);
        formatador = new DecimalFormat("R$ #,##0.00");
     
        Cliente cliente = new Cliente();
        
        System.out.println("###### SysBank ######");
        System.out.println("## informe o nome: ");
        cliente.setNome( le.nextLine() );
        
        inicializarCliente( cliente );
        
        //menu
        while(true){
            
          int menu = escolhaMenu(); 
          
          if (menu == 5) {
             break; 
          }else if (menu == 1){
              cliente.addConta( cadastrarConta(le) ); 
          }else if (menu == 2){
              imprimeContas( cliente );   
          }else if (menu == 3){    
              realizaOperacoes( cliente );
          }else{
             System.out.println("menu invalido!!!");   
          }            
            
        }
        
        System.out.println("## Ate logo "+cliente.getNome());
    }
    
     public static void realizaOperacoes(Cliente c){
        Scanner ler = new Scanner(System.in); 
        String op = escolheOperacao(); 
        
        System.out.println("## Escolha a conta ");
        listaContas(c);        
        int numConta = ler.nextInt();
        
        System.out.println("## Qual o Valor da Operaçao? ");
        double valor = ler.nextDouble();        
        
        if(op.equals("s")){
            c.getContas().get( numConta -1 ).sacar( valor );
        }else if (op.equals("d")){
            c.getContas().get( numConta -1 ).depositar( valor );           
        }else if (op.equals("t")){
            System.out.println("## Escolha a conta que recebera a Tansferencia ");
            listaContas(c);        
            int numTransf = ler.nextInt();
            
            Conta cd = c.getContas().get(numTransf -1);
            
            c.getContas().get( numConta -1 ).transferir( cd , valor );
            
        }else{
           System.out.println("## Operaçao Invalida! "); 
        }
        
        System.out.println("## Operaçao realizada com sucesso! ");
         
    }
    
    public static void listaContas(Cliente c){
        for( int i = 0; i< c.getContas().size(); i++ ){ 
            Conta ct = c.getContas().get(i);
           System.out.println("## "+(i+1)+") conta: "+ ct.getNumero() 
           +" Tipo de Conta: "+ct.getClass().toString().replaceAll("class ","")
           ); 
       }
    }
    
    public static String escolheOperacao(){
        Scanner ler = new Scanner(System.in);
        System.out.println("###### Tipo de Operaçao ######");                
        System.out.println("# s. Saque");
        System.out.println("# d. Deposito");
        System.out.println("# t. Transferencia");
        return ler.nextLine();
    }
    
    public static void imprimeContas(Cliente c){
       System.out.println("###### MINHAS CONTAS ######"); 
       System.out.println("## nome: "+c.getNome()); 
       System.out.println("## numero de contas: "+ c.getContas().size() ); 
       System.out.println("===============");
       for( Conta ct :  c.getContas() ){ 
           System.out.println("## conta: "+ ct.getNumero() +" saldo: "+ formatador.format(ct.getSaldo()) 
           +" - Banco: "+ ct.getBanco().getNome().toUpperCase()
           +" Tipo de Conta: "+ct.getClass().toString().replaceAll("class ","")
           ); 
       }
       System.out.println("===============");
       System.out.println("Saldo das Contas :: "+formatador.format(c.saldoContas()));
        
       
    }
    
    //2ª forma, passar a variavel por parametro.
    public static Conta cadastrarConta(Scanner ler){        
          System.out.println("###### CADASTRO DE CONTA ######"); 
          System.out.println("## escolha o tipo de conta");                
          System.out.println("# C. conta comum");
          System.out.println("# E. conta especial");
          System.out.println("# P. conta poupança");
          String tipoConta = ler.next();  
          Conta c;
          if (tipoConta.equalsIgnoreCase("E")){
             c = new ContaEspecial();    
          }else if (tipoConta.equalsIgnoreCase("P")){
             c = new Poupanca();    
          }else{
             c = new Conta("","");   
          }
          
          System.out.println("# agencia");
          c.setAgencia( ler.next() );          
          System.out.println("# numero Conta");
          c.setNumero( ler.next() );
                    
          if ( c instanceof ContaEspecial ){
              System.out.println("# limiteCredito");
              //cast
              ((ContaEspecial)c).setLimiteCredito( ler.nextDouble() );
          }
          
          c.setBanco( new Banco("BB",10) );
          
          return c;
    }
    
    
    public static int escolhaMenu(){
          // 3ª forma de usar uma variavel, criar novamente
          Scanner ler = new Scanner(System.in);
          System.out.println("###### MENU ######");  
          System.out.println("## 1. Cadastrar conta");
          System.out.println("## 2. Listar Contas");
          System.out.println("## 3. Operaçoes");
         // System.out.println("## 4. Relatorio");
          System.out.println("## 5. Sair");
            
          return ler.nextInt();        
    }
    
    public static void inicializarCliente(Cliente c ){
        
        Conta ct = new Conta("123","123");
        ct.setBanco( new Banco("BB",10) );
        ct.depositar(5000.4654654);
        c.addConta( ct  );
        
        ct = new ContaEspecial("456","456");
        ct.setBanco( new Banco("Caixa",10) );
        c.addConta( ct );
        
        ct = new Poupanca();
        ct.setNumero("789");
        ct.setAgencia("789");
        ct.setBanco( new Banco("c6",10) );
        c.addConta(  ct );
        
    }
    
    
}

