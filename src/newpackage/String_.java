
package newpackage;
import java.util.Scanner;


public class String_ extends Exception{
    static private int numero;
    static private int numero2;
   //cambio
    public static void main (String []args){     
        Scanner entrada = new Scanner(System.in);
        System.out.print("2 ingrese un numero: ");
        try{           
            numero2=entrada.nextInt();
            if (numero2==5){
                throw new String_();
            }
        }catch(String_ e){  
            e.mensajeError();
        }       
    }
    public void mensajeError(){
        System.out.println("introdujo un 5");
    }
            
}
