import java.util.Scanner;

public class Baekjoon20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();

        int result;

        if (d1 == d2 && d2 == d3) {
            result = 10000+d1*1000;
        } else if (d1 == d2 || d1 == d3) {
            result = 1000+d1*100;
        } else if (d2 == d3) {
            result = 1000+d2*100;
        } else {
            if (d1 > d2 && d1 > d3) {
                result = d1*100;
            } else if (d2 > d1 && d2 > d3) {
                result = d2*100;
            } else {
                result = d3*100;
            }
        }

        System.out.println(result);
    }
}
