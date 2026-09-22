// Question:
// Write a Java program to rearrange the characters of a string
// so that all lowercase alphabet characters appear first,
// followed by all '#' characters.
//
// Input:
// ###ab##c##d##e
//
// Expected Output:
// abcde##########

import java.util.*;

public class Main {
    public static void main(String[] args) {
      String s1="###ab##c##d##e";
      System.out.println(s1.replace("#",""));
      System.out.println(s1.replace("#","")+s1.replaceAll("[a-z]",""));
      System.out.println(s1.replaceAll("[a-z]","")+s1.replace("#",""));


      
      
    }
}

