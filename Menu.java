import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Menu {
    public ArrayList<Categoria> Categoria; //Creo categoria
    /**
     * Inizializza il menu popolando gli array delle categorie e dei piatti
     */
    public void init() {
        // antipasti
        ArrayList<Piatto> antipastiPiatti = new ArrayList<Piatto>();
        // popoliamo l'array list degli antipasti
        // -- bruschetta
        ArrayList<String> ingredienti = new ArrayList<>(Arrays.asList("Pane tostato", "pomodori freschi", "basilico", "aglio", "olio extravergine di oliva", "sale", "pepe"));
        ArrayList<String> allergeni = new ArrayList<>(Arrays.asList("Glutine"));
        antipastiPiatti.add(new Piatto("A0", "Bruschetta al Pomodoro", ingredienti, allergeni, 5, 6.0));
        // -- Instalata di mare
        ingredienti = new ArrayList<>(Arrays.asList("Calamari", "gamberi", "cozze", "vongole", "polpo", "limone", "olio extravergine di oliva", "prezzemolo", "sale", "pepe"));
        allergeni = new ArrayList<>(Arrays.asList("Molluschi", "Crostacei"));
        antipastiPiatti.add(new Piatto("A1", "Insalata di mare", ingredienti, allergeni, 10, 12.0));
        // -- Caprese
        ingredienti = new ArrayList<>(Arrays.asList("Mozzarella di bufala", "pomodori", "basilico", "olio extravergine di oliva", "sale", "pepe"));
        allergeni = new ArrayList<>(Arrays.asList("Latticini"));
        antipastiPiatti.add(new Piatto("A2", "Caprese", ingredienti, allergeni, 10, 8.5));
        // -- Tartare di salmone
        ingredienti = new ArrayList<>(Arrays.asList("Salmone fresco", "avocado", "limone", "erba cipollina", "olio extravergine di oliva", "sale", "pepe"));
        allergeni = new ArrayList<>(Arrays.asList("Pesce"));
        antipastiPiatti.add(new Piatto("A3", "Tartare di salmone", ingredienti, allergeni, 10, 14.0));
        // ---
        Categoria antipasti = new Categoria("A", "Antipasti", antipastiPiatti);
        // popoliamo l'array list dei primi
    }
    /**
     * Restituisce un istanza del piatto
     * @param IdPiatto A1 -> A = antipasti, 1 = id piatto
     * @return
     */
    public String getPiatto(String IdPiatto) {
        String[] parts = IdPiatto.split("");
        // ---
        String part1 = parts[0];
        String part2 = parts[1];
    }

    public Menu (List<String> Categoria) {      //Costruttore arrayList
        this.Categoria = Categoria;
    }

}
