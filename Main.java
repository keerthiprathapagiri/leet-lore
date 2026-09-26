// Base Conversion
//
// Question:
// Write a Java program to convert a decimal number into a given base,
// where values 0–9 are represented by digits and values 10 onwards
// are represented by A, B, C, etc.
//
// Input:
// Number = 718
// Base = 12
//
// Expected Output:
// 4BA

//converting number to 10-A , 11-B and numbers 0-9
import java.util.*;

public class Main {
    public static void main(String[] args) {
      int n=12;
      int num=718;
      int rem =0;
      StringBuilder res=new StringBuilder();
      while(num>0){
        rem=num%n;
        if(rem<=9){
          res=res.append(rem);
        }
        else{
          res=res.append((char)('A'+(rem-10)));
        }
        num=num/n;
      }
      System.out.print(res.reverse());
      
    }
}
