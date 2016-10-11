import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<ArrayList<Integer>> inputList=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> inputSubList=null;
        for(int i=0;i<n;i++){
            inputSubList=new ArrayList<Integer>();
            int d=s.nextInt();
            for(int j=0;j<d;j++){
                inputSubList.add(s.nextInt());
            }
            inputList.add(inputSubList);
        }
        int q=s.nextInt();
        for(int i=0;i<q;i++){
            int x=s.nextInt();
            int y=s.nextInt();
            ArrayList<Integer> newList=inputList.get(x-1);
            if(newList.size() >= y)
                System.out.println(newList.get(y-1));
            else
              System.out.println("ERROR!");  
        }
        s.close();
    }
}