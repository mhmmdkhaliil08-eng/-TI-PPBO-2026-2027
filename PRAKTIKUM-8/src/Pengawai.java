public class Pengawai {
    protected String nama;
    protected String nip;
    protected double gajiPokok;
    public Pengawai(String nama,String nip,double gajiPokok){

        this.nama=nama;
        this.nip=nip;
        if(gajiPokok <= 0){
            this.gajiPokok = 0;
            System.out.println("gaji gak boleh dibawah 0");
        } else {
            this.gajiPokok = gajiPokok;
        }
    }

    public void tampilData(){
        System.out.println("Nama      : "+this.nama);
        System.out.println("Nip       : "+this.nip);
        System.out.println("GajiPokok : "+this.gajiPokok);
    }
}
