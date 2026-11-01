public class Buku {
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahunTerbit;

    public Buku(String judul,String pengarang,String penerbit,int tahunTerbit){
        this.judul=judul;
        this.pengarang=pengarang;
        this.penerbit=penerbit;
        this.tahunTerbit=tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }
    public  String getPengarang(){
        return pengarang;
    }
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    public String getPenerbit() {
        return penerbit;
    }
    public void setJudul(String judul){
        this.judul=judul;
        System.out.println("judul yang baru adalah : "+judul);
    }
    public void setPengarang(String pengarang){
        this.pengarang=pengarang;
        System.out.println("Pengarang terbaru adalah : "+pengarang);
    }

}
