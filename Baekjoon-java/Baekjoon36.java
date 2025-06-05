import java.util.Scanner;

public class Baekjoon36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[9];

        num[0] = sc.nextInt();

        int max = num[0];
        int cnt = 0;

        for (int i = 1; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] > max) {
                max = num[i];
                cnt = i;
            }
        }

        System.out.println(max);
        System.out.println(cnt+1);
    }
}
