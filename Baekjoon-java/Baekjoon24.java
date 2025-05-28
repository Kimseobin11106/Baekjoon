import java.util.Scanner;

public class Baekjoon24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        int a = sc.nextInt();

        int[] sub = new int[a];
        int[] num = new int[a];

        int result = 0;

        for (int i = 0; i < sub.length; i++) {
            sub[i] = sc.nextInt();
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < sub.length; i++) {
            result += sub[i] * num[i];
        }


        if (amount == result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
