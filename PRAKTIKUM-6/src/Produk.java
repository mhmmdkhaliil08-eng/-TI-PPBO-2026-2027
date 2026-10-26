public class Produk {
    String nama;
    double harga;

    public boolean isMahal(double batasHarga){
        batasHarga=40000;
        return harga >= batasHarga;
    }
}
