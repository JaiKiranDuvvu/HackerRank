import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                //System.out.println("String ::"+s1);
                int x=sc.nextInt();
                int length=s1.length();
                if(length<15){
                    int Templength=15-length;
                    for(int j=0;j<Templength;j++){
                        s1=s1+" ";
                    }
                }
                System.out.print(s1);
                if(x<10){
                    System.out.println("00"+x);
                }else if(x<100){
                     System.out.println("0"+x);
                }else{
                     System.out.println(x);
                }
            }
            System.out.println("================================");

    }
}
