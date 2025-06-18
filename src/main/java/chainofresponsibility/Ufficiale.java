package chainofresponsibility;

public abstract class Ufficiale {
    protected Ufficiale superiore;

    public void setSuperiore(Ufficiale superiore) {
        this.superiore = superiore;
    }

    public void verificaStipendio(int importo) {
        if (getStipendio() >= importo) {
            System.out.println("L'ufficiale " + getClass().getSimpleName() +
                    " percepisce almeno " + importo + " euro.");
        } else if (superiore != null) {
            superiore.verificaStipendio(importo);
        } else {
            System.out.println("Nessun ufficiale percepisce almeno " + importo + " euro.");
        }
    }

    public abstract int getStipendio();
}
