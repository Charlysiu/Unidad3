import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner ent =  new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int numero = scaner.nextInt();
        if (numero % 2 == 0){
            System.out.println("El numero " + numero + " es par");
        }else {
            System.out.println("El numero es inpar");
        }
    }
}