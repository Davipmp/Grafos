public class Aresta<rede> {

    private double relacao;
    private Pessoa<rede> inicio;
    private Pessoa<rede> fim;

    public Aresta(double peso, Pessoa<rede> inicio, Pessoa<rede> fim) {
        this.relacao = peso;
        this.inicio = inicio;
        this.fim = fim;
    }

    public double getRelacao() {
        return relacao;
    }

    public void setRelacao(double relacao) {
        this.relacao = relacao;
    }

    public Pessoa<rede> getInicio() {
        return inicio;
    }

    public void setInicio(Pessoa<rede> inicio) {
        this.inicio = inicio;
    }

    public Pessoa<rede> getFim() {
        return fim;
    }

    public void setFim(Pessoa<rede> fim) {
        this.fim = fim;
    }
}
