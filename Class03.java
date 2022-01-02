public class Class03 {
    public static void main(String[] argv) {
        // try-catch-finally
        try {
            int num = 12, den = 0;
            int ans = num / den;
            System.out.println("ans = " + ans);
        } catch (ArithmeticException e) {
            System.out.println("除數為0");
        } finally {
            System.out.println("end of main()!!");
        }
    }
}
