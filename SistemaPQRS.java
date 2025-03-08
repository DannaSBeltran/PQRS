/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pqrs;
   import java.util.Scanner;
/**
 *
 * @author 310
 */
public class SistemaPQRS {
   
    


    public static void main(String[] args) {
        
        Departamento departamentoTecnico = new Departamento("Tecnico", "Soporte y asistencia tecnica");
        Departamento departamentoAtencion = new Departamento("Atencion al cliente", "Gestionar quejas y sugerencias");

        
        Empleado empleadoJuan = new Empleado("Juan Perez", "Soporte Tecnico", 101);
        Empleado empleadoDaniel = new Empleado("Daniel Lopez", "Atencion al cliente", 102);

        
        Cliente cliente1 = new Cliente("Felipe Gonzalez", 1);
        Cliente cliente2 = new Cliente("Mariana Torres", 2);

        
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            
            System.out.println("\n*** Menu Sistema PQRS ***");
            System.out.println("1. Crear Solicitud");
            System.out.println("2. Consultar Solicitud");
            System.out.println("3. Actualizar Estado de Solicitud");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1: 
                    
                    System.out.print("Ingrese el ID del cliente (1 o 2): ");
                    int idCliente = scanner.nextInt();
                    scanner.nextLine();  

                    Cliente cliente = idCliente == 1 ? cliente1 : cliente2;

                    System.out.print("Ingrese la descripcion de la solicitud: ");
                    String descripcion = scanner.nextLine();

                    System.out.println("Seleccione el departamento (1. Tecnico, 2. Atencion): ");
                    int idDepartamento = scanner.nextInt();
                    Departamento departamento = idDepartamento == 1 ? departamentoTecnico : departamentoAtencion;

                    System.out.println("Seleccione el empleado asignado (1. Juan Perez, 2. Daniel Lopez): ");
                    int idEmpleado = scanner.nextInt();
                    Empleado empleado = idEmpleado == 1 ? empleadoJuan : empleadoDaniel;

                    
                    cliente.crearSolicitud(departamento, empleado, descripcion);
                    break;

                case 2: 
                    
                    System.out.print("Ingrese el ID de la solicitud a consultar: ");
                    int idSolicitudConsulta = scanner.nextInt();
                    scanner.nextLine();

                    
                    boolean encontrada = false;
                    for (Cliente c : new Cliente[] {cliente1, cliente2}) {
                        c.consultarSolicitud(idSolicitudConsulta);
                        encontrada = true;
                        break;
                    }

                    if (!encontrada) {
                        System.out.println("Solicitud no encontrada.");
                    }
                    break;

                case 3: 
                    
                    System.out.print("Ingrese el ID de la solicitud a actualizar: ");
                    int idSolicitudActualizar = scanner.nextInt();
                    scanner.nextLine(); 

                    
                    boolean solicitudExistente = false;
                    for (Cliente c : new Cliente[] {cliente1, cliente2}) {
                        for (Solicitud s : c.getSolicitudes()) {
                            if (s.getIdSolicitud() == idSolicitudActualizar) {
                                solicitudExistente = true;

                                
                                System.out.print("Ingrese el nuevo estado de la solicitud (Abierta/Resuelta/Cerrada): ");
                                String nuevoEstado = scanner.nextLine();

                                
                                s.actualizarEstado(nuevoEstado);
                                System.out.println("Estado de la solicitud actualizado exitosamente.");
                                break;
                            }
                        }
                    }

                    if (!solicitudExistente) {
                        System.out.println("Solicitud no encontrada.");
                    }
                    break;

                case 4: 
                    System.out.println("Saliendo del sistema...");
                    exit = true;
                    break;

                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
                    break;
            }
        }

        scanner.close(); 
    }
}



    

