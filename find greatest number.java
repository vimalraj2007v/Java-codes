import java.util.*;

public class Main {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("enter the 1st number");
int a=scan.nextInt();
           System.out.println("enter the 2nd number");
int b=scan.nextInt();
         System.out.println("enter the 3rd number");
int c=scan.nextInt();
if(a>b && a>c) {
 System.out.println("greater numrber is :"+a);
}else if (b>a && b>c){
System.out.println("greater numrber is : "+b);
    
}else{
   System.out.println("greater numrber is : "+c);
}
}
}
