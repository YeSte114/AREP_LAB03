/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spark;

import java.util.HashMap;

/**
 *
 * @author Yeison Barreto
 */
public class Spark {

    private static Spark instance;

    private HashMap<String, String> services = new HashMap<>();

    private Spark(){}

    public static Spark getInstance() {
        if(instance == null){
            instance = new Spark();
        }
        return instance;
    }

    public void get(String path, Route route){
        Response response = new Response();
        Request request = new Request();

        String res = route.handle(request,response);
        services.put(path, res);
    }

    public String post(String path, Route route){
        Response response = new Response();
        Request request = new Request();
        services.put(path, route.handle(request,response));
        return route.handle(request,response);
    }

    public String getService(String path){
        return services.get(path);
    }
}
