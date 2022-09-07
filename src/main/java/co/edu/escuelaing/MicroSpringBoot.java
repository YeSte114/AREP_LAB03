package co.edu.escuelaing;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MicroSpringBoot {
    static Map<String, Method> services = new HashMap<String, Method>();

    public static void main(String[] args) throws ClassNotFoundException {
        String className = args[0];
        Class c = Class.forName(className);

        for (Method m : c.getMethods()){
            if (m.isAnnotationPresent(RequestMapping.class)){
                try {
                    String URI = m.getAnnotation(RequestMapping.class).value();
                    System.out.println(URI);
                    System.out.println("URI: " + URI + " ,Method: " + m);
                    services.put(URI, m);

                } catch (Throwable ex){
                    ex.printStackTrace();
                }
            }
        }

    }
}
