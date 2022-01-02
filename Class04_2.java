public class Class04_2 {
    public static void main(String[] argv) {
        int num = 12;
        int den[] = { 12, 4, 3, 13, 2, 4 };
        for (int i = 0; i < 10; i++) {
            if (den[i] == 0 || den[i] > 12) { // 用or簡化
                System.out.println("程式執行有誤");
                break;
            } else {
                System.out.println("ans = " + num / den[i]);
            }
        }
    }
}