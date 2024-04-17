// problem link
// https://codeforces.com/problemset/problem/318/A

import java.util.*;

public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        if((n+1)/2 >= k){
            System.out.println((2*k) -1);
        }else{
            System.out.println((2*(k-(n+1)/2)));
        }
    }
}
