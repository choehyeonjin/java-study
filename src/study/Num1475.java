package study;

import java.io.*;

public class Num1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        char[] chars = String.valueOf(num).toCharArray();
        int[] usage = new int[10];

        for (char aChar : chars) {
            usage[aChar - '0']++;
        }

        int max = 0;
        int maxNum = 0;
        for (int i = 0; i < 10; i++) {
            if (usage[i] > max && i != 6 && i != 9) {
                maxNum = i;
                max = usage[i];
            }
        }

        int sixNine = (usage[6] + usage[9] + 1) / 2;
        if (sixNine > max) max = sixNine;

        bw.write(max + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
