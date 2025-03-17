package study;

import java.io.*;

public class Num1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        if (input.trim().isEmpty()) { // 공백만 있는 경우
            bw.write("0\n");
        }
        else{
            String[] arr = input.split(" ");
            int len = arr.length;
            int realLen = len;

            if (arr[0].isEmpty()) realLen--; // 공백으로 시작
            else if (arr[len - 1].isEmpty()) realLen--; // 공백으로 끝

            bw.write(realLen + "\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
