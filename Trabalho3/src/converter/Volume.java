package converter;

public class Volume {
	
	private double miliLitros;
	private double litros;
	private double milimetrosCubicos;
	private double centimetrosCubicos;
	private double decimetrosCubicos;
	private double metrosCubicos;
	private double pesCubicos;
	
	// Função usada para converter os valores de volume 
	
	public void converteVol(double valor, int unidadeMedida)
	{
		switch(unidadeMedida)
		{
	// Caso o usuário escolha mililitros
		case 1:
			this.litros = valor / 1000;
			this.milimetrosCubicos = valor * 1000;
			this.centimetrosCubicos = valor ;               // Em cada caso é calculado todos os 
			this.decimetrosCubicos = valor / 1000;          //       valores possíveis
			this.metrosCubicos = valor / 1000000;
			this.pesCubicos = valor / 28317;
			break;
			
			
	// Caso o usuário escolha litros
		case 2:
			this.miliLitros = valor * 1000;
			this.milimetrosCubicos = valor * 1000000;
			this.centimetrosCubicos = valor * 1000;
			this.decimetrosCubicos = valor;
			this.metrosCubicos = valor / 1000;
			this.pesCubicos = valor / 28.317;
			break;
			
			
	// Caso o usuário escolha milímetros cúbicos
		case 3:
			this.miliLitros = valor / 1000;
			this.litros = valor / 1000000;
			this.centimetrosCubicos = valor / 1000;
			this.decimetrosCubicos = valor / 1000000;
			this.metrosCubicos = valor / 1000000000;
			this.pesCubicos = valor / 28320000;
			break;
			
			
	// Caso o usuário escolha centímetros cúbicos
		case 4:
			this.miliLitros = valor;
			this.litros = valor / 1000;
			this.milimetrosCubicos = valor * 1000;
			this.decimetrosCubicos = valor / 1000;
			this.metrosCubicos = valor / 1000000;
			this.pesCubicos = valor / 28317;
			break;
			
			
	// Caso o usuário escolha decímetros cúbicos
		case 5:
			this.miliLitros = valor * 1000;
			this.litros = valor;
			this.milimetrosCubicos = valor * 1000000;
			this.centimetrosCubicos = valor * 1000;
			this.metrosCubicos = valor / 1000;
			this.pesCubicos = valor / 28.317;
			break;
			
			
	// Caso o usuário escolha metros cúbicos
		case 6:
			this.miliLitros = valor * 1000000;
			this.litros = valor * 1000;
			this.milimetrosCubicos = valor * 1000000000;
			this.centimetrosCubicos = valor * 1000000;
			this.decimetrosCubicos = valor * 1000;
			this.pesCubicos = valor * 35.315;
			break;
			
			
	// Caso o usuário escolha pés cúbicos
		case 7:
			this.miliLitros = valor * 28317;
			this.litros = valor * 28.317;
			this.milimetrosCubicos = valor * 28320000;
			this.centimetrosCubicos = valor * 28317;
			this.decimetrosCubicos = valor * 28.317;
			this.metrosCubicos = valor / 35.315;
			break;
		}
	}
	
	
	// Abaixo constam os getters e setters
	
	
	
	public double getMiliLitros() {
		return miliLitros;
	}
	public void setMiliLitros(double miliLitros) {
		this.miliLitros = miliLitros;
	}
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	public double getMilimetrosCubicos() {
		return milimetrosCubicos;
	}
	public void setMilimetrosCubicos(double milimetrosCubicos) {
		this.milimetrosCubicos = milimetrosCubicos;
	}
	public double getCentimetrosCubicos() {
		return centimetrosCubicos;
	}
	public void setCentimetrosCubicos(double centimetrosCubicos) {
		this.centimetrosCubicos = centimetrosCubicos;
	}
	public double getDecimetrosCubicos() {
		return decimetrosCubicos;
	}
	public void setDecimetrosCubicos(double decimetrosCubicos) {
		this.decimetrosCubicos = decimetrosCubicos;
	}
	public double getMetrosCubicos() {
		return metrosCubicos;
	}
	public void setMetrosCubicos(double metrosCubicos) {
		this.metrosCubicos = metrosCubicos;
	}
	public double getPesCubicos() {
		return pesCubicos;
	}
	public void setPesCubicos(double pesCubicos) {
		this.pesCubicos = pesCubicos;
	}
	public double getVol(int n)
	{
		switch (n)
		{
		case 1:
			return this.miliLitros;
		case 2:
			return this.litros;
		case 3:
			return this.milimetrosCubicos;
		case 4:
			return this.centimetrosCubicos;
		case 5:
			return this.decimetrosCubicos;
		case 6:
			return this.metrosCubicos;
		case 7:
			return this.pesCubicos;
		}
		return 0;
	}
}
