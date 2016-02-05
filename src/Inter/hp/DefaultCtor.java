package Inter.hp;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 1/9/16
 * Time: 5:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultCtor      {

    int x=0;
    DefaultCtor(int w){
        x = w;
    }
    DefaultCtor(){};


    class B extends DefaultCtor{
        int x=0;


        B(int w) {
            x=w+1;
        }
    }

}
