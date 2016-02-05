package algo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 30/11/14
 * Time: 14:52
 * To change this template use File | Settings | File Templates.
 */
public class TwoSum {

    private static final Path path1 = FileSystems.getDefault().getPath("other", "2sum.txt");
    private static final Path path2 = FileSystems.getDefault().getPath("other", "example0.txt");
    public static int counter = 0;
    public static int hits = 0;
    private static TreeSet<Long> set = new TreeSet<Long>();
    private static TreeSet<Long> temp = new TreeSet<Long>();

    public static void main(String[] args){

        readArray(path1);
        System.out.println("set size=" + set.size());

        for (int targetValue = -10000; targetValue <= 10000; targetValue++ ){

            if (twoSum(targetValue)){
                hits++;
                //System.out.println("target value! " + targetValue);
            }
        }

        System.out.println("hits=" + hits);
    }

    private static boolean twoSum(int targetValue) {
        boolean result = false;
        for (Long number : set) {

            if (number > 10000 )

            temp = (TreeSet<Long>) set.clone();
            temp.remove(number);
            if (temp.contains(targetValue - number)){
                result = true;
            }else {

            }

        }
        return result;
    }

    private static void readArray(Path path) {
        System.out.println("Reading file");
        Stream<String> lines = null;
        try {
            lines = Files.lines(path, StandardCharsets.UTF_8);
            // lambada!
            //integerArray = new int[(int) count.count()];
            lines.forEach(line -> process(line));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } finally {
            lines.close();
        }
    }

    private static void process(String line) {

        try{
        set.add(Long.parseLong(line));
            counter ++;
//        if (counter%100000 == 0 ){
//            System.out.println("one grand " + counter);
//        }
        }catch (Exception e){
            System.out.println("error " + e.getMessage() +  line);
        }

    }

}
