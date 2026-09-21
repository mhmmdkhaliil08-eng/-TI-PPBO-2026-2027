import java.util.Scanner;
public class HitungTarifListrik {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int gol=0;
        double Tkwh=0;
        double kwh=0;
        double Total=0;
        System.out.println("pilih golongan: " +
                "\n1.450 VA\n" +
                "2.900 VA\n" +
                "3.1300 VA\n" +
                "4.2200 VA\n" +
                "5.Diatas 2200 VA");
        System.out.print("pilihan : ");
        int pil = sc.nextInt();
        switch(pil) {
            case 1:
                gol = 450;
                System.out.println("golongan : 450 VA");
                Tkwh = 450;
                System.out.println("Tarif per kwh = Rp." + Tkwh);
                do {
                    System.out.print("jumlah pemakaian dalam kwh : ");
                    kwh = sc.nextDouble();
                    if (kwh == 0 || kwh <= -1) {
                        System.out.println("jumlah kwh nya salah tolong ulangi pengisiannya");
                    } else {
                        Total = kwh * Tkwh;
                        System.out.println("Total Tagihan = " + Total);
                    }
                } while (kwh == 0 || kwh <= -1);
                break;
            case 2:
                gol = 900;
                System.out.println("golongan : 900 VA");
                Tkwh = 650;
                System.out.println("Tarif per kwh = Rp." + Tkwh);
                do {
                    System.out.print("jumlah pemakaian dalam kwh : ");
                    kwh = sc.nextDouble();
                    if (kwh == 0 || kwh <= -1) {
                        System.out.println("jumlah kwh nya salah tolong ulangi pengisiannya");
                    } else {
                         Total = kwh * Tkwh;
                        System.out.println("Total Tagihan = " + Total);
                    }
                } while (kwh == 0 || kwh <= -1);
                break;

            case 3:
            case 4:
                gol = 1300;
                System.out.println("golongan : 1300 VA");
                Tkwh = 1.444;
                System.out.println("Tarif per kwh = Rp." + Tkwh);
                do {
                    System.out.print("jumlah pemakaian dalam kwh : ");
                    kwh = sc.nextDouble();
                    if (kwh == 0 || kwh <= -1) {
                        System.out.println("jumlah kwh nya salah tolong ulangi pengisiannya");
                    } else {
                         Total = kwh * Tkwh;
                        System.out.println("Total Tagihan = " + Total);
                    }
                } while (kwh == 0 || kwh <= -1);
                break;
            case 5:
                System.out.println("Masukkan Golongan Anda(Diatas VA");
                gol = sc.nextInt();
                if (gol >= 3500 && gol <= 5500) {
                    System.out.println("golongan :  " + gol + "VA");
                    Tkwh = 1.699;
                    System.out.println("Tarif per kwh = Rp." + Tkwh);
                    do {
                        System.out.print("jumlah pemakaian dalam kwh : ");
                        kwh = sc.nextDouble();
                        if (kwh == 0 || kwh <= -1) {
                            System.out.println("jumlah kwh nya salah tolong ulangi pengisiannya");
                        } else {
                             Total = kwh * Tkwh;
                            System.out.println("Total Tagihan = " + Total);
                        }
                    } while (kwh == 0 || kwh <= -1);
                    break;
                } else if (gol >= 6600) {
                    System.out.println("golongan : " + gol + "VA");
                    Tkwh = 450;
                    System.out.println("Tarif per kwh = Rp." + Tkwh);
                    do {
                        System.out.print("jumlah pemakaian dalam kwh : ");
                        kwh = sc.nextDouble();
                        if (kwh == 0 || kwh <= -1) {
                            System.out.println("jumlah kwh nya salah tolong ulangi pengisiannya");
                        } else {
                             Total = kwh * Tkwh;
                            System.out.println("Total Tagihan = " + Total);
                        }
                    } while (kwh == 0 || kwh <= -1);
                }
                break;
            default:
                System.out.println("pilihan tidak valid");
                break;

        }
        System.out.println("=======struk anda=======");
        System.out.println("Golongan daya : " + gol + " VA");
        System.out.println("Jumlah Kwh    : " + kwh);
        System.out.println("Tarif perKwh  : Rp." + Tkwh);
        System.out.println("Total Tagihan : Rp." + Total);

    }
}
