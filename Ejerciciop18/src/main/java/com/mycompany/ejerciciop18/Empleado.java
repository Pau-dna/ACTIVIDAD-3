package com.mycompany.ejerciciop18;


public class Empleado {
    private final String codigo;
    private final String nombres;
    private final double horasTrabajadas;
    private final double valorHora;
    private final double retencionFuente;

    public Empleado(String codigo, String nombres, double horasTrabajadas, double valorHora, double retencionFuente) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.retencionFuente = retencionFuente;
    }

    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }

    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        return salarioBruto - (salarioBruto * (retencionFuente / 100));
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getRetencionFuente() {
        return retencionFuente;
    }
}

