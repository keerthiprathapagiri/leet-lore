// Question:
// Write a Java program to remove characters that occur more than twice
// consecutively in a string, so that each character can appear a maximum
// of two times consecutively.
//
// Input:
// aaabbc
//
// Expected Output:
// aabbc



import java.util.*;

public class Main {
    public static void main(String[] args) {
      String s="aaabbc";
      int count=1;
      StringBuilder s1=new StringBuilder();
      for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)==s.charAt(i+1)){
          if(count>=2){
            continue;
          }
          else{
            count++;
            s1=s1.append(s.charAt(i));
            count=1;
          }}
        else{
          s1=s1.append(s.charAt(i+1));
          count=1;
        }
        
          }
        
        System.out.print(s1);
        }
      
}
