package study;

import java.io.*;
import java.util.Arrays;

public class Num2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] height = new int[9];
        for (int i = 0; i < 9; i++) {
            height[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(height);

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                int[] newHeight = new int[7];
                int index = 0;

                for (int k = 0; k < 9; k++) {
                    if (k != i && k!= j) {
                        newHeight[index++] = height[k];
                    }
                }
                int sum = 0;
                for (int n : newHeight) {
                    sum += n;
                }
                if (sum == 100) {
                    for (int n : newHeight) {
                        bw.write(n + "\n");
                    }
                    bw.flush();
                    br.close();
                    bw.close();
                    return;
                }
            }
        }
    }
}
