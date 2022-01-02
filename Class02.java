//修改習題1
public class Class02 {
    public static void main(String[] args) {
        int num = 12, den = 0;

        if (den == 0) {
            // 餘數為0跳過除法
            System.out.println("除數為0");
        } else {
            int ans = num / den;
            System.out.println("答案為 =" + ans);
        }

        System.out.println("end of main()!!");
    }
}