import java.util.Scanner;
public class Latihan_4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[3][3];
        System.out.println("MAsukkan angkanya:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                System.out.print("nilai ["+i+"]"+"["+j+"]=");
                nilai[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array nya:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                System.out.print(nilai[i][j]+" ");
            }
            System.out.println();
        }
        int totalsemua=0;
        for(int i=0;i<3;i++) {
            int totalperbaris=0;
            for (int j = 0; j < 3; j++) {
                totalperbaris+=nilai[i][j];
                totalsemua+=nilai[i][j];
            }
            System.out.println("total baris "+ (i+1) +" = "+ totalperbaris );
        }
        System.out.println("total seluruh elemen = "+ totalsemua);


    }
}
