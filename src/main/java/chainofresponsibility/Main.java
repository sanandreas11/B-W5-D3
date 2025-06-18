package chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        // Creo gli ufficiali
        Ufficiale tenente = new Tenente();
        Ufficiale capitano = new Capitano();
        Ufficiale maggiore = new Maggiore();
        Ufficiale colonnello = new Colonnello();
        Ufficiale generale = new Generale();

        // Imposto la catena
        tenente.setSuperiore(capitano);
        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);

        // Test
        tenente.verificaStipendio(3500); // dovrebbe rispondere il Colonnello
        tenente.verificaStipendio(6000); // Nessuno
    }
}
