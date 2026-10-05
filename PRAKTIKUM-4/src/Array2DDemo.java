public class Array2DDemo {
    public static void main(String[] args){
        int[][] nilai={
                {2,3,4},
                {5,6,7},
                {8,9,0}
        };
        for(int baris=0;baris<nilai.length;baris++){
            for(int kolom=0;kolom<nilai[baris].length;kolom++){
                System.out.print(nilai[baris][kolom]+" ");
            }
            System.out.println();
        }
        int totalnilai=0;
        for (int baris=0;baris<nilai.length;baris++){
            for(int kolom=0;kolom<nilai[baris].length;kolom++){
                totalnilai+=nilai[baris][kolom];
            }
        }
        System.out.println("total seluruh elemen = "+ totalnilai);
    }
}
