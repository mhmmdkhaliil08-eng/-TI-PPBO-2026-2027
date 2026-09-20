import java.util.Scanner;
public class Latihan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("silahkan pilih menu dibawah: ");
        System.out.println("\n1.Nasgor\n" +
                "2.Soto\n" +
                "3.Nasi Ayam\n" +
                "4.Mie Ayam");
        System.out.print("Nomor pilihan : ");
        double pil = sc.nextDouble();
        switch ((int) pil){
            case 1:System.out.println("Nasgor"); break;
            case 2:System.out.println("Soto"); break;
            case 3:System.out.println("Nasi Ayam"); break;
            case 4:System.out.println("Mie Ayam"); break;
            default: System.out.println("pilihan tidak valid");
        }

    }
}
