import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji;

    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.listaRezerwacji = new ArrayList<>();
    }

    public Klient(String imie, String nazwisko) {
        this(imie, nazwisko, "brak@email.com");
    }

    public void dodajRezerwacje(Wydarzenie wydarzenie) {
        listaRezerwacji.add(wydarzenie);
        wydarzenie.zarezerwujMiejsce();
    }

    public void anulujRezerwacje(Wydarzenie wydarzenie) {
        listaRezerwacji.remove(wydarzenie);
        wydarzenie.anulujMiejsce();
    }

    public void wyswietlRezerwacje() {
        if (listaRezerwacji.isEmpty()) {
            System.out.println("Brak rezerwacji.");
            return;
        }
        for (Wydarzenie w : listaRezerwacji) {
            System.out.println(w);
        }
    }

    public String getImie() { return imie; }
    public String getNazwisko() { return nazwisko; }
}
