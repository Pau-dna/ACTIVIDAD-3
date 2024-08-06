/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7;


public class Comparador {
    private double a;
    private double b;

    // Constructor para inicializar los valores A y B
    public Comparador(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Método para comparar los valores y devolver el resultado como String
    public String comparar() {
        if (a > b) {
            return "A es mayor que B";
        } else if (a < b) {
            return "A es menor que B";
        } else {
            return "A es igual a B";
        }
    }

    // Getters y Setters para los valores de A y B
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
}
