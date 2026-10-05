public class Latihan_2 {
    public static void main(String[] args){
        int tinggi=5;
        System.out.println("Segitiga terbalik:");
        for(int i=tinggi;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Persegi:");
        for(int i=1;i<=tinggi;i++){
            for(int j=1;j<=tinggi;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
