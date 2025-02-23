package aplicacion;

import mates.Matematicas;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) { // Iniciamos el programa
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de pasos: "); // Mensaje para el usuario
        int pasos = sc.nextInt();
        double pi = Matematicas.generarNumeroPiRecursivo(pasos, 0);
        System.out.println("El número PI es aproximadamente: " + pi); // Obtenemos resultado de la aprox de pi
        sc.close();
    }
}




