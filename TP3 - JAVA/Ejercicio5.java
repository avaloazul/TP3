import java.util.Scanner;

public class total {
public static void main(String[]args) {
Scanner f new Scanner(System.in);
int num,acumulador=0;
System.out.println("Para terminar el programa digite 99999");
	do{
	System.out.println("indique un numero:");
	num=f.nextInt();
if(num<99999){
	acumulador=acumulador+num;
	}else{
		System.out.println("La carga ha finalizado");
	}
}while(num<99999);
	if(acumulador==0){
		System.out.println("El valor acumulado es igual a 0");
		}else if(acumulador>0){
			System.out.println("El valor acumulado es mayor a 0");
	}else{
		System.out.println("El valor acumulado es menor a 0");
}
	System.out.println("El total de la suma de los numeros: " + acumulador);
}
}