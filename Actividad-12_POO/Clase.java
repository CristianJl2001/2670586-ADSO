class Clase {
    public int codigo;
    public String nombre;
    public String areaConocimiento;
    public int duracionHoras;
    public String[] temas;
    public int numTemas;

    public Clase(int dato1, String dato2, String dato3, int dato5) {
        codigo = codigo;
        nombre = nombre;
        areaConocimiento = areaConocimiento;
        duracionHoras = duracionHoras;
        temas = new String[15];
        numTemas = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void imprimirDetalleCurso() {
        System.out.println(codigo + " - " + nombre + " - " + duracionHoras + " hr");
    }

    public void editarInformacionCurso(String nombre, String area, int duracion) {
        nombre = nombre;
        areaConocimiento = area;
        duracionHoras = duracion;
    }

    public void agregarTema(String tema) {
        if (numTemas < 15) {
            temas[numTemas] = tema;
            numTemas++;
        } else {
            System.out.println("No se pueden agregar más temas a este curso.");

        }
    }
}
