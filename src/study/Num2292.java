package study;

import java.io.*;

public class Num2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int shell = 1;
        int room = 1;

        while (N > room) {
            room += shell * 6;
            shell++;
        }
        bw.write(shell + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
