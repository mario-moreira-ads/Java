import java.util.Scanner;
import java.util.ArrayList;

public class Principal
{

    static Scanner ler = new Scanner(System.in);
    static ArrayList<Viagem> guardarLinha = new ArrayList<>();
    static ArrayList<Veiculo> guardarOnibus = new ArrayList<>();
    static ArrayList<Itinerario> guardarItinerario = new ArrayList<>();

    public static void Principal(String[] args)
    {
        System.out.println("-----   O ESFORÇO É MAIS IMPORTANTE QUE O RESULTADO FINAL!!!-----");
        System.out.println("***GUSTIL VIAGENS***");
        
        montarMenu();
        Viagem linha = new Viagem("");

        int resp = ler.nextInt();
        while(true)
        {
            if(resp == 0)
            {
                break;
            }
            else if(resp == 1)
            {
                cadastrarOnibus();
            }
            else if(resp == 2)
            {
                consultarOnibus();
            }
            else if(resp == 3)
            {
                cadastrarLinha(linha);
            }
            else if(resp == 4)
            {
                consultarLinha();
            }
            else if(resp == 5)
            {
                realizarVendas(linha);
            }
            else if(resp == 6)
            {
                relatorio(linha);
            } 

            montarMenu();
            resp = ler.nextInt();
        }
    }

    private static void montarMenu()
    {
        System.out.println("\n----------MENU----------");
        System.out.println(" 1 - Cadastrar Ônibus   ");
        System.out.println(" 2 - Consultar Veículo   ");
        System.out.println(" 3 - Cadastrar Itinerário   ");
        System.out.println(" 4 - Consultar Itinerário    ");
        System.out.println(" 5 - Venda de Passagens   ");
        System.out.println(" 6 - Relatório ANTT   ");
        System.out.println(" Tecle 0 para Sair  ");
        System.out.println("\n----------------------------------------");
    }

    private static void cadastrarOnibus()
    {
        String resposta = " ";
        do
        {
            System.out.println("  ********** Cadastro de Veículo **********  ");
            System.out.println("\n----------------------------------------");

            Veiculo veiculo = MetodoTipoVeiculo();

            System.out.print("Número do Onibus: "); veiculo.setNumeroPassagem(ler.next());
            guardarOnibus.add(veiculo);        

            System.out.print("Deseja Cadastrar outro Onibus? (S)im (N)ão: ");
            System.out.println("\n----------------------------------------");
            resposta = ler.next();
        }while(resposta.equalsIgnoreCase("s"));
    }

    private static Veiculo MetodoTipoVeiculo()
    {
        System.out.println("Informe o Tipo de onibus");
        System.out.println("# L  Leito");
        System.out.println("# M  Micro");

        String tipoVeiculo = ler.next();
        if (tipoVeiculo.equalsIgnoreCase("L")){
            return  new OnibusLeito("","",0,0);
        }
        else  {
            return  new MicroOnibus("","",0,0);
        }

    }

    private static void consultarOnibus()
    {
        System.out.println("  ********** Consultar Veículos Cadastrados**********  ");
        System.out.println("\n-----------------------------------------------------");

        String bus = "";
        do{
            System.out.print("Número do Onibus: "); bus = ler.next();

            for(Veiculo o: guardarOnibus)
            {
                if(bus.equals(o.getNumeroPassagem()))
                {
                    System.out.println("Onibus: "+o.getNumeroPassagem()+"\nCapacidade: "+o.getCapacidade()+"\nTipo de Onibus: "+o.getTipo());
                }
            }

            System.out.print("Pesquisar outro Veículo: (S)im  (N)ão: "); bus = ler.next();
            System.out.println("\n----------------------------------------");
        }while(bus.equalsIgnoreCase("s"));
    }

    private static void cadastrarLinha(Viagem linha)
    {
        System.out.println("  ********** Cadastrar Itinerário **********  ");
        String bus,resp;

        do{

            System.out.print("Onibus: "); bus = ler.next();
            for(Veiculo o: guardarOnibus)
            {
                if(bus.equals(o.getNumeroPassagem()))
                {
                    System.out.println("Onibus: "+o.getNumeroPassagem()+"\nCapacidade: "+o.getCapacidade()+"\nTipo de Onibus: "+o.getTipo());
                    linha.setVeiculo(o);
                    break;
                }
            }
            System.out.print("Numero da Linha: "); linha.setNumeroLinha(ler.next());
            System.out.print("Cidade de Partida: "); linha.setCidadePartida(ler.next());
            System.out.print("Cidade de Destino: "); linha.setCidadeDestino(ler.next());
            System.out.print("Data de Saida: "); linha.setDataSaida(ler.next());
            System.out.print("Hora de Saida: "); linha.setHoraSaida(ler.next());
            System.out.print("Data de Chegada: "); linha.setDataChegada(ler.next());
            System.out.print("Hora de Chegada: "); linha.setHoraChegada(ler.next());
            System.out.print("Distância(em Km): "); linha.setKm(ler.nextDouble());
            if(linha.getKm()>200){
                System.out.print("Motorista #1: "); linha.setMotorista1(ler.next());
                System.out.print("Motorista #2: "); linha.setMotorista2(ler.next());
                System.out.print("Ônibus Leito"); 

            }else{
                System.out.print("Motorista #1: "); linha.setMotorista1(ler.next());
                System.out.print("Micro Ônibus"); 

            }

            guardarLinha.add(linha);
            System.out.print("\nCadastrar outra Linha: (S)im (N)ão: "); resp = ler.next();
            System.out.println("\n----------------------------------------");
        }while(resp.equalsIgnoreCase("s"));
    }

    private static void consultarLinha()
    {
        System.out.println("  ********** Consultar Linha **********  ");

        String linha = "";
        String cidadePartida;
        String cidadeDestino;
        String horaSaida;
        String dataSaida;

        do{

            System.out.println("****    Digite os Dados da Linha que Deseja Consultar    ****");

            System.out.print("Escolha a cidade de Partida: "); cidadePartida = ler.next();
            System.out.print("Escolha a cidade de Destino: "); cidadeDestino = ler.next();
            System.out.print("Escolha o data de saida: "); dataSaida = ler.next();
            System.out.print("***Dados da Viagem***");
            System.out.print("\nOrigem: " + cidadePartida + "\nDestino: " + cidadeDestino + "\nData: " + dataSaida  );
            System.out.print("\nPesquisar outra linha: (S)im (N)ão: "); linha = ler.next();
            System.out.println("\n----------------------------------------");

            for(Viagem l: guardarLinha)
            {
                if(cidadePartida.equalsIgnoreCase(l.getCidadePartida()) && cidadeDestino.equalsIgnoreCase(l.getCidadeDestino()) && 
                dataSaida.equalsIgnoreCase(l.getDataSaida()))
                {
                    System.out.println("Onibus: "+l.getVeiculo().getNumeroPassagem()+"\nCapacidade: "+l.getVeiculo().getCapacidade()+"\nTipo de Onibus: "+l.getVeiculo().getTipo()+
                        "\nNumero da linha: "+l.getNumeroLinha()+"\nValor da passagem: "+l.valorPassagem()+"\nCidade de Partida: "+l.getCidadePartida()+
                        "\nCidade de destino: "+l.getCidadeDestino()+"\nData de saida: "+l.getDataSaida()+"\nHora da saida: "+l.getHoraSaida()+"\nData de chegada: "
                        +l.getDataChegada()+"\nHora da chegada: "+l.getHoraChegada());
                }
            }

            System.out.print("Pesquisar outra linha: (S)im (N)ão: "); linha = ler.next();
            System.out.println("\n----------------------------------------");
        }while(linha.equalsIgnoreCase("s"));
    }

    private static void realizarVendas(Viagem linha)
    {
        System.out.println("----------VENDA DE PASSAGENS----------");
        Itinerario i = new Itinerario("","",0);
        System.out.println("Nome do Passageiro: "); 
        i.setNome(ler.next());
        System.out.println("CPF: "); 
        i.setCPF(ler.next());
        System.out.println("Idade (em anos): "); 
        i.setIdade(ler.nextInt());
        if(i.getIdade()>=18 && i.getIdade()<60){

            System.out.println("Sr(a): " + i.getNome()+ "\nValor da sua passagem: " + linha.valorPassagem() );
            System.out.println("Destino: "+linha.getCidadeDestino());

        } else if(i.getIdade()>=60){
            System.out.println("Passagem Gratuita!" + " - Valor: " + (linha.valorPassagem()-linha.valorPassagem()));
            System.out.println("\nDestino: "+linha.getCidadeDestino());

        } else if (i.getIdade()<18 && i.getIdade()>=0){

            System.out.println("ATENÇÃO - MENOR DE IDADE");
            System.out.println("Nome do Responsável"); 
            i.setNomeResp(ler.next());
            System.out.println("CPF do Responsável"); i.setCpfResp(ler.next());
            System.out.println("\n-----------------------------------------");
            System.out.println("*** Selecione a viagem *** ");
            System.out.println("\nDestino: "+linha.getCidadeDestino()+ "\nValor Total: "+linha.valorPassagem() *2);
        } else{

            System.out.println("Idade inválida!");
        }
        System.out.println("\n----------------------------------------");

    }

    private static void relatorio(Viagem linha){

        System.out.println("----------RELATÓRIO ANTT DE VIAGEM----------");
        System.out.print("\nNumero da Linha: " + linha.getNumeroLinha());
        System.out.print("\nValor da Passagem: "+ linha.valorPassagem());
        System.out.print("\nCidade de Partida: " + linha.getCidadePartida());
        System.out.print("\nCidade de Destino: " + linha.getCidadeDestino());
        System.out.print("\nData de Saida: " + linha.getDataSaida());
        System.out.print("\nHora de Saida: " + linha.getHoraSaida());
        System.out.print("\nData de Chegada: " + linha.getDataChegada());
        System.out.print("\nHora de Chegada: " + linha.getHoraChegada());
        System.out.print("\nDistância(em Km): " + linha.getKm());
        if(linha.getKm()>200){
            System.out.print("\nMotorista #1: " + linha.getMotorista1());
            System.out.print("\nMotorista #2: " + linha.getMotorista2());
            System.out.print("\nÔnibus Leito"); 

        }else{
            System.out.print("\nMotorista #1: "+linha.getMotorista1());
            System.out.print("\nMicro Ônibus");

        }
        System.out.println("\n----------------------------------------");
    }
}
