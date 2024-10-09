/*
package Siva.Java.Practise.Arrays_Practise;

import java.util.Arrays;

public class TwoSUm_Leetcode {

        //THE MISTAKE IN THE BELOW CODE IS NOT USING NESTED LOOP
      */
/*  if(target > 0){
            for(int i =0 ;i < arr.length - 1; i++){
                int sum =  arr[i]+arr[i+1];
                if(sum == target){
                    //System.out.println(arr[i]+" "+arr[i+1]);
                    System.out.println(i+ " " + (i+1) );
                                    }
            }
        }*//*

        public static int TwoSUm(int arr[], int target){
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int sum = arr[i] + arr[j];
                    if (sum == target) {
                       // return new int[] {i, j};
                    }
                }
            }
           // return new int[]{};
        }
    public static void main(String[] args) {
        int arr[] = {4,7,2,8,6};
        int tar = 8;
        //int[] f =  TwoSUm(arr, tar);
        System.out.println(f);

    }
}
*/
