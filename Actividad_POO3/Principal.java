import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clase[] cursos = new Clase[100];
        int numCursos = 0;

        while (true) {
            System.out.println("+--------------------------------------------+");
            System.out.println("| MENU DE CURSOS |");
            System.out.println("+--------------------------------------------+");
            System.out.println("| Memoria: " + (100 - numCursos) + " |");
            System.out.println("| 1. Crear curso. |");
            System.out.println("| 2. Listar todos los cursos. |");
            System.out.println("| 3. Ver detalle de curso. |");
            System.out.println("| 4. Editar informacion de un curso. |");
            System.out.println("| 5. Agregar tema a curso. |");
            System.out.println("| 6. Eliminar curso. |");
            System.out.println("| 7. Salir. |");
            System.out.println("+--------------------------------------------+");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (numCursos < 100) {
                        System.out.print("Ingrese el código del curso: ");
                        int codigo = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.print("Ingrese el nombre del curso: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el área de conocimiento: ");
                        String area = scanner.nextLine();
                        System.out.print("Ingrese la duración en horas: ");
                        int duracion = scanner.nextInt();

                        boolean codigoRepetido = false;
                        for (int i = 0; i < numCursos; i++) {
                            if (cursos[i].getCodigo() == codigo) {
                                codigoRepetido = true;
                                System.out.println("Error: El código ya existe.");
                                break;
                            }
                        }

                        if (!codigoRepetido) {
                            cursos[numCursos] = new Clase(codigo, nombre, area, duracion);
                            numCursos++;
                            System.out.println("Curso creado con éxito.");
                        }
                    } else {
                        System.out.println("Memoria llena. No se pueden crear más cursos.");
                    }
                    break;
                case 2:
                    System.out.println("Lista de todos los cursos:");
                    for (int i = 0; i < numCursos; i++) {
                        cursos[i].imprimirDetalleCurso();
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el código del curso a ver detalle: ");
                    int codigoVerDetalle = scanner.nextInt();
                    boolean encontrado = false;
                    for (int i = 0; i < numCursos; i++) {
                        if (cursos[i].getCodigo() == codigoVerDetalle) {
                            cursos[i].imprimirDetalleCurso();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Curso no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el código del curso a editar: ");
                    int codigoEditar = scanner.nextInt();
                    boolean encontradoEditar = false;
                    for (int i = 0; i < numCursos; i++) {
                        if (cursos[i].getCodigo() == codigoEditar) {
                            System.out.print("Nuevo nombre: ");
                            scanner.nextLine(); 
                            String nuevoNombre = scanner.nextLine();
                            System.out.print("Nueva área de conocimiento: ");
                            String nuevaArea = scanner.nextLine();
                            System.out.print("Nueva duración en horas: ");
                            int nuevaDuracion = scanner.nextInt();
                            cursos[i].editarInformacionCurso(nuevoNombre, nuevaArea, nuevaDuracion);
                            System.out.println("Información del curso editada con éxito.");
                            encontradoEditar = true;
                            break;
                        }
                    }
                    if (!encontradoEditar) {
                        System.out.println("Curso no encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el código del curso al que desea agregar un tema: ");
                    int codigoAgregarTema = scanner.nextInt();
                    boolean encontradoAgregarTema = false;
                    for (int i = 0; i < numCursos; i++) {
                        if (cursos[i].getCodigo() == codigoAgregarTema) {
                            if (cursos[i].getDuracionHoras() < 15) {
                                System.out.print("Ingrese el tema a agregar: ");
                                scanner.nextLine(); 
                                String tema = scanner.nextLine();
                                cursos[i].agregarTema(tema);
                                System.out.println("Tema agregado con éxito.");
                            } else {
                                System.out.println("No se pueden agregar más temas a este curso.");
                            }
                            encontradoAgregarTema = true;
                            break;
                        }
                    }
                    if (!encontradoAgregarTema) {
                        System.out.println("Curso no encontrado.");
                    }
                    break;
                case 6:
                    System.out.print("Ingrese el código del curso a eliminar: ");
                    int codigoEliminar = scanner.nextInt();
                    boolean encontradoEliminar = false;
                    for (int i = 0; i < numCursos; i++) {
                        if (cursos[i].getCodigo() == codigoEliminar) {
                            cursos[i] = null;
                            System.out.println("Curso eliminado con éxito.");
                            
                            for (int j = i; j < numCursos - 1; j++) {
                                cursos[j] = cursos[j + 1];
                            }
                            numCursos--;
                            encontradoEliminar = true;
                            break;
                        }
                    }
                    if (!encontradoEliminar) {
                        System.out.println("Curso no encontrado.");
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        }
    }
}