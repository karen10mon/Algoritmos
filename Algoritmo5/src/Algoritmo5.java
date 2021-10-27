import java.util.Scanner;
public class Algoritmo5 {
    
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in) ;
        int a,b,res=0;
        
    do{
         a = 1+(int)(Math.random()*6);   
         b = 1+(int)(Math.random()*6);
             System.out.println("El resultado del primer dado es: " +a);
             System.out.println("El resultado del segundo dado es: " +b);
             System.out.println("La suma del lanzamiento de los dos dados" + "dados es: "+(a+b)+"\n");
             System.out.println("Ingrese 1 para salir ");res= dato.nextInt();
   
    }while(res!=1);
    System.out.println("*-*-*-*-*-*-*-Exit*-*-**-*-*-*");
               
        }}
    

