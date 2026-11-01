public class LatihanClass {
    public static void main(String[] args){
        Mahasiswa m1 = new Mahasiswa("siti","234567",3.9);
        m1.setIpk(3.8);
        System.out.println("Ipk sekarang : "+m1.getIpk());
        m1.setIpk(5.0);
        System.out.println("Ipk sekarang : "+m1.getIpk());


    }
}
