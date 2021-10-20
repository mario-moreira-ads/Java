import java.util.ArrayList;

public class Itinerario
{
    private Veiculo veiculo;
    private String nome,nomeResp;
    private String CPF, cpfResp;
    private int idade;
    static ArrayList<Viagem> destinos; 

    public void setVeiculo(Veiculo veiculo)
    {
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo()
    {
        return veiculo;
    }

    public ArrayList<Viagem> getDestinos(){
        return destinos;       
    }

    public void addDestino(Viagem destinos){
        this.destinos.add( destinos );
    }

    public void setNomeResp(String nomeResp)
    {
        if(nome != " ")
        {
            this.nomeResp=nomeResp;
        }
        else
        {
            System.out.println("Por favor digite seu nome");
        }
    }

    public String getNomeResp()
    {
        return nomeResp;
    }

    public void setCpfResp(String cpfResp)
    {

        this.cpfResp=cpfResp;

    }

    public void setNome(String nome)
    {
        if(nome != " ")
        {
            this.nome = nome;
        }
        else
        {
            System.out.println("Por favor digite seu nome");
        }
    }

    public String getNome()
    {
        return nome;
    }

    public void setCPF(String CPF)
    {

        this.CPF = CPF;

    }

    public String getCPF()
    {
        return CPF;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;

    }

    public int getIdade()
    {
        return idade;
    }

    public Itinerario(String nome , String CPF, int idade)
    {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;

    }

}
