package agh.po.lab2;

import java.util.Random;
import java.util.ArrayList;
public class lotto {
    public static void main(String[] args) {
        Random rand = new Random();
        int liczba_calkowita = rand.nextInt();
        int los = rand.nextInt(50);
        System.out.println(los);
    }
}
