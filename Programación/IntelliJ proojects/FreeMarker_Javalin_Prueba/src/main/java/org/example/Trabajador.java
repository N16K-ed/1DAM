package org.example;

import javax.persistence.*;

@Entity
@Table(name = "trabajadores")
public class Trabajador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private int sueldo;
    private String contrato;
    private String departamento;

    public Trabajador(){}

    public Trabajador(String nombre, int sueldo, String contrato, String departamento) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.contrato = contrato;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public String getContrato() {
        return contrato;
    }

    public String getDepartamento() {
        return departamento;
    }
}
