package Inter.ping;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 2/4/16
 * Time: 10:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class Catch {

    public static void main(String args[]){

        Catch l = new Catch();
        System.out.println("Start"); // will be printed

        try{
            System.out.println("try1");
            l.throw1();
            System.out.println("try2");
        }finally { // no need catch block
            System.out.println("finally"); // always printObject
        }
        System.out.println("end");      // won't printObject, program will exit.

    }

    public void throw1(){
        throw new RuntimeException("xxx");
    }


}
