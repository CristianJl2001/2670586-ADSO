import java.util.ArrayList;
import java.util.List;
public class jugador{
    public String cedula;
    public String nombre;
    public int edad;
    public String posicion;
    
    
    
    public jugador(String cedula, String nombre, int edad, String posicion) {
            this.cedula = cedula;
            this.nombre = nombre;
            this.edad = edad;
            this.posicion = posicion;
    }
    // Métodos getters y setter
    public String getCedula(){
        return cedula;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getPosicion(){
        return posicion;
    }
    
    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setPosicion(String posicion){
        this.posicion = posicion;
    }
}
