package P6.Tugas;

public class Persegi extends BangunDatar {
    float s;

    @Override
    public float luas() {
        System.out.println("Sisi = " + s);
        return s * s;
    }

    @Override
    public float keliling() {
        return 4 * s;
    }
}

