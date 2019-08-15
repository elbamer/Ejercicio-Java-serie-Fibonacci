package serieFibonacci;
import java.util.Scanner;

public class SeriFibonacci {

	public static void main(String[] args) {
		int numeroUno=0;
		int numeroDos=1;
		int aux;
		Scanner leer= new Scanner (System.in);
		System.out.println("Introduce cantidad de numeros para serie Fibonacci");
		int max=leer.nextInt();	
		
		for (int i = 0; i<=max;i++) {
			System.out.println(numeroUno);					
			aux=numeroUno+numeroDos;
			numeroUno=numeroDos;
			numeroDos=aux;	

		}
	}

}
