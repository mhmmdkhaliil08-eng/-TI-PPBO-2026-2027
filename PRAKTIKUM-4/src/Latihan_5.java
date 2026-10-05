import java.util.Scanner;
public class Latihan_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nilai = new int[5];
        int max=nilai[0];
        int max2=Integer.MIN_VALUE;
        int i=0;
        System.out.println("Masukkan angkanya:");
        for(i=0;i<5;i++){
            System.out.print("nilai ["+i+"]=");
            nilai[i] = sc.nextInt();
        }
        for(i=0;i<5;i++){
            System.out.print(nilai[i]+" ");
            if(nilai[i]>max){
                max2=max;
                max=nilai[i];
            }
            else if (nilai[i] > max2 && nilai[i] != max){
                max2=nilai[i];
            }
        }
        System.out.println();
        System.out.println("nilai kedua terbesar: "+max2);
    }
}
