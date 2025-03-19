package study;

import java.io.*;

public class Num2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");
        int A = Integer.parseInt(temp[0]);
        int B = Integer.parseInt(temp[1]);
        int V = Integer.parseInt(temp[2]);

        int cnt = (V - B) / (A - B);

        if ((V - B) % (A - B) != 0) {
            cnt++;
        }
        bw.write(cnt + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
