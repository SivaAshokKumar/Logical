package Siva.Java.Practise.GeneralACCENTUREPRACTISE;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static Boolean CheckAnagra(String s1,String s2){
        char[] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
      return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String 1 and S2");
        String S1 = scanner.next();
        String S2 = scanner.next();
        if(CheckAnagra(S1,S2)){
            System.out.println("return True");
        }else {
            System.out.println("False");
        }
    }
}
