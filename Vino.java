
import java.util.ArrayList;

public class Vino {
    public String Nome;
    public String Id;
    public String annoDiProd;
    public String origine;
    public ArrayList<String>piattiConsigliati;
    public double prezzo;
    public String tipologia;


    public Vino(String nome, String id, String annoDiProd, String origine, ArrayList<String> piattiConsigliati, double prezzo, String tipologia) {
        Nome = nome;
        this.Id = id;
        this.annoDiProd = annoDiProd;
        this.origine = origine;
        this.piattiConsigliati = piattiConsigliati;
        this.prezzo = prezzo;
        this.tipologia = tipologia;
    }

    
}
