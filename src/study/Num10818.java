package study;

import java.io.*;

public class Num10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] num = new int[n];
        int i;

        for (i = 0; i < n; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }

        int max = num[0];
        int min = num[0];
        for (i = 1; i < n; i++) {
            if (num[i] > max) max = num[i];
            if (num[i] < min) min = num[i];
        }
        bw.write(min + " " + max + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
