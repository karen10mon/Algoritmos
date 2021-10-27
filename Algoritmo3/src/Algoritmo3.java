import java.util.Scanner;
public class Algoritmo3 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in) ;
        int x,a,b,c,m;
        int valor;
        float n;
        
      System.out.println("+++++++Algoritmo congruencial lineal++++++++");
      System.out.println("Ingrese el valor de la semilla:  ");
      x =dato.nextInt();
      System.out.println("Ingrese una constante multiplicativa: ");
      a = dato.nextInt();
      System.out.println("Ingrese la aditiva: ");
      b = dato.nextInt();
      System.out.println("Ingrese el modulo: ");
      c = dato.nextInt();
      System.out.println("Ingrese el número de iteraciones: ");
      m = dato.nextInt();
      System.out.println("\n|     xi        |    xi+1   |    ri   | ");
      for (int i=1;i<m;i++){
          valor= (a*x+b)%c;
          n = (float)valor/(float)(c);
           System.out.println("|   "+" x"+i+"=   "+x+"   |   ("+valor+")   |   "+n+"   | ");
           x = valor;
          
      }
     
    }
    
}
