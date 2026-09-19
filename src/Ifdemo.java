
public class Ifdemo {
    public static void main(String[] args){
        int nilai = 75;
        char huruf;

        if(nilai >= 75 ){
            huruf= 'A';
        }
        else if(nilai>=70){
            huruf= 'B';
        }
        else if (nilai>=55){
            huruf= 'C';
        }
        else {
            huruf = 'E';
        }
        System.out.println("Nilai hruf = " + huruf);
    }
}
