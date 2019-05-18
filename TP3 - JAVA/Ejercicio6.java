import java.util.Scanner;

public class Empleado {
    private Scanner teclado;
    private String nombre;
    private int sueldo;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = teclado.next();
        System.out.print("Ingrese el sueldo del empleado: ");
        sueldo = teclado.nextInt();
    }
    public void imprimeDatos(){
        System.out.println("Empleado: " +nombre);
        System.out.println("Sueldo: " +sueldo);
    }
    public void imprimeImpuesto(){
        if(sueldo>3000)
            System.out.println("El empleado debe pagar impuesto");
        else
            System.out.println("El empleado no debe pagar impuesto");
    }
    public static void main (String args[]){     
        Empleado empleado1 = new Empleado();
        empleado1.inicializar();
        empleado1.imprimeDatos();
        empleado1.imprimeImpuesto();
    }  
}