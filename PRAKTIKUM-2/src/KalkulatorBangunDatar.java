import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //untuk menerima inputan dari user
        double P,L,r; //variabel yang menyimpan nilai panjang,lebar,dan jari-jari
        double Luas ,Keliling;//variabel yg nyimpan nilai luas dan keliling
        int pilih;//variabel yang menyimpan nilai pilihan user
        /*
        membuat percabangan
         */
        System.out.println("pilih nomor menu dibawah");
        System.out.println("1.Persegi panjang");
        System.out.println("2.Lingkaran");

        System.out.print("Pilihan : ");
        pilih = sc.nextInt();//variabel yang menyimpan nilai pilih
        /*
        jika memilih nomor 1 maka akan dieksekusi nomor 1,
        jika tidak maka akan di eksekusi nomor 2
         */
        if(pilih == 1){
            System.out.println("Masukkam nilai panjang dan lebar:");//menyuruh user memaasukkan nilai P dan L
            System.out.print("P = ");
            P = sc.nextDouble();
            System.out.print("L = ");
            L = sc.nextDouble();
            Luas = P * L;//mencari nilai luas persegi
            Keliling = 2 * (P+L);//mencari nilai keliling persegi
            System.out.println("Luas persegi = " + Luas);
            System.out.println("Keliling persegi = " + Keliling);
            boolean Luasbesar = Luas > 100;/*membandingkan apakah nilai luas persgi lebih dari 100
            jika iya maka outputnya true
            */
            System.out.println("luasbesar = " + Luasbesar);
        }
        else {
            System.out.println("Masukkan nilai jari-jari");//menyuruh user memaasukkan nilai r
            System.out.print("r = ");
            r = sc.nextDouble();
            Luas = Math.PI * Math.pow(r,2);/*Math.PI untuk konstanta pi dan
            Math.pow untuk mengalikan bilangan berpangkat */
            System.out.println("Luas lingkaran = " + Luas);
        }
    }
}
