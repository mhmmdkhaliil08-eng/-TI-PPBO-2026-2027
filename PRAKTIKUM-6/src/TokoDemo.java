import java.util.Scanner;
public class TokoDemo {
    public static  void main(String[] args){
        ProdukTugas[] p = new ProdukTugas[5];
        p[0]=new ProdukTugas("pr-01","Indomie goreng",2500,20);
        p[1]=new ProdukTugas("pr-02","Milku",3000,25);
        p[2]=new ProdukTugas("pr-03","Minyak goreng",25000,15);
        p[3]=new ProdukTugas("pr-04","Golda",5000,30);
        p[4]=new ProdukTugas("pr-05","Magnum",37000,5);

        for(ProdukTugas q : p){
            q.tampilkanData();
            System.out.println("------");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Apakah anda mau beli?(true/false)");
        if(sc.nextBoolean()){
            System.out.println("====nama produk=====");
            for(ProdukTugas q : p){
                q.tampilkanData1();
            }
            sc.nextLine();
            System.out.print("pilih barangnya : ");
            String nama = sc.nextLine();

            boolean ditemukan = false;

            for (ProdukTugas q : p) {
                if (q.nama_produk.equalsIgnoreCase(nama)) {
                    ditemukan = true;

                    String idBarang = q.kode_produk;
                    System.out.println("-> Barang ditemukan! ID/Kode Produk: " + idBarang);

                    System.out.print("Masukkan jumlah yang ingin dibeli: ");
                    int jumlah = sc.nextInt();
                    if (jumlah > q.stock) {
                        System.out.println("\n[TRANSAKSI GAGAL] Stok tidak mencukupi!");
                        System.out.println("Stok yang tersedia hanya: " + q.stock);
                    }
                    else {
                        double totalHarga = q.hitungTotalharga(jumlah);
                        int sisaStok = q.stok(jumlah);

                        System.out.println("\n==== HASIL TRANSAKSI ====");
                        System.out.println("Produk       : " + q.nama_produk);
                        System.out.println("jumlah beli  : " + jumlah);
                        System.out.println("Total Harga  : Rp " + totalHarga);

                        q.stock = sisaStok;

                        break;
                    }
                }
            }
            if (!ditemukan) {
                System.out.println("-> Maaf, nama produk tidak cocok dengan data.");
            }
        }

    }
}
