public class Class04 {
    public static void main(String[] argv) {
        int num = 12;
        int den[] = { 12, 4, 3, 13, 2, 4 };
        for (int i = 0; i < 10; i++) {
            // 用if-else 敘述 使當這兩種錯誤有任何一種發生 停止執行
            if (den[i] == 0) {
                System.out.println("程式執行有誤(除數為0)");
                break;// 停止
            } else {
                if (den[i] > 12) {
                    System.out.println("程式執行有誤(陣列索引值超出了範圍)");
                    break;
                } else {
                    System.out.println("ans = " + num / den[i]);
                }
            }
        }
    }
}