package study;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Num11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        ArrayList<Integer> S = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String[] temp = br.readLine().split(" ");
            String mode = temp[0];

            if (mode.equals("add")) {
                int x = Integer.parseInt(temp[1]);
                if (!S.contains(x)) S.add(x);
            }

            else if (mode.equals("remove")) {
                int x = Integer.parseInt(temp[1]);
                S.remove(Integer.valueOf(x));
            }

            else if (mode.equals("check")) {
                int x = Integer.parseInt(temp[1]);
                if (S.contains(x)) bw.write(1 + "\n");
                else bw.write(0 + "\n");
            }

            else if (mode.equals("toggle")) {
                int x = Integer.parseInt(temp[1]);
                if (S.contains(x)) S.remove(Integer.valueOf(x));
                else S.add(x);
            }

            else if (mode.equals("all")) {
                Integer[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
                S = new ArrayList<>(Arrays.asList(arr));
            }

            else if (mode.equals("empty")) {
                S.clear();
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
