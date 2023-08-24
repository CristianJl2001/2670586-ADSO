import java.util.Scanner;
public class Principal{
    public static void main (String []args){

        Personas arregloPersona [] = new Personas [10];

        arregloPersona[0] = new Personas (" Cristian ", 22, 1.64);
        arregloPersona[1] = new Personas (" Camilo ", 24, 1.74);
        arregloPersona[2] = new Personas (" Steven ", 24, 1.70);
        arregloPersona[3] = new Personas (" Juanes ", 22, 1.77);
        arregloPersona[4] = new Personas (" 6 ", 11, 1.45);
        arregloPersona[5] = new Personas (" Stephanie ", 21, 1.62);
        arregloPersona[6] = new Personas (" Cristian ", 22, 1.64);
        arregloPersona[7] = new Personas (" Andres ", 28, 1.68);
        arregloPersona[8] = new Personas (" Bryan ", 21, 1.66);
        arregloPersona[9] = new Personas (" Juli ", 22, 1.41);

        // for(int i =0; i < arregloPersona.length; i++){
        //     System.out.println(arregloPersona[i]);
        // }

        Personas primeraPersona = arregloPersona[0];
        System.out.println("1- Nombre: " + primeraPersona.getNombre());
        System.out.println(" - Edad: " + primeraPersona.getEdad());
        System.out.println(" - Altura: " + primeraPersona.getAltura());

        Personas segundaPersona = arregloPersona[1];
        System.out.println("2- Nombre: " + segundaPersona.getNombre());
        System.out.println(" - Edad: " + segundaPersona.getEdad());
        System.out.println(" - Altura: " + segundaPersona.getAltura());

        Personas terceraPersona = arregloPersona[2];
        System.out.println("3- Nombre: " + terceraPersona.getNombre());
        System.out.println(" - Edad: " + terceraPersona.getEdad());
        System.out.println(" - Altura: " + terceraPersona.getAltura());

        Personas cuartaPersona = arregloPersona[3];
        System.out.println("4- Nombre: " + cuartaPersona.getNombre());
        System.out.println(" - Edad: " + cuartaPersona.getEdad());
        System.out.println(" - Altura: " + cuartaPersona.getAltura());
        
        Personas quintaPersona = arregloPersona[4];
        System.out.println("5- Nombre: " + quintaPersona.getNombre());
        System.out.println(" - Edad: " + quintaPersona.getEdad());
        System.out.println(" - Altura: " + quintaPersona.getAltura());

        Personas sextaPersona = arregloPersona[5];
        System.out.println("6 -Nombre: " + sextaPersona.getNombre());
        System.out.println(" - Edad: " + sextaPersona.getEdad());
        System.out.println(" - Altura: " + sextaPersona.getAltura());

        Personas septimaPersona = arregloPersona[6];
        System.out.println("7- Nombre: " + septimaPersona.getNombre());
        System.out.println(" - Edad: " + septimaPersona.getEdad());
        System.out.println(" - Altura: " + septimaPersona.getAltura());

        Personas octavaPersona = arregloPersona[7];
        System.out.println("8- Nombre: " + octavaPersona.getNombre());
        System.out.println(" - Edad: " + octavaPersona.getEdad());
        System.out.println(" - Altura: " + octavaPersona.getAltura());

        Personas novenaPersona = arregloPersona[8];
        System.out.println("9- Nombre: " + novenaPersona.getNombre());
        System.out.println(" - Edad: " + novenaPersona.getEdad());
        System.out.println(" - Altura: " + novenaPersona.getAltura());

        Personas decimaPersona = arregloPersona[9];
        System.out.println("10- Nombre: " + decimaPersona.getNombre());
        System.out.println(" -  Edad: " + decimaPersona.getEdad());
        System.out.println(" -  Altura: " + decimaPersona.getAltura());
    }
}




