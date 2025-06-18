package composite;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titolo;
    private List<String> autori = new ArrayList<>();
    private double prezzo;
    private List<ElementoLibro> contenuti = new ArrayList<>();

    public Libro(String titolo, double prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public void aggiungiAutore(String autore) {
        autori.add(autore);
    }

    public void aggiungiContenuto(ElementoLibro el) {
        contenuti.add(el);
    }

    public void stampa() {
        System.out.println("Libro: " + titolo);
        System.out.println("Autori: " + autori);
        System.out.println("Prezzo: €" + prezzo);
        for (ElementoLibro el : contenuti) {
            el.stampa();
        }
    }

    public int getNumeroTotalePagine() {
        return contenuti.stream().mapToInt(ElementoLibro::getNumeroPagine).sum();
    }
}
