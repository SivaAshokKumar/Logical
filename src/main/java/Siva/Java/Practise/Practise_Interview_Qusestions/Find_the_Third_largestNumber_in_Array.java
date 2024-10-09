package Siva.Java.Practise.Practise_Interview_Qusestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Find_the_Third_largestNumber_in_Array {



            public static void main(String[] args) {
                int arr[] = {2,3,4,1};
                for(int i = 0; i < arr.length-1; i++){
                    for(int j = i +1; j <arr.length; j++){
                        for(int k = j+1 ; k < arr.length; k++){
                            if(arr[k] > arr[i] && arr[k] > arr[j]){
                                System.out.print(k);
                            }
                        }
                    }
                }
               // return -1;
            }
}
 /*
        //Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i +1; j <arr.length; j++){
                for(int k = j+1 ; k < arr.length; k++){
                    if(arr[k] > arr[i] && arr[k] > arr[j]){
                        return k;
                    }
                }
            }
        }
        return -1; */
/*public static void main(String[] args) {
        int arr[] = {2, 5, 1, 7, 4};
        //Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n ; j++) {
                for (int k = i + 1; k < n ; k++) {
                    if ((arr[k] > arr[i]) && (arr[k] > arr[j])) {
                        System.out.print(arr[k]);
                        break;
                    }
                }
            }
        }
    }*/
