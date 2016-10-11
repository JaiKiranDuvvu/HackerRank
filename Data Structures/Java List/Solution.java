import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int N=Integer.parseInt(s.nextLine());
        List<Integer> L=new ArrayList<Integer>();
        String tempStr=s.nextLine();
        String [] tempSt=tempStr.split(" ");
        for(String sp:tempSt)
            L.add(Integer.parseInt(sp));
        int Q=Integer.parseInt(s.nextLine());
        for(int j=0;j<Q;j++){
            String type=s.nextLine();
            //System.out.println(type);
            if(type.equals("Insert")){
                String str=s.nextLine();
                String[] sArray=str.split(" ");
                int x=Integer.parseInt(sArray[0]);
                int y=Integer.parseInt(sArray[1]);
                L.add(x,y);
            }if(type.equals("Delete")){
                int x_=Integer.parseInt(s.nextLine());
                L.remove(x_);
            }
        }
        for(int i=0;i<L.size();i++)
            System.out.print(L.get(i)+" ");
    }
}
