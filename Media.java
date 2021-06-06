
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        //Leer 10 numeros enteros por teclado y guardarlos en un array. 
        //Calcula y muestra la media de los numeros que esten en las posiciones pares.

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cantida de numeros: ");
        int n  = sc.nextInt();
        int [] numeros = new int[n];
        int suma = 0;
        int media;
        int m = n/2;

        for(int i  = 0; i < numeros.length; i++ ){

            System.out.print("Ingresa los datos: " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        if (n%2 == 0){
            for (int x = 1; x < numeros.length; x = x+2){
                suma += numeros[x];
                
            }
                
                media  = suma/m;
                System.out.println("La suma es: " + suma);
                System.out.print("La media de los numeros pares es: " + media);
        }else{
            for (int x = 0; x < numeros.length; x++){
                suma += numeros[x];
                
            }
                media  = suma/n;
                System.out.println("La suma es: " + suma);
                System.out.print("La media de los numeros impares es: " + media);
        
        }
        
        
        

    }   
}
