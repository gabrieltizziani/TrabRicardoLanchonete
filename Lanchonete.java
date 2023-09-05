package TrabLanchonete;
// local, cardapio (tipo Lanche, infos do lanche, poderia criar um vetor pra lanche)
public class Lanchonete {
    private String local;
    private String nome;
    public static Lanche [] cardapio;

    public Lanchonete(String local, String nome, Lanche [] cardapio) {
        this.local = local;
        this.nome = nome;
        this.cardapio = cardapio;
    }


    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Lanche [] getCardapio() {
        return cardapio;
    }

    public void setCardapio(Lanche[] cardapio) {
        this.cardapio = cardapio;
    }

    public static void ExibirCardapio() {
        System.out.println("oii");

    }
}