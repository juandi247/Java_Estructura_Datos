//JUEGO JUANDI DIAZ

import java.io.*;

public class Juego {
    public static void main (String[] args) throws Exception {
        double precio_inicial, precio_final,precio_descuent;
        int id,digito;
        String linea;
        BufferedReader teclado=new BufferedReader( 
            new InputStreamReader(System.in));
        System.out.println("Escribe el precio del juego: ");
        linea = teclado.readLine();precio_inicial=Double.parseDouble(linea);
        System.out.println("El precio es: "+precio_inicial);


        System.out.print("Escribe tu id(solo numeros): ");
        linea = teclado.readLine();id=Integer.parseInt(linea);
        digito = id%10;

        
        System.out.println("su descuento sera del "+digito+"%");
        precio_descuent=(precio_inicial*digito/100)+precio_inicial;
        System.out.println("Precio con descuento: "+precio_descuent);

       double iva=(precio_descuent*19/100);
       System.out.println("Precio del IVA: "+iva);

       precio_final=precio_descuent+iva;
       System.out.println("EL precio final con el descuento aplicado mas el iva de 19% es de: "+precio_final);


//Juego Juan Diego Diaz







        





        
    }
}
