import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year),Integer.parseInt(month)-1,Integer.parseInt(day));
        int calDate=cal.get(Calendar.DAY_OF_WEEK);
        if(calDate == Calendar.SUNDAY){
            System.out.println("SUNDAY");
        }else if(calDate == Calendar.MONDAY){
            System.out.println("MONDAY");   
        }else if(calDate == Calendar.TUESDAY){
            System.out.println("TUESDAY"); 
        }else if(calDate == Calendar.WEDNESDAY){
            System.out.println("WEDNESDAY"); 
        }else if(calDate == Calendar.THURSDAY){
            System.out.println("THURSDAY"); 
        }else if(calDate == Calendar.FRIDAY){
            System.out.println("FRIDAY"); 
        }else if(calDate == Calendar.SATURDAY){
            System.out.println("SATURDAY"); 
        }
    }
}
