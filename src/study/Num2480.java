package study;

import java.util.Scanner;

public class Num2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        String[] dice = temp.split(" ");

        int[] arr = new int[3];
        int i;
        for (i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(dice[i]);
        }

        int cnt = 0;
        int same = 0;
        if (arr[0] == arr[1]) {
            same = arr[0];
            cnt = 2;
            if (arr[2] == same) cnt = 3;
        }
        else if (arr[0] == arr[2]) {
            same = arr[0];
            cnt = 2;
        }
        else if (arr[1] == arr[2]) {
            same = arr[1];
            cnt = 2;
        }

        int prize = 0;
        if (cnt == 0) {
            int max = arr[0];
            for (i = 1; i < 3; i++) {
                if (arr[i] > max) max = arr[i];
            }
            prize = max * 100;
        }
        else if (cnt == 2) {
            prize = 1000 + same * 100;
        }
        else if (cnt == 3) {
            prize = 10000 + same * 1000;
        }

        System.out.println(prize);
    }
}
