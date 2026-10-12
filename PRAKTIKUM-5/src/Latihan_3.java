public class Latihan_3 {
    static double konversisuhu(double c){
        return ((c * 9/5)+32);
    }
    static double konversisuhu(double c,String tujuan){
        if(tujuan.equalsIgnoreCase("kelvin")){
            return (c+273.15);
        } else if (tujuan.equalsIgnoreCase("fahreinhit")) {
            return (c * 9/5)+32;
        } else if (tujuan.equalsIgnoreCase("reamur")) {
            return (4*c/5);
        }
        else{
            return c;
        }

    }
    public static void main(String[] args){
        System.out.println("celcius ke fahreinhit = "+konversisuhu(30));
        System.out.println("celius ke skalar tujuan anda = "+konversisuhu(40,"reamur"));
    }
}
