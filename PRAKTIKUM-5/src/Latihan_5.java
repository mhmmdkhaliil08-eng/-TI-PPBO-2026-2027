import java.util.Scanner;
public class Latihan_5 {
    static int hitungTotal(int[] data){
        int total=0;
        for (int n:data){
            total+=n;
        }
        return total;
    }

    static double filterDiatasratarata(int[] data){
        double hasil= (double) hitungTotal(data)/ data.length;
        System.out.println("Nilai rata-rata adalah = "+hasil);
        System.out.print("Nilai diatas rata-rata = ");
        for (int datum : data) {
            if (datum > hasil) {
                System.out.print(datum + " ");
            }
        }
        return hasil;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah siswa:");
        int n= sc.nextInt();
        int[] nilai=new int[n];
        System.out.println("masukkan nilai siswa:");
        for(int i=0;i<n;i++){
            System.out.print("nilai siswa-"+(i+1)+":");
            nilai[i]= sc.nextInt();
        }
        System.out.println("total nilai adalah = "+hitungTotal(nilai));
        System.out.println(filterDiatasratarata(nilai));
    }
}
