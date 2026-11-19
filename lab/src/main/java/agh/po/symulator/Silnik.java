
package agh.po.symulator;

public class Silnik extends Komponent {

    private int maxObroty;
    private int obroty;

    public Silnik(String producent, String model,
                  int maxObroty) {
        super(producent, model);
        this.maxObroty = maxObroty;
        this.obroty = 0;
    }

    public void uruchom() {
        if (obroty == 0) {
            obroty = 800;
        }
    }

    public void zatrzymaj() {
        obroty = 0;
    }

    public void zwiekszObroty() {
        obroty = Math.min(obroty + 500, maxObroty);
    }

    public void zmniejszObroty() {
        obroty = Math.max(obroty - 500, 0);
    }

    public int getObroty() {
        return obroty;
    }

    public int getMaxObroty() {
        return maxObroty;
    }
}
