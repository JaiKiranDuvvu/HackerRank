
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    public String str="hello world";
    private static Singleton singletonInstance;
    private Singleton(){}
    static Singleton getSingleInstance(){
        if(singletonInstance==null)
        {
            singletonInstance=new Singleton();
        } 
        return singletonInstance;
    }
}
