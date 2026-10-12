public class Latihan_2 {
    static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for(int i=2;i * i <= n;i++){
            if(n % 2 == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("apakah angka 6 prima? "+isPrima(6));

        for(int i=0; i<=50;i++){

            if(isPrima(i)){
                System.out.print(i+" ");
            }
        }
    }
}
