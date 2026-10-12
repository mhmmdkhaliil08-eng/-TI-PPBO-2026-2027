import java.util.Scanner;
public class Latihan_4 {
    static int carimaksimum(int[] data){
        int max=data[0];
        for(int nilai:data){
            if(nilai>max){
                max=nilai;
            }
        }
        return max;
    }
    static int cariminimum(int[] data){
        int min=data[0];
        for(int nilai:data){
            if(nilai<min){
                min=nilai;
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah siswa:");
        int n= sc.nextInt();
        int[] nilaisiswa=new int[n];
        System.out.println("masukkan nilai siswa:");
        for(int i=0;i<n;i++){
            System.out.print("nilai siswa-"+(i+1)+":");
            nilaisiswa[i]= sc.nextInt();
        }
        System.out.println("Nilai terbesar adalah : "+carimaksimum(nilaisiswa));
        System.out.println("Nilai terkecil adalah: "+cariminimum(nilaisiswa));



    }
}
