import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int[] A;
    public static   int m;
    public static int n;
    public static boolean[] visitedArray;
    private static boolean result=false;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for (int i= 0; i < T; i++) {
            n = sc.nextInt();
            A= new int[n];
            visitedArray= new boolean[n];
            Arrays.fill(visitedArray,false);
            m = sc.nextInt();
            for (int j = 0; j < n; j++) {
                A[j]= sc.nextInt();
            }
            int temp =0;
            result=false;
            isPossible(temp);
            if(result) 
                System.out.println("YES");
            else 
                System.out.println("NO");
        }

    }
private static void isPossible( int i) {
    if(i>n || i+m >= n || i==n-1){
        result =true;
        return; 
    }
    if(visitedArray[i] == true){
        return;
    }
    visitedArray[i]= true;
    if (i+1 < n && A[i+1]==0){
        isPossible(i+1);            
    }
    if (i-1>=0 && A[i-1]==0){
    isPossible(i-1);
    }
    if(i+m < n && A[i+m]==0){
        isPossible(i+m);
    }

    }
}