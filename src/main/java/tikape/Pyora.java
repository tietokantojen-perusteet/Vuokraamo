package tikape;

public class Pyora {

    private String rekisterinumero;
    private String merkki;

    public Pyora(String rekisterinumero, String merkki) {
        this.rekisterinumero = rekisterinumero;
        this.merkki = merkki;
    }

    public String getRekisterinumero() {
        return rekisterinumero;
    }

    public void setRekisterinumero(String rekisterinumero) {
        this.rekisterinumero = rekisterinumero;
    }

    public String getMerkki() {
        return merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }
}
