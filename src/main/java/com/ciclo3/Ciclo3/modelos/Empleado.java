package com.ciclo3.Ciclo3.modelos;

import javax.persistence.*;

@Entity
@Table(name = "Empleado")// Se relaciona la clase Empleado con una tabla llamada Empleado
public class Empleado {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//permite generar un Id en orden para los
    // objetos que se vayan creando
    private int id;
    private String nombreEmpleado;
    private String correo;
    @ManyToOne // Asociar tablas
    @JoinColumn(name = "empresa_id")// Relacionar Empleado con una empresa
    private Empresa empresa;
    private String rol;

    private String password;

    private Boolean estado;

    // Constructor
    public Empleado() {

    }

    public Empleado(String nombreEmpleado, String correo, Empresa empresa, String rol, String password, Boolean estado){
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
        this.password = password;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
