package study;

import java.util.Scanner;

public class Num25238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] temp = str.split(" ");
        double defend = Double.parseDouble(temp[0]);
        double ignore = Double.parseDouble(temp[1]);

        if (defend - (defend * ignore / 100) >= 100) {
            System.out.println(0);
        }
        else System.out.println(1);
    }
}
