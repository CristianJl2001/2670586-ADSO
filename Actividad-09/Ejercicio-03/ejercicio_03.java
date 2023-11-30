import java.util.Scanner;

public class ejercicio_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamaño máximo del arreglo de clientes
        final int TAMANO_MAXIMO = 100;

        // Arreglo para almacenar los nombres de los clientes
        String[] clientes = new String[TAMANO_MAXIMO];

        int memoriaDisponible = TAMANO_MAXIMO;

        int opcion;

        do {
            System.out.println("Memoria disponible: " + memoriaDisponible + " Registros.");
            System.out.println("1: Registrar cliente.");
            System.out.println("2: Ver lista de clientes.");
            System.out.println("3: Editar cliente.");
            System.out.println("4: Eliminar cliente.");
            System.out.println("5: Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    // Registrar cliente
                    if (memoriaDisponible > 0) {
                        System.out.print("Ingrese el nombre completo del cliente: ");
                        String nombreCliente = scanner.nextLine();

                        // Verificar si el cliente ya está registrado
                        boolean clienteExistente = false;
                        for (int i = 0; i < TAMANO_MAXIMO - memoriaDisponible; i++) {
                            if (clientes[i] != null && clientes[i].equals(nombreCliente)) {
                                clienteExistente = true;
                                break;
                            }
                        }

                        // Almacenar el nombre del cliente en el arreglo si no existe
                        if (!clienteExistente) {
                            clientes[TAMANO_MAXIMO - memoriaDisponible] = nombreCliente;
                            memoriaDisponible--;
                            System.out.println("Cliente registrado exitosamente.");
                        } else {
                            System.out.println("Error: Cliente ya registrado.");
                        }
                    } else {
                        System.out.println("Error: Memoria llena, no se pueden registrar más clientes.");
                    }
                    break;
                case 2:
                    // Ver lista de clientes
                    System.out.println("Lista de clientes:");
                    for (int i = 0; i < TAMANO_MAXIMO - memoriaDisponible; i++) {
                        System.out.println((i + 1) + ": " + clientes[i]);
                    }
                    break;
                case 3:
                    // Editar cliente
                    if (memoriaDisponible < TAMANO_MAXIMO) {
                        System.out.print("Ingrese el nombre del cliente a editar: ");
                        String nombreEditar = scanner.nextLine();

                        // Buscar el cliente en el arreglo
                        int indiceEditar = -1;
                        for (int i = 0; i < TAMANO_MAXIMO - memoriaDisponible; i++) {
                            if (clientes[i] != null && clientes[i].equals(nombreEditar)) {
                                indiceEditar = i;
                                break;
                            }
                        }

                        // Editar el cliente si se encuentra
                        if (indiceEditar != -1) {
                            System.out.print("Ingrese el nuevo nombre del cliente: ");
                            String nuevoNombre = scanner.nextLine();
                            clientes[indiceEditar] = nuevoNombre;
                            System.out.println("Cliente editado exitosamente.");
                        } else {
                            System.out.println("Error: Cliente no encontrado.");
                        }
                    } else {
                        System.out.println("Error: No hay clientes para editar.");
                    }
                    break;
                case 4:
                    // Eliminar cliente
                    if (memoriaDisponible < TAMANO_MAXIMO) {
                        System.out.print("Ingrese el nombre del cliente a eliminar: ");
                        String nombreEliminar = scanner.nextLine();

                        // Buscar el cliente en el arreglo
                        int indiceEliminar = -1;
                        for (int i = 0; i < TAMANO_MAXIMO - memoriaDisponible; i++) {
                            if (clientes[i] != null && clientes[i].equals(nombreEliminar)) {
                                indiceEliminar = i;
                                break;
                            }
                        }

                        // Eliminar el cliente si se encuentra
                        if (indiceEliminar != -1) {
                            // Mover los clientes restantes hacia arriba
                            for (int i = indiceEliminar; i < TAMANO_MAXIMO - memoriaDisponible - 1; i++) {
                                clientes[i] = clientes[i + 1];
                            }
                            clientes[TAMANO_MAXIMO - memoriaDisponible - 1] = null;
                            memoriaDisponible++;
                            System.out.println("Cliente eliminado exitosamente.");
                        } else {
                            System.out.println("Error: Cliente no encontrado.");
                        }
                    } else {
                        System.out.println("Error: No hay clientes para eliminar.");
                    }
                    break;
                case 5:
                    // Salir
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Error: Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        
    }
}
