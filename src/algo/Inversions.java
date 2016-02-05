package algo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 20/10/14
 * Time: 17:33
 * To change this template use File | Settings | File Templates.
 */
public class Inversions {

    private static final Path path1 = FileSystems.getDefault().getPath("other", "example0.txt");
    private static final Path path2 = FileSystems.getDefault().getPath("other", "example1.txt");
    private static final Path path4 = FileSystems.getDefault().getPath("other", "example2.txt");
    private static final Path path3 = FileSystems.getDefault().getPath("other", "IntegerArray.txt");
    private static int[] integerArray = null;
    private static int counter = 0;

    public static void main(String[] args){

        readArray(path3);

        //System.out.println("brute force Inversions=" + countBruteForce());
        System.out.println("merge sort " + Arrays.toString(integerArray) + "->" + Arrays.toString(doMergeSort(integerArray)));
        //System.out.println("recursions Inversions=" + countRecursive(integerArray));

    }

    private static void readArray(Path path) {
        System.out.println("Reading file");
        Stream<String> lines = null;
        Stream<String> count = null;
        try {
            lines = Files.lines(path, StandardCharsets.UTF_8);
            count = Files.lines(path, StandardCharsets.UTF_8);
            // lambada!
            integerArray = new int[(int) count.count()];
            lines.forEach(line -> process(line));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } finally {
            lines.close();
            count.close();
        }
    }

    private static long countRecursive(int[] integerArray) {

        long inversions;
        if (integerArray.length == 1){
            inversions = 0;
        } else{
            long x = countRecursive(Arrays.copyOfRange(integerArray, 0, integerArray.length / 2));
            long y = countRecursive(Arrays.copyOfRange(integerArray, integerArray.length / 2, integerArray.length));;
            long z = count(integerArray);
            inversions = x + y + z;
        }

        return inversions;

        //long bigO = 0;
    }

    private static long count(int[] integerArray) {

        long inversions = 0;
        long bigO = 0;

//        int[] sortA = Arrays.copyOf({integerArray}}, 0, integerArray.length / 2);
//        int[] sortB = Arrays.copyOf(integerArray, integerArray.length / 2, integerArray.length);
//
//        for (int i = 0; i < integerArray.length; i++ ){
//            //bigO++;
//            if ( integerArray[i] > integerArray[j] ){
//                Inversions++;
//                //System.out.println("(" + integerArray[i] + "," + integerArray[j] + ")" );
//            }
//
//            if (i   )
//
//                if ()
//                if ( integerArray[i] > integerArray[j] ){
//                    Inversions++;
//                    //System.out.println("(" + integerArray[i] + "," + integerArray[j] + ")" );
//                }
//
//                bigO++;
//                long Inversions = 0;
//
//
//                    if      (i > mid)                a[k] = aux[j++];
//                    else if (j > hi)                 a[k] = aux[i++];
//                    else if (less(aux[j], aux[i])) { a[k] = aux[j++]; Inversions += (mid - i + 1); }
//                    else                             a[k] = aux[i++];
//                }
                return inversions;

    }

    private static long countBruteForce() {
        long inversions = 0;
        long bigO = 0;
        for (int i = 0; i < integerArray.length; i++ ){
            //bigO++;
            for (int j = i+1; j < integerArray.length; j++ ){

                if ( integerArray[i] > integerArray[j] ){
                    inversions++;
                    //System.out.println("(" + integerArray[i] + "," + integerArray[j] + ")" );
                }

                bigO++;
            }
        }
        System.out.println("BigO=" + bigO);
        return inversions;
    }

    private static void process(String line) {
        integerArray[counter++] = Integer.parseInt(line);
        //System.out.println(line);
    }

    private static int[] doMergeSort(int[] array) {
        if (array.length == 1){
            return array;
        }
        else{
                int[] left = doMergeSort(Arrays.copyOfRange(array, 0, array.length / 2));
                int[] right = doMergeSort(Arrays.copyOfRange(array, array.length / 2, array.length));
                int[] result = mergeParts(left, right);
                return result;
            }
        }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftCounter = 0;
        int rightCounter = 0;

        for (int i=0; i<(left.length + right.length); i++){

            try{
                if (left[leftCounter] <= right[rightCounter]){
                    result[i] = left[leftCounter];
                    leftCounter++;
                }else{
                    result[i] = right[rightCounter];
                    rightCounter++;
                }
            } catch (Exception e){
                if (rightCounter >= right.length && leftCounter < left.length){
                    result[i] = left[leftCounter];
                    leftCounter++;
                }else if (leftCounter >= left.length && rightCounter < right.length){
                    result[i] = right[rightCounter];
                    rightCounter++;
                }else{
                    System.out.println("Error with arrays counters");
                }
            }
        }

        return result;
    }

}
