import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        // zabezpieczenie przed brakiem arg
        if (args.length != 6) {
            System.out.println("Błąd: Podaj 6 liczb jako argumenty ");
            return;
        }

        // wczytanie typow uzytkownika
        ArrayList<Integer> typyUzytkownika = new ArrayList<>();
        for (String arg : args) {
            typyUzytkownika.add(Integer.parseInt(arg));
        }
        Collections.sort(typyUzytkownika);

        Random random = new Random();

        // czesc 1
        ArrayList<Integer> pierwszeLosowanie = losujLiczby(random);
        Collections.sort(pierwszeLosowanie);
        int pierwszeTrafienia = zliczTrafienia(typyUzytkownika, pierwszeLosowanie);

        System.out.println("Twoje typy: " + typyUzytkownika);
        System.out.println("Wylosowane liczby: " + pierwszeLosowanie);
        System.out.println("Liczba trafień: " + pierwszeTrafienia);

        // zad3

        long czasStart = System.currentTimeMillis();
        long liczbaLosowan = 0;
        int trafienia = 0;

        // petla losujaca do uzyskania 6 roznych liczb
        while (trafienia < 6) {
            liczbaLosowan++;
            ArrayList<Integer> kolejneLosowanie = losujLiczby(random);
            trafienia = zliczTrafienia(typyUzytkownika, kolejneLosowanie);
        }

        long czasKoniec = System.currentTimeMillis();
        long czasTrwania = czasKoniec - czasStart;

        System.out.println("Sukces! Trafiono 6/6.");
        System.out.println("Liczba losowań potrzebnych do pełnego trafienia: " + liczbaLosowan);
        System.out.println("Czas działania programu: " + czasTrwania + " ms (" + (czasTrwania / 1000.0) + " s)");
    }

    // generowanie 6 unikalnych liczb
    private static ArrayList<Integer> losujLiczby(Random random) {
        ArrayList<Integer> wylosowane = new ArrayList<>();
        while (wylosowane.size() < 6) {
            int liczba = random.nextInt(49) + 1;
            if (!wylosowane.contains(liczba)) {
                wylosowane.add(liczba);
            }
        }
        return wylosowane;
    }

    // sprawdzanie liczby trafien
    private static int zliczTrafienia(ArrayList<Integer> typy, ArrayList<Integer> wylosowane) {
        int trafienia = 0;
        for (int liczba : typy) {
            if (wylosowane.contains(liczba)) {
                trafienia++;
            }
        }
        return trafienia;
    }
}