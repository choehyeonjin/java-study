package study;

import java.io.*;

public class Num17478 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;

    public static void print(int n) throws IOException {
        for (int i = 0; i < n*4; i++) {
            bw.write("_");
        }
    }

    public static void recursive(int n) throws IOException {
        if (n == N) {
            print(n);
            bw.write("\"재귀함수가 뭔가요?\"\n");
            print(n);
            bw.write("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
            print(n);
            bw.write("라고 답변하였지.\n");
            return;
        }
        print(n);
        bw.write("\"재귀함수가 뭔가요?\"\n");
        print(n);
        bw.write("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
        print(n);
        bw.write("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
        print(n);
        bw.write("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");

        recursive(n+1);
        print(n);
        bw.write("라고 답변하였지.\n");
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        recursive(0);

        bw.flush();
        br.close();
        bw.close();
    }
}
