import java.util.Scanner;
import java.util.ArrayList;
public class KalkulatorMethod {
   static double tambah(double a,double b){
       return a + b;
   }
   static double tambah(double a,double b,double c){
       return a + b + c;
   }
   static double kurang(double a,double b){
       return a-b;
   }
   static double kali(double a,double b){
       return a*b;
   }
   static double bagi(double a, double b){
       return a/b;
   }
   static double pangkat(double a, double b){
       return Math.pow( a,b);
   }
   static double akar(double a){
       return Math.sqrt(a);
   }
   static double riwayatHasil(double[] riwayat){
       double max=riwayat[0];
       for(double nilai:riwayat)
           if (nilai > max) {
               max = nilai;
           }
       return max;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<Double> daftarHasil = new ArrayList<>();
       int pil;
       double hasil=0;
       do {
           System.out.println("silahkan pilih menu dibawah");
           System.out.println("1.Tambah(2 angka) " +
                   "2.Tambah(3 angka)\n" +
                   "3.Pengurangan " +
                   "4.Perkalian\n" +
                   "5.Pembagian " +
                   "6.Perpangkatan\n" +
                   "7.Akar kuadrat "+
                   "0.Keluar");
           System.out.print("pilihan anda : ");
           pil = sc.nextInt();
           boolean hitung = false;
           switch (pil) {
               case 1:
                   System.out.print("masukkan angka pertama: ");
                   int a = sc.nextInt();
                   System.out.print("masukkan angka kedua: ");
                   int b = sc.nextInt();
                   hasil=tambah(a,b);
                   System.out.println("hasil " + a + "+" + b + "= " + hasil);
                   hitung=true;
                   break;

               case 2:
                   System.out.print("masukkan angka pertama: ");
                   int c = sc.nextInt();
                   System.out.print("masukkan angka kedua: ");
                   int d = sc.nextInt();
                   System.out.print("masukkan angka ketiga: ");
                   int e = sc.nextInt();
                   hasil=tambah(c,d,e);
                   System.out.println("hasil dari" + c + "+" + d + "= " + tambah(c, d, e));
                   hitung=true;
                   break;
               case 3:
                   System.out.print("masukkan angka pertama: ");
                   int f = sc.nextInt();
                   System.out.print("masukkan angka kedua: ");
                   int g = sc.nextInt();
                   hasil=kurang(f,g);
                   System.out.println("hasil dari" + f + "-" + g + "= " + kurang(f, g));
                   hitung=true;
                   break;
               case 4:
                   System.out.print("masukkan angka pertama: ");
                   int h = sc.nextInt();
                   System.out.print("masukkan angka kedua: ");
                   int i = sc.nextInt();
                   hasil=kali(h,i);
                   System.out.println("hasil dari " + h + "*" + i + "= " + kali(h, i));
                   hitung=true;
                   break;
               case 5:
                   System.out.print("masukkan angka pertama: ");
                   int j = sc.nextInt();
                   System.out.print("masukkan angka kedua: ");
                   int k = sc.nextInt();
                   hasil=bagi(j,k);
                   System.out.println("hasil dari " + j + "/" + k + "= " + bagi(j, k));
                   hitung=true;
                   break;
               case 6:
                   System.out.print("masukkan angka pertama: ");
                   int l = sc.nextInt();
                   System.out.print("masukkan angka pangkat: ");
                   int m = sc.nextInt();
                   hasil=pangkat(l,m);
                   System.out.println("hasil " + l + "^" + m + "= " + pangkat(l, m));
                   hitung=true;
                   break;
               case 7:
                   System.out.print("masukkan angka pertama: ");
                   int n = sc.nextInt();
                   System.out.println();
                   hasil=akar(n);
                   System.out.println("akar dari " + n + " = " + akar(n));
                   hitung=true;
                   break;
               case 0:
                   if (daftarHasil.isEmpty()){
                       System.out.println("Belum ada riwayat perhitungan");
                   }
                   else {
                       double[] Arrayriwayat=new double[daftarHasil.size()];
                       for (int p = 0; p < daftarHasil.size(); p++){
                           Arrayriwayat[p]= daftarHasil.get(p);
                       }
                       double nilaiTertinggi = riwayatHasil(Arrayriwayat);
                       System.out.println("hasil operasi teringgi = "+nilaiTertinggi);
                   }
                   break;
               default:
                   System.out.println("pilihan tidak valid");
                   break;
           }
           if (hitung) {
               daftarHasil.add(hasil);
           }
       } while (pil != 0);
   }
}
