import java.util.*;

public class Main {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("enter the year");
int a=scan.nextInt();
        if( a%400==0 ){
           System.out.println("it is a leap year");
        }else if (a %100==0){
            System.out .println("it is not leap year");
        }else if (a %4==0){
          System.out.println("it is leap year");
          
        }else{
          System.out.println("it is not leap year");
        }

}
}
