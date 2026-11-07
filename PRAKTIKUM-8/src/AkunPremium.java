public class AkunPremium extends Akun{
    private double batasKredit;
    public AkunPremium(String username,double saldo,double batasKredit){
        super(username, saldo);
        this.batasKredit=batasKredit;
    }
    public void cekLmit(){
        System.out.println("Username    : "+this.username);
        System.out.println("Saldo       : "+this.saldo);
        System.out.println("BatasKredit : "+this.batasKredit);
    }
}
