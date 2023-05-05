import java.util.ArrayList;

public class Pessoa<rede> {

    private rede dado;
    private ArrayList<Aresta<rede>> arestasEntrada;
    private ArrayList<Aresta<rede>> arestasSaida;

    public Pessoa(rede valor){
        this.dado = valor;
        this.arestasEntrada = new ArrayList<Aresta<rede>>();
        this.arestasSaida = new ArrayList<Aresta<rede>>();
    }

    public rede getDado() {
        return dado;
    }

    public void setDado(rede dado) {
        this.dado = dado;
    }

    public ArrayList<Aresta<rede>> getArestasEntrada() {
        return arestasEntrada;
    }

    public void setArestasEntrada(ArrayList<Aresta<rede>> arestasEntrada) {
        this.arestasEntrada = arestasEntrada;
    }

    public ArrayList<Aresta<rede>> getArestasSaida() {
        return arestasSaida;
    }

    public void setArestasSaida(ArrayList<Aresta<rede>> arestasSaida) {
        this.arestasSaida = arestasSaida;
    }

    public void adicionarArestaEntrada(Aresta<rede> aresta){
        this.arestasEntrada.add(aresta);
    }

    public void adicionarArestaSaida(Aresta<rede> aresta){
        this.arestasSaida.add(aresta);
    }
}
