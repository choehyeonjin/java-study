package study;

import java.util.Scanner;

public class Num25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int num = scanner.nextInt();
        scanner.nextLine();

        int realSum = 0;
        for (int i = 0; i < num; i++) {
            String temp = scanner.nextLine();
            String[] receipt = temp.split(" ");
            realSum += Integer.parseInt(receipt[0]) * Integer.parseInt(receipt[1]);
        }
        if (sum == realSum) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
