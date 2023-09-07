/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spark;

/**
 *
 * @author Yeison Barreto
 */
@FunctionalInterface
public interface Route {
    String handle(Request request, Response response);
}