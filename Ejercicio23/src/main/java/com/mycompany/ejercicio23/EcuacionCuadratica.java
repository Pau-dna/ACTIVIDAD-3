
package com.mycompany.ejercicio23;

public class EcuacionCuadratica {
    // Atributos de la clase
    private double a;
    private double b;
    private double c;

    // Constructor de la clase
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método para calcular las soluciones
    public String calcularSoluciones() {
        // Calcular el discriminante
        double discriminante = b * b - 4 * a * c;
        
        // Verificar el valor del discriminante
        if (discriminante > 0) {
            // Dos soluciones reales y distintas
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return "Soluciones: x1 = " + x1 + ", x2 = " + x2;
        } else if (discriminante == 0) {
            // Una solución real doble
            double x = -b / (2 * a);
            return "Solución única: x = " + x;
        } else {
            // No hay soluciones reales
            return "No hay soluciones reales";
        }
    }

    // Métodos getters y setters (opcional, si necesitas acceder a los atributos)
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
}
