package Siva.Java.Practise.GeneralACCENTUREPRACTISE;

import java.util.Scanner;

public class RepeatTHESTRING {
    public static void main(String args[]){
        Scanner scanner =  new Scanner(System.in);
        int a = scanner.nextInt();
        String r = scanner.next();
        //int a = 4;

        //String r = "abc";
        for (int i = 0; i < a; i++){
            System.out.print(r+" ");
        }
    }
}
