public class BreakContinoueDemo {
    public static void main(String[] args){
        System.out.println("menggunakan Break:");
        for(int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Menggunakn continoue:");
        for(int j=1;j<=10;j++){
            if(j % 2 == 0){
                continue;
            }
            System.out.println(j);
        }
    }
}
