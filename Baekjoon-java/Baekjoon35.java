import java.util.Scanner;

public class Baekjoon35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];

        num[0] = sc.nextInt();
        int max = num[0];
        int min = num[0];

        for (int i = 1; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (max < num[i]) {
                max = num[i];
            }
            if (min > num[i]) {
                min = num[i];
            }
        }


        System.out.print(min + " " + max);





    }
}

