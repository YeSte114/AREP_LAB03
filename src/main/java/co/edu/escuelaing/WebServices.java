package co.edu.escuelaing;

public class WebServices {

    @RequestMapping("/hello")
    public static String helloWorld(){
        return "Hello World";
    }

    @RequestMapping("/status")
    public static String serverStatus(){
        return "Running";
    }

}
