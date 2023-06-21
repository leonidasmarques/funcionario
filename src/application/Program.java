package application;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Funcionario func = new Funcionario();
		
		System.out.println("Informe o nome do funcionario: ");
		func.name = sc.nextLine();
		System.out.println("Informe o salario do funcionario: ");
		func.salarioBruto = sc.nextDouble();
		System.out.println("Informe o imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.print(func);
		System.out.println();
		double percent = 0;
		System.out.println("Qual o percentual de aumento de salario?");
		percent = sc.nextDouble();
		
		System.out.printf("O salario ajustado é: R$%.2f", func.salarioReajustado(percent));
		sc.close();
	}

}
