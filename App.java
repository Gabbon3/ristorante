import java.util.Scanner;

public class App {
    public static Menu menu = new Menu();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ---
        System.out.println("Insersci l'id dell'ordine: ");
        int idOrdine = in.nextInt();
        System.out.println("Inserisci il numero del tavolo: ");
        int numeroTavolo = in.nextInt();
        Ordine ordine = new Ordine(idOrdine, numeroTavolo);
        // ---
        int cmd = 0;
        System.out.println("1. Dettagli categorie\n 2. Dettagli piatto\n 3. Ordina");
        do {
            System.out.println("Inserisci il comando: ");
            cmd = in.nextInt();
            in.nextLine();
            switch (cmd) {
                case 1:
                    System.out.println("Inserisci l'id della categoria:");
                    String idCategoria = in.nextLine();
                    menu.dettagliCategoria(idCategoria);
                    break;
                case 2: 
                    System.out.println("Inserisci l'd del piatto: ");
                    String idPiatto = in.nextLine();
                    menu.dettagliPiatto(idPiatto);
                    break;
                default:
                    System.out.println(".");
                    break;
            }
        } while(cmd != 3);
        // Inizio l'ordine
        String idPiatto = "";
        System.out.println("\212 il momento di ordinare\nInserisci l'id dei piatti: ");
        do {
            idPiatto = in.nextLine().trim();
            Piatto piatto = menu.getPiatto(idPiatto);
            if (piatto != null) {
                ordine.aggiungiPiatto(piatto);
            } else {
                System.out.println("Piatto non trovato.");
            }
        } while(!idPiatto.equalsIgnoreCase("end"));
        ordine.riepilogoOrdine();
    }
}
