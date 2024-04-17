// problem link
// https://codeforces.com/problemset/problem/1807/D


import java.io.*;
import java.util.*;
public class Sample{
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int q = sc.nextInt();
            long[] prefix = new long[n+1];
            for(int i=0;i<n;i++){
                a[i]  = sc.nextInt();
                prefix[i+1] = prefix[i] + a[i];
            }
            while(q-->0){
                int l = sc.nextInt(),r = sc.nextInt(),x = sc.nextInt();
                long add = prefix[n] - (prefix[r]-prefix[l-1]) + (r-l +1)*x;

                System.out.println(add%2==0?"NO":"YES");

            }
        }
    }
}
