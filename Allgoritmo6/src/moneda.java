import java.util.Random;
import java.util.Scanner;
class moneda {
     public void lanzar(){
        Random probable = new Random();
        int n, pro=2,sol=0,aguila = 0,cen=0;
               
        Scanner dato =new  Scanner(System.in);
         
        while(1!=cen){
        n = probable.nextInt(pro);
        if(0==n){
            sol++;
            System.out.println("Resultado del lanzamiento = sol");
      }else{
            aguila++;
            System.out.println("Resultado del lanzamiento = aguila");
       }
        System.out.println("Desea realizar otro lanzamiento?");
        System.out.println("\n Ingrese el valor 1 para terminar");
        cen=dato.nextInt();
        }
        System.out.println("El total de soles obtenidos es: "+sol);
        System.out.println("El total de Aguilas obtenidos es: "+aguila);
        System.out.println("*-*-*-*-*-*-*-Exit*-*-**-*-*-*");
               
    }
       
    }
    
    

