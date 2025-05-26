import java.util.Scanner;

public class Baekjoon16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int answer = (a%4==0 && a%100 !=0 || a%400 == 0)? 1 : 0;

        System.out.println(answer);
    }
}
