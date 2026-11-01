public class ProdukLatihan {
    public static void main(String[] args) {
        Produk p = new Produk("09-milo","milo",70000,50);

        System.out.println("Kode produk : "+p.getKodeMenu());
        System.out.println("Nama produk : "+p.getNamaMenu());
        System.out.println("Harga       : "+p.getHarga());
        System.out.println("Stok        : "+p.getStok());

        p.setHarga(20000);
        p.setHarga(-90000);
        p.tambahStok(50);
        p.tambahStok(-20);
        p.kurangiStok(20);
        p.kurangiStok(100);
        p.kurangiStok(40);

    }
}