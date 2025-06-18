package adapter;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        info.setDataDiNascita(new Date(90, 5, 15)); // 15 giugno 1990

        DataSource adapter = new InfoAdapter(info);


        // Soluzione alternativa: stampa direttamente dal DataSource
        System.out.println("Nome Completo: " + adapter.getNomeCompleto());
        System.out.println("Età: " + adapter.getEta());
    }
}
