public class jugadores{
    
    public int cedula;
    public String nombre;
    public String posicion;
    public String [] jugadores;


// Constructor
    public jugadores(int documento, String nombre, String posicion, String [] jugadores){
        cedula = documento;
        nombre = nombre;
        posicion = posicion;
        jugadores = new String[11];
    }

// Getters
    public int getCedula(){
        return cedula;
    }

    public String getNombre(){
        return nombre;
    }
    public String getposicion(){
        return posicion;
    }
// Setters

    public void setCedula (int documento){
        cedula = documento;
    }
    
    public void setNombre(String nombre){
        nombre = nombre;
    }
    public void setPosicion(String posicion){
        posicion = posicion;
    }
}