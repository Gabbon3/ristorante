import java.util.List;
import java.util.ArrayList;


public class Ordine{
    int IdOrdine;
    int NumeroTavolo;
    List <Piatto> ListaPiatti;
    int TempoStimato;
    double PrezzoTotale;
    public Ordine(int IdOrdine, int NumeroTavolo, List <Piatto> ListaPiatti, int TempoStimato, double PrezzoTotale)
    {
        this.IdOrdine = IdOrdine;
        this.NumeroTavolo = NumeroTavolo;
        this.ListaPiatti = ListaPiatti;
        this.TempoStimato = TempoStimato;
        this.PrezzoTotale = PrezzoTotale;
    }
    public Ordine(int IdOrdine, int NumeroTavolo)
    {
        this.IdOrdine = IdOrdine;
        this.NumeroTavolo = NumeroTavolo;
        this.TempoStimato = 0;
        this.PrezzoTotale = 0;
        this.ListaPiatti = new ArrayList<Piatto>();
    }
}