package study;

import java.util.Scanner;

public class Num2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        int j;
        for (i = 1; i < n+1; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}