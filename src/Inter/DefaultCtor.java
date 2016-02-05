package Inter;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 12/30/15
 * Time: 4:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class DefaultCtor {
    public DefaultCtor(int i){

    }
    private int x;
    public int y;
    private DefaultCtor(){};
    public class C extends DefaultCtor {
        public int x;
        private int y;

    }




}
