import java.util.ArrayList;

public class Ordine{
    int IdOrdine;
    int NumeroTavolo;
    ArrayList <Piatto> ListaPiatti;
    int TempoStimato;
    double PrezzoTotale;
    public Ordine(int IdOrdine, int NumeroTavolo, ArrayList <Piatto> ListaPiatti, int TempoStimato, double PrezzoTotale)
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
    /**
     * Aggiunge un piatto all'ordine
     * @param piatto
     */
    public void aggiungiPiatto(Piatto piatto) {
        this.ListaPiatti.add(piatto);
        this.PrezzoTotale += piatto.Prezzo;
    }
    public void riepilogoOrdine() {
        System.out.println("Riepilogo ordine " + (this.IdOrdine) + " del tavolo " + this.NumeroTavolo + ":\n" );
        for(Piatto piatto : this.ListaPiatti) {
            System.out.println(piatto.stampaDettagli());
            System.out.println(" ---\n");
        }
        System.out.println("Prezzo totale: " + this.PrezzoTotale);
        System.out.println("Tempo stimato: " + this.TempoStimato + " minuti");
    }
}