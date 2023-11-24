import java.util.Date;

public class CajeroElectronico{

    // Atributos
    int capacidad_total;
    int dineroDisponible;
    int cant_10;
    int cant_20;
    int cant_50;
    int cant_100;
    String Nombrebanco;
    String listaTransacciones [];
    String usuario_admin;
    String clave_admin;

    // Constructor
    public CajeroElectronico(int capacidad_total, int dineroDisponible, int cant_10, int cant_20, int cant_50, int cant_100, String Nombrebanco, String usuario_admin, String clave_admin){
        this.capacidad_total = capacidad_total;
        this.dineroDisponible = dineroDisponible;
        this.cant_10 = cant_10;
        this.cant_20 = cant_20;
        this.cant_50 = cant_50;
        this.cant_100 = cant_100;
        this.Nombrebanco = Nombrebanco;
        this.usuario_admin = usuario_admin;
        this.clave_admin =clave_admin;
        listaTransacciones = new String[100];
    }

    public CajeroElectronico(int capacidad_total, String Nombrebanco, String usuario_admin, String clave_admin){
        this.capacidad_total = capacidad_total;
        this.Nombrebanco = Nombrebanco;
        this.usuario_admin = usuario_admin;
        this.clave_admin =clave_admin;

        this.dineroDisponible =0;
        this.cant_10 = 0;
        this.cant_20 = 0;
        this.cant_50 = 0;
        this.cant_100 = 0;
        listaTransacciones = new String[100];
    }

    public void imprimirDetalle(){
        System.out.println ("------------------------------------------");
        System.out.println ("    capacidad_total: "+capacidad_total);
        System.out.println ("    dineroDisponible: "+dineroDisponible);
        System.out.println ("    cant_10: "+cant_10);
        System.out.println ("    cant_20: "+cant_20);
        System.out.println ("    cant_50: "+cant_50);
        System.out.println ("    cant_100: "+cant_100);
        System.out.println ("    Nombrebanco: " +Nombrebanco);
        System.out.println ("    usuario_admin: "+usuario_admin);
        System.out.println ("    clave_admin: "+clave_admin);
        for(int i = 0; i < listaTransacciones.length; i++){
            if(listaTransacciones[i] !=null){
                System.out.println("   => "+listaTransacciones);
            }
        }
        System.out.println ("------------------------------------------");
    }

    public boolean abastecerCajero(int cant_10, int cant_20, int cant_50, int cant_100){
        int total = (cant_10 * 10000) + (cant_20 * 20000) + (cant_50 * 50000) +(cant_100 * 100000);

        if(total <= capacidad_total){
            dineroDisponible = total;
            this.cant_10 = cant_10;
            this.cant_20 = cant_20;
            this.cant_50 = cant_50;
            this.cant_100 = cant_100;
            registrarTransaccion("ABASTECER", "0000 0000 0000 0000", total, "OK");
            return true;
        }else{
            registrarTransaccion("ABASTECER", "0000 0000 0000 0000", total, "ERROR");
            return false;
        }
    }

    public void registrarTransaccion(String tipo, String numeroTarjeta, int monto, String estado){
		Date fecha = new Date();
		String texto = fecha.toString()+" - "+tipo+" - "+numeroTarjeta+" - "+monto+" - "+estado;

		// Buscar un indice donde este vacio
		int indice = -1;
		for (int i=0; i<listaTransacciones.length; i++) {
			if (listaTransacciones[i]==null) {
				indice = i;
				break;
			}
		}
		
		if (indice != -1) {
			listaTransacciones[ indice ] = texto;
		}else{
			for (int i=0; i<listaTransacciones.length-1; i++) {
				listaTransacciones[i] = listaTransacciones[i+1];
			}
			listaTransacciones[ listaTransacciones.length-1 ] = texto;
		}
	}

    public void verHistorialCajero(String user, String pass){
        if(user.equals(usuario_admin) && pass.equals(clave_admin)){
            registrarTransaccion("HISTORIAL", "0000 0000 0000 0000", 0, "OK" );
            for(int i = 0; i < listaTransacciones.length; i++){
                if(listaTransacciones[i] != null){
                    System.out.println(listaTransacciones[i]);
                }
            }
        }else{
            System.out.println("--------- ACCESO DENEGADO-----------");
            registrarTransaccion("HISTORIAL", "0000 0000 0000 0000", 0, "ERROR" );
        }
    } 



    // public void retirarDineroTarjeta(int monto, String estado, String tipo){
    //     String monto = " - "+estado+ " - "+monto+ " - "+tipo;
    //     if() 
    // }
} 