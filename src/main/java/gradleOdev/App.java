/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradleOdev;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }
    public static boolean search(ArrayList <Integer> array , int e){
        System.out.println("inside Search");
        if(array == null) return false;
        for(int elt : array){
            if(elt == e )return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}