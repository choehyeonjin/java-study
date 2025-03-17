package study;

import java.io.*;

public class Num2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        String[] temp = br.readLine().split(" ");
        int[] card = new int[N];
        int i, j, k;
        for (i = 0; i < N; i++) {
            card[i] = Integer.parseInt(temp[i]);
        }

        int max = 0;
        for (i = 0; i < N - 2; i++) {
            for (j = i + 1; j < N - 1; j++) {
                for (k = j + 1; k < N; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if (sum <= M && sum > max) {
                        max = sum;
                    }
                }
            }
        }
        bw.write(max + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
