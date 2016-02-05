package Inter; /**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 12/9/15
 * Time: 12:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Strings {

    public static void main(String[] args){

        String a = new String("");
        String b = new String("");

        if (a.equals(b)) System.out.println("true");
        if (a == b) System.out.println("true");
        if (a.hashCode() == b.hashCode()) System.out.println("hashCode");

        // same object
        String e = "abc";
        String f = "abc";

        // not same object
        String c = new String("abc");
        String d = new String("abc");


    }
}
