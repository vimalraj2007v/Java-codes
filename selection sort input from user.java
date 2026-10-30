import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
            System.out.println("enter array size:");
      int n =sc.nextInt();

     int[] arr= new int[n];
     for ( int i=0;i<n;i++){
      System.out.println("enter array elements:");
      arr[i]=sc.nextInt();
     }
     for ( int i=0;i<arr.length-1;i++){
      int minIndex=i;
      for( int j=i+1;j<arr.length;j++){
        if (arr[j] < arr[minIndex]){
          minIndex=j;
        }
      }
      int temp=arr[i];
      arr[i]=arr[minIndex];
      arr[minIndex]=temp;
     }
     System.out.println("Sorted Array:");
     System.out.println(Arrays.toString(arr));
    }
}
