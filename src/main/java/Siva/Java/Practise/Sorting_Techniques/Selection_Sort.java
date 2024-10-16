package Siva.Java.Practise.Sorting_Techniques;
import java.util.Date;
public class Selection_Sort {

    public static void SelectioAn(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int minindex = i;
            for (int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
    }
}
