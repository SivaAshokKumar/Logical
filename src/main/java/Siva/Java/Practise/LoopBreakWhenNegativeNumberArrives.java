package Siva.Java.Practise;

import java.util.Scanner;

public class LoopBreakWhenNegativeNumberArrives {
    public static void main(String[] args) {
        //LoopBreakWhenNegativeNumberArrives
      /*  double n,sum = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Nef num to Stop");

        while(true){
            n = scanner.nextDouble();
            if (n<0.0){
                break;
            }
            sum = sum+ n;
        }
        System.out.println(sum);
*/
   //LABELS CONCEPT
        L1:
        for (int i = 1; i <= 5; i++) {
            L2:
            for (int j = 1; j <= 5 ; j++) {
                if(i==3 && j==3)
                    break;
                System.out.print   ("*");

            }
            System.out.println(" ");
        }
    }
}
