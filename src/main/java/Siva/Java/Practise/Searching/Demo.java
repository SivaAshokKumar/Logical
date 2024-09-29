package Siva.Java.Practise.Searching;

import Siva.Java.Practise.Sorting_Techniques.BubbleSort;
import Siva.Java.Practise.Sorting_Techniques.InsertionSort;
import Siva.Java.Practise.Sorting_Techniques.Selection_Sort;

import java.util.*;
public class Demo {
    public static void main(String[] args) {

      int[] arr = {1,3,5,6,10,12,15,20,21,28};
      int[] arr1 = {10,5,26,3,15,22};
      int[] arr2 = {5,6,9,4,8,2};
/*        BubbleSort.Bubble(arr2);
        System.out.println(Arrays.toString(arr2));*/
        //LINEAR SEARCH
       /* int target = 9;
        for (int i = 0; i < arr2.length ; i++) {
            if(arr2[i] == target ){
                System.out.println(i);
                return;
            }
        }
*/
        InsertionSort.InsertSorting(arr1);
        System.out.println(Arrays.toString(arr1));

      //  Selection_Sort.SelectioAn(arr1);
        //System.out.println(Arrays.toString(arr1));
      //Sorting_Techniques.se
     //   System.out.println(BinarySearch.search(arr,12));
        //System.out.println(Arrays.toString(SelectioAn(arr)));


    }
}
