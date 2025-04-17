import java.util.Scanner;

public class Baekjoon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        while (true) {
            a = sc.nextInt();
            if (a > 0) {
                break;
            }
            System.out.println("0보다 큰 숫자 입력");
        }
        while (true) {
            b = sc.nextInt();
            if (b < 10) {
                break;
            }
            System.out.println("10보다 작은 숫자 입력");
        }

        System.out.println(a-b);
    }
}
