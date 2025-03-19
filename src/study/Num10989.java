package study;

import java.io.*;
import java.util.Arrays;

public class Num10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            arr[i] = temp;
        }
        Arrays.sort(arr);
        for (int num : arr) {
            bw.write(num + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
