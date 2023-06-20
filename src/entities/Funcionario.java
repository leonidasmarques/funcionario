package entities;

public class Funcionario {
	
	public String name;
	public double salarioBruto;
	public double imposto;
	
	
	public double salarioReajustado(double x) {
		double aux;
		aux = salarioBruto + x;
		return aux;
	}
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	
	
	
	
}
