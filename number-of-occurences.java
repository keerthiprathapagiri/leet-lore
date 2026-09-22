//Write a program to find the frequency (number of occurrences) of each distinct element in an integer array and display how many times each element is repeated.
//input : {10,20,10,30,10,30,20,30,20}
//output : 10 repeated 3
//20 repeated 3
//30 repeated 3
import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] arr={10,20,10,30,10,30,20,30,20};
      int n=arr.length;
      boolean[] visited=new boolean[n];
      
      System.out.println(Arrays.toString(arr));
      for(int i=0;i<n;i++){
        if (visited[i]){
          continue;
        }
        
        int count=1;

      for(int j=i+1;j<n;j++){
          if (arr[i]==arr[j]){
            count++;
            visited[j]=true;

      }
      }
      System.out.println(arr[i]+"repeated"+count);
   }}
}
