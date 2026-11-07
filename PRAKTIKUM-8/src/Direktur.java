public class Direktur extends Manager{
    private double tunjangSaham;
    public Direktur(String nama,String nip,double gajipokok,double tunjanganJabatan,double tunjangSaham){
        super(nama,nip,gajipokok,tunjanganJabatan);
        this.tunjangSaham=tunjangSaham;
    }
    public static void main(String[] args){
        Pengawai p =new Pengawai("bro andi","208763451",-1);
        Manager m =new Manager("john","2025678485",7000000,6000000);
        Direktur d =new Direktur("doe","20245678923",1000000,6000000,8000000);

        p.tampilData();
        System.out.println("===============");
        m.tampilData();
        System.out.println("===============");
        d.tampilData();
    }

}
