package study;

import java.io.*;

public class Num2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");
        int h = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        if (m >= 45) {
            m-= 45;
        }
        else {
            int diff = 45 - m;
            m = 60 - diff;
            if (h != 0) h -= 1;
            else h = 23;
        }
        bw.write(h + " " + m);

        bw.flush();
        br.close();
        bw.close();
    }
}
