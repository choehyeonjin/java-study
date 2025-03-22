package study;

import java.io.*;
import java.util.Arrays;

public class Num3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] seq = new int[n];
        String[] temp = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(temp[i]);
        }
        int x = Integer.parseInt(br.readLine());

        Arrays.sort(seq);
        int left = 0;
        int right = n - 1;
        int cnt = 0;

        while (left < right) {
            int sum = seq[left] + seq[right];

            if (sum == x) {
                cnt++;
                left++;
                right--;
            }
            else if (sum < x) left++;

            else right--;
        }
        bw.write(cnt + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
