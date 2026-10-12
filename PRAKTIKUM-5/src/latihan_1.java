public class latihan_1 {
    static double luasPersegiPanjang(double p,double l){
        return p * l;
    }
    static double luasLingkaran(double r){
        return Math.PI * r*r;
    }
    public static void main(String[] args){
        System.out.println("luas persegi panjang = "+luasPersegiPanjang(20,60));
        System.out.println("luas persegi panjang = "+luasPersegiPanjang(30,70));

        System.out.println("luas lingkaran = "+luasLingkaran(5));
        System.out.println("luas lingkaran = "+luasLingkaran(7));
    }
}
