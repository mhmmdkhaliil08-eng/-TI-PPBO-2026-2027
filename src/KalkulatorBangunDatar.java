import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P,L,r;
        double Luas ,Keliling;

        System.out.println("pilih nomor menu dibawah");
        System.out.println("1.Persegi panjang");
        System.out.println("2.Lingkaran");

        System.out.print("Pilihan : ");
        int pilih = sc.nextInt();

        if(pilih == 1){
            System.out.println("Masukkam nilai panjang dan lebar:");
            System.out.print("P = ");
            P = sc.nextDouble();
            System.out.print("L = ");
            L = sc.nextDouble();
            Luas = P * L;
            Keliling = 2 * (P+L);
            System.out.println("Luas persegi = " + Luas);
            System.out.println("Keliling persegi = " + Keliling);
            boolean Luasbesar = Luas > 100;
            System.out.println("luasbesar = " + Luasbesar);
        }
        else {
            System.out.println("Masukkan nilai jari-jari");
            System.out.print("r = ");
            r = sc.nextDouble();
            Luas = Math.PI * Math.pow(r,2);
            System.out.println("Luas lingkaran = " + Luas);
        }
    }
}
