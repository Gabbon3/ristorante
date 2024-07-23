import java.util.ArrayList;
import java.util.Arrays;

public class CartaVini {
    public ArrayList<CategoriaVini> CategorieVini;
    public CartaVini(){
        
    }
    public void Vinit(){
        this.CategorieVini = new ArrayList<CategoriaVini>();
        //LISTA DEI BIANCHI
        ArrayList<Vino> viniBianchi = new ArrayList<Vino>();
        //Verdicchio dei Castelli di Jesi
        ArrayList<String> piattiConsigliati = new ArrayList<>(Arrays.asList("A1", "A2", "A3"));
        viniBianchi.add(new Vino("Verdicchio dei Castelli di Jesi", "BI0", "2022", "Marche, Italia", piattiConsigliati, 20.0, "bianco secco"));
        //Chardonnay
        piattiConsigliati = new ArrayList<>(Arrays.asList("P1", "P3", "S1"));
        viniBianchi.add(new Vino("Chardonnay", "BI1", "2021", "Trentino-Alto Adige, Italia", piattiConsigliati, 25.0, "bianco secco"));
        //Sauvignon Blanc
        piattiConsigliati = new ArrayList<>(Arrays.asList("A0", "A2", "S2"));
        viniBianchi.add(new Vino("Sauvignon Blanc", "BI2", "2022", "Friuli Venezia Giulia, Italia", piattiConsigliati, 29.0, "bianco aromatico"));
        //Fiano di Avellino
        piattiConsigliati = new ArrayList<>(Arrays.asList("A1", "A3", "P2"));
        viniBianchi.add(new Vino("Fiano di Avellino", "BI3", "2021", "Campania, Italia", piattiConsigliati, 13.0, "bianco strutturato"));
        //LISTA DEI ROSSI
        ArrayList<Vino> viniRossi = new ArrayList<Vino>();
        //Chianti Classico
        piattiConsigliati = new ArrayList<>(Arrays.asList("P0", "S0", "S1"));
        viniRossi.add(new Vino("Chianti Classico", "RO0", "2020", "Toscana, Italia", piattiConsigliati, 20.0, "Rosso secco"));
        //Barolo
        piattiConsigliati = new ArrayList<>(Arrays.asList("S0", "P2", "S3"));
        viniRossi.add(new Vino("Barolo", "RO1", "2018", "Piemonte, Italia", piattiConsigliati, 42.0, "Rosso robusto"));
        //Montepulciano d'Abruzzo
        piattiConsigliati = new ArrayList<>(Arrays.asList("P3", "S1", "S2"));
        viniRossi.add(new Vino("Montepulciano d'Abruzzo", "RO2", "2019", "Abruzzo, Italia", piattiConsigliati, 15.0, "Rosso corposo"));
        //Primitivo di Manduria
        piattiConsigliati = new ArrayList<>(Arrays.asList("P0", "S0", "S1"));
        viniRossi.add(new Vino("Primitivo di Manduria", "RO3", "2019", "Abruzzo, Italia", piattiConsigliati, 25.0, "Rosso corposo"));
        //LISTA DEI ROSATI
        ArrayList<Vino> viniRosati = new ArrayList<Vino>();
        //Cerasuolo d'Abruzzo
        piattiConsigliati = new ArrayList<>(Arrays.asList("A0", "A1", "A2"));
        viniRosati.add(new Vino("Cerasuolo d'Abruzzo", "RS0", "2022", "Abruzzo, Italia", piattiConsigliati, 18.0, "Rosato fruttato"));
        //Bardolino Chiaretto
        
        piattiConsigliati = new ArrayList<>(Arrays.asList("P3", "P1", "A3"));
        viniRosati.add(new Vino("Bardolino Chiaretto", "RS1", "2021", "Veneto, Italia", piattiConsigliati, 20.0, "Rosato leggero"));
    }
}
