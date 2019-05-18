import java.util.Scanner;

public class imp {
public static void main(String[]args) {
	int n,impar=0,par=0;
	float numero;
	Scanner entrada = new Scanner (System.in);
	System.out.println("Este programa le pedirá que inserte 10 números");
	for (n=1;n<=10;n=n+1) {
	System.out.println("Numero:");
	numero=entrada.nextFloat();
	if(numero%2==0) {
	par=par+1;
	} else {
	impar=impar+1;}
	}
	System.out.printf("Los impares son:%d\n",impar);
	System.out.printf("Los pares son:%d\n",par);
}	
}