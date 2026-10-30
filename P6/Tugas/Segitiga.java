package P6.Tugas;

public class Segitiga extends BangunDatar {
    float a, t;

    @Override
    public float luas() {
        System.out.println("Alas = " + a + "\nTinggi = " + t);
        return a * t / 2;
    }

    @Override
    public float keliling() {
        float pyt = (float) Math.sqrt((a * a) + (t * t));
        System.out.println("Perhitungan Pytaghoras = " + pyt);
        return a + t + pyt;
    }
}

