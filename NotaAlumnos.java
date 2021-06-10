import java.util.Scanner;

import javax.imageio.stream.IIOByteBuffer;

public class NotaAlumnos {

    public static void main(String [] args){

    /**
     * Leer por teclado la nota de los alumnos de una clase y calcular la nota
     * media del grupo.
     * Mostrando los alumnos con notas superiores a la media
     */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de calificaciones: ");
        int n  = sc.nextInt();
        double [] notas = new double [n];
        double suma = 0;
        double media;

        // Bucle para rellenar el arreglo
        for(int i = 0; i <notas.length; i++){
            System.out.print("Ingresa las calificaciones: " + (i+1) + ": ");
            notas [i] = sc.nextInt();
            suma += notas[i];
        }

        media = suma/n;
        System.out.println("La media es: " + media);

        for(int i = 0; 1<notas.length; i++){
            if(notas[i] > media){
                
                System.out.println("Los alumnos con calificacion mayor a la media son: " + notas[i]);
            }
        }


        



    }
    
}
