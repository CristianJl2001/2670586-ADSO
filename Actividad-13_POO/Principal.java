public class Principal {
    public static void main(String[] args) {
        // Crear instancias de Jugadores
        jugador jugador1 = new jugador("123", "Pinocho", 25, "Delantero");
        System.out.println("");
        jugador jugador2 = new jugador("456", "Dumbo", 28, "Defensa");
        System.out.println("");
        jugador jugador3 = new jugador("789", "Shrek3", 22, "Mediocampista");
        System.out.println("");
        jugador jugador4 = new jugador("101", "Anaquin", 30, "Portero");
        System.out.println("");
        jugador jugador5 = new jugador("202", "El pepe", 26, "Defensa");
        System.out.println("");
        jugador jugador6 = new jugador("303", "Larry", 23, "Mediocampista");
        System.out.println("");
        jugador jugador7 = new jugador("404", "Burro", 29, "Delantero");
        System.out.println("");
        jugador jugador8 = new jugador("505", "Chespirito", 27, "Portero");
        System.out.println("");
        jugador jugador9 = new jugador("606", "Kiko", 24, "Defensa");
        System.out.println("");
        jugador jugador10 = new jugador("707", "Don Ramon", 31, "Mediocampista");
        System.out.println("");

        // Crear instancias de Equipos
        equipo equipo1 = new equipo("Equipo1", 2000);
        equipo equipo2 = new equipo("Equipo2", 2005);

        // Agregar Jugadores a los equipos
        equipo1.agregarJugador(jugador1);
        equipo1.agregarJugador(jugador2);
        equipo1.agregarJugador(jugador3);
        equipo1.agregarJugador(jugador4);
        equipo1.agregarJugador(jugador5);
        equipo1.agregarJugador(jugador6);

        equipo2.agregarJugador(jugador7);
        equipo2.agregarJugador(jugador8);
        equipo2.agregarJugador(jugador9);
        equipo2.agregarJugador(jugador10);

        // Transferir jugadores del primer equipo al segundo equipo
        equipo2.agregarJugador(jugador1);
        equipo2.agregarJugador(jugador2);
        equipo2.agregarJugador(jugador5);

        // Mostrar información detallada de los jugadores del segundo equipo
        equipo2.listaNombreJugadores();
    }
}
