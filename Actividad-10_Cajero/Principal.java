import java.util.Scanner;
public class Principal{
    public static void main (String [] args){

        CajeroElectronico cajero02 = new CajeroElectronico(1500000000, "ola", "olo123", "ola345");        
        cajero02.abastecerCajero(1000, 1000, 500, 500);
        cajero02.abastecerCajero(20000, 20000, 5000, 5000);
        
        cajero02.imprimirDetalle();

        


    }
    
}