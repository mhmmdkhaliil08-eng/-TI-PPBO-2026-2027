public class MethodDemo {
    static void sapa(String nama){
        System.out.println("Halo, nama saya"+nama+"!");
    }
    static void tampilkanBiodata(String nama1,int umur,String kota){
        System.out.println(nama1 + "("+umur+" tahun) -- "+ kota);
    }
    public static void main(String[] args){
        sapa("budi");
        sapa("Adi");
        tampilkanBiodata("Budi",20,"Bandung");

    }
}
