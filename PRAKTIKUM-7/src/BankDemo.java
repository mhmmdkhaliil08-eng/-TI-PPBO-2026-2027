public class BankDemo {
    public static void main(String[] args){
        RekeningBank rek = new RekeningBank("12347","Sibro",8000000);
        rek.setor(50000);
        rek.tarik(400000);
        rek.tarik(9000000);
        rek.setor(-1000);
    }
}
