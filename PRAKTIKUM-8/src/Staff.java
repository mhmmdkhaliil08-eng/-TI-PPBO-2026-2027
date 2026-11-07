public class Staff extends Pengawai{
    private double tunjanganKinerja;
    public Staff(String nama,String nip,double gajiPokok,double tunjanganKinerja){
        super(nama, nip, gajiPokok);
        this.tunjanganKinerja=tunjanganKinerja;
    }

    public double getTunjanganKinerja() {
        return tunjanganKinerja;
    }
}
