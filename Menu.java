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

        //LISTA DEI PRIMI
        
        ArrayList<Piatto> primiPiatti = new ArrayList<Piatto>();
        
        // -- Spaghetti alla Carbonara
        ingredienti = new ArrayList<>(Arrays.asList("Spaghetti", "uova", "pancetta", "pecorino romano", "pepe nero"));
        allergeni = new ArrayList<>(Arrays.asList("Glutine", "Uova", "Latticini"));
        primiPiatti.add(new Piatto("P0", "Spaghetti alla Carbonara", ingredienti, allergeni, 15, 10.0));
        // -- Risotto ai Funghi Porcini
        ingredienti = new ArrayList<>(Arrays.asList("Riso carnaroli", "funghi porcini", "burro", "parmigiano reggiano", "brodo vegetale", "cipolla", "vino bianco", "prezzemolo", "sale", "pepe"));
        allergeni = new ArrayList<>(Arrays.asList("Latticini"));
        primiPiatti.add(new Piatto("P1", "Risotto ai Funghi Porcini", ingredienti, allergeni, 20, 13.0));
        // -- Lasagna alla Bolognese
        ingredienti = new ArrayList<>(Arrays.asList("Sfoglie di pasta all'uovo", "ragù alla bolognese (carne di manzo, carne di maiale, pomodori, carote, cipolle, sedano, vino rosso)", "besciamella (latte, burro, farina)", "parmigiano reggiano"));
        allergeni = new ArrayList<>(Arrays.asList("Latticini", "Glutine", "Uova"));
        primiPiatti.add(new Piatto("P2", "Lasagna alla Bolognese", ingredienti, allergeni, 20, 12.50));
        // -- Penne all'Arrabbiata
        ingredienti = new ArrayList<>(Arrays.asList("Penne rigate", "pomodori pelati", "aglio", "peperoncino", "olio extravergine di oliva", "prezzemolo", "sale"));
        allergeni = new ArrayList<>(Arrays.asList("Glutine"));
        primiPiatti.add(new Piatto("P3", "Penne all'Arrabbiata", ingredienti, allergeni, 10, 8.50));
        // ---
        Categoria primi = new Categoria("P", "Primi", primiPiatti);


        //LISTA DEI SECONDI

        //LISTA DEI DESSERT

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
