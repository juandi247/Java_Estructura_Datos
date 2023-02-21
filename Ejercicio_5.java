import java.io.*;
public class Ejercicio_5 {
    public static void main (String[] args) throws Exception {
      
        String linea;
        BufferedReader teclado=new BufferedReader
        (new InputStreamReader(System.in));

Double precio,descuento,precio_final;

System.out.print("Escribe el precio del medicamento: ");
        linea = teclado.readLine();
        precio=  Double.parseDouble(linea);
        descuento=0.2;
        System.out.println("Escribe `principal` para saber si es comprado en la principal: ");
        
        String eleccion = teclado.readLine();
     


    
       
        if (eleccion.equals("principal")){
            System.out.println("si aplica descuento");
             precio_final=precio-(precio*descuento);
             System.out.println("(Precio final: "+precio_final);
            
        }
        else{
            System.out.println("(no aplica descuento)el precio final va a ser: "+precio);
        }


    }
    
}
