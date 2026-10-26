public class Latihan {
    public static void main(String[] args){
        System.out.println("======Latihan nomor 1=======");
        Buku b1= new Buku("Pulang","Tere liye","Gramedia",2015);
        Buku b2= new Buku("Para pemimpi","Andrea hirata","Gramedia",2016);

        System.out.println("Judul : "+b1.judul+"\n"+"Pengarang : "+b1.pengarang+"\n"+"Penerbit : "+b1.penerbit);
        System.out.println("======");
        System.out.println("Judul     : "+b2.judul+"\n" +
                           "Pengarang : "+b2.pengarang+"\n" +
                           "Penerbit  : "+b2.penerbit);

        System.out.println("========latihan nomor 2=======");

        Persegi p1=new Persegi(4);
        Persegi p2=new Persegi(5);
        System.out.println("Luas persegi adalah = "+p1.hasil()+"\n"+
                           "Keliling persegi adalah = "+p1.kelilingHasil());

        System.out.println("Luas persegi adalah = "+p2.hasil()+"\n"+
                "Keliling persegi adalah = "+p2.kelilingHasil());

        System.out.println("=========Latihan nomor 3=======");
        Produk pr1=new Produk();
        Produk pr2=new Produk();
        pr1.nama="sirup";
        pr1.harga=20000;
        pr2.nama="Tas";
        pr2.harga=200000;

        System.out.println("Nama Produk : "+pr1.nama);
        System.out.println("Harga       : "+pr1.harga);
        System.out.println("Apakah mahal"+"("+pr1.nama+")"+": "+pr1.isMahal(pr1.harga));

        System.out.println("Nama Produk : "+pr2.nama);
        System.out.println("Harga       : "+pr2.harga);
        System.out.println("Apakah mahal"+"("+pr2.harga+")"+": "+pr2.isMahal(pr2.harga));

        System.out.println("======Latihan nomor 4=======");
        Buku[] bukus=new Buku[4];
        bukus[0]=new Buku("Pergi","Tere liye","Gramedia",2014);
        bukus[1]=new Buku("sarah","Hanum & Rangga","Kompas",2020);
        bukus[2]=new Buku("Kudasai","Bryan krishna","erlangga",2021);
        bukus[3]=new Buku("Bandung dipagi hari","Briyan krishna","Kompas",2022);

        for(Buku b : bukus){
            if(b.terbit()){
                b.tampil();
            }
        }
        System.out.println("=====Latihan nomor 5======");
        Persegi[] persegis = new Persegi[4];

        persegis[0]=new Persegi(4);
        persegis[1]=new Persegi(5);
        persegis[2]=new Persegi(7);
        persegis[3]=new Persegi(8);

        double max = 0.0;
        for (Persegi p : persegis){
            System.out.println("sisi "+p.sisi+" luas nya = "+ p.hasil());
            if(max < p.hasil()){
                max = p.hasil();
            }
        }
        System.out.println("Luas terbesar adalah = "+max);



    }
}
