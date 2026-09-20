import java.util.Scanner;
public class Latihan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Berat Badan Anda: ");
        double a = sc.nextDouble();
        System.out.print("Masukkan Tinggi Badan Anda: ");
        double b = sc.nextDouble();
        double T = b/100;

        double BMI = a / (T*T);
        System.out.println("BMI Anda " + a +"/" + (T*T) + "= " + BMI);

        if(BMI < 18.5){
            System.out.println("Kekurangan Berat Badan");
        }
        else if (BMI >= 18.5 && BMI <= 22.9){
            System.out.println("Ideal");
        }
        else if (BMI >= 23.0 && BMI <= 24.0){
            System.out.println("Kelebihan Berat Badan");
        }
        else if (BMI >= 25.0 && BMI <= 29.9){
            System.out.println("Obesitas Tingkat 1");
        }
        else if (BMI >= 30.0){
            System.out.println("Obesitas Tingkat 2");
        }

    }
}
