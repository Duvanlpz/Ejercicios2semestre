import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba algo: ");
        String texto = scanner.nextLine();
        System.out.println("El texto ingresado es: " + texto);
    }
}