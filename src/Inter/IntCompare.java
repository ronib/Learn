package Inter;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 2/3/16
 * Time: 10:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntCompare {

    public static void main(String[] args) {
        Integer a = 1000, b = 1000;
        System.out.println(a == b);//1
        System.out.println(a.equals(b));//1
        Integer c = 100, d = 100;
        System.out.println(c == d);//2
        System.out.println(c.equals(d));//1
//        System.out.println(Integer.low);//1
    }
}
