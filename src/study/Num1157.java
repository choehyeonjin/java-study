package study;

import java.io.*;

public class Num1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] alphabet = new int[26];

        int diff = 'a' - 'A';
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ('a' <= c && c <= 'z') { // 소문자면
                c -= diff; // 대문자로 바꾸기
            }
            if ('A' <= c && c <= 'Z') { // 대문자면
                alphabet[c - 'A']++;
            }
        }
        int max = 0;
        boolean isSame = false;
        int mode = 0;
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                mode = i;
                isSame = false;
            }
            else if (alphabet[i] == max) {
                isSame = true;
            }
        }
        if (isSame) bw.write("?\n");
        else bw.write((char) (mode + 'A') + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
