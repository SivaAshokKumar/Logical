package Siva.Java.Practise.GeneralACCENTUREPRACTISE;

import java.util.Arrays;
import java.util.Scanner;

public class HikingTrail {
    public static void selectsort(int arrr[]){
        for (int i = 0;  i < arrr.length; i++){
            int min = i;
            for (int j = i+1; j < arrr.length; j++){
                if(arrr[j] < arrr[min]){
                    min = j;
                }
            }
            int temp = arrr[i];
            arrr[i] = arrr[min];
            arrr[min] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int ArrSize =  scanner.nextInt();
        int arr[] = new int[ArrSize];
        for(int i = 0; i <= ArrSize-1; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        selectsort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[ArrSize - 1]);

    }
}
