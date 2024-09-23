package Siva.Java.Practise;

import java.util.Arrays;

public class Two_DArray {
    public static void main(String[] args) {
/*        int[][] a;
        a = new int[3][];
        a[1][3] = 56;
        a[2][3] = 76;*/
        //System.out.println(a[1][1]);
       // System.out.println(Arrays.toString(a));
        /*int a[] = {5,6,78,9,3,23};
        int copyTo = new int[8];*/

                // Declare and initialize a 3D array
                int[][][] array = new int[2][4][2];

                // Initialize the elements of the 3D array
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 4; j++) {
                        for (int k = 0; k < 2; k++) {
                            array[i][j][k] = i + j + k; // Example initialization
                        }
                    }
                }

                // Print the 3D array
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 4; j++) {
                        for (int k = 0; k < 2; k++) {
                            System.out.print(array[i][j][k] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
            }
        }


