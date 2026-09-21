import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("jumlah : " + (a+b));
        System.out.println("selisih : " + (a-b));
        System.out.println("kali : " + (a*b));
        System.out.println("bagi : " + (a/b));
        System.out.println("jmodule : " + (a%b));

        System.out.println("apakah a > b " + (a>b));
        System.out.println("apakah a < b " + (a<b));
        System.out.println("apakah a == b " + (a==b));
        System.out.println("apakah a >= b " + (a>=b));
        System.out.println("apakah a <= b " + (a<=b));
    }
}
