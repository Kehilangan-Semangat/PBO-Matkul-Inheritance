package P6.Tugas;

public class Main {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        bd.luas();
        bd.keliling();

        Persegi ps = new Persegi();
        ps.s = 5;
        System.out.println("Persegi");
        System.out.println("Luas: " + ps.luas());
        System.out.println("Keliling: " + ps.keliling());
        System.out.println();

        Lingkaran lk = new Lingkaran();
        lk.r = 3;
        System.out.println("Lingkaran");
        System.out.println("Luas: " + lk.luas());
        System.out.println("Keliling: " + lk.keliling());
        System.out.println();

        PersegiPanjang pp = new PersegiPanjang();
        pp.p = 8;
        pp.l = 5;
        System.out.println("Persegi Panjang");
        System.out.println("Luas: " + pp.luas());
        System.out.println("Keliling: " + pp.keliling());
        System.out.println();

        Segitiga sg = new Segitiga();
        sg.a = 3;
        sg.t = 4;
        System.out.println("Segitiga");
        System.out.println("Luas: " + sg.luas());
        System.out.println("Keliling: " + sg.keliling());
    }
}

