public class Main5
{
public static void main(String[]args)
{
int a=4567;
int sum=0;
sum=sum+a%10;
a=a/10;
sum=sum+a%10;
a=a/10;
sum=sum+a%10;
a=a/10;
sum=sum+a;
System.out.println(sum);
}
}
 
