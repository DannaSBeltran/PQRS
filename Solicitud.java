/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pqrs;

/**
 *
 * @author 310
 */


import java.util.Date;

public class Solicitud {
    private static int contador = 1;
    private int idSolicitud;
    private Cliente cliente;
    private Departamento departamento;
    private Empleado empleado;
    private String descripcion;
    private Date fechaCreacion;
    private String estado;

    
    public Solicitud(Cliente cliente, Departamento departamento, Empleado empleado, String descripcion) {
        this.idSolicitud = contador++;
        this.cliente = cliente;
        this.departamento = departamento;
        this.empleado = empleado;
        this.descripcion = descripcion;
        this.fechaCreacion = new Date();
        this.estado = "Abierta"; 
    }

    
    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public void actualizarEstado(String estado) {
        this.estado = estado;
    }
}
