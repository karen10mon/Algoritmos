import java.util.Scanner;
public class Algoritmo2 {
    public static void main(String[] args) {
      Scanner dato=new Scanner(System.in) ;
      System.out.println("+++++++Algoritmo de Multiplicador constante++++++++");
      int semilla,constante,r,semilla2,ssemilla,longitud;
      System.out.println("Ingrese el valor de la semilla:  ");
      semilla =dato.nextInt();
      System.out.println("Ingrese el numero de repeticiones: ");
      r = dato.nextInt();
      
      longitud = String.valueOf(semilla).length(); 
      if(longitud==4){
          System.out.println("Ingrese el valor de la constante:");
         constante = dato.nextInt();
         longitud = String.valueOf (constante).length();
         if(longitud==4){
         System.out.println("++++Numeros aleatorios+++");
         
      for(int i=0; i<r; i++){       
      semilla2=semilla*constante;
      String semillal;
      semillal = Integer.toString(semilla2);
      ssemilla = semillal.length();
      
      String semilla3;
      semilla3 = semillal;
      String semi;
      semi= semillal.substring(2,6);
      
     semilla2 = Integer.parseInt(semi);
     System.out.print("\n Constante"+1+"["+constante+"]"
             +"  Y " +" [" + semilla+"]"+ " =" +semilla3+
             "  centro= "+semi+ "  R" +(i+1)+"= 0."+semi);
     
      semilla =semilla2;
      System.out.println();
    }
         }else{
             System.out.println("Ingrese un valor de 4 digitos:");   
         }
      }else{
         System.out.println("Ingrese un valor de 4 digitos;");    
    }
    }
    }

