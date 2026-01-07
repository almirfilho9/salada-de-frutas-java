public class Fruta {
    private String nome;
    private String cor;
    private boolean temCaroco;

    public Fruta(String nome, String cor, boolean temCaroco) {
        this.nome = nome;
        this.cor = cor;
        this.temCaroco = temCaroco;
    }

    public String getNome() { return nome; }
    public String getCor() { return cor; }
    public boolean temCaroco() { return temCaroco; }

    @Override
    public String toString() {
        return nome + " (" + cor + ")" + (temCaroco ? " - com caroço" : " - sem caroço");
    }
}