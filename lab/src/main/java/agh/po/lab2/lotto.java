package agh.po.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class lotto {
    public static void main(String[] args) {
        // 1. utworzenue listy
        ArrayList<Integer> wylosowaneLiczby = new ArrayList<>();

        // generator liczb losowych
        Random random = new Random();

        // petla
        while (wylosowaneLiczby.size() < 6) {
            //dodaje +1 zeby bylo z zakresu 1-49
            int wylosowana = random.nextInt(49) + 1;

            // sprawdzenie unikalnosci
            if (!wylosowaneLiczby.contains(wylosowana)) {
                wylosowaneLiczby.add(wylosowana);
            }-
        }

        // wyswietlam wynik w konsoli
        System.out.println(wylosowaneLiczby);
    }
}