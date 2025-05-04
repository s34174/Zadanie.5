public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc;
    private int dostepneMiejsca;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        this(nazwa, cena, "brak", "brak");
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa, cena, data, "brak");
    }

    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
        this.maxLiczbaMiejsc = 100;
        this.dostepneMiejsca = 0;
    }

    public String toString() {
        return nazwa + " | Data: " + data + " | Miejsce: " + miejsce +
                " | Cena: " + cena + " zł | Dostępne: " + dostepneMiejsca + "/" + maxLiczbaMiejsc;
    }

    public void zarezerwujMiejsce() {
        if (dostepneMiejsca < maxLiczbaMiejsc) {
            dostepneMiejsca++;
        }
    }

    public void anulujMiejsce() {
        if (dostepneMiejsca > 0) {
            dostepneMiejsca--;
        }
    }

    public String getNazwa() { return nazwa; }
    public String getData() { return data; }
    public String getMiejsce() { return miejsce; }
    public int getMaxLiczbaMiejsc() { return maxLiczbaMiejsc; }
    public int getDostepneMiejsca() { return dostepneMiejsca; }
    public double getCena() { return cena; }

    public void setCena(double cena) { this.cena = cena; }
}
