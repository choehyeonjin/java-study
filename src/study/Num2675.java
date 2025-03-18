package study;

import java.io.*;

public class Num2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        int i, j, k;
        for (i = 0; i < T; i++) {
            String[] temp = br.readLine().split(" ");
            int R = Integer.parseInt(temp[0]); // 반복 횟수
            String[] S = temp[1].split(""); // 문자열

            for (j = 0; j < S.length; j++) {
                for (k = 0; k < R; k++) {
                    bw.write(S[j]);
                }
            }
            bw.write("\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
