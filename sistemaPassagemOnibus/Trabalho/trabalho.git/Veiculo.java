import java.util.ArrayList;

public class Veiculo
{
    protected String NumeroPassagem;
    protected String tipo;
    protected  int Capacidade;
    protected  int EhIdoso;
    protected  int capacidadeIdoso;
    private ArrayList<Itinerario> itinerarioList;

    public void setEhIdoso(int EhIdoso)
    {
        this.EhIdoso=EhIdoso;
    }

    public int getEhIdoso()
    {
        return EhIdoso ;
    }

    public void setNumeroPassagem(String NumeroPassagem)
    {
        this.NumeroPassagem = NumeroPassagem;
    }

    public String getNumeroPassagem()
    {
        return NumeroPassagem;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setCapacidade(int capacidade)
    {
        this.Capacidade = Capacidade;
    }

    public int getCapacidade()
    {
        return Capacidade;
    }

    public void setCapacidadeIdoso(int capacidadeIdoso)
    {
        this.capacidadeIdoso = capacidadeIdoso;
    }

    public int getCapacidadeIdoso()
    {
        return capacidadeIdoso;       
    }

    public ArrayList<Itinerario> getItineraioList()
    {
        return itinerarioList;
    }

    public void addItineraio(Itinerario i)
    {
        this.itinerarioList.add(i);
    }
}

