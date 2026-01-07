import java.util.ArrayList;
import java.util.List;

public class Salada {
    private String nomeDaSalada;
    private List<Fruta> ingredientes;

    public Salada(String nomeDaSalada) {
        this.nomeDaSalada = nomeDaSalada;
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarFruta(Fruta fruta) {
        this.ingredientes.add(fruta);
    }

    public void exibirReceita() {
        System.out.println("--- Cardápio: " + nomeDaSalada + " ---");
        if (ingredientes.isEmpty()) {
            System.out.println("A salada está vazia.");
        } else {
            for (Fruta f : ingredientes) {
                System.out.println("  [ ] " + f);
            }
        }
    }
}