
import java.util.List;

public class Categoria {
    public String Id;
    public String Nome;//Nome piatto es: "Prosciutto crudo e melone"
    public List<String> Piatti;//categoria piatti (A= antipasti, P = primi, S = secondi, C = contorni, D = dolci)

    public Categoria(String Id, String Nome, List<String> Piatti){
        this.Id = Id;
        this.Nome = Nome;
        this.Piatti = Piatti;
    }
}