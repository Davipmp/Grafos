public class Main {
    public static void main(String[] args) {

        Networking<String> grafo = new Networking<String>();
        grafo.adicionarPessoa("Paulo");
        grafo.adicionarPessoa("Lorenzo");
        grafo.adicionarPessoa("Cleuza");
        grafo.adicionarPessoa("Kleber");
        grafo.adicionarPessoa("Claudio");

        grafo.adicionarAresta(2.0, "Paulo", "Lorenzo");
        grafo.adicionarAresta(3.0, "Lorenzo", "Kleber");
        grafo.adicionarAresta(1.0, "Kleber", "Cleuza");
        grafo.adicionarAresta(1.0, "Paulo", "Cleuza");
        grafo.adicionarAresta(2.0, "Claudio", "Lorenzo");
        grafo.adicionarAresta(3.0, "Claudio", "Paulo");

        grafo.BuscaEmLargura();

    }
}