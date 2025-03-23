package study;

import java.io.*;
import java.util.Arrays;

public class Num10815 {
    public static boolean binarySearch(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] < n) left = mid + 1;
            else if (arr[mid] > n) right = mid - 1;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] temp1 = br.readLine().split(" ");

        int[] card = new int[N];
        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(temp1[i]);
        }
        Arrays.sort(card);

        int M = Integer.parseInt(br.readLine());
        String[] temp2 = br.readLine().split(" ");

        int[] input = new int[M];
        for (int i = 0; i < M; i++) {
            input[i] = Integer.parseInt(temp2[i]);
            if (binarySearch(card, input[i])) bw.write("1 ");
            else bw.write("0 ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
