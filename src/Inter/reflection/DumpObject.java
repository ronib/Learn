package Inter.reflection;

import java.lang.reflect.*;
import java.util.Collection;


/**
 * printObject the structure of an object
 */
public class DumpObject {

    public static String spaces = "";

    public DumpObject(){
        this.spaces = "";
    }

    public void printObject(Object obj){

        printTitle(obj.getClass().getName());

        for (Field field : obj.getClass().getDeclaredFields()) {
            if (Modifier.isPublic(field.getModifiers())) {
                printField(field, obj);
            }
        }
    }

    private void printField(Field field, Object obj) {

        // only public fields
        try {
            if (field.getType().isPrimitive()){
                // primitive member
               print(field.getName() + " = " + field.get(obj));
            }else if (field.getType().isAssignableFrom(String.class)){
                // strings
                print(field.getName() + " = " + (String) field.get (obj));
            }else if (Collection.class.isAssignableFrom(field.getType())) {
                // collection
                printCollection(field, obj);
            }else {
                // new class
                print(field.getName() + " = " );
                spaces += "   ";
                printObject(field.get(obj));
            }
        } catch (Exception e) {
            print("Error in printing object " + field.getName() + e.getMessage());
        }

    }

    private void printCollection(Field field, Object obj) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Type type = field.getGenericType();
        Object a ;
        if (type instanceof Class) {
            a = (Class) type;
        }
        if (type instanceof ParameterizedType) {
            a =  ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            Type componentType = ((GenericArrayType) type).getGenericComponentType();
            Class<?> componentClass = componentType.getClass();
            if (componentClass != null ) {
                a = Array.newInstance(componentClass, 0).getClass();
            }
        }

        ParameterizedType pType = (ParameterizedType) type;
        Class<?> klass = (Class<?>) pType.getActualTypeArguments()[0];
        print(field.getName() + " = " + field.getGenericType());
        spaces += "   ";
        String targetMethodName = "get";// + field.getName().substring(0, 1).toUpperCase() + (field.getName().substring(1));
        print(klass.getSimpleName());

        //Method method = klass.getMethod(targetMethodName, null) ;
        //Object result = method.invoke(type, new Object[] {});
        //printField(collectionClass, field); // class java.lang.String.
        //print(field.getName() + " = " + field.get(obj));

    }


    public void printTitle(String className){
        String titleStr = "Object of Class \"" + className + "\"";
        print(titleStr);

        // repeat "=" n times
        String dashStr = new String(new char[titleStr.length()]).replace("\0", "=");
        print(dashStr);
    }

    public static void print(String text){
        System.out.println(spaces + text);
    }

}


