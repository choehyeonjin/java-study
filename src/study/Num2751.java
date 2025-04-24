package study;

import java.io.*;
import java.util.Arrays;

public class Num2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] seq = new int[N];

        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(seq);

        for (int i : seq) {
            bw.write(i + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
