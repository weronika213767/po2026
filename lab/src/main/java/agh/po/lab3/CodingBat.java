package agh.po.lab3;

public class CodingBat {

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public static void main(String[] args) {
        CodingBat zadanie = new CodingBat();

        System.out.println(zadanie.startHi("hi there"));
        System.out.println(zadanie.startHi("hi"));
        System.out.println(zadanie.startHi("hello hi"));
    }
}
