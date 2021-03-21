package converter;

public class Comprimento {

	private double milimetro;
	private double centimetro;
	private double decimetro;
	private double metro;
	private double kilometro;
	private double milha;
	private double pes;
	
	
	// Função usada para fazer a conversão dos valores de comprimento
	
	public void converteComp(double valor, int unidadeMedida) {
		
		switch (unidadeMedida)
		{
	// Caso o usuário escolha milímetro
		case 1:
			this.centimetro = valor / 10;
			this.decimetro = valor / 100;                   // Em cada caso é calculado todos os 
			this.metro = valor / 1000;                      //         valores possíveis
			this.kilometro = valor / 1000000;
			this.milha = valor / 1609340;
			this.pes = valor / 304.8;
			break;
			
			
	// Caso o usuário escolha centímetro
		case 2:
			this.milimetro = valor * 10;
			this.decimetro = valor / 10;
			this.metro = valor / 100;
			this.kilometro = valor / 100000;
			this.milha = valor / 160934;
			this.pes = valor / 30.48;
			break;
			
			
	// Caso o usuário escolha decímetro
		case 3:
			this.milimetro = valor * 100;
			this.centimetro = valor * 10;
			this.metro = valor / 100;
			this.kilometro = valor / 10000;
			this.milha = valor / 16093.4;
			this.pes = valor / 3.048;
			break;
			
			
	// Caso o usuário escolha metro
		case 4:
			this.milimetro = valor * 1000;
			this.centimetro = valor * 100;
			this.decimetro = valor * 10;
			this.kilometro = valor / 1000;
			this.milha = valor / 1609.34;
			this.pes = valor * 3.281;
			break;
	
			
	// Caso o usuário escolha quilômetro
		case 5:
			this.milimetro = valor * 1000000;
			this.centimetro = valor * 100000;
			this.decimetro = valor * 10000;
			this.metro = valor * 1000;
			this.milha = valor *1.609;
			this.pes = valor * 3281;
			break;
			
			
	// Caso o usuário escolha milha
		case 6:
			this.milimetro = valor * 1690340;
			this.centimetro = valor * 169034;
			this.decimetro = valor * 16903.4;
			this.metro = valor * 1690.34;
			this.kilometro = valor * 1.609;
			this.pes = valor * 5280;
			break;
			
			
	// Caso o usuário escolha pés
		case 7:
			this.milimetro = valor * 304.8;
			this.centimetro = valor * 30.48;
			this.decimetro = valor * 3.048;
			this.metro = valor / 3.281;
			this.kilometro = valor / 3281;
			this.milha = valor / 5280;
			break;
		
		}
		
	}

	
	// Abaixo consta os getters e setters

	public double getMilimetro() {
		return milimetro;
	}


	public void setMilimetro(double milimetro) {
		this.milimetro = milimetro;
	}


	public double getCentimetro() {
		return centimetro;
	}


	public void setCentimetro(double centimetro) {
		this.centimetro = centimetro;
	}


	public double getDecimetro() {
		return decimetro;
	}


	public void setDecimetro(double decimetro) {
		this.decimetro = decimetro;
	}


	public double getMetro() {
		return metro;
	}


	public void setMetro(double metro) {
		this.metro = metro;
	}


	public double getKilometro() {
		return kilometro;
	}


	public void setKilometro(double kilometro) {
		this.kilometro = kilometro;
	}


	public double getMilha() {
		return milha;
	}


	public void setMilha(double milha) {
		this.milha = milha;
	}


	public double getFt() {
		return pes;
	}


	public void setFt(double ft) {
		this.pes = pes;
	}
	
	public double getComp(int n)
	{
		switch (n)
		{
		case 1:
			return this.milimetro;
		case 2:
			return this.centimetro;
		case 3:
			return this.decimetro;
		case 4:
			return this.metro;
		case 5:
			return this.kilometro;
		case 6:
			return this.milha;
		case 7:
			return this.pes;
		}
		return 0;
	}
	
}
