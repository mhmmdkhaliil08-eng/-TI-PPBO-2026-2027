import java.util.Scanner;
public class Latihan_6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("masukkan ukuran array: ");
        n= sc.nextInt();
        int[] nilai=new int[n];
        System.out.println("masukkan elemennya");
        for(int i=0;i<n;i++){
            System.out.print("nilai["+i+"]=");
            nilai[i]=sc.nextInt();
        }
        System.out.println("elemennya: ");
        for(int i=0;i<n;i++){
            System.out.print(nilai[i]+" ");
        }
        System.out.println();

        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++) {
                if (nilai[j] > nilai[j+1]) {
                    temp=nilai[j+1];
                    nilai[j+1]=nilai[j];
                    nilai[j]=temp;
                }
            }
        }
        System.out.println("Setelah diurutkan:");
        for(int i=0;i<n;i++){
            System.out.print(nilai[i]+" ");
        }
    }
}
