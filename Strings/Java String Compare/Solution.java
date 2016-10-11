import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Collections;

public class Solution {
    static ArrayList<String> resultList= new ArrayList<String>();
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String in=s.nextLine();
        int k=s.nextInt();
        substrings(in,0,1,k);
        Collections.sort(resultList);
        System.out.println(resultList.get(0));
        System.out.println(resultList.get(resultList.size()-1));
    }
    static void substrings(String in,int start, int end,int k){
        if(start == in.length() && end == in.length()){
            return;
        }else{
            if(end == in.length()+1){
                substrings(in,start+1,start+1,k);
            }else{
                String sb=in.substring(start, end);
                if(sb.length()==k){
                    resultList.add(sb);
                }
                substrings(in,start, end+1,k);
            }
        }
    }
}