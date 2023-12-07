package aula01;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario, abono, novoSalario;
		
		System.out.println("Digite o valor do salário: ");
		Scanner valor1 = new Scanner (System.in);
		salario = valor1.nextFloat();
		
		System.out.println("Digite o valor do abono: ");
		Scanner valor2 = new Scanner (System.in);
		abono = valor2.nextFloat();
		
		novoSalario = salario + abono; 
		System.out.print("Seu novo salário é : "+novoSalario);
		
		
		
		
		
		
		

	}

}
