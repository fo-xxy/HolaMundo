/*Para que el susuario agrege datos se agre una libreria*/
/*nombre de pquete*/
import java.util.Scanner;
public class Principal {

    /*Se crea un metodo */
    public static void main(String[] args){
        /*Se hace una instancia de la libreria scanner y se le crea un objeto en este caso es teclado*/
        Scanner teclado = new Scanner(System.in);

        /*Le mostramos al usuario que ingrese datos*/
        System.out.println("Ingresa el primer número");

        /*Se define el tipo de dato que el usuario agregará*/
        int primerNumero = teclado.nextInt();

        System.out.println("Ingresa el segundo número");
        int segundoNumero = teclado.nextInt();




        /*Se le da la condicion para que muestre */
        System.out.print("La suma es " + (primerNumero+segundoNumero));
    }
}
