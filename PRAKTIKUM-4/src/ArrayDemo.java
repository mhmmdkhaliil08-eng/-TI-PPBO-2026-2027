public class ArrayDemo {
    public static void main(String[] args){
        int[] nilai={10,20,30,40,50,60,70,80};
        System.out.println("Menggunakan for biasa");
        for(int i=0;i<nilai.length;i++){
            System.out.println("indeks-"+i+": "+nilai[i]);
        }
        System.out.println();
        System.out.println("Menggunakan nchanced for");
        for(int n : nilai){
            System.out.print(n+" ");
        }
    }
}
