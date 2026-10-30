package P6.Tugas;

public class PersegiPanjang extends BangunDatar {
    float p, l;

    @Override
    public float luas() {
        System.out.println("Panjang = " + p + "\nLebar = " + l);
        return p * l;
    }

    @Override
    public float keliling() {
        return 2 * (p + l);
    }
}

