package Nov_exercises.exe_18112024;

public class CustomException {
    public static void main(String[] args) throws Exception {
        Bank1 sbi = new Bank1("INR",100);
        Bank1 icici = new Bank1("INR",123);
        System.out.println(sbi.add(icici));

        Bank1 jp_chase = new Bank1("USD",100);
        // 100 + 100*85 = 8600
        System.out.println(sbi.add(jp_chase));

    }
}
