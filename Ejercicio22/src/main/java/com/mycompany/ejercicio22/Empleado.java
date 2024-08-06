package com.mycompany.ejercicio22;

public class Empleado {
    // Atributos de la clase
    private String nombre;
    private double salarioPorHora;
    private int horasTrabajadas;

    // Constructor de la clase
    public Empleado(String nombre, double salarioPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Método para calcular el salario mensual
    public double calcularSalarioMensual() {
        return salarioPorHora * horasTrabajadas;
    }

    // Método para obtener el nombre del empleado
    public String getNombre() {
        return nombre;
    }

    // Método para determinar el mensaje a mostrar
    public String obtenerMensaje() {
        double salarioMensual = calcularSalarioMensual();
        if (salarioMensual > 450000) {
            return nombre + " - Salario mensual: $" + salarioMensual;
        } else {
            return nombre;
        }
    }
    
}
