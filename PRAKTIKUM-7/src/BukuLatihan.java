public class BukuLatihan {
    public static void main(String[] args){
        Buku b = new Buku("Hidup Sekali","Bocah","Gramedia",2000);
        System.out.println("Judul Buku : "+b.getJudul());
        System.out.println("Pengarang  : "+b.getPengarang());
        System.out.println("Penerbit   : "+b.getPenerbit());
        System.out.println("Tahun Tebit: "+b.getTahunTerbit());

        b.setJudul("apa aja");
        b.setPengarang("Bujang");


    }
}
