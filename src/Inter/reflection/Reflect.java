package Inter.reflection;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 * User: ronib
 * Date: 29/09/15
 * Time: 09:26
 * To change this template use File | Settings | File Templates.
 */
public class Reflect {

    public static void main (String args[]) {



        Name n = new Name();
        n.firstName = "Doron";
        n.lastName = "Somer";
        Person p = new Person();
        p.age = 35;
        p.name = n;
        System.out.println("start");
        print(n);
        print(p);

    }

    public static void print(Object object){

        System.out.println("Object of class:" + object.getClass().getSimpleName());
        System.out.println("---------------------------------");
        for (Field f : object.getClass().getDeclaredFields()){
            try{
                String name = f.getName();
                Field field = object.getClass().getDeclaredField(name);
                field.setAccessible(true);
                Object value = field.get(object);
                if (!name.equals("name")){
                    System.out.println("   " + name + ": " + value);
                }else{
                    print(value);
                }
            }catch (Exception e){
                System.out.println("Error. " + e.getMessage());
            }
        }

    }

    static class Name {
            public String firstName;
            public String lastName;
        }

        static class Person {
            public int age;
            public Name name;
        }
}
