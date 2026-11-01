import java.util.Scanner;
public class RekeningLatihan {
    private String nomorRekenig;
    private String namaPemilik;
    private double saldo;
    private String jenisRekenig;

    Scanner sc = new Scanner(System.in);

    public RekeningLatihan(String nomorRekenig,String namaPemilik,double saldo,String jenisRekenig){
        this.nomorRekenig = nomorRekenig;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
        this.jenisRekenig = jenisRekenig;
    }

    public String getNomorRekenig() {
        return nomorRekenig;
    }
    public String getNamaPemilik(){
        return  namaPemilik;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getJenisRekenig(){ return jenisRekenig; }

    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        } else {
            this.saldo += jumlah;
            System.out.println("Setor saldo berhasil, saldo : " + this.saldo);
        }

    }

    public void tarik(double jumlah){
        if(jumlah<=0){
            System.out.println("Penarikan harus lebih dari 0");
        } else if (jumlah > this.saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            this.saldo-=jumlah;
            System.out.println("Penarikan berhasil, saldo sekarang : "+this.saldo);
        }

    }

    public void transfer(String rekeningTujuan,double jumlah){
        if(jumlah < 0){
            System.out.println("Gak betul jir");
        } else if (this.saldo - jumlah < 0) {
            System.out.println("Saldo tidak cukup");
        }else {
            this.saldo-=jumlah;
            System.out.println("Transfer Berhasil");
            System.out.println("di transfer ke rekening : "+rekeningTujuan);
        }
    }
    public  void cekMutasi(){
        System.out.println("Nomor Rekening : "+this.nomorRekenig);
        System.out.println("Pemilik        : "+this.namaPemilik);
        System.out.println("Saldo          : "+this.saldo);
        System.out.println("Jenis Rekening : "+this.jenisRekenig);


    }


}
