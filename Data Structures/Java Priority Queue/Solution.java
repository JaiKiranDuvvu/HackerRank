import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(String fname,double cgpa,int id) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
   @Override
   public String toString() {
      return "Student :: fname:"+fname+" cgpa:"+cgpa+" token:"+token;
   }
}

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
      PriorityQueue<Student> prq = new PriorityQueue<Student>(totalEvents,
            new Comparator<Student>() {
                @Override
                public int compare(Student student1, Student student2) {
                    if (student1.getCgpa() < student2.getCgpa()) return 1;
                    else if (student1.getCgpa() > student2.getCgpa()) return -1;
                    else {
                        if (!student1.getFname().equals(student2.getFname()))
                        return student1.getFname().compareTo(student2.getFname());
                        else return student1.getToken() - student2.getToken();
                    }
                }
            }
      );
      while(totalEvents>0){
         String event = in.next();
         //Complete your code
         if(event.equals("ENTER")){
             Student s=new Student(in.next(),in.nextDouble(),in.nextInt());
             prq.add(s);
         }
          if(event.equals("SERVED")){
              prq.poll();
          }
         totalEvents--;
      }
      if(!prq.isEmpty()){
          while(!prq.isEmpty())
            System.out.println(prq.poll().getFname()) ; 
      }else{
          System.out.println("EMPTY");
      }
    }
}
