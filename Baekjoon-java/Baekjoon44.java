import java.util.Scanner;

public class Baekjoon44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        String number = sc.next();

        int sum = 0;

        for (int i = 0; i < len; i++) {
            sum += number.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}