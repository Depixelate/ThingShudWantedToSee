import java.util.*;
import java.lang.reflect.*;
class Reflection {
    public static void main(String[] args) {
        Class<?> c1 = new ArrayDeque<Integer>().getClass();
        Class<?> c2 = Class.forName("ArrayList");
        Object adq = c1.newInstance();
        Object al = c2.newInstance();

        Constructor<?>[] arrayDequeConstructors = c1.getDeclaredConstructors();
        Constructor<?>[] arrayListConstructors = c2.getDeclaredConstructors();

        Field[] arrayDequeFields = c1.getDeclaredFields();
        Method[] methods = c1.getDeclaredMethods();

        for (Constructor<?> c : arrayDequeConstructors) {
            System.out.println(c);
            System.out.println(Arrays.toString(c.getParameterTypes()));
        }

        for (Method m : methods) {
            System.out.println(m);
            System.out.println(m.getName());
            System.out.println(m.getParameterTypes());
        }

        for (Field f: arrayDequeFields) {
            System.out.println(f);
            System.out.println(f.getName());
            f.setAccessible(true);
            System.out.println(f.get(adq));
        }

        Method m = c1.getMethod("add");


        System.out.printf("Deque");
    }
}
    
}
