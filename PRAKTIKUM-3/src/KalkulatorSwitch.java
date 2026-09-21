import java.util.Scanner;

public class KalkulatorSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Angka Pertama: ");
        double a = sc.nextDouble();
        System.out.print("Opertaor (+,-,*,/): ");
        char op = sc.next().charAt(0);
        System.out.print("angka kedua: ");
        double b = sc.nextDouble();

        double hasil =0;
        switch (op){
            case '+':
                hasil = a+b; break;
            case '-': hasil =a-b; break;
            case '*': hasil = a*b; break;
            case '/': hasil = a/b; break;
        }
        System.out.println("hasil dari " + a + op + b  + "=" + hasil );
    }
}