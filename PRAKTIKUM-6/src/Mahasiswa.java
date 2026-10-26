public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    //constructor tanpa parameter
    public Mahasiswa(){
        nama="belum diisi";
        nim="--";
        ipk=0.0;
    }

    public Mahasiswa(String nama,String nim,double ipk){
        this.nama=nama;
        this.nim=nim;
        this.ipk=ipk;
    }

    public  void tampilkanData(){
        System.out.println("Nama : "+nama);
        System.out.println("Nim  : "+nim);
        System.out.println("Ipk  : "+ipk);
    }
    public boolean isCumlaude(){
        return ipk >= 3.5;
    }
}
