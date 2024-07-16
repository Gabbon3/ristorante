package Classes;

import java.util.List;

public class Menu {
    public List<String> Categoria; //Creo categoria

    public String getPiatto() {        //metodo per richiamare il piatto
        return Categoria.Nome;                               
    }

    public Menu (List<String> Categoria) {      //Costruttore arrayList
        this.Categoria = Categoria;
    }

}







