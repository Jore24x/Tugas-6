import java.util.Scanner;

class perhitungan{
    Scanner sc = new Scanner(System.in);

   String menu;
    String menuprint;



    String menu2;
    private int ketik , game , internet , scan , print , teh , keseluruhan;
    private int totalharga , totwak;

    public int gettotalharga() {
        return totalharga;
    }

    public void settotalharga(int totalharga) {
        this.totalharga = totalharga;
    }

    public int getTotwak() {
        return totwak;
    }

    public void setTotwak(int totwak) {
        this.totwak = totwak;
    }

    public int getKetik() {
        return ketik;
    }

    public void setKetik(int ketik) {
        this.ketik = ketik;
    }

    public int getGame() {
        return game;
    }

    public void setGame(int game) {
        this.game = game;
    }

    public int getInternet() {
        return internet;
    }

    public void setOnline(int internet) {
        this.internet = internet;
    }

    public int getScan() {
        return scan;
    }

    public void setScan(int scan) {
        this.scan = scan;
    }

    public int getPrint() {
        return print;
    }

    public void setPrint(int print) {
        this.print = print;
    }

    public int getTeh() {
        return teh;
    }

    public void setTeh(int teh) {
        this.teh = teh;
    }
    public void loop(){
        menu();
        menu2();
    }
    public perhitungan() {
    loop();
    }
    public void menu2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("ada lagi??(y/n):");
        menu2 = sc.nextLine().toLowerCase();
        if (menu2.equals("y")){
            loop();
        }
        else {
            keseluruhan = ketik + game + internet + scan + print + teh;
            System.out.println("total keseluruhan: " + keseluruhan );
            System.out.println("terima kasih");
        }
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. ketik: ");
        System.out.println("2. internet: ");
        System.out.println("3. game: ");
        System.out.println("4. scan: ");
        System.out.println("5. print: ");
        System.out.println("6. tehbotol: ");
        System.out.println("7. tidak ada: ");
        System.out.println("pilih menu yang mau digunakan(input angka saja): ");
        menu = sc.nextLine().toLowerCase();

        if (menu.equals("1") ){
                ketik();
        }
        else if (menu.equals("2")) {
                internet();
        }
        else if (menu.equals("3")) {
                game();
        }
        else if (menu.equals("4")) {
                scan();
        }
        else if (menu.equals("5")) {
                print();
        }
        else if (menu.equals("6")) {
                teh();
        }
        else if (menu.equals("7")) {
        menu();
        }
        else{

        }
    }

    public void ketik(){
        Scanner sc = new Scanner(System.in);
        System.out.print("waktu menggunakan(menit): ");
        this.totwak = sc.nextInt();
        ketik = (this.totwak*2000)/60;
        System.out.println("Total harga: " + ketik);

    }
    public void internet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("waktu menggunakan(menit): ");
        this.totwak = sc.nextInt();
        internet = (this.totwak*4000)/60;
        System.out.println("Total harga: " + internet);
    }
    
    public void game(){
        Scanner sc = new Scanner(System.in);
        System.out.print("waktu menggunakan(menit): ");
        this.totwak = sc.nextInt();
        game = (this.totwak*5000)/60;
        System.out.println("Total harga: " + game);
    }
    
    public void print(){
        Scanner sc = new Scanner(System.in);
        System.out.print("print hitam putih atau warna(HP/W)");
        menuprint = sc.nextLine().toUpperCase();
        if (menuprint.equals("HP")){
            System.out.println("berapa banyak: ");
            this.totalharga = sc.nextInt();
            print = this.totalharga*500;
            System.out.println("total harga: " +print);

        }
        else if (menuprint.equals("W")){
            System.out.print("berapa banyak: ");
            this.totalharga = sc.nextInt();
            print = this.totalharga*1000;
            System.out.println("total harga: " +print);
        }
    }
    public void scan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("berapa banyak: ");
        this.totalharga = sc.nextInt();
        scan = this.totalharga*1000;
        System.out.println("total harga: " +print);
    }
    
    public void teh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("berapa banyak: ");
        this.totalharga = sc.nextInt();
        scan = this.totalharga*3000;
        System.out.println("total harga: " +print);

    }

}

public class Tugas6_3 {
    public static void main(String[] args) {
        perhitungan p = new perhitungan();
    }



}
