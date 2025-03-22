package study;

import java.io.*;

public class Num2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine().trim());
        int B = Integer.parseInt(br.readLine().trim());
        int C = Integer.parseInt(br.readLine().trim());

        int num = A * B * C;
        char[] chars = String.valueOf(num).toCharArray();
        int[] usage = new int[10];

        for (char aChar : chars) {
            usage[aChar - '0']++;
        }

        for (int cnt : usage) {
            bw.write(cnt + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
