public class LogikaDemo {
    public static void main(String[] argstring){
        int nilai_ujian = 90;
        int kehadiran = 80;

        if (nilai_ujian >= 75 && kehadiran >= 80){
            System.out.println("lULUS mata kuliah");
        }else{
            System.out.println("TIDAK LULUS mata kuliah");
        }

        boolean punyaKTP=false;
        boolean punyaSIM=true;

        if( punyaKTP || punyaSIM){
            System.out.println("boleh menyewa kendaraan");
        }

        if(!punyaKTP){
            System.out.println("KTP belum tersedia");
        }
    }
}
