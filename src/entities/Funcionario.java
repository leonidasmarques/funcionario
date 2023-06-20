package entities;

public class Funcionario {
	
	public String name;
	public double salarioBruto;
	public double imposto;
	
	
	public double salarioReajustado(double x) {
		double aux;
		aux = (salarioBruto / 100 ) * x;
		return salarioLiquido() + aux;
	}
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	@Override
	public String toString() {
		return "Funcionario: Nome: " 
				+ name + ", Salario Liquido: R$" 
				+ String.format("%.2f", salarioLiquido());
	}
	
	
	
	
	
}
