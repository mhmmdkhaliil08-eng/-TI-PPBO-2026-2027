public class MethodArrayDemo {
    static double hitungRataRata(int[] data){
        int total=0;
        for(int nilai : data){
            total += nilai;
        }
        return (double) total / data.length;
    }
    static int cariMaksimum(int[] data){
        int max = data[0];
        for (int nilai:data){
            if(nilai>max) {
                max = nilai;
            }
        }
        return max;
    }
    static int[] urutkanAscending(int[] data){
        int[] hasil = data.clone();

        for(int i=0;i< hasil.length - 1;i++){
            for(int j = 0; j< hasil.length-i-1;j++){
                if(hasil[j]>hasil[j+1]){
                    int temp = hasil[j];
                    hasil[j]=hasil[j+1];
                    hasil[j+1]=temp;
                }
            }
        }
        return hasil;
    }
    public static void main(String[] args){
        int[] nilaiujian={80,90,59,99};

        System.out.println("Rata-rata: "+hitungRataRata(nilaiujian));
        System.out.println("Maksimum: " + cariMaksimum(nilaiujian));

        int[] terurut = urutkanAscending(nilaiujian);
        System.out.print("setelah diurutkan: ");
        for(int n : terurut){
            System.out.print(n+" ");
        }
    }
}
