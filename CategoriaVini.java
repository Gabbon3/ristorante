
import java.util.List;
import java.util.ArrayList;


public class CategoriaVini {
    public String Id;
    public String Nome;//Nome piatto es: "Prosciutto crudo e melone"
    public ArrayList<Vino> Vini;//categoria vini (BI= bianchi, RO = rossi, RS = rosati)

    public CategoriaVini(String Id, String Nome, ArrayList<Vino> Vini){
        this.Id = Id;
        this.Nome = Nome;
        this.Vini = Vini;

        
    }
}