public class OperasiArray {
    public static void main(String[] args){
        int[] nilai={20,30,40,50,60,70,80};
        int cari=90;
        int posisi=-1;

        for(int i=0;i < nilai.length;i++){
            if(cari==nilai[i]){
                posisi=i;
            }
        }
        if(posisi != -1){
            System.out.println("nilai "+cari+" ditemukan di indeks-"+posisi);
        }
        else{
            System.out.println("nilai "+cari+" tidak ditemukan");
        }

    }
}
