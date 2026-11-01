public class RekeningBank {
    private String nomorRekenig;
    private String namaPemilik;
    private double saldo;

    public RekeningBank(String nomorRekenig,String namaPemilik,double saldo){
        this.nomorRekenig = nomorRekenig;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
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
    public void setor(double jumlah){
        if(jumlah <= 0){
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor saldo berhasil, saldo : "+saldo);
    }
    public void tarik(double jumlah){
        if(jumlah<=0){
            System.out.println("Penarikan harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo-=jumlah;
            System.out.println("Penarikan berhasil, saldo sekarang : "+saldo);
        }
    }
}
