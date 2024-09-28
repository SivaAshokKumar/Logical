package Siva.Java.Practise.Searching;

public class BinarySearch {

    public static  int search (int[] arr,int target){

        int start  = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start+end) / 2;
            if(target > arr[mid]){ //Focus on Right Side
                start = mid + 1;
            }
            else if (target<arr[mid]) { //FOCUS ON LEFT SIDE
                end  = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}
