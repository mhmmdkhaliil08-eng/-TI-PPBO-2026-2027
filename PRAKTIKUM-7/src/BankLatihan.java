import java.util.Scanner;
public class BankLatihan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       RekeningLatihan[] r = new RekeningLatihan[2];
       r[0]=new RekeningLatihan("723464839","lil",400,"Tabungan");
       r[1]=new RekeningLatihan("263764887","lul",900,"Giro");


        System.out.print("Masukkan rekenig anda : ");
        String rekenig = sc.nextLine();
        for(int i = 0; i<2;i++) {
            if (rekenig.equalsIgnoreCase(r[i].getNomorRekenig())) {
                System.out.println("Pilih Menu dibawah ini:");
                System.out.println("1.setor\n" + "2.tarik\n" + "3.tranfer\n" + "4.cek mutasi");
                System.out.println("pilihan anda");
                int pilih = sc.nextInt();
                if (pilih == 1) {
                    System.out.print("Masukkan uang setoran anda: ");
                    double setor = sc.nextDouble();
                    r[i].setor(setor);
                    break;
                } else if (pilih==2) {
                    System.out.print("jumlah tarikan: ");
                    double tarik = sc.nextDouble();
                    r[i].tarik(tarik);
                    break;
                } else if (pilih==3) {
                    sc.nextLine();
                    System.out.println("Masukkan rekening tujuan anda : ");
                    String re = sc.nextLine();

                    System.out.print("Masukkan nominalnya: ");
                    double tf = sc.nextDouble();
                    r[i].transfer(re,tf);
                    break;
                } else if (pilih == 4) {
                    r[i].cekMutasi();
                    break;
                }else {
                    System.out.println("Pilihan tidak Valid");
                }
            }else {
                System.out.println("Rekening yang dimasukkan Salah");
                break;
            }
        }




    }
}
