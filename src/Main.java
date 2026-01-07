import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Lista que armazena todas as frutas disponíveis no sistema
    private List<Fruta> catalogoFrutas = new ArrayList<>();

    // Metodo para adicionar frutas ao catálogo
    public void adicionarFruta(Fruta fruta) {
        catalogoFrutas.add(fruta);
    }

    // Getter para que outras partes do código acessem a lista
    public List<Fruta> getCatalogo() {
        return catalogoFrutas;
    }

    public static void main(String[] args) {
        Main app = new Main();
        Scanner leitor = new Scanner(System.in);

        // 1. Carrega todas as centenas de frutas
        popularDados(app);

        System.out.println("========================================");
        System.out.println("       SISTEMA DE SALADAS FRUTAL        ");
        System.out.println("========================================");
        System.out.println("Temos " + app.getCatalogo().size() + " frutas cadastradas.");

        // 2. Interatividade: Pergunta ao usuário
        System.out.print("\nVocê gostaria de ver o catálogo completo? (s/n): ");
        String resposta = leitor.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            System.out.println("\n--- CATÁLOGO COMPLETO ---");
            for (int i = 0; i < app.getCatalogo().size(); i++) {
                System.out.println(i + ". " + app.getCatalogo().get(i));
            }
            System.out.println("-------------------------\n");
        } else {
            System.out.println("\nSeguindo para as sugestões de saladas...\n");
        }


        // 2. Exibe o catálogo completo (opcional)
        System.out.println("Catálogo carregado com " + app.getCatalogo().size() + " frutas.\n");

        // 1. SALADA TROPICAL (Frutas amarelas e laranjas)
        Salada tropical = new Salada("Explosão Tropical");
        tropical.adicionarFruta(app.getCatalogo().get(1));  // Abacaxi
        tropical.adicionarFruta(app.getCatalogo().get(53)); // Manga
        tropical.adicionarFruta(app.getCatalogo().get(26)); // Carambola
        tropical.adicionarFruta(app.getCatalogo().get(52)); // Mamão
        tropical.exibirReceita();

        System.out.println();

// 2. SALADA VERMELHA (Antioxidante)
        Salada vermelha = new Salada("Vermelhos Intensos");
        vermelha.adicionarFruta(app.getCatalogo().get(59)); // Morango
        vermelha.adicionarFruta(app.getCatalogo().get(35)); // Framboesa
        vermelha.adicionarFruta(app.getCatalogo().get(27)); // Cereja
        vermelha.adicionarFruta(app.getCatalogo().get(72)); // Romã
        vermelha.exibirReceita();

        System.out.println();

// 3. SALADA "DETOX" (Frutas verdes)
        Salada detox = new Salada("Green Mix");
        detox.adicionarFruta(app.getCatalogo().get(45)); // Kiwi
        detox.adicionarFruta(app.getCatalogo().get(49)); // Limão
        detox.adicionarFruta(app.getCatalogo().get(64)); // Pera
        detox.adicionarFruta(app.getCatalogo().get(51)); // Maçã (Verde)
        detox.exibirReceita();

        System.out.println();

// 4. SALADA EXÓTICA (Frutas raras ou diferentes)
        Salada exotica = new Salada("Tesouros do Oriente");
        exotica.adicionarFruta(app.getCatalogo().get(48)); // Lichia
        exotica.adicionarFruta(app.getCatalogo().get(71)); // Rambutão
        exotica.adicionarFruta(app.getCatalogo().get(69)); // Pitaya
        exotica.adicionarFruta(app.getCatalogo().get(54)); // Mangostão
        exotica.exibirReceita();

        System.out.println();

// 5. SALADA ENERGIA (Frutas densas e doces)
        Salada energia = new Salada("Energia Pura");
        energia.adicionarFruta(app.getCatalogo().get(14)); // Banana
        energia.adicionarFruta(app.getCatalogo().get(0));  // Abacate
        energia.adicionarFruta(app.getCatalogo().get(29)); // Coco
        energia.adicionarFruta(app.getCatalogo().get(19)); // Cacau
        energia.exibirReceita();

        System.out.println();

        // 4. Uso Dinâmico (Sugestão do Dia Aleatória)
        Salada sugestao = new Salada("Sugestão do Chef (Aleatória)");
        List<Fruta> embaralhada = new ArrayList<>(app.getCatalogo());
        Collections.shuffle(embaralhada);

        for (int i = 0; i < 5; i++) {
            sugestao.adicionarFruta(embaralhada.get(i));
        }
        sugestao.exibirReceita();

        System.out.println("\n⚠️ Dica: Verifique os caroços antes de servir!");
    }

    // Metodo organizado para não poluir o main
    private static void popularDados(Main m) {

        m.adicionarFruta(new Fruta("Abacate", "verde", true));
        m.adicionarFruta(new Fruta("Abacaxi", "amarelo", false));
        m.adicionarFruta(new Fruta("Açaí", "roxa", false));
        m.adicionarFruta(new Fruta("Acerola", "vermelha", false));
        m.adicionarFruta(new Fruta("Ackee", "vermelha", false));
        m.adicionarFruta(new Fruta("Akebia", "roxa", false));
        m.adicionarFruta(new Fruta("Alqueca (Kiwano)", "laranja", false));
        m.adicionarFruta(new Fruta("Ameixa", "roxa", true));
        m.adicionarFruta(new Fruta("Amora", "preta", false));
        m.adicionarFruta(new Fruta("Araçá", "amarelo", false));
        m.adicionarFruta(new Fruta("Araticum", "amarelo", false));
        m.adicionarFruta(new Fruta("Atemoia", "verde", false));
        m.adicionarFruta(new Fruta("Bacaba", "roxa", false));
        m.adicionarFruta(new Fruta("Bacuri", "amarelo", false));
        m.adicionarFruta(new Fruta("Banana", "amarela", false));
        m.adicionarFruta(new Fruta("Bergamota", "amarela", false));
        m.adicionarFruta(new Fruta("Biribá", "amarelo", false));
        m.adicionarFruta(new Fruta("Buriti", "laranja", false));
        m.adicionarFruta(new Fruta("Butiá", "laranja", false));
        m.adicionarFruta(new Fruta("Cacau", "marrom", false));
        m.adicionarFruta(new Fruta("Cagaita", "amarelo", false));
        m.adicionarFruta(new Fruta("Cajá", "amarelo", false));
        m.adicionarFruta(new Fruta("Caju", "vermelho", false));
        m.adicionarFruta(new Fruta("Calamansi", "verde", false));
        m.adicionarFruta(new Fruta("Camu-camu", "vermelho", false));
        m.adicionarFruta(new Fruta("Caqui", "laranja", false));
        m.adicionarFruta(new Fruta("Carambola", "amarela", false));
        m.adicionarFruta(new Fruta("Cereja", "vermelha", true));
        m.adicionarFruta(new Fruta("Cherimoya", "verde", false));
        m.adicionarFruta(new Fruta("Coco", "verde", false));
        m.adicionarFruta(new Fruta("Cupuaçu", "marrom", false));
        m.adicionarFruta(new Fruta("Damasco", "laranja", true));
        m.adicionarFruta(new Fruta("Durian", "amarelo", false));
        m.adicionarFruta(new Fruta("Feijoa", "verde", false));
        m.adicionarFruta(new Fruta("Figo", "roxo", false));
        m.adicionarFruta(new Fruta("Framboesa", "vermelha", false));
        m.adicionarFruta(new Fruta("Goiaba", "verde", false));
        m.adicionarFruta(new Fruta("Graviola", "verde", false));
        m.adicionarFruta(new Fruta("Guaraná", "vermelho", false));
        m.adicionarFruta(new Fruta("Guabiroba", "amarelo", false));
        m.adicionarFruta(new Fruta("Ingá", "branco", false));
        m.adicionarFruta(new Fruta("Jabuticaba", "roxa", false));
        m.adicionarFruta(new Fruta("Jaca", "amarela", false));
        m.adicionarFruta(new Fruta("Jambo", "vermelho", false));
        m.adicionarFruta(new Fruta("Jenipapo", "marrom", false));
        m.adicionarFruta(new Fruta("Kiwi", "verde", false));
        m.adicionarFruta(new Fruta("Kumquat", "laranja", false));
        m.adicionarFruta(new Fruta("Laranja", "laranja", false));
        m.adicionarFruta(new Fruta("Lichia", "vermelha", true));
        m.adicionarFruta(new Fruta("Limão", "verde", false));
        m.adicionarFruta(new Fruta("Longan", "marrom", true));
        m.adicionarFruta(new Fruta("Maçã", "vermelha", true));
        m.adicionarFruta(new Fruta("Mamão", "laranja", false));
        m.adicionarFruta(new Fruta("Manga", "amarela", true));
        m.adicionarFruta(new Fruta("Mangostão", "roxa", false));
        m.adicionarFruta(new Fruta("Maracujá", "amarelo", false));
        m.adicionarFruta(new Fruta("Melancia", "verde", false));
        m.adicionarFruta(new Fruta("Melão", "amarelo", false));
        m.adicionarFruta(new Fruta("Mirtilo", "azul", false));
        m.adicionarFruta(new Fruta("Morango", "vermelho", false));
        m.adicionarFruta(new Fruta("Murici", "amarelo", false));
        m.adicionarFruta(new Fruta("Nectarina", "laranja", true));
        m.adicionarFruta(new Fruta("Noni", "branco", false));
        m.adicionarFruta(new Fruta("Pequi", "amarelo", true));
        m.adicionarFruta(new Fruta("Pera", "verde", true));
        m.adicionarFruta(new Fruta("Pêssego", "laranja", true));
        m.adicionarFruta(new Fruta("Physalis", "laranja", false));
        m.adicionarFruta(new Fruta("Pinha", "verde", false));
        m.adicionarFruta(new Fruta("Pitanga", "vermelha", false));
        m.adicionarFruta(new Fruta("Pitaya", "rosa", false));
        m.adicionarFruta(new Fruta("Pupunha", "laranja", false));
        m.adicionarFruta(new Fruta("Rambutão", "vermelho", true));
        m.adicionarFruta(new Fruta("Romã", "vermelha", false));
        m.adicionarFruta(new Fruta("Sapoti", "marrom", false));
        m.adicionarFruta(new Fruta("Tamarindo", "marrom", false));
        m.adicionarFruta(new Fruta("Tucumã", "laranja", false));
        m.adicionarFruta(new Fruta("Umbu", "amarelo", false));
        m.adicionarFruta(new Fruta("Uva", "roxa", false));
        m.adicionarFruta(new Fruta("Uxi", "amarelo", false));
        m.adicionarFruta(new Fruta("Toranja", "rosa", false));
        m.adicionarFruta(new Fruta("Tangerina", "laranja", false));
        m.adicionarFruta(new Fruta("Pomelo", "verde", false));
        m.adicionarFruta(new Fruta("Yuzu", "amarelo", false));
        m.adicionarFruta(new Fruta("Kaffir Lime", "verde", false));
        m.adicionarFruta(new Fruta("Finger Lime", "variada", false));
        m.adicionarFruta(new Fruta("Blood Lime", "vermelha", false));
        m.adicionarFruta(new Fruta("Salak", "marrom", false));
        m.adicionarFruta(new Fruta("Santol", "amarelo", false));
        m.adicionarFruta(new Fruta("Langsat", "amarelo", false));
        m.adicionarFruta(new Fruta("Duku", "amarelo", false));
        m.adicionarFruta(new Fruta("Jujuba", "vermelha", true));
        m.adicionarFruta(new Fruta("Quince", "amarelo", true));
        m.adicionarFruta(new Fruta("Pawpaw", "amarelo", false));
        m.adicionarFruta(new Fruta("Mamey Sapote", "laranja", true));
        m.adicionarFruta(new Fruta("Canistel", "amarelo", false));
        m.adicionarFruta(new Fruta("Lucuma", "amarelo", false));
        m.adicionarFruta(new Fruta("Soursop", "verde", false));
        m.adicionarFruta(new Fruta("Sugar Apple", "verde", false));
        m.adicionarFruta(new Fruta("Starfruit", "amarela", false)); // carambola
        m.adicionarFruta(new Fruta("Rose Apple", "rosa", false));
        m.adicionarFruta(new Fruta("Java Plum", "roxa", false));
        m.adicionarFruta(new Fruta("Indian Gooseberry", "verde", false));

        m.adicionarFruta(new Fruta("Breadfruit", "verde", false));
        m.adicionarFruta(new Fruta("Cloudberry", "laranja", false));
        m.adicionarFruta(new Fruta("Elderberry", "preta", false));
        m.adicionarFruta(new Fruta("Gac", "vermelha", false));
        m.adicionarFruta(new Fruta("Hala Fruit", "vermelha", false));
        m.adicionarFruta(new Fruta("Ice Apple", "branco", false));
        m.adicionarFruta(new Fruta("Ilama", "verde", false));
        m.adicionarFruta(new Fruta("Indian Fig", "roxa", false));
        m.adicionarFruta(new Fruta("Jaboticaba", "roxa", false));
        m.adicionarFruta(new Fruta("Jackfruit", "amarela", false));
        m.adicionarFruta(new Fruta("Jujube", "vermelha", true));
        m.adicionarFruta(new Fruta("Kepel", "marrom", false));
        m.adicionarFruta(new Fruta("Langsat", "amarelo", false));
        m.adicionarFruta(new Fruta("Loquat", "laranja", true));
        m.adicionarFruta(new Fruta("Lychee", "vermelha", true));
        m.adicionarFruta(new Fruta("Mabolo", "vermelha", false));
        m.adicionarFruta(new Fruta("Marula", "amarelo", true));
        m.adicionarFruta(new Fruta("Maypop", "amarelo", false));
        m.adicionarFruta(new Fruta("Monkey Fruit", "laranja", false));
        m.adicionarFruta(new Fruta("Monster Fruit", "verde", false));
        m.adicionarFruta(new Fruta("Mountain Papaya", "amarelo", false));
        m.adicionarFruta(new Fruta("Nance", "amarelo", false));
        m.adicionarFruta(new Fruta("Osage Orange", "verde", false));
        m.adicionarFruta(new Fruta("Pandan Fruit", "vermelha", false));
        m.adicionarFruta(new Fruta("Passion Fruit", "roxo", false));
        m.adicionarFruta(new Fruta("Pequi", "amarelo", true));
        m.adicionarFruta(new Fruta("Persimmon", "laranja", false));
        m.adicionarFruta(new Fruta("Plantain", "verde", false));
        m.adicionarFruta(new Fruta("Pomegranate", "vermelha", false));
        m.adicionarFruta(new Fruta("Prickly Pear", "vermelha", false));
        m.adicionarFruta(new Fruta("Rambutan", "vermelho", true));
        m.adicionarFruta(new Fruta("Red Banana", "vermelha", false));
        m.adicionarFruta(new Fruta("Salak", "marrom", false));
        m.adicionarFruta(new Fruta("Santalum", "vermelho", false));
        m.adicionarFruta(new Fruta("Sapodilla", "marrom", false));
        m.adicionarFruta(new Fruta("Soursop", "verde", false));
        m.adicionarFruta(new Fruta("Star Apple", "roxa", false));
        m.adicionarFruta(new Fruta("Sugar Apple", "verde", false));
        m.adicionarFruta(new Fruta("Tamarillo", "vermelho", false));
        m.adicionarFruta(new Fruta("Velvet Tamarind", "preta", false));
        m.adicionarFruta(new Fruta("Wood Apple", "marrom", false));
        m.adicionarFruta(new Fruta("African Breadfruit", "verde", false));
        m.adicionarFruta(new Fruta("African Cherry Orange", "laranja", false));
        m.adicionarFruta(new Fruta("African Star Apple", "laranja", false));
        m.adicionarFruta(new Fruta("Akee", "vermelha", false));
        m.adicionarFruta(new Fruta("Amazon Grape", "roxa", false));
        m.adicionarFruta(new Fruta("Ambarella", "amarelo", false));
        m.adicionarFruta(new Fruta("Australian Finger Lime", "verde", false));
        m.adicionarFruta(new Fruta("Babaco", "amarelo", false));
        m.adicionarFruta(new Fruta("Bael Fruit", "amarelo", false));
        m.adicionarFruta(new Fruta("Barbadine", "verde", false));
        m.adicionarFruta(new Fruta("Beach Plum", "roxa", true));
        m.adicionarFruta(new Fruta("Bignay", "preta", false));
        m.adicionarFruta(new Fruta("Bilimbi", "verde", false));
        m.adicionarFruta(new Fruta("Black Apple", "roxa", false));
        m.adicionarFruta(new Fruta("Black Sapote", "verde", false));
        m.adicionarFruta(new Fruta("Blueberry", "azul", false));
        m.adicionarFruta(new Fruta("Bolwarra", "branca", false));
        m.adicionarFruta(new Fruta("Borojo", "marrom", false));
        m.adicionarFruta(new Fruta("Brush Cherry", "vermelha", false));
        m.adicionarFruta(new Fruta("Buddha's Hand", "amarelo", false));
        m.adicionarFruta(new Fruta("Burmese Grape", "roxa", false));
        m.adicionarFruta(new Fruta("Button Mangosteen", "roxa", false));
        m.adicionarFruta(new Fruta("Caimito", "roxa", false));
        m.adicionarFruta(new Fruta("Calamondin", "laranja", false));
        m.adicionarFruta(new Fruta("Canary Melon", "amarelo", false));
        m.adicionarFruta(new Fruta("Cape Gooseberry", "laranja", false));
        m.adicionarFruta(new Fruta("Carissa", "vermelha", false));
        m.adicionarFruta(new Fruta("Cashew Apple", "vermelho", false));
        m.adicionarFruta(new Fruta("Cedar Bay Cherry", "vermelha", false));
        m.adicionarFruta(new Fruta("Charichuelo", "amarelo", false));
        m.adicionarFruta(new Fruta("Chayote Fruit", "verde", false));
        m.adicionarFruta(new Fruta("Chenee", "amarelo", false));
        m.adicionarFruta(new Fruta("Cherimoya", "verde", false));
        m.adicionarFruta(new Fruta("Chokeberry", "preta", false));
        m.adicionarFruta(new Fruta("Chupa-chupa", "amarelo", false));
        m.adicionarFruta(new Fruta("Cinnamon Apple", "vermelha", true));
        m.adicionarFruta(new Fruta("Cluster Fig", "roxa", false));
        m.adicionarFruta(new Fruta("Cocona", "vermelha", false));
        m.adicionarFruta(new Fruta("Conkerberry", "amarelo", false));
        m.adicionarFruta(new Fruta("Cornelian Cherry", "vermelha", true));
        m.adicionarFruta(new Fruta("Crowberry", "preta", false));
        m.adicionarFruta(new Fruta("Cupuacu", "marrom", false));
        m.adicionarFruta(new Fruta("Custard Apple", "verde", false));
        m.adicionarFruta(new Fruta("Davidson's Plum", "roxa", false));
        m.adicionarFruta(new Fruta("Dead Man's Fingers", "azul", false));
        m.adicionarFruta(new Fruta("Desert Fig", "roxa", false));
        m.adicionarFruta(new Fruta("Desert Lime", "verde", false));
        m.adicionarFruta(new Fruta("Dewberry", "preta", false));
        m.adicionarFruta(new Fruta("Doubah", "verde", false));
        m.adicionarFruta(new Fruta("Dragonfruit", "rosa", false));
        m.adicionarFruta(new Fruta("Duku Langsat", "amarelo", false));
        m.adicionarFruta(new Fruta("Emu Berry", "vermelha", false));
        m.adicionarFruta(new Fruta("Fairchild Tangerine", "laranja", false));
        m.adicionarFruta(new Fruta("Fe'i Banana", "laranja", false));
        m.adicionarFruta(new Fruta("Fibrous Satinash", "vermelha", false));
        m.adicionarFruta(new Fruta("Florida Strangler Fig", "verde", false));

        m.adicionarFruta(new Fruta("Forest Strawberry", "vermelha", false));
        m.adicionarFruta(new Fruta("Fox Grape", "roxa", false));
        m.adicionarFruta(new Fruta("Gabiroba", "amarelo", false));
        m.adicionarFruta(new Fruta("Gamboge", "amarelo", false));
        m.adicionarFruta(new Fruta("Genip", "amarelo", false));
        m.adicionarFruta(new Fruta("Giant Granadilla", "amarelo", false));
        m.adicionarFruta(new Fruta("Golden Kiwifruit", "amarelo", false));
        m.adicionarFruta(new Fruta("Gooseberry", "verde", false));
        m.adicionarFruta(new Fruta("Governor's Plum", "roxa", false));
        m.adicionarFruta(new Fruta("Granadilla", "laranja", false));
        m.adicionarFruta(new Fruta("Groundcherry", "laranja", false));
        m.adicionarFruta(new Fruta("Grumichama", "preta", false));
        m.adicionarFruta(new Fruta("Guava", "verde", false));
        m.adicionarFruta(new Fruta("Guavasteen", "amarelo", false));
        m.adicionarFruta(new Fruta("Hackberry", "roxa", false));
        m.adicionarFruta(new Fruta("Hardy Kiwi", "verde", false));
        m.adicionarFruta(new Fruta("Honeydew Melon", "verde", false));
        m.adicionarFruta(new Fruta("Honeysuckle Berry", "azul", false));
        m.adicionarFruta(new Fruta("Horned Melon", "laranja", false));
        m.adicionarFruta(new Fruta("Huckleberry", "azul", false));
        m.adicionarFruta(new Fruta("Ice Cream Bean", "branco", false));
        m.adicionarFruta(new Fruta("Illawarra Plum", "roxa", false));
        m.adicionarFruta(new Fruta("Imbe", "laranja", false));
        m.adicionarFruta(new Fruta("Indian Almond", "verde", false));
        m.adicionarFruta(new Fruta("Indian Jujube", "vermelha", true));
        m.adicionarFruta(new Fruta("Jaboticaba Preta", "preta", false));
        m.adicionarFruta(new Fruta("Jocote", "vermelha", true));
        m.adicionarFruta(new Fruta("Jujube Fruit", "marrom", true));
        m.adicionarFruta(new Fruta("Juneberry", "roxa", false));
        m.adicionarFruta(new Fruta("Kakadu Plum", "verde", false));
        m.adicionarFruta(new Fruta("Kei Apple", "amarelo", false));
        m.adicionarFruta(new Fruta("Kitembilla", "roxa", false));
        m.adicionarFruta(new Fruta("Kwai Muk", "laranja", true));
        m.adicionarFruta(new Fruta("Lakoocha", "amarelo", false));
        m.adicionarFruta(new Fruta("Lemon Aspen", "amarelo", false));
        m.adicionarFruta(new Fruta("Lilly Pilly", "rosa", false));
        m.adicionarFruta(new Fruta("Loganberry", "vermelha", false));
        m.adicionarFruta(new Fruta("Lulo", "laranja", false));
        m.adicionarFruta(new Fruta("Macadamia Fruit", "verde", false));
        m.adicionarFruta(new Fruta("Madrono", "vermelha", false));
        m.adicionarFruta(new Fruta("Malay Apple", "vermelha", false));
        m.adicionarFruta(new Fruta("Mammee Apple", "amarelo", true));
        m.adicionarFruta(new Fruta("Mandarin Orange", "laranja", false));
        m.adicionarFruta(new Fruta("Mangaba", "amarelo", false));
        m.adicionarFruta(new Fruta("Marang", "verde", false));
        m.adicionarFruta(new Fruta("Marionberry", "preta", false));
        m.adicionarFruta(new Fruta("Mayapple", "amarelo", false));
        m.adicionarFruta(new Fruta("Medlar", "marrom", true));
        m.adicionarFruta(new Fruta("Midgen Berry", "branca", false));
        m.adicionarFruta(new Fruta("Mimusops", "amarelo", false));
        m.adicionarFruta(new Fruta("Mock Strawberry", "vermelha", false));
        m.adicionarFruta(new Fruta("Monstera Deliciosa", "verde", false));
        m.adicionarFruta(new Fruta("Morinda", "branco", false));
        m.adicionarFruta(new Fruta("Mountain Soursop", "verde", false));
        m.adicionarFruta(new Fruta("Mulberry", "preta", false));
        m.adicionarFruta(new Fruta("Muntingia", "vermelha", false));
        m.adicionarFruta(new Fruta("Mysore Raspberry", "roxa", false));
        m.adicionarFruta(new Fruta("Natal Plum", "vermelha", false));
        m.adicionarFruta(new Fruta("Native Cherry", "vermelha", false));
        m.adicionarFruta(new Fruta("Naranjilla", "laranja", false));
        m.adicionarFruta(new Fruta("Nepal Raspberry", "vermelha", false));
        m.adicionarFruta(new Fruta("Ogeche Lime", "verde", false));
        m.adicionarFruta(new Fruta("Otaheite Gooseberry", "verde", false));
        m.adicionarFruta(new Fruta("Paciﬁc Rose Apple", "rosa", false));
        m.adicionarFruta(new Fruta("Palmyra Fruit", "preta", false));
        m.adicionarFruta(new Fruta("Papaya", "laranja", false));
        m.adicionarFruta(new Fruta("Paradise Nut", "marrom", false));
        m.adicionarFruta(new Fruta("Paw Paw", "amarelo", false));
        m.adicionarFruta(new Fruta("Peach Palm", "laranja", false));
        m.adicionarFruta(new Fruta("Pepino Melon", "amarelo", false));
        m.adicionarFruta(new Fruta("Peruvian Apple Cactus", "vermelha", false));
        m.adicionarFruta(new Fruta("Pineapple Guava", "verde", false));
        m.adicionarFruta(new Fruta("Pistachio Fruit", "verde", true));
        m.adicionarFruta(new Fruta("Plumcot", "roxa", true));
        m.adicionarFruta(new Fruta("Poha Berry", "amarelo", false));
        m.adicionarFruta(new Fruta("Pond Apple", "verde", false));
        m.adicionarFruta(new Fruta("Pulasan", "vermelho", true));
        m.adicionarFruta(new Fruta("Purple Apple Berry", "roxa", false));
        m.adicionarFruta(new Fruta("Purple Guava", "roxa", false));
        m.adicionarFruta(new Fruta("Purple Mombin", "roxa", true));
        m.adicionarFruta(new Fruta("Quararibea", "amarelo", false));
        m.adicionarFruta(new Fruta("Queensland Davidson Plum", "roxa", false));
        m.adicionarFruta(new Fruta("Riberry", "vermelha", false));
        m.adicionarFruta(new Fruta("Rollinia", "amarelo", false));
        m.adicionarFruta(new Fruta("Rose Hip", "vermelha", false));
        m.adicionarFruta(new Fruta("Rowan Berry", "laranja", false));
        m.adicionarFruta(new Fruta("Salmonberry", "laranja", false));
        m.adicionarFruta(new Fruta("Sandpaper Fig", "laranja", false));
        m.adicionarFruta(new Fruta("Santol", "amarelo", false));
        m.adicionarFruta(new Fruta("Satinleaf", "vermelha", false));
        m.adicionarFruta(new Fruta("Sea Buckthorn", "laranja", false));
        m.adicionarFruta(new Fruta("Sea Grape", "roxa", false));
        m.adicionarFruta(new Fruta("Serviceberry", "roxa", false));
        m.adicionarFruta(new Fruta("Silverberry", "vermelha", false));
        m.adicionarFruta(new Fruta("Snowberry", "branca", false));
        m.adicionarFruta(new Fruta("Sonneratia", "verde", false));
        m.adicionarFruta(new Fruta("Soursop", "verde", false));
        m.adicionarFruta(new Fruta("Spanish Lime", "verde", false));
        m.adicionarFruta(new Fruta("Star Gooseberry", "verde", false));
        m.adicionarFruta(new Fruta("Strawberry Guava", "vermelha", false));
        m.adicionarFruta(new Fruta("Surinam Cherry", "vermelha", false));
        m.adicionarFruta(new Fruta("Sweet Granadilla", "laranja", false));
        m.adicionarFruta(new Fruta("Tayberry", "roxa", false));

        m.adicionarFruta(new Fruta("Thimbleberry", "vermelha", false));
        m.adicionarFruta(new Fruta("Tomatillo", "verde", false));
        m.adicionarFruta(new Fruta("Tree Tomato", "vermelho", false));
        m.adicionarFruta(new Fruta("Ugni", "roxa", false));
        m.adicionarFruta(new Fruta("Vanilla Fruit", "verde", false));
        m.adicionarFruta(new Fruta("Velvet Apple", "vermelha", false));
        m.adicionarFruta(new Fruta("Wampee", "amarelo", false));
        m.adicionarFruta(new Fruta("Water Apple", "rosa", false));
        m.adicionarFruta(new Fruta("White Mulberry", "branca", false));
        m.adicionarFruta(new Fruta("White Sapote", "verde", false));
        m.adicionarFruta(new Fruta("Wild Banana", "verde", false));
        m.adicionarFruta(new Fruta("Wild Orange", "laranja", false));
        m.adicionarFruta(new Fruta("Wild Peach", "laranja", true));
        m.adicionarFruta(new Fruta("Wineberry", "vermelha", false));
        m.adicionarFruta(new Fruta("Wongi", "amarelo", false));
        m.adicionarFruta(new Fruta("Woodland Strawberry", "vermelha", false));
        m.adicionarFruta(new Fruta("Xigua", "verde", false));
        m.adicionarFruta(new Fruta("Yangmei", "vermelha", false));
        m.adicionarFruta(new Fruta("Youngberry", "preta", false));
        m.adicionarFruta(new Fruta("Zigzag Vine Fruit", "verde", false));
        m.adicionarFruta(new Fruta("Zizyphus", "vermelha", true));
        m.adicionarFruta(new Fruta("Aprium", "laranja", true));
        m.adicionarFruta(new Fruta("Pluot", "roxa", true));
        m.adicionarFruta(new Fruta("Tayberry", "vermelha", false));
        m.adicionarFruta(new Fruta("Boysenberry", "preta", false));
        m.adicionarFruta(new Fruta("Olallieberry", "preta", false));
        m.adicionarFruta(new Fruta("Marionberry", "preta", false));
        m.adicionarFruta(new Fruta("Loganberry", "vermelha", false));
        m.adicionarFruta(new Fruta("Silvanberry", "preta", false));
        m.adicionarFruta(new Fruta("Veitchberry", "vermelha", false));
        m.adicionarFruta(new Fruta("Phenberry", "roxa", false));
        m.adicionarFruta(new Fruta("Jostaberry", "preta", false));
        m.adicionarFruta(new Fruta("Worcesterberry", "preta", false));
        m.adicionarFruta(new Fruta("Hinnonmaki Berry", "vermelha", false));
        m.adicionarFruta(new Fruta("Pixwell Gooseberry", "rosa", false));
        m.adicionarFruta(new Fruta("Captivator Gooseberry", "rosa", false));
        m.adicionarFruta(new Fruta("Black Velvet Gooseberry", "preta", false));
        m.adicionarFruta(new Fruta("Poorman Gooseberry", "vermelha", false));
        m.adicionarFruta(new Fruta("Red Jacket Gooseberry", "vermelha", false));
        m.adicionarFruta(new Fruta("Welcome Gooseberry", "vermelha", false));
        m.adicionarFruta(new Fruta("Achacha", "laranja", false));
        m.adicionarFruta(new Fruta("Arazá", "amarelo", false));
        m.adicionarFruta(new Fruta("Biriba", "amarelo", false));
        m.adicionarFruta(new Fruta("Caimito Roxo", "roxa", false));
        m.adicionarFruta(new Fruta("Curuba", "amarelo", false));
        m.adicionarFruta(new Fruta("Guanabana", "verde", false));
        m.adicionarFruta(new Fruta("Ilama Rosa", "rosa", false));
        m.adicionarFruta(new Fruta("Mamey Colorado", "vermelha", true));
        m.adicionarFruta(new Fruta("Pepino Dulce", "amarelo", false));
        m.adicionarFruta(new Fruta("Tamarillo Rojo", "vermelho", false));
        m.adicionarFruta(new Fruta("Você escolhe", "Desejo", false));

    }

}