import java.util.*;

public class dig {

public static void main(String[]args) {
Scanner tecla=new Scanner(System.in);
int numero;
System.out.print("Por favor, ingrese un valor entero de 1 o 2 digitos:");
numero=tecla.nextInt();
if (numero<10) {
System.out.print("Tiene un digito");	
} else {	
System.out.print("Tiene dos digitos");
}
}
}