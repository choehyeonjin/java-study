package study;

import java.io.*;

public class Num4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            String[] temp = br.readLine().split(" ");
            int N = Integer.parseInt(temp[0]); // 학생 수
            int grades[] = new int[N]; // 학생들의 점수
            int sum = 0; // 점수 합
            for (int j = 0; j < N; j++) {
                grades[j] = Integer.parseInt(temp[j + 1]);
                sum += grades[j];
            }

            double avg = (double) sum / N;
            int num = 0;
            for (int j = 0; j < N; j++) {
                if (grades[j] > avg) num++;
            }

            double pro = (double) num / N * 100;
            bw.write(String.format("%.3f", pro) + "%\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
