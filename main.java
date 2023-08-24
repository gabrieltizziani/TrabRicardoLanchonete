package TrabLanchonete;

public class main {
    public static void main(String[] args) {
        Lanche lanche = new Lanche("X-burger", 25.0);
        Lanchonete lanchonete = new Lanchonete("JK", "UniFil Lanches", lanche);
        lanchonete.exibirCardapio();
    }
}
