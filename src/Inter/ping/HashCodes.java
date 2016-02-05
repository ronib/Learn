package Inter.ping;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 1/8/16
 * Time: 7:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class HashCodes {

    public static void main(String[] args) {
        String a = new String("");
        String b = new String("");

        if (a.hashCode() == b.hashCode()){
            System.out.println("true");

        }   else{
            System.out.println("false");
        }
    }
}
