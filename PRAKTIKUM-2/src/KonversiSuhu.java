import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan suhu (C) : ");
        double C = sc.nextDouble();
        double F = C * 9/5 + 32;
        System.out.println("Suhu Fahrenhrit = " + F);
    }
}
