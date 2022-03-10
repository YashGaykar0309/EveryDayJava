//        Bearland has infinitely many cities, numbered starting from 1. Some pairs of cities are connected with bidirectional roads:
//        There are roads 1-2, 3-4, 5-6, 7-8, and so on (there is a road between cities 2*i+1 and 2*i+2 for every non-negative integer i).
//        There are roads 1-3, 3-5, 5-7, 7-9, ... (between every two consecutive odd numbers).
//        There are roads 2-4, 4-6, 6-8, 8-10, ... (between every two consecutive even numbers).
//        This is how the first few cities and roads between them look like:
//        You are given Q queries. In each query, for the given pair of different cities a and b,
//        you should check if there is a road between them. For each query, print "YES" or "NO" accordingly.

import java.lang.*;
import java.util.Scanner;

public class P3BearAndLadder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        for(int i=0;i<a;i++) {
            long x = sc.nextInt();
            long y = sc.nextInt();
            boolean road=false;
            long temp;

            if (x >= 0 && y >= 0) {
                if (x > y) {
                    temp = y;
                    y = x;
                    x = temp;
                }
                if (x % 2 == 1 && y == x + 1) {
                    road = true;
                } else if (y - x == 2) {
                    road = true;
                }
            }

            if (road == true) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }
        }
    }
}
