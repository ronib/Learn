package Inter.hp;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 1/9/16
 * Time: 7:43 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Abstract {

    abstract int method();
    void anotherMethod(){

    }

    Abstract(String a){};
    Abstract(){};

    class B extends Abstract{
        int method(){return 2;}


        B(int a){
        }
    }
}
