package Inter.reflection;

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 */
public class TestDisplayStructure {
    public static PrintStream out = System.out;
    enum ClassMember { CONSTRUCTOR, FIELD, METHOD, CLASS, ALL }
    public static void main (String[] args){

//        Inter.reflection.DumpObject display = new Inter.reflection.DumpObject();
//
//        display.printObject(getTest1());
//
//        display = new Inter.reflection.DumpObject();
//        display.printObject(getTest2());



        try {
            //Class<?> c = Class.forName(args[0]);
            Class<?> c = Class.forName(getTest2().getClass().getSimpleName());
            out.format("Class:%n  %s%n%n", c.getCanonicalName());

            Package p = c.getPackage();
            out.format("Package:%n  %s%n%n",
                    (p != null ? p.getName() : "-- No Package --"));

                        printMembers(c.getConstructors(), "Constructor");
                        printMembers(c.getFields(), "Fields");
                        printMembers(c.getMethods(), "Methods");


            // production code should handle these exceptions more gracefully
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        }

    }

    private static void printMembers(Member[] mbrs, String s) {
        out.format("%s:%n", s);
        for (Member mbr : mbrs) {
            if (mbr instanceof Field)
                out.format("  %s%n", ((Field)mbr).toGenericString());
            else if (mbr instanceof Constructor)
                out.format("  %s%n", ((Constructor)mbr).toGenericString());
            else if (mbr instanceof Method)
                out.format("  %s%n", ((Method)mbr).toGenericString());
        }
        if (mbrs.length == 0)
            out.format("  -- No %s --%n", s);
        out.format("%n");
    }

    private static void printClasses(Class<?> c) {
        out.format("Classes:%n");
        Class<?>[] clss = c.getClasses();
        for (Class<?> cls : clss)
            out.format("  %s%n", cls.getCanonicalName());
        if (clss.length == 0)
            out.format("  -- No member interfaces, classes, or enums --%n");
        out.format("%n");
    }

    private static Object getTest1() {

        Name n = new Name();
        n.firstName = "Hanan";
        n.lastName = "Gitliz";
        Person p = new Person();
        p.age = 35;
        p.name = n;

        return p;
    }

    private static Object getTest2() {

        Name n = new Name();
        n.firstName = "Hanan";
        n.lastName = "Gitliz";

        Check c = new Check();
        c.email = "roni12@gmail.com";
        c.id = 58;
        //c.bigNumber = Long.MAX_VALUE;
        c.namesList = new ArrayList<Name>();
        c.namesList.add(n);

        Name n1 = new Name();
        n1.firstName = "hillel";
        n1.lastName = "gaya";
        c.namesList.add(n1);

        return c;
    }
}

class Name {
    public String firstName;
    public String lastName;
}

class Person {
    public int age;
    public Name name;
}

class Check{
    private String name;
    public int id;
    public String email;
    public ArrayList<Name> namesList;
    //public Long bigNumber;

}
