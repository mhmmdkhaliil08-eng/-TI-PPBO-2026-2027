import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        double a = sc.nextDouble();
        double hasil = a % 2;
        System.out.println("hasil" + a + " % 2.0" + " = " + hasil);
        if (hasil == 0){
            System.out.println(a + " bilangan genap");
        }else{
            System.out.println(a + " bilangan ganjil");
        }
    }
}
