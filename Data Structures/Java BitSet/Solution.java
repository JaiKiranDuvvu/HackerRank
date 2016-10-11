import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static BitSet B1;
    public static BitSet B2;
    public static HashMap<String,BitSet> map;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int M=s.nextInt();
        s.nextLine();
        B1 = new BitSet(N);
        B2 = new BitSet(N);
        map=new HashMap<String,BitSet>();
        map.put("1",B1);
        map.put("2",B2);
        for(int i=0;i<M;i++){
            String operation=s.next();
            int resultSet=s.nextInt();
            int value=s.nextInt();
            if(operation.equals("AND")){
                add(resultSet,value);
            }
            else if(operation.equals("OR")){
                or(resultSet,value);
            }
            else if(operation.equals("XOR")){
                xor(resultSet,value);
            }
            else if(operation.equals("FLIP")){
                flip(resultSet,value);
            }
            else if(operation.equals("SET")){
                set(resultSet,value);
            }
            else{
                System.out.println("Invalid Operation");
            }
            if(i!=M-1)s.nextLine();
        }
        s.close();
    }
    public static void add(int resultSet,int value){
        BitSet k=map.get(String.valueOf(resultSet));
        BitSet l=map.get(String.valueOf(value));
        k.and(l);
        map.put(String.valueOf(resultSet),k);
        printResult();
    }
    public static void or(int resultSet,int value){
        BitSet k=map.get(String.valueOf(resultSet));
        BitSet l=map.get(String.valueOf(value));
        k.or(l);
        map.put(String.valueOf(resultSet),k);
        printResult();
    }
    public static void xor(int resultSet,int value){
        BitSet k=map.get(String.valueOf(resultSet));
        BitSet l=map.get(String.valueOf(value));
        k.xor(l);
        map.put(String.valueOf(resultSet),k);
        printResult();
    }
    public static void flip(int resultSet,int value){
         BitSet k=map.get(String.valueOf(resultSet));
         k.flip(value);
         map.put(String.valueOf(resultSet),k);
         printResult();
    }
    public static void set(int resultSet,int value){
         BitSet k=map.get(String.valueOf(resultSet));
         k.set(value);
         map.put(String.valueOf(resultSet),k);
         printResult();
    }
    public static void printResult(){
        System.out.println(B1.cardinality()+" "+B2.cardinality());
    }
    
}