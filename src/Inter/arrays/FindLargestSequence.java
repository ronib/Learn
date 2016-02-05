package Inter.arrays;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 1/5/16
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindLargestSequence {

    public static void main(String[] args) {
        int[] series = {2,4,1,2,3,4,8,9};

        int counter = 1;
        int max = 1;
        int start = 0;
        for (int i = 1; i < series.length; i++) {
            if (series[i-1] + 1 == series[i]){
                counter++;

            }else{
                if (max < counter){
                    max = counter;
                    start = i - counter;
                }
                counter = 1;
            }

        }

        System.out.println("start=" + start + " counter=" + max + ". " + series[start] + "-" + series[start+max-1]);
    }
}
