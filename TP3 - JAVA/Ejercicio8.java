import java.util.Scanner;
class Persona{
    protected Scanner entrada;
    protected String nombre;
    protected int edad;
    public Persona() {
        entrada=new Scanner(System.in);}
public void cargarDatos() {
            System.out.print("Ingrese nombre:");
            nombre=entrada.next();
            System.out.print("ingrese edad:");
            edad=entrada.nextInt();}
public void imprimirDatos() {
            System.out.println("Nombre:"+nombre);
            System.out.println("Edad:"+edad);}}
class Empleado extends Persona {
        protected int sueldo;
public void cargarSueldo() {
            Sysstem.out.print("Ingrese sueldo:");
            sueldo=entrada.nextInt();}
public void imprimirSueldo() {
    System.out.println("El sueldo es:"+sueldo);}}
public class Prueba {
    public static void main(String[]ar) {
        Empleado empleado1=new Empleado();
        empleado1.cargarDatos();
        empleado1.cargarSueldo();
        empleado1.imprimirDatos();
        empleado1.imprimirSueldo();
    }
}
