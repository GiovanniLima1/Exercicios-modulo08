package aula01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras*5) - descontos);
		System.out.println("Salário líquido: "+salarioLiquido); 

	}

}
