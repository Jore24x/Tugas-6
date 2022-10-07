import java.util.Scanner;

public class segitiga {
    segitiga segitiga = new segitiga();
    Scanner sc = new Scanner(System.in);
    private int alas , tinggi;
    private double luas;

    public segitiga(){this.alas = 0 ; this.tinggi = 0;}

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public void luasSegitiga(){
        System.out.print("alas : ");
        this.alas = sc.nextInt();
        System.out.print("Tinggi : ");
        this.tinggi = sc.nextInt();

        this.luas = this.alas * this.tinggi * 0.5;
        System.out.print("Luas = " + this.luas);
}

    public static void main(String[] args) {
        segitiga Luas = new segitiga();
        Luas.luasSegitiga();
    }
    }
