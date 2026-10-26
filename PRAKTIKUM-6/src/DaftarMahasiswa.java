public class DaftarMahasiswa {
    public static void main(String[] args){
        Mahasiswa[] daftar = new Mahasiswa[3];

        daftar[0]=new Mahasiswa("Siti","205678945",3.8);
        daftar[1]=new Mahasiswa("Budi","205678990",3.0);
        daftar[2]=new Mahasiswa("Asep","205678911",4.0);

        for(Mahasiswa m:daftar ){
            m.tampilkanData();
            System.out.println("---");
        }
        int jumlahCumlaude = 0;
        for(Mahasiswa m:daftar){
            if(m.isCumlaude()){
                jumlahCumlaude++;
            }
        }
        System.out.println("Jumlah mahasiswa cumlaude : "+jumlahCumlaude);
    }
}
