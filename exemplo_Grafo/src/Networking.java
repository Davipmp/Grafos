import java.util.ArrayList;

public class Networking<rede> {

    private ArrayList<Pessoa<rede>> pessoa;
    private ArrayList<Aresta<rede>> arestas;

    public Networking(){
        this.pessoa = new ArrayList<Pessoa<rede>>();
        this.arestas = new ArrayList<Aresta<rede>>();
    }

    public void adicionarPessoa(rede dado){
        Pessoa<rede> novaPessoa = new Pessoa<rede>(dado);
        this.pessoa.add(novaPessoa);
    }

    public void adicionarAresta(Double relacao, rede pessoaInicio, rede pessoaFim){
        Pessoa<rede> inicio = this.getPessoa(pessoaInicio);
        Pessoa<rede> fim = this.getPessoa(pessoaFim);
        Aresta<rede>  aresta = new Aresta<rede>(relacao, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }
    public Pessoa<rede> getPessoa(rede dado){
        Pessoa<rede> pessoa = null;
        for (int i = 0; i < this.pessoa.size(); i++) {
            if(this.pessoa.get(i).getDado().equals(dado)){
                pessoa = this.pessoa.get(i);
                break;
            }
        }
        return pessoa;
    }

    public void BuscaEmLargura(){
        ArrayList<Pessoa<rede>> marcados = new ArrayList<Pessoa<rede>>();
        ArrayList<Pessoa<rede>> fila = new ArrayList<Pessoa<rede>>();
        Pessoa<rede> atual = this.pessoa.get(4);
        marcados.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);
        while (fila.size() > 0){
            Pessoa<rede> visitado = fila.get(0);
            for (int i = 0; i < visitado.getArestasSaida().size(); i++) {
                Pessoa<rede> proximo = visitado.getArestasSaida().get(i).getFim();
                if(!marcados.contains(proximo)){
                    marcados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }
}
