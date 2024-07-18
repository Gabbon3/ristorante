
import java.util.List;
import java.util.ArrayList;


public class Categoria {
    public String Id;
    public String Nome;//Nome piatto es: "Prosciutto crudo e melone"
    public List<Piatto> Piatti;//categoria piatti (A= antipasti, P = primi, S = secondi, D = dolci)

    public Categoria(String Id, String Nome, ArrayList<Piatto> Piatti){
        this.Id = Id;
        this.Nome = Nome;
        this.Piatti = Piatti;
    }
}