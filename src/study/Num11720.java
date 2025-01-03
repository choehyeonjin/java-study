package study;

import java.util.Scanner;

public class Num11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(str.substring(i,i+1));
        }
        System.out.println(sum);
    }
}
