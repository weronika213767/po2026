package agh.po.lab3;

import static org.junit.jupiter.api.Assertions.*;

public class CodingBatTest {CodingBat codingBat = new CodingBat();

    @org.junit.Test
    public void startHiTest1() {
        assertEquals(true, codingBat.startHi("hi there"));
    }

    @org.junit.Test
    public void startHiTest2() {
        assertEquals(true, codingBat.startHi("hi"));
    }

    @org.junit.Test
    public void startHiTest3() {
        assertEquals(false, codingBat.startHi("hello hi"));
    }

}