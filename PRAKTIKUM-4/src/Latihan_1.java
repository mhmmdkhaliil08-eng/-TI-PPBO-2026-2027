import java.util.Scanner;
public class Latihan_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=10;
        System.out.print("masukkan angka : ");
        int nilai= sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(nilai+" x "+i+"="+nilai*i);
        }
    }
}
