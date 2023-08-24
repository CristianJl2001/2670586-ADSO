
public class Personas{

    // Atributos- Caracteristicas

    private String nombre;
    private int edad; 
    private double altura;

    // Constructor
    public Personas (String nombre1,int edad1, double altura1){

        this.nombre = nombre1;
        this.edad = edad1;
        this.altura = altura1;
    }

    // Getters

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }
    public double getAltura(){
        return altura;
    }

    // Setters

    public void setnombre(String nombre1){
        nombre = nombre1;
    }
    public void setedad(int edad1){
        edad = edad1;
    }
    public void setaltura(double altura1){
        altura = altura1;
    }


}
