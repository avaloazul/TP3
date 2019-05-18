import java.util.Scanner;
public class Operaciones {
    private Scanner teclado;
    private int num1,num2,suma,multiplicacion,resta,division;
    public void carga(){
        teclado=new Scanner(System.in);
        System.out.print("Ingrese un valor para el primer número: ");
        num1=teclado.nextInt();
        System.out.print("Ingrese un valor para el segundo número: ");
        num2=teclado.nextInt();
    }    
    public void suma(){
        suma=num1+num2;
    }
    public void resta(){
        resta=num1-num2;
    }
    public void multiplicar(){
        multiplicacion=num1*num2;
    }
    public void dividir(){
        division=num1/num2;
    }
    public void mostrarResultados(){
        System.out.println("La suma de los números ingresados es: " +suma);
        System.out.println("La resta de los números ingresados es: " +resta);
        System.out.println("La multiplicación de los números ingresados es: " +multiplicacion);
        System.out.println("La división de los números ingresados es: " +division);
    }
    public static void main (String args[]){
        Operaciones operacion1 = new Operaciones();
        operacion1.carga();
        operacion1.suma();
        operacion1.resta();
        operacion1.multiplicar();
        operacion1.dividir();
        operacion1.mostrarResultados();
    }
}