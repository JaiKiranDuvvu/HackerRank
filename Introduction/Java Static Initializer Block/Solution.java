public static boolean flag=false;
public static int B=0;
public static int H=0;
static {
    Scanner s=new Scanner(System.in);
    B=s.nextInt();
    H=s.nextInt();
    if(B<=0 || H<=0){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    else{
        flag=true;
    }
}
