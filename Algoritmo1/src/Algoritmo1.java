import java.util.Scanner;       
public class Algoritmo1 {
    public static void main(String[] args) {
      Scanner dato=new Scanner(System.in) ;
      System.out.println("+++++++Algoritmo de cuadrados medios++++++");
      int xinicial,semilla,r,xcuadrada,scuadrada= 0;
      System.out.println("Ingrese el valor de la semilla:  ");
      xinicial =dato.nextInt();
      System.out.println("Ingrese el numero de repeticiones: ");
      r = dato.nextInt();
      semilla = String.valueOf(xinicial).length();
      String semi, semilla2;
      
      if(semilla>3){
          System.out.println("+++Numeros aleatorios+++");
          for(int i=0; i<r; i++){
              
      xcuadrada =(int) Math.pow(xinicial, 2);
      semilla2 = Integer.toString(xcuadrada);
      scuadrada = semilla2.length();
      int p = (scuadrada - semilla)/2;
      semi =semilla2.substring (p,p + semilla);
      
      System.out.print("\n"+"Y"+ i + "= "+ xinicial+ "X"
              +(i+i)+  "= " + xcuadrada+ "r" + (i+1)+ "= 0." + semi);
      xinicial = Integer.parseInt(semi);
          }
          System.out.println();
      }else{
          System.out.println("¡Error! Ingrese una semilla mayor a 3 digitos");
      }
    }
}
          
     
    
    

