
public class ProdukTugas {
    String kode_produk;
    String nama_produk;
    double harga;
    int stock;

    public ProdukTugas(String kode_produk,String nama_produk, double harga, int stock){
        this.kode_produk = kode_produk;
        this.nama_produk = nama_produk;
        this.harga = harga;
        this.stock = stock;
    }

    public  double hitungTotalharga(int jumlahBeli){
        double total=this.harga;
        String nama1 = this.nama_produk;
        String kode = this.kode_produk;
        total = total * jumlahBeli;

        return total;
    }

    public int stok(int jumlah){
        int stock = this.stock;
        String nama1 = this.nama_produk;
        String kode = this.kode_produk;
        stock = stock - jumlah;
        return stock;
    }

    public void tampilkanData(){
        System.out.println("====data produk=====");
        System.out.println("Kode Produk : "+this.kode_produk);
        System.out.println("Nama Produk : "+this.nama_produk);
        System.out.println("Harga       : " + this.harga);
        System.out.println("Stock       : "+this.stock);
    }

    public void tampilkanData1(){
        System.out.println("Nama Produk : "+this.nama_produk);
    }
}
