import java.util.ArrayList;

public class Viagem
{
    private String numeroLinha;
    private String cidadePartida;
    private String cidadeDestino;
    private String dataSaida;
    private String horaSaida;
    private String dataChegada;
    private String horaChegada;
    private boolean[] assento;
    private double km;
    private String ehInterestadual, motorista1,motorista2;
    static ArrayList<Veiculo> veiculos;
    private Veiculo veiculo;

    public Viagem(){}

    //calculo da passagem
    protected double valorPassagem(){
        return km *0.50;
    }

    public Viagem(String cidadePartida)
    {
        this.cidadePartida = cidadePartida;
        this.assento = new boolean[100];
    }

    public void setNumeroLinha(String numeroLinha)
    {
        this.numeroLinha = numeroLinha;
    }

    public String getNumeroLinha()
    {
        return numeroLinha;
    }

    public void setCidadePartida(String cidadePartida)
    {
        this.cidadePartida = cidadePartida;
    }

    public String getCidadePartida()
    {
        return cidadePartida;
    }

    public void setCidadeDestino(String cidadeDestino)
    {
        this.cidadeDestino = cidadeDestino;
    }

    public String getCidadeDestino()
    {
        return cidadeDestino;
    }

    public void setEhInterestadual(String ehInterestadual)
    {
        this.ehInterestadual = ehInterestadual;
    }

    public String getEhInterestadual()
    {
        return ehInterestadual;
    }

    public void setKm(double km)
    {
        this.km=km;        
    }

    public double getKm()
    {
        return km;
    }

    public void setDataSaida(String dataSaida)
    {
        this.dataSaida = dataSaida;
    }

    public String getDataSaida()
    {
        return dataSaida;
    }

    public void setHoraSaida(String horaSaida)
    {
        this.horaSaida = horaSaida;
    }

    public String getHoraSaida()
    {
        return horaSaida;
    }

    public void setDataChegada(String dataChegada)
    {
        this.dataChegada = dataChegada;
    }

    public String getDataChegada()
    {
        return dataChegada;
    }

    public void setHoraChegada(String horaChegada)
    {
        this.horaChegada = horaChegada;
    }

    public String getHoraChegada()
    {
        return horaChegada;
    }

    public void setMotorista1(String motorista1)
    {
        this.motorista1=motorista1;
    }

    public String getMotorista1()
    {
        return motorista1;
    }

    public void setMotorista2(String motorista2)
    {
        this.motorista2=motorista2;
    }

    public String getMotorista2()
    {
        return motorista2;
    }

    public void setVeiculo(Veiculo veiculo)
    {
        this.veiculo = veiculo;
    }    

    public Veiculo getVeiculo()
    {
        return veiculo;
    }

    public void setAssento(int lugar)
    {
        if(assento[lugar] == false)
        {
            assento[lugar] = true;
            System.out.println("Compra efetuada com Sucesso");
        }
        else
        {
            System.out.println("Assento ocupado");
        }
    }
}
