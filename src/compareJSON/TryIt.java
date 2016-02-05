import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 10/08/15
 * Time: 21:19
 * To change this template use File | Settings | File Templates.
 */
class Engine{}
class T2 extends TryIt{
    T2(){
        System.out.println("t2");
    }
}
public class TryIt {
     static Integer age;
    TryIt(){
        System.out.println("TryIt");
    }
    public void divide(int a, int b) {
        try {
            int c = a / b;
        }
        catch (Exception e) {
            System.out.print("Exception ");
        } finally {
            System.out.println("Finally");
        }

    }
    public static void main(String[] args){

       new TryIt();
        System.out.println("xxxx");
             Boolean f = true;
        Boolean flag = true;
     //   Boolean flag = true;

        //
        // Bodivide();
//        age = age + 1;
//        System.out.println("The age is " + age);

        //if (2 = 3) System.out.println("Hi");
//        if ("john".equals("john")){
//            System.out.println("true");
//        }
//
//        if ("john".equals(new Button("john"))){
//            System.out.println("true");
//
//        }
//
//        Panel p = new Applet();
//        //Frame f = new Panel();
//        Object o = new Button("A");

//        ArrayList<String> arr = new ArrayList<String>();
//        arr.add("A");
//        arr.add("B");
//        arr.add("C");
//        arr.add("D");
//        arr.add(1,"E");
//        arr.set(2, "E");
//
//        System.out.println(arr);
//
//
//
//        Engine a = new Engine();
//        Engine b = a;
//        a = null;
//
//
//       // TryIt t1 = new TryIt();
//        T2 t2 = new T2();



    }
}
