
package newpackage;

public class Excepcion extends Exception {
    public Excepcion(){
        super("ha introducido un 5");
    }
    public void mensajeError(){
        System.out.println("ha introducido un 5...");
    }
}
