public class LatihanClass {
    public static void main(String[] args){
        Mahasiswa m1=new Mahasiswa();
        Mahasiswa m2=new Mahasiswa("Siti","789045",3.9);
        m2.tampilkanData();
        System.out.println("Cumlaude?"+ m2.isCumlaude());

        System.out.println(m1.nama+" -- "+m1.ipk);
        System.out.println(m2.nama+" -- "+m2.ipk);
    }
}
