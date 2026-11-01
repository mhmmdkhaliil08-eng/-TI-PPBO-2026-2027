public class Waktu {
    private double jam;
    private double menit;
    private double detik;

    public Waktu(double jam,double menit,double detik){
        this.jam=jam;
        this.menit=menit;
        this.detik=detik;
    }
    public double getJam(){
        return jam;
    }
    public double getMenit(){
        return menit;
    }
    public double getDetik(){
        return detik;
    }

    public void setJam(double jam){
        if(jam >= 0 && jam <= 23){
            this.jam=jam;
        } else {
            System.out.println("Jamnya Tidak Valid");
        }
    }
    public void setMenit(double menit){
        if (menit >= 0 && menit <= 59){
            this.menit=menit;
        }else {
            System.out.println("Menitnya Tidak Valid");
        }
    }
    public void setDetik(double detik){
        if (detik >= 0 && detik <= 59){
            this.detik=detik;
        }else {
            System.out.println("DEtiknya tidak Valid");
        }
    }

    public static void main(String[] args){
        Waktu w =new Waktu(20,45,50);
        System.out.println("Jam sekarang adalah : "+w.getJam()+"."+w.getMenit()+"."+w.getDetik());

        w.setJam(13);
        w.setMenit(20);
        w.setDetik(59);

        System.out.println("Jam sekarang(baru) adalah : "+w.getJam()+"."+w.getMenit()+"."+w.getDetik());

        w.setJam(13);
        w.setMenit(80);
        w.setDetik(60);

        System.out.println("Jam sekarang(baru lagi) adalah : "+w.getJam()+"."+w.getMenit()+"."+w.getDetik());

    }

}
