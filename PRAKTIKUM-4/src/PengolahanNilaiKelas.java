import  java.util.Scanner;
public class PengolahanNilaiKelas {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N;
        double rata;
        double total=0;
        int kkm = 70;
        int lulus=0;
        int gaklulus=0;
        System.out.print("Masukkan jumlah siswa: ");
        N= sc.nextInt();
        int[] nilai=new int[N];
        System.out.println("Masukkan nilai siswa:");
        for(int i=0;i<N;i++){
            System.out.print("nilai siswa-"+(i+1)+":");
            nilai[i]= sc.nextInt();
        }
        int max=nilai[0];
        int min=nilai[0];
        for(int i=0;i<N;i++){
            if(nilai[i]>max){
                max=nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
            total=total+nilai[i];
        }
        rata=total / N;

        for(int i=0;i<N;i++){
            if(nilai[i]>=kkm){
                lulus++;
            }
            else{
                gaklulus++;
            }
        }
        System.out.println("Semua nilai siswa :");
        for(int i=0;i<N;i++){
            System.out.print(nilai[i]+" ");
        }
        int temp;
        for(int i=0;i<N-1;i++){
            for(int j=0;j<N-i-1;j++){
                if(nilai[j]>nilai[j+1]){
                    temp=nilai[j+1];
                    nilai[j+1]=nilai[j];
                    nilai[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("========Tampilan Akhir========");
        System.out.print("total nilai siswa = "+total);
        System.out.println();
        System.out.print("rata-rata nilai siswa = "+rata);
        System.out.println();
        System.out.print("Nilai Tertinggi = "+max);
        System.out.println();
        System.out.print("Nilai Terendah = "+min);
        System.out.println();
        System.out.print("Jumlah siswa yang LULUS = "+lulus);
        System.out.println();
        System.out.print("Jumlah siswa yang GAK LULUS = "+gaklulus);
        System.out.println();
        System.out.println("Nilai Setelah Diurut : ");
        for(int i=0;i<N;i++){
            System.out.print(nilai[i]+" ");
        }

    }
}
