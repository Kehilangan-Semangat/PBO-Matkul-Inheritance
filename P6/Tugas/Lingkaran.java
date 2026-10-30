package P6.Tugas;

public class Lingkaran extends BangunDatar {
    float r;
    final float phi = 3.14f;

    @Override
    public float luas() {
        System.out.println("Jari - jari = " + r);
        return phi * r * r;
    }

    @Override
    public float keliling() {
        return 2 * phi * r;
    }
}

