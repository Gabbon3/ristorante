import java.util.List;

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
}