/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package pqrs;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int idCliente;
    public ArrayList<Solicitud> solicitudes;

   
    public Cliente(String nombre, int idCliente) {
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.solicitudes = new ArrayList<>();
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    
    public void crearSolicitud(Departamento departamento, Empleado empleado, String descripcion) {
        Solicitud nuevaSolicitud = new Solicitud(this, departamento, empleado, descripcion);
        solicitudes.add(nuevaSolicitud);
        System.out.println("Solicitud creada exitosamente.");
    }

    
    public void consultarSolicitud(int idSolicitud) {
        for (Solicitud solicitud : solicitudes) {
            if (solicitud.getIdSolicitud() == idSolicitud) {
                System.out.println("Estado de la solicitud: " + solicitud.getEstado());
                return;
            }
        }
        System.out.println("Solicitud no encontrada.");
    }

    public ArrayList<Solicitud> getSolicitudes() {
        return solicitudes;
    }
}
