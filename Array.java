import java.util.Scanner;

public class Array{

    public static void main(String[] args){

        //Calcular la media de una serie de numeros que se leen por teclado.

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros ");
        int n = sc.nextInt();
    
        double [] numeros = new double [n];
        double suma = 0;
        double media; 

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese los numeros enteros:  " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for(int x = 0; x < numeros.length; x++){
            suma += numeros[x];
            
            
        }
        media = (suma/ n);
        
        System.out.print("La media es: " + media);
    }
    
}