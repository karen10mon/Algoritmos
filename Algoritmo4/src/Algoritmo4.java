import java.util.Scanner;
public class Algoritmo4 {
    
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in) ;
        int X0,k,g,n;
       float num;
       System.out.println("+++++++Algoritmo congruencial Multiplicativo++++++++");
      System.out.println("Ingrese el valor de la semilla:  ");
      X0 =dato.nextInt();
      if (X0%2==1){
      System.out.println("Ingrese el valor de k:  ");
      k=dato.nextInt();
      System.out.println("Ingrese el valor de g:  ");
      g =dato.nextInt();
      System.out.println("Ingrese el número de iteraciones:  ");
      n =dato.nextInt();
      
      int m= (int) Math.pow(k,g);
      int a= 3+8*k;
     System.out.print("m= "+m);
     System.out.print(" a= "+a);
      System.out.println("\n\n|  i  |  X0  |  mod(m)  |  ri  |");
     for (int i=1;i<n;i++){
          int numero =  (a*X0)%m;
          num= (float)numero/((float) (m)-1);
          System.out.println("|  "+i+"  |  "+X0+"  |  "+numero+"  |  "+num+"  |  ");
          X0 = numero;
       
      }
      }else{
          System.out.println("¡Error! Ingrese un número que sea impar");
          
      }
       
    }
    
}
