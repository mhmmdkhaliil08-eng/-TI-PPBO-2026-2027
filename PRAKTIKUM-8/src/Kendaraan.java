public class Kendaraan {
    protected String merek;
    protected int kecepatanMaks;
    public Kendaraan (String merek,int kecepatanMaks){
        this.merek=merek;
        this.kecepatanMaks=kecepatanMaks;
    }
}
class Mobil extends Kendaraan{
    private int jumlahPintu;
    public Mobil(String merek,int kecepatanMaks,int jumlahPintu){
        super(merek,kecepatanMaks);
        this.jumlahPintu=jumlahPintu;
    }
    public void tampilkanInfo(){
        System.out.println("Merek mobil: "+this.merek);
        System.out.println("Jumlah pintu: "+this.jumlahPintu);
        System.out.println("Kecepatan maks: "+this.kecepatanMaks);
    }
}
class Motor extends Kendaraan{
    private String jenisMotor;
    public Motor(String merek,int kecepatanMaks,String jenisMotor){
        super(merek, kecepatanMaks);
        this.jenisMotor=jenisMotor;
    }
}
