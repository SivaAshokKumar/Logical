package Siva.Java.Practise.GeneralACCENTUREPRACTISE;

public class MaximumSubArray {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5};
        for(int i = 0; i < arr.length -1 ; i++){
            int sum = 0;
            for(int j = i+1 ; j < arr.length-1; j++){
                sum = arr[i] + arr[j];
                int temp = sum;
                if(sum < temp){
                    System.out.println(sum);
                }
                else {
                    System.out.println(temp);
                }
            }
        }
    }
}
