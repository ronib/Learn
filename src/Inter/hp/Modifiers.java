package Inter.hp;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 1/9/16
 * Time: 5:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Modifiers {
    protected int method(){
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("start");
        Modifiers a = new Modifiers();
        System.out.println(a.method());

        Modifiers b = new B();
        System.out.println(b.method());

    }

}

class B extends Modifiers{
    public int method(){ // no modifier is default modifier (package subclass only. public/protected can solve it
        return 2;
    }
}