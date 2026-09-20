import java.util.Scanner;
public class Latihan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("angka pertama: ");
        double a = sc.nextDouble();
        System.out.print("angka kedua: ");
        double b = sc.nextDouble();
        System.out.print("angka ketiga: ");
        double c = sc.nextDouble();
        if(a>b){
            if(a>c){
                System.out.println(a + " adalah bilangan terbesar");
            }
            else{
                System.out.println(c+" adalah bilangan terbesar");
            }
        }
        else if (b>c){
            System.out.println(b +" adalah bilangan terbesar");
        }
        else {
            System.out.println(c +" adalah bilangan terbesar");
        }

    }
}
