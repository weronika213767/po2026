
package agh.po.symulator;

public class Main {

    public static void main(String[] args) {

        Silnik silnik = new Silnik("Toyota", "1.8", 6000);

        SkrzyniaBiegow skrzynia =
                new SkrzyniaBiegow("Toyota", "Manualna", 6);

        Sprzeglo sprzeglo =
                new Sprzeglo("Toyota", "Standard");

        Pozycja pozycja = new Pozycja(0, 0);

        Samochod samochod =
                new Samochod(silnik, skrzynia, sprzeglo, pozycja);

        System.out.println("POCZATEK");
        samochod.pokazStan();

        System.out.println("WLACZENIE SILNIKA");
        samochod.wlacz();
        samochod.pokazStan();

        System.out.println("WRZUCENIE 1 BIEGU");
        sprzeglo.wcisnij();
        samochod.zwiekszBieg();
        sprzeglo.zwolnij();
        samochod.pokazStan();

        System.out.println("JAZDA");
        samochod.jedzDoPozycji(10, 5);
        samochod.pokazStan();

        System.out.println("WRZUCENIE 2 BIEGU");
        sprzeglo.wcisnij();
        samochod.zwiekszBieg();
        sprzeglo.zwolnij();
        samochod.pokazStan();

        System.out.println("ZMNIEJSZENIE BIEGU");
        sprzeglo.wcisnij();
        samochod.zmniejszBieg();
        sprzeglo.zwolnij();
        samochod.pokazStan();

        System.out.println("WYLACZENIE SAMOCHODU");
        samochod.wylacz();
        samochod.pokazStan();
    }
}
