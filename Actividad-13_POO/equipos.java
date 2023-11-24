public class equipos{
    public String nombre;
    public int fundacion;
    public int N_ganados;
    public int N_empatados;
    public int N_perdidos;
    

    public equipos(String nombre, int fundacion, int N_ganados, int N_empatados, int N_perdidos){
        nombre = nombre;
        fundacion = fundacion;
        N_ganados = N_ganados;
        N_empatados = N_empatados;
        N_perdidos = N_perdidos;
    }

    public String getNombre(){
        return nombre;
    }

    public int getfundacion(){
        return fundacion;
    }

    public int getN_ganados(){
        return N_ganados;
    }

    public int getN_empatados(){
        return N_empatados;
    }
    public int getN_perdidos(){
        return N_perdidos;
    }
}
