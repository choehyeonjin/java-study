package study;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Num1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }
        // 커스텀 정렬
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    for (int i = 0; i < s1.length(); i++) {
                        if (s1.charAt(i) == s2.charAt(i))
                            continue;
                        return s1.charAt(i) - s2.charAt(i);
                    }
                }
                return s1.length() - s2.length();
            }
        });
        // 중복 삭제
        for (int i = 0; i < list.size(); i++) {
            String current = list.get(i);
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j).equals(current)) {
                    list.remove(j);
                }
            }
        }

        for (String s : list){
            bw.write(s + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
