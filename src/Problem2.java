/**
 * Created by Ameya Singh on 12/20/2016.
 */

import java.io.*;
import java.util.*;

public class Problem2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("blocks.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int lines = Integer.parseInt(st.nextToken());

        String[][] words = new String[lines][];
        for (int i = 0; i < lines; i++) {
            st = new StringTokenizer(br.readLine());
            words[i] = new String[2];
            words[i][0] = st.nextToken();
            words[i][1] = st.nextToken();
        }

        int[] output = getOutput(words);

        for (int i : output) {
            pw.println(i);
        }

        pw.close();
    }

    static int[] getOutput(String[][] wordsArray) {
        int[] out = new int[26];
        for (String[] words : wordsArray) {
            int[] boardLetters = new int[26];
            for (String word : words) {
                int[] wordLetters = new int[26];
                char[] ch = word.toCharArray();
                for (char c : ch) {
                    int temp = (int) c;
                    if (temp <= 122 & temp >= 97) {
                        int letter = temp - 97;
                        wordLetters[letter] = wordLetters[letter] + 1;
                    }
                }
                for (int i = 0; i < 26; i++) {
                    if (boardLetters[i] < wordLetters[i]) {
                        boardLetters[i] = wordLetters[i];
                    }
                }
            }
            for (int i = 0; i < 26; i++) {
                out[i] = out[i] + boardLetters[i];
            }
        }
        return out;
    }
}
