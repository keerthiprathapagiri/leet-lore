// Question:
// Write a Java program to count the number of vowels, consonants,
// numbers, and special characters present in a given string.
//
// Input:
// asdfwjladpm2183!@!&#^*sanf
//
// Expected Output:
// vowels=1
// consonents=19
// numbers=4
// spl symbols=8

import java.util.*;

public class Main {
    public static void main(String[] args) {
      String s1="asdfwjladpm2183!@!&#^*sanf";
      char[] ch2=s1.toCharArray();
      int v=0;
      int c=0;
      int spl=0;
      int n=0;
      String ch1=s1.toLowerCase();
      for(char ch:ch1.toCharArray()){
        if(Character.isLetter(ch)){
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            v++;
          }
          else{
            c++;
          }

        }
        if(ch >='0' && ch<='9'){
          n++;
        }
        else{
          spl++;
        }
      }
      System.out.println("vowels="+v);
      System.out.println("consonents="+c);
      System.out.println("numbers="+n);
      System.out.println("spl symbols="+spl);
    }
}
