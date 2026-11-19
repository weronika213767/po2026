
package agh.po.symulator;

public class Samochod {

    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    private Sprzeglo sprzeglo;
    private Pozycja pozycja;

    private boolean stanWlaczenia;

    public Samochod(Silnik silnik,
                    SkrzyniaBiegow skrzynia,
                    Sprzeglo sprzeglo,
                    Pozycja pozycja) {

        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.sprzeglo = sprzeglo;
        this.pozycja = pozycja;
        this.stanWlaczenia = false;
    }

    public void wlacz() {
        silnik.uruchom();
        stanWlaczenia = true;
    }

    public void wylacz() {
        silnik.zatrzymaj();
        skrzynia.ustawLuz();
        stanWlaczenia = false;
    }

    public void zwiekszBieg() {
        if (stanWlaczenia && sprzeglo.getStanSprzegla()) {
            skrzynia.zwiekszBieg();
        }
    }

    public void zmniejszBieg() {
        if (sprzeglo.getStanSprzegla()) {
            skrzynia.zmniejszBieg();
        }
    }

    public void jedzDoPozycji(double x, double y) {
        if (stanWlaczenia && skrzynia.getAktualnyBieg() > 0) {
            pozycja.aktualizujPozycje(x, y);
        }
    }

    public void pokazStan() {
        System.out.println("Stan samochodu:");
        System.out.println("Silnik wlaczony: " + stanWlaczenia);
        System.out.println("Obroty: " + silnik.getObroty());
        System.out.println("Bieg: " + skrzynia.getAktualnyBieg());
        System.out.println("Sprzeglo wcisniete: "
                + sprzeglo.getStanSprzegla());
        System.out.println("Pozycja: " + pozycja.getPozycja());
        System.out.println("------------------");
    }
}
