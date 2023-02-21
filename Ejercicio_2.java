import java.io.*;
import static java.lang.Math;
public class Ejercicio_2 {
    public static void main (String[] args) throws Exception {
        Double Radio,Altura;
        String linea;
        BufferedReader teclado=new BufferedReader
        (new InputStreamReader(System.in));
        System.out.println("Pi es " + Math.PI);    
        
        
        System.out.print("Escribe el radio: ");
        linea = teclado.readLine();
        Radio= Double.parseDouble(linea);
                
        System.out.print("Escribe la altura: ");
        linea = teclado.readLine();
        Altura= Double.parseDouble(linea);
       Double radioelevado= Math.pow(Radio, 2);
       System.out.println(radioelevado);

       Double area=(2*(Math.PI*radioelevado)+((2*Math.PI*Radio)*Altura));
       Double Volumen=(Math.PI*radioelevado)*Altura;
               System.out.println("El area del cilindro es: "+area);
               System.out.println("el volumen es: "+Volumen);

        
   


Double a,b,c;
System.out.print("Escribe el Alto (elipsoide): ");
        linea = teclado.readLine();
       a= Double.parseDouble(linea);
                
        System.out.print("Escribe el ancho: ");
        linea = teclado.readLine();
        b= Double.parseDouble(linea);

        System.out.print("Escribe la longitud: ");
        linea = teclado.readLine();
        c= Double.parseDouble(linea);

        System.out.println("El volumen de la elipsoide es: "+ (1.3333333)*Math.PI*a*b*c);
                
      
        System.exit(0);


    }
}
