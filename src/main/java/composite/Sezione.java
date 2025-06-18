package composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ElementoLibro {
    private String titolo;
    private List<ElementoLibro> sottoelementi = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungiElemento(ElementoLibro elemento) {
        sottoelementi.add(elemento);
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for (ElementoLibro el : sottoelementi) {
            el.stampa();
        }
    }

    @Override
    public int getNumeroPagine() {
        int totale = 0;
        for (ElementoLibro el : sottoelementi) {
            totale += el.getNumeroPagine();
        }
        return totale;
    }
}
