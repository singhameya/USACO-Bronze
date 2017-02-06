/**
 * Created by Ameya Singh on 12/20/2016.
 */
import java.io.*;
import java.util.*;

public class Problem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("cowsignal.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cowsignal.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String output = "";
        StringBuilder outputBuilder = new StringBuilder(y*k);
        for (int i = 0; i < y; i++) {
            String line = br.readLine();
            char[] ch = line.toCharArray();
            StringBuilder out = new StringBuilder(x*k);
            for (int j = 0; j < x; j++) {
                if (ch[j] == 'X') {
                    for (int l = 0; l < k; l++) {
                        out.append('X');
                    }
                }
                if (ch[j] == '.') {
                    for (int l = 0; l < k; l++) {
                        out.append('.');
                    }
                }
            }
            for (int j = 0; j < k; j++) {
                outputBuilder.append(out.toString()).append("\n");
            }
        }

        output = outputBuilder.toString();

        pw.print(output);
        pw.close();
    }
}
