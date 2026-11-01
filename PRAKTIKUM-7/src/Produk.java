public class Produk {
    private String kodeMenu;
    private String namaMenu;
    private double harga;
    private int stok;

    public Produk(String kodeMenu,String namaMenu,double harga,int stok){
        this.kodeMenu=kodeMenu;
        this.namaMenu=namaMenu;
        this.harga=harga;
        this.stok=stok;
    }
    public String getKodeMenu(){
        return kodeMenu;
    }
    public String getNamaMenu(){
        return namaMenu;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
    public void setHarga(double harga){
        if (harga < 0){
            System.out.println("Harga produk gak boleh minus ");
        }else {
            this.harga=harga;
            System.out.println("Harga produk update : "+harga);
        }
    }
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
            System.out.println("Stok berhasil ditambah. Stok sekarang: " + this.stok);
        } else {
            System.out.println("Error: Jumlah tambahan stok harus lebih dari 0!");
        }
    }
    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Error: Jumlah pengurangan stok harus lebih dari 0!");
        } else if (this.stok - jumlah < 0) {
            System.out.println("Error: Stok tidak mencukupi! Sisa stok saat ini: " + this.stok);
        } else {
            this.stok -= jumlah;
            System.out.println("Stok berhasil dikurangi. Stok sekarang: " + this.stok);
        }
    }
}
