import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.ArrayList;


public class Lector {

    //Utiliza la clase Scanner

    // public static void main(String[] args) {
        
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("ingrese su nombre");

    //     String nombre =sc.nextLine();

    //     System.out.println("Bienvenido " + nombre + ".  Ingrese su edad");

    //     int edad = sc.nextInt();

    //     System.out.println("Gracias  " + nombre + "usted tiene " + edad);
    
        

        


    
    //}

    //Class BufferReader e InputStreamReader
    public static void main(String[] args) throws Exception{
        
        
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese su nombre");

        String nombre = lector.readLine();

        System.out.println("Bienvenido " + nombre + " por favor ingrese su edad");

        String entrada = lector.readLine();

        int edad = Integer.parseInt(entrada);

        System.out.println("Hola " + nombre + " Su edad es " + edad);



    }

    
    
    
}
