import java.util.Scanner;
public class Latihan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Umur: ");
        int umur = sc.nextInt();
        System.out.print("Apakah anda mahasiswa: ");
        boolean mahasiswa = sc.nextBoolean();


        if(umur < 25 && mahasiswa){
            System.out.println("diskon 20%");
        }
        else if (umur >= 25 || !mahasiswa){
            System.out.println("harga normal");
        }

    }
}
