package Inter.arrays;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 11/11/15
 * Time: 11:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class Multiple {

    public static void main (String[] arr){
        System.out.println("o(n2)");
        int[] array = {3,8,4,7};
        //int[] result = new int[array.length];
        int[] result = {1,1,1,1};// new int[array.length];
        for (int i=0; i< array.length; i++){
            System.out.println(array[i]);
            for (int j=0; j<array.length; j++){

                if (i!=j){

                    result[i] = result[i] * array[j];
                }
            }
        }
        System.out.println(Arrays.toString(result));

        System.out.println("o(2n)");
        System.out.println(Arrays.toString(array));
        int[] leftOfMe = new int[array.length];
        int[] rightOfMe = new int[array.length];
        result = new int[array.length];
        int multiple = 1;
        int multiple2 = 1;

        for (int i=0; i< array.length; i++){
            leftOfMe[i] = multiple;
            multiple = multiple * array[i];
            rightOfMe[array.length-1-i] = multiple2;
            multiple2 = multiple2 * array[array.length-1-i];
        }
        System.out.println(Arrays.toString(leftOfMe));
        System.out.println(Arrays.toString(rightOfMe));
        for (int i=0; i< array.length; i++){
            result[i] = leftOfMe[i] * rightOfMe[i];
        }
        System.out.println(Arrays.toString(result));

        System.out.println("another option o(2n)");
        int[] products = new int[array.length];
        multiple = 1;
        System.out.println(Arrays.toString(array));
        for (int i=0; i< array.length; i++){
            products[i] = multiple;
            multiple *= array[i];
        }
        System.out.println(Arrays.toString(products));
        multiple = 1;
        for (int i=0; i< array.length; i++){
            products[array.length-1] = products[array.length-1] * multiple;
            multiple = multiple * array[array.length-1];
        }
        System.out.println(Arrays.toString(result));



    }
}
