/**
 * Created by Ameya Singh on 12/20/2016.
 */
import java.awt.*;
import java.io.*;
import java.util.*;

public class Problem1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("square.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));

        Point[] points = new Point[4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Point point1 = new Point(a,b);
        points[0] = point1;
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        Point point2 = new Point(c,d);
        points[1] = point2;

        st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        Point point3 = new Point(e,f);
        points[2] = point3;
        int g = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        Point point4 = new Point(g,h);
        points[3] = point4;

        int maxDist = 0;

        if (Math.abs(points[0].getX()-points[1].getX()) > maxDist) {
            maxDist = (int) Math.abs(points[0].getX()-points[1].getX());
        }
        if (Math.abs(points[0].getY()-points[1].getY()) > maxDist) {
            maxDist = (int) Math.abs(points[0].getY()-points[1].getY());
        }
        if (Math.abs(points[0].getX()-points[2].getX()) > maxDist) {
            maxDist = (int) Math.abs(points[0].getX()-points[2].getX());
        }
        if (Math.abs(points[0].getY()-points[2].getY()) > maxDist) {
            maxDist = (int) Math.abs(points[0].getY()-points[2].getY());
        }
        if (Math.abs(points[0].getX()-points[3].getX()) > maxDist) {
            maxDist = (int) Math.abs(points[0].getX()-points[3].getX());
        }
        if (Math.abs(points[0].getY()-points[3].getY()) > maxDist) {
            maxDist = (int) Math.abs(points[0].getY()-points[3].getY());
        }
        if (Math.abs(points[1].getX()-points[2].getX()) > maxDist) {
            maxDist = (int) Math.abs(points[1].getX()-points[2].getX());
        }
        if (Math.abs(points[1].getY()-points[2].getY()) > maxDist) {
            maxDist = (int) Math.abs(points[1].getY()-points[2].getY());
        }
        if (Math.abs(points[1].getX()-points[3].getX()) > maxDist) {
            maxDist = (int) Math.abs(points[1].getX()-points[3].getX());
        }
        if (Math.abs(points[1].getY()-points[3].getY()) > maxDist) {
            maxDist = (int) Math.abs(points[1].getY()-points[3].getY());
        }
        if (Math.abs(points[2].getX()-points[3].getX()) > maxDist) {
            maxDist = (int) Math.abs(points[2].getX()-points[3].getX());
        }
        if (Math.abs(points[2].getY()-points[3].getY()) > maxDist) {
            maxDist = (int) Math.abs(points[2].getY()-points[3].getY());
        }

        pw.println((int) Math.pow(maxDist, 2));
        pw.close();
    }
}
