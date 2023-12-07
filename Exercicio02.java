package aula01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		float n1, n2, n3, n4, soma;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite a nota do aluno: ");
		n1 = leia.nextFloat();
		
		System.out.print("Digite a nota do aluno: ");
		n2 = leia.nextFloat();
		
		System.out.print("Digite a nota do aluno: ");
		n3 = leia.nextFloat();
		
		System.out.print("Digite a nota do aluno: ");
		n4 = leia.nextFloat();
		
		soma = (n1 + n2 + n3 + n4)/4;
		
		System.out.println("Média final do participante: "+soma); 
		
				
		
		
		
		
	}

}
