package mates;

public class Matematicas {

    public static double generarNumeroPiRecursivo(long pasos, long puntos) {
        if (pasos == 0) {
            return 4.0 * puntos / (puntos + pasos + 1); // Ajuste para evitar división por cero
        }

        double x = Math.random();
        double y = Math.random();

        if (x * x + y * y <= 1) {
            puntos++;
        }

        return generarNumeroPiRecursivo(pasos - 1, puntos);
    }
}


