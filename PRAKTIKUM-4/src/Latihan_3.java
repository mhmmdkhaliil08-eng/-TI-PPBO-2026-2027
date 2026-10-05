import java.util.Scanner;
public class Latihan_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nilai=new int[5];
        System.out.println("Masukkan angkanya ");
        for(int i=0;i < 5;i++){
            System.out.print("nilai ["+i+"]=");
             nilai[i]= sc.nextInt();
        }
        System.out.println("menampilkan angka array:");
        for(int i=4;i>=0;i--){
            System.out.println(nilai[i]);
        }
    }
}
