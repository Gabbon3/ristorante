import java.util.List;
import java.util.ArrayList;

public class Piatto {
    public String Id;
    public String Nome;
    public List<String> Ingredienti;
    public List<String> Allergeni;
    public Integer TempoStimato; // tempo in minuti
    public Double Prezzo;
    /**
     * Costruttore del piatto con tutte le informazioni
     * @param Id
     * @param Nome
     * @param Ingrediendi
     * @param Allergeni
     * @param TempoStimato
     * @param Prezzo
     */
    public Piatto(String Id, String Nome, ArrayList<String> Ingrediendi, ArrayList<String> Allergeni, Integer TempoStimato, Double Prezzo) {
        this.Id = Id;
        this.Nome = Nome;
        this.Ingredienti = Ingrediendi;
        this.Allergeni = Allergeni;
        this.TempoStimato = TempoStimato;
        this.Prezzo = Prezzo;
    }
    public Piatto() {
        //TODO Auto-generated constructor stub
    }
    /**
     * Stampa i dettagli relativi al piatto
     * @return dettagli
     */
    public String stampaDettagli() {
        String dettagli = "Dettagli del piatto " + this.Nome + " (ID " + this.Id + ")";
        // -- Ingredienti
        dettagli += " - Ingredienti: ";
        dettagli += String.join(", ", this.Ingredienti) + "\n";
        // -- Allergeni
        dettagli += " - Allergeni: ";
        dettagli += String.join(", ", this.Allergeni) + "\n";
        // -- Tempo stimato
        dettagli += " - Tempo stimato: " + this.TempoStimato + " minuti\n";
        // -- Prezzo
        dettagli += " - Prezzo: " + this.Prezzo;
        // ---
        return dettagli;
    }
}