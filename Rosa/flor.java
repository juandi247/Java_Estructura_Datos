
public class flor{
public static void main(String[]args){

atributos flor1=new atributos();




flor1.SetColor("Verde");
flor1.SetNpetalos(15);
flor1.SetNrosas(6);
flor1.SetTamaño(35.4f);
System.out.println("color"+flor1.GetColor());


precio(flor1.GetTamaño());
calculo(flor1.GetNpetalos(),flor1.GetNrosas());

volumen(flor1.GetTamaño(),25.4f);



}
//metodos
public static void calculo (int a, int b){
double ratio=a/b;
System.out.println("El ratio o numero de petalos con respecto a cada rosa es de "+ratio);
    }


public static void volumen(double altura,float ancho){
double volumen=altura*ancho*Math.sin(90);
System.out.println("El volumen de la rosa es de "+volumen);

}


public static void precio(double altura){
    if (altura>=20){
        System.out.println("El precio de la rosa es de "+altura*15+"$");
    }
    else{
        System.out.println("el precio de la rosa será de "+altura*20+"$");
}}

}