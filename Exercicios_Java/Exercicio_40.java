package Exercicios_java;
import java.util.Scanner;

public class Exercicio_40 {public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
    int a, b, c; 
  	System.out.print("Verificador de Tri�ngulo\n\n");


    System.out.print("Digite o lado A=");
    a = teclado.nextInt(); 
	
    System.out.print("Digite o lado B=");
    b = teclado.nextInt(); 
	
	System.out.print("Digite o lado C=");
   c = teclado.nextInt(); 
   
   teclado.close();


	if( a < b + c && b < a + c && c < a + b ){ 
		if(a==b && b == c){
			System.out.print("Equil�tero.");
		}else if(a==b || a==c || b==c){ 
			System.out.print("Is�sceles.");
		}else{ 
			System.out.print("Escaleno.");
		}
	}else{
		System.out.print("Valores n�o formam um tri�ngulo");
	}

}

}