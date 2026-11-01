public class SiswaLatihan {
    public static void main(String[] args){
        Siswa s = new Siswa(70);
        System.out.println("Nilai Siswa : "+s.getNilai());

        s.setNilai(80);
        System.out.println("Nilai Siswa(baru) : "+s.getNilai());
        s.setNilai(120);


        System.out.println("Huruf yang didapat : "+s.getNilaiHuruf(97));
    }
}
