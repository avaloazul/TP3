import java.util.Scanner;

public class Ejercicio1 {
  public static void main (String[]ar){
    Scanner teclado = new Scanner (System.in);
    int cantidad;
    float precio;
    float importe;
    System.out.print("Ingrese la cantidad de articulos a llevar:");
    cantidad = teclado.nextInt();
    System.out.print("Ingrese el valor unitario del producto:");
    precio=teclado.nextFloat();
    importe=precio*cantidad;
    System.out.print("El importe a pagar es:");
    System.out.print(importe);
  }
}