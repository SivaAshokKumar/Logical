package Accenture_Originally_Asked_Question;

import java.util.Arrays;

public class ASCII {
    public static void main(String[] args) {
        String s = "ABC";
        //char s1   = 'A';
        //int as = s1;
        //System.out.println(as);
        int result = 0;
        char g[] = s.toCharArray();
        System.out.println(Arrays.toString(g));
        for(int i = 0; i < g.length; i++){
            int ascii = g[i];
            int weight = 1;
            weight = weight * 10;
            result = ascii * weight;
            System.out.println(result);
            //int as[]  =  new as[g.length];
                    ////as[] = g[i];
           // System.out.println(ascii);
           /* for(int j=10; j < 10000000 ; j=j*10){
                System.out.println(ascii * j);
                //break;
                continue;
            }*/
        }
        //int[] ascii = g;
     //   System.out.println("The AsCCI value of" +g + " "+ "is:" +ascii);
      //  System.out.println(Arrays.toString(ascii));
    }
}
