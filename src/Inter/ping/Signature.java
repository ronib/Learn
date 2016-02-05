package Inter.ping;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 12/9/15
 * Time: 11:38 AM
 * To change this template use File | Settings | File Templates.
 */
class notPublic{
    Long getLength(){
        return new Long(4);
    }
}

public class Signature extends notPublic{

    public static void main(String args[]){

        Signature s = new Signature();
        System.out.println("number=" + s.getLength());
    }

    // will this compile   ?
//    public Integer getLength(){
//        return new Integer(5);
//    }

}
