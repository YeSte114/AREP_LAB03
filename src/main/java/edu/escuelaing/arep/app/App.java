/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.escuelaing.arep.app;

import java.io.IOException;
import spark.Spark;

/**
 * Clase encargada de iniciar el servidor HttpServer.
 * @author Yeison Barreto
 */
public class App {
    /**
     * Inicia el programa.
     * @param args args
     * @throws IOException Por si algo sale mal en el proceso
     */
    public static void main(String[] args) throws IOException {
        Spark spark = Spark.getInstance();
        spark.get("/", ((request, response) -> {
            response.setType("application/json");
            response.setCode("200 OK");
            response.setPath("test.json");
            response.setBody();
            return response.getResponse();
        }));
        
        HttpServer server = HttpServer.getInstance();
        server.run(args);
    }
}
