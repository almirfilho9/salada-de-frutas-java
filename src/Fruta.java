public class Fruta {
    private String nome;
    private String cor;
    private boolean temCaroco;

    // Construtor
    public Fruta(String nome, String cor, boolean temCaroco) {
        this.nome = nome;
        this.cor = cor;
        this.temCaroco = temCaroco;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public boolean temCaroco() {
        return temCaroco;
    }

    // toString para exibir bonitinho
    @Override
    public String toString() {
        return nome + " (" + cor + ")" + (temCaroco ? " - com caroço" : "");
    }
}