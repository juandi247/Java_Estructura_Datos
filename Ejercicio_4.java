import java.io.*;
public class Ejercicio_4 {
    public static void main (String[] args) throws Exception {
      
        String linea;
        BufferedReader teclado=new BufferedReader
        (new InputStreamReader(System.in));
      int minuto_precio=355;
    double iva=0.2 ;
    
    System.out.print("Escribe cuanto duro la llamada(minutos): ");
        linea = teclado.readLine();
        int minuto= Integer.parseInt(linea);
        double precio_inicial=minuto*minuto_precio;
        System.out.println("El precio final de la llamada va a ser de: "+((precio_inicial*0.2)+precio_inicial));
}
}