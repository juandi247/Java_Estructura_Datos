import java.io.*;
public class Ejercicio_1_Java {
    public static void main (String[] args) throws Exception {
        int num1,num2,elegir;
        String linea;
        BufferedReader teclado=new BufferedReader
        (new InputStreamReader(System.in));

        
        System.out.print("Escribe el numero: ");
        linea = teclado.readLine();
        num1= Integer.parseInt(linea);
        
       
        System.out.print("Escribe otro numero: ");
        linea = teclado.readLine();
        num2= Integer.parseInt(linea);
        while(num1<0 || num2<=0) {
            System.out.println("no se pueden numeros negativos");

            System.out.print("Escribe el numero: ");
        linea = teclado.readLine();
        num1= Integer.parseInt(linea);
        
       
        System.out.print("Escribe otro numero: ");
        linea = teclado.readLine();
        num2= Integer.parseInt(linea);
        }
       
        System.out.printf("Escoje el tipo de operacion %n1.Suma%n2.Resta%n3.Mutliplicacion%n4.Division");
        System.out.println(": ");
        linea = teclado.readLine();
        elegir= Integer.parseInt(linea);
  

        switch(elegir){
case 1: System.out.print(num1+num2);
break;
case 2: System.out.print(num1-num2);
break;
case 3: System.out.print(num1*num2);
break;
case 4: System.out.print(num1/num2);
break;
default:
System.out.print("escribe el numero correctamente")
;
        }


        System.exit(0);



    }
}
