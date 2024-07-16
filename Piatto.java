import java.util.List;

public class Piatto {
    public String Id;
    public String Nome;
    public List<String> Ingredienti;
    public List<String> Allergeni;
    public Integer TempoStimato;
    public Double Prezzo;

    public Piatto(String Id, String Nome, List<String> Ingrediendi, List<String> Allergeni, Integer TempoStimato, Double Prezzo) {
        this.Id = Id;
        this.Nome = Nome;
        this.Ingredienti = Ingrediendi;
        this.Allergeni = Allergeni;
        this.TempoStimato = TempoStimato;
        this.Prezzo = Prezzo;
    }

    
}