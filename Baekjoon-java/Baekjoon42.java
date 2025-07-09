import java.util.Scanner;

public class Baekjoon42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        String[] a = new String[len];

        for (int i=0; i < a.length; i++) {
            a[i] = sc.next();
        }

        for (int i=0; i < a.length; i++) {
            char firstChar = a[i].charAt(0);
            char lastChar = a[i].charAt(a[i].length() - 1);
            System.out.println("" + firstChar+lastChar);
        }

    }
}
