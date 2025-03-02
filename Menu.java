import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Menu {
    public ArrayList<Categoria> Categorie; // Creo categoria

    public Menu() {
        this.init();
    }

    /**
     * Inizializza il menu popolando gli array delle categorie e dei piatti
     */
    public void init() {
        this.Categorie = new ArrayList<Categoria>();
        // antipasti
        ArrayList<Piatto> antipastiPiatti = new ArrayList<Piatto>();
        // popoliamo l'array list degli antipasti
        // -- bruschetta
        ArrayList<String> ingredienti = new ArrayList<>(Arrays.asList("Pane tostato", "pomodori freschi", "basilico",
                "aglio", "olio extravergine di oliva", "sale", "pepe"));
        ArrayList<String> allergeni = new ArrayList<>(Arrays.asList("Glutine"));
        antipastiPiatti.add(new Piatto("A0", "Bruschetta al Pomodoro", ingredienti, allergeni, 5, 6.0));
        // -- Instalata di mare
        ingredienti = new ArrayList<>(Arrays.asList("Calamari", "gamberi", "cozze", "vongole", "polpo", "limone",
                "olio extravergine di oliva", "prezzemolo", "sale", "pepe"));
        allergeni = new ArrayList<>(Arrays.asList("Molluschi", "Crostacei"));
        antipastiPiatti.add(new Piatto("A1", "Insalata di mare", ingredienti, allergeni, 10, 12.0));
        // -- Caprese
        ingredienti = new ArrayList<>(Arrays.asList("Mozzarella di bufala", "pomodori", "basilico",
                "olio extravergine di oliva", "sale", "pepe"));
        allergeni = new ArrayList<>(Arrays.asList("Latticini"));
        antipastiPiatti.add(new Piatto("A2", "Caprese", ingredienti, allergeni, 10, 8.5));
        // -- Tartare di salmone
        ingredienti = new ArrayList<>(Arrays.asList("Salmone fresco", "avocado", "limone", "erba cipollina",
                "olio extravergine di oliva", "sale", "pepe"));
        allergeni = new ArrayList<>(Arrays.asList("Pesce"));
        antipastiPiatti.add(new Piatto("A3", "Tartare di salmone", ingredienti, allergeni, 10, 14.0));
        // ---
        Categoria antipasti = new Categoria("A", "Antipasti", antipastiPiatti);
        // popoliamo l'array list dei primi

        // LISTA DEI PRIMI

        ArrayList<Piatto> primiPiatti = new ArrayList<Piatto>();

        // -- Spaghetti alla Carbonara
        ingredienti = new ArrayList<>(Arrays.asList("Spaghetti", "uova", "pancetta", "pecorino romano", "pepe nero"));
        allergeni = new ArrayList<>(Arrays.asList("Glutine", "Uova", "Latticini"));
        primiPiatti.add(new Piatto("P0", "Spaghetti alla Carbonara", ingredienti, allergeni, 15, 10.0));
        // -- Risotto ai Funghi Porcini
        ingredienti = new ArrayList<>(Arrays.asList("Riso carnaroli", "funghi porcini", "burro", "parmigiano reggiano",
                "brodo vegetale", "cipolla", "vino bianco", "prezzemolo", "sale", "pepe"));
        allergeni = new ArrayList<>(Arrays.asList("Latticini"));
        primiPiatti.add(new Piatto("P1", "Risotto ai Funghi Porcini", ingredienti, allergeni, 20, 13.0));
        // -- Lasagna alla Bolognese
        ingredienti = new ArrayList<>(Arrays.asList("Sfoglie di pasta all'uovo",
                "ragù alla bolognese (carne di manzo, carne di maiale, pomodori, carote, cipolle, sedano, vino rosso)",
                "besciamella (latte, burro, farina)", "parmigiano reggiano"));
        allergeni = new ArrayList<>(Arrays.asList("Latticini", "Glutine", "Uova"));
        primiPiatti.add(new Piatto("P2", "Lasagna alla Bolognese", ingredienti, allergeni, 20, 12.50));
        // -- Penne all'Arrabbiata
        ingredienti = new ArrayList<>(Arrays.asList("Penne rigate", "pomodori pelati", "aglio", "peperoncino",
                "olio extravergine di oliva", "prezzemolo", "sale"));
        allergeni = new ArrayList<>(Arrays.asList("Glutine"));
        primiPiatti.add(new Piatto("P3", "Penne all'Arrabbiata", ingredienti, allergeni, 10, 8.50));
        // ---
        Categoria primi = new Categoria("P", "Primi", primiPiatti);

        // LISTA DEI SECONDI

        ArrayList<Piatto> secondiPiatti = new ArrayList<Piatto>();
        // popoliamo l'array list dei secondi
        // -- Filetto di Manzo al Pepe Verde
        ingredienti = new ArrayList<>(Arrays.asList("Filetto di manzo", "panna fresca", "brodo di carne", "pepe verde",
                "brandy", "burro", "sale"));
        allergeni = new ArrayList<>(Arrays.asList("Latticini"));
        secondiPiatti.add(new Piatto("S0", "Filetto di Manzo al Pepe Verde", ingredienti, allergeni, 15, 20.0));
        // -- Pollo alla Cacciatora
        ingredienti = new ArrayList<>(Arrays.asList("Pollo", "pomodori", "cipolla", "carote", "sedano", "olive nere",
                "vino rosso", "rosmarino", "aglio", "olio", "extravergine di oliva", "sale", "pepe"));
        allergeni = new ArrayList<>(Arrays.asList(""));
        secondiPiatti.add(new Piatto("S1", "Pollo alla Cacciatora", ingredienti, allergeni, 25, 14.50));
        // -- Salmone alla Griglia
        ingredienti = new ArrayList<>(
                Arrays.asList("Salmone fresco", "limone", "olio extravergine di oliva", "sale", "pepe", "aneto"));
        allergeni = new ArrayList<>(Arrays.asList("Pesce"));
        secondiPiatti.add(new Piatto("S2", "Salmone alla Griglia", ingredienti, allergeni, 14, 18.0));
        // -- Melanzane alla Parmigiana
        ingredienti = new ArrayList<>(Arrays.asList("Melanzane", "passata di pomodoro", "mozzarella",
                "parmigiano reggiano", "basilico", "olio extravergine di oliva", "sale", "pepe"));
        allergeni = new ArrayList<>(Arrays.asList("Latticini"));
        secondiPiatti.add(new Piatto("S3", "Melanzane alla parmigiana", ingredienti, allergeni, 18, 13.0));
        // ---
        Categoria secondi = new Categoria("S", "Secondi", secondiPiatti);
        // popoliamo l'array list dei secondi
        // LISTA DEI DESSERT

        // -- Tiramisù
        ArrayList<Piatto> dessertPiatti = new ArrayList<Piatto>();
        ingredienti = new ArrayList<>(
                Arrays.asList("Savoiardi", "caffè", "mascarpone", "uovo", "zucchero", "cacao in polvere", "marsala"));
        allergeni = new ArrayList<>(Arrays.asList("Glutine", "uova", "latticini"));
        dessertPiatti.add(new Piatto("D0", "Tiramisù", ingredienti, allergeni, 30, 6.0));

        // -- Panna Cotta ai frutti di bosco
        ingredienti = new ArrayList<>(Arrays.asList("Panna fresca", "zucchero", "vaniglia", "gelatina",
                "frutti di bosco (lamponi, mirtilli, fragole)", "zucchero a velo"));
        allergeni = new ArrayList<>(Arrays.asList("latticini"));
        dessertPiatti.add(new Piatto("D1", "Panna Cotta ai Frutti di Bosco", ingredienti, allergeni, 10, 5.5));

        // -- Cannoli Siciliani
        ingredienti = new ArrayList<>(
                Arrays.asList("Ricotta di pecora", "zucchero", "cannoli (farina, zucchero, strutto, vino bianco)",
                        "cioccolato fondente", "frutta candita", "frutta a guscio", "pistacchi"));
        allergeni = new ArrayList<>(Arrays.asList(" Glutine", "latticini", "frutta a guscio"));
        dessertPiatti.add(new Piatto("D2", "Cannoli Siciliani", ingredienti, allergeni, 20, 7.0));

        // -- Cheesecake al Limone
        ingredienti = new ArrayList<>(Arrays.asList("Biscotti digestive", " burro", "formaggio cremoso",
                "cioccolato fondente", "zucchero", "panna", " limone", "gelatina"));
        allergeni = new ArrayList<>(Arrays.asList("Glutine", "latticini"));
        dessertPiatti.add(new Piatto("D3", "Cheesecake al Limone", ingredienti, allergeni, 5, 6.5));

        Categoria dessert = new Categoria("D", "Dessert", dessertPiatti);

        // Aggiungo ogni categoria nell'array del menu
        this.Categorie.add(antipasti); // 0
        this.Categorie.add(primi); // 1
        this.Categorie.add(secondi); // 2
        this.Categorie.add(dessert); // 3
    }

    public int getIndexCategoria(String idCategoria) {
        int index = -1;
        switch (idCategoria) {
            case "A":
                index = 0; // antipasti alla posizione 0
                break;
            case "P":
                index = 1; // primi alla posizione 1
                break;
            case "S":
                index = 2; // secondi alla posizione 2
                break;
            case "D":
                index = 3; // dessert alla posizione 3
                break;
        }
        return index;
    }

    /**
     * 
     * @param idCategoria
     */
    public void dettagliCategoria(String idCategoria) {
        int indexCategoria = this.getIndexCategoria(idCategoria);
        if (indexCategoria == -1) {
            System.out.println("Categoria non trovata.");
            return;
        }
        Categoria categoria = this.Categorie.get(indexCategoria);
        for (int i = 0; i < categoria.Piatti.size(); i++) {
            Piatto piatto = categoria.Piatti.get(i);
            System.out.println(" - " + piatto.Id + " " + piatto.Nome + ", " + piatto.Prezzo + "\u20ac \n");
        }
    }

    public void dettagliPiatto(String idPiatto) {
        Piatto piatto = this.getPiatto(idPiatto);
        if (piatto == null) {
            System.out.println("Piatto non trovato.");
        } else {
            System.out.println(piatto.stampaDettagli());
        }
    }

    /**
     * Restituisce un istanza del piatto
     * 
     * @param IdPiatto A1 -> A = antipasti, 1 = id piatto
     * @return
     */
    public Piatto getPiatto(String IdPiatto) {
        try {
            String[] parts = IdPiatto.split("");
            // ---
            String idCategoriaStringa = parts[0];
            int idPiatto = Integer.parseInt(parts[1]);
            // ---
            int idCategoria = this.getIndexCategoria(idCategoriaStringa);
            // ---
            Categoria categoria = this.Categorie.get(idCategoria);
            Piatto piatto = categoria.Piatti.get(idPiatto);
            // ---
            return piatto;
        } catch (Exception e) {
            return null;
        }
    }
}
