import java.util.HashSet;
import java.util.Scanner;

public class Baekjoon38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>(); // 중복된 값 제거

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            set.add(num % 42); // 나머지 값 추가
        }

        System.out.println(set.size());

        sc.close();
    }
}