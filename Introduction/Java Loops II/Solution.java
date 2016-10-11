import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            String s="";
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                int result=loopSeries(a,b,j);
                s=s+String.valueOf(result)+" ";
            }
            System.out.println(s);
        }
        in.close();
    }
    public static int loopSeries(int a,int b,int n){
        if(n==0)
            return a+b;
        else
            return (((int)Math.pow(2,n))*b)+loopSeries(a,b,n-1);
    }
}
