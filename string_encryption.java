// Encrypted String Using K Value
// Question:
// Write a Java program to encrypt a given string by adding K positions
// to each alphabet character. If the character goes beyond Z or z,
// it should wrap around to the beginning.
//
// Input:
// String = "Watch"
// K = 92
//
// Expected Output:
// Kohqv

//encrypted question
//acc to k value encrypt the given string by adding 

import java.util.*;

public class Main {
    public static void main(String[] args) {
      String n="Watch";
      int k=92;
      k=k%26;
      StringBuilder result=new StringBuilder();
      for(char c:n.toCharArray()){
        if(Character.isLetter(c)){
          if(Character.isUpperCase(c)){
            char base='A';
            char encrypted=(char)((c-base+k)%26+base);
            result.append(encrypted);
          }
          else{
            char base='a';
            char encrypted=(char)((c-base+k)%26+base);
            result.append(encrypted);
          }}
        else{
            result.append(c);
        }
        

      }
        
    System.out.print(result);
    }
}
