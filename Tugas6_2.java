import java.util.Scanner;


class pulsa{
Scanner sc = new Scanner(System.in);

private int j , m , d , selisih , totwak1 , totwak2 , harga , totharga;

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void waktu(){

    System.out.println("jam: ");
    this.j = sc.nextInt();
    System.out.println("menit: ");
    this.m = sc.nextInt();
    System.out.println("detik: ");
    this.d = sc.nextInt();
    System.out.println(j+ ":" +m + ":" +d);
    totwak1 = (this.j*3600) + (this.m*60) + this.d;
}
    public void waktu2(){

        System.out.println("jam: ");
        this.j = sc.nextInt();
        System.out.println("menit: ");
        this.m = sc.nextInt();
        System.out.println("detik: ");
        this.d = sc.nextInt();
        System.out.println(j+ ":" +m + ":" +d);
        totwak2 = (this.j*3600) + (this.m*60) + this.d;
    }


    public pulsa() {
        harga = 150;
        waktu();
        waktu2();

        selisih = totwak2 - totwak1;
        totharga = selisih*harga/5;

        System.out.println("selisih waktu: " +selisih);
        System.out.println("total harga: Rp.  " + totharga);



    }
}

public class Tugas6_2{

    public static void main(String[] args) {
        pulsa p = new pulsa();
    }

}