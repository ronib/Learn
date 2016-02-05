package Inter.arrays;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 11/17/15
 * Time: 4:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class StockDiff {

    public static void main(String[] args){

        int[] shares = {2, 3, 10, 6, 4, 8, 1};
        int maxDiff = 0;
        for (int i=0; i<shares.length; i++){
//            System.out.println(shares[i]);
            for (int j=i+1; j<shares.length; j++){
                if (shares[i] < shares[j]){
                    int currDiff = Math.abs(shares[i] - shares[j]);
                    if (maxDiff < currDiff){
                        maxDiff = currDiff;
                    }
                }
            }
        }
        System.out.println(maxDiff);

        maxDiff = 0;
        int minSoFar = shares[0];
        for (int i=1; i<shares.length; i++){
//            System.out.println(shares[i]);
            if (shares[i] < minSoFar){
                minSoFar = shares[i];
            }
            if (minSoFar < shares[i]){
                int currDiff = Math.abs(minSoFar - shares[i]);
                if (maxDiff < currDiff){
                    maxDiff = currDiff;
                }
            }
        }
        System.out.println(maxDiff);





    }




}
