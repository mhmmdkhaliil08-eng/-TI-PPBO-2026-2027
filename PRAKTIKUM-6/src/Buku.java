public class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahunTerbit;

    public Buku(String judul,String pengarang,String penerbit,int tahunTerbit){
        this.judul=judul;
        this.pengarang=pengarang;
        this.penerbit=penerbit;
        this.tahunTerbit=tahunTerbit;
    }
    public boolean terbit(){
        return tahunTerbit>2015;
    }
    public void tampil(){
        System.out.println("Judul       : "+judul+"\n"+
                           "Pengarang   : "+pengarang+"\n"+
                           "Penerbit    : "+penerbit+"\n"+
                           "TahunTerbit :"+tahunTerbit);
        System.out.println();
    }
}
