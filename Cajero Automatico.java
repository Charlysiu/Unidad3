import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {

    
    
        double saldo = 1000.0;
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al cajero automático.");
        System.out.println("Seleccione una opción:");
        System.out.println("Consultar saldo");
        System.out.println("Depositar dinero");
        System.out.println("Retirar dinero");
        System.out.println("Salir");
        
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                
                System.out.println("Su saldo es: " + saldo);
                break;
            case 2:
            
                System.out.println("¿Cuánto dinero quiere depositar?");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println("Su nuevo saldo es: " + saldo);
                break;
            case 3:
            
                System.out.println("¿Cuánto dinero quiere retirar?");
                double retiro = scanner.nextDouble();
                if (retiro <= saldo) {
                    saldo -= retiro;
                    System.out.println("Retiro exitoso. Su nuevo saldo es: " + saldo);
                } else {
                    System.out.println("No cuenta con los fondos suficientes.");
                }
                break;
            case 4:
                
                System.out.println("Gracias, vuelva pronto");
                break;
            
        }
        
        scanner.close();
    }
}
    
