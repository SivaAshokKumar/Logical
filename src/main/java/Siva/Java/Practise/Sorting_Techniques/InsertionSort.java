package Siva.Java.Practise.Sorting_Techniques;

public class InsertionSort {
    public static void InsertSorting(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while ( j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }
/*
    public static void main(String[] args) {
        int arr1[] = {2,4,532,22,89,2321};
        new InsertionSort(arr1);
    }*/
}
