package co.edu.escuelaing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MicroJunit {

    public static void main(String... args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        String className = args[0];
        Class c = Class.forName(className);
        Method[] declareMethods = c.getDeclaredMethods();

        int passed = 0;
        int failed = 0;

        for (Method m : declareMethods){
            if (m.isAnnotationPresent(Test.class)){
                try {
                    m.invoke(null);
                    passed=passed+1;
                    System.out.println("Invoke: "+m.getName() + " in class: "+c.getName());
                }catch (Exception e){
                    failed = failed+1;
                }


            }
        }
        System.out.println("Passed: "+passed+",failed: "+failed);
    }

}
