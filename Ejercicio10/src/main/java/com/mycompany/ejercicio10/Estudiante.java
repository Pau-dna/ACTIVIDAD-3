/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10;


public class Estudiante {
    // Atributos de la clase
    private String numeroInscripcion;
    private String nombres;
    private double patrimonio;
    private int estratoSocial;
    private static final double VALOR_MATRICULA = 50000; // Valor constante de la matrícula

    // Constructor para inicializar los atributos
    public Estudiante(String numeroInscripcion, String nombres, double patrimonio, int estratoSocial) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
    }

    // Método para calcular el pago de matrícula
    public double calcularPagoMatricula() {
        double pagoMatricula = VALOR_MATRICULA;

        // Verificar las condiciones para el incremento
        if (patrimonio > 2000000 && estratoSocial > 3) {
            pagoMatricula += 0.03 * patrimonio;
        }

        return pagoMatricula;
    }

    // Getters y Setters
    public String getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public void setNumeroInscripcion(String numeroInscripcion) {
        this.numeroInscripcion = numeroInscripcion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(double patrimonio) {
        this.patrimonio = patrimonio;
    }

    public int getEstratoSocial() {
        return estratoSocial;
    }

    public void setEstratoSocial(int estratoSocial) {
        this.estratoSocial = estratoSocial;
    }
}
