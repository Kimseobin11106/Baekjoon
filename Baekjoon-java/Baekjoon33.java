import java.util.Scanner;

public class Baekjoon33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int cnt = 0;

        int[] num = new int[a];

        for (int i = 0; i< num.length; i++) {
            num[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        for (int j = 0; j< num.length; j++) {

            if (num[j] == v) {
                cnt++;
            }
        }

        System.out.println(cnt);



    }
}
