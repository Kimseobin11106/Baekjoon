import java.util.Scanner;

public class Baekjoon34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] num = new int[n];

        for (int i = 0; i< num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int j = 0; j< num.length; j++) {
            if (num[j] < x) {
                System.out.print(num[j] + " ");
            }
        }





    }
}

