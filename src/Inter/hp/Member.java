package Inter.hp;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 1/9/16
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Member {

    public static void main(String[] args) {
        Base b = new SubClass();
        System.out.println(b.x);
        System.out.println(b.method());
    }

    static class Base {
        static int x = 2;
        int method(){
            return x;
        }
    }
    static class SubClass extends Base{
        static int x = 3;
        int method(){
            return x;
        }
    }
}
