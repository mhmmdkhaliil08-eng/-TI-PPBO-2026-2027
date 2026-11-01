public class Siswa {
    private double nilai;

    public Siswa(double nilai){
        this.nilai=nilai;
    }
    public double getNilai(){
        return nilai;
    }
    public void setNilai(double nilai){
        if(nilai >= 0 &&  nilai <= 100){
            this.nilai=nilai;
        }else {
            System.out.println("Nilai harus dalam rentang 0-100");
        }
    }
    public String getNilaiHuruf(double nilai){
        String huruf;
        if (nilai >= 90){
            huruf = "A";
        } else if (nilai >= 80 && nilai <= 89) {
            huruf="B";
        } else if (nilai >= 65 && nilai <= 79) {
            huruf = "C";
        } else if (nilai >= 50 && nilai <= 64) {
            huruf="D";
        }
        else {
            huruf = "E";
        }
        return huruf;
    }
}
