/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pqrs;

/**
 *
 * @author 310
 */
public class Empleado {
    private String nombre;
    private String cargo;
    private int idEmpleado;

    
    public Empleado(String nombre, String cargo, int idEmpleado) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.idEmpleado = idEmpleado;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}

