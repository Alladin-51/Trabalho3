package converter;

public class Peso {

	private double miliGrama;
	private double grama;
	private double kiloGrama;
	private double libra;
	private double tonelada;
	
	
	// Função usada para fazer as conversões de peso
	
public void convertePeso(double valor, int unidadeMedida) {
		
		switch (unidadeMedida)
		{
	// Caso o usuário escolha miligrama
		case 1:
			this.grama = valor / 1000;
			this.kiloGrama = valor / 1000000;            // Em cada caso é calculado todos os 
			this.libra = valor / 453592;                 //         valores possíveis
			this.tonelada = valor / 1000000000;
			break;
			
			
	// Caso o usuário escolha grama
		case 2:
			this.miliGrama = valor * 1000;
			this.kiloGrama = valor / 1000;
			this.libra = valor / 453.592;
			this.tonelada = valor / 1000000;
			break;
			
			
	// Caso o usuário escolha quilograma
		case 3:
			this.miliGrama = valor * 1000000;
			this.grama = valor * 1000;
			this.libra = valor * 0.453592;
			this.tonelada = valor / 1000;
			break;
			
	// Caso o usuário escolha libra
	
		case 4:
			this.miliGrama = valor * 453592;
			this.grama = valor * 453.592;
			this.kiloGrama = valor * 0.453592;
			this.tonelada = valor * 0.000453592;
			break;
			
			
	// Caso o usuário escolha tonelada
		case 5:
			this.miliGrama = valor * 1000000000;
			this.grama = valor * 1000000;
			this.kiloGrama = valor * 1000;
			this.libra = valor * 2205;
			break;
		
		}
}
	
	
	// Abaixo constam os getters e setters
	
	public double getMiliGrama() {
		return miliGrama;
	}
	public void setMiliGrama(double miliGrama) {
		this.miliGrama = miliGrama;
	}
	public double getGrama() {
		return grama;
	}
	public void setGrama(double grama) {
		this.grama = grama;
	}
	public double getKiloGrama() {
		return kiloGrama;
	}
	public void setKiloGrama(double kiloGrama) {
		this.kiloGrama = kiloGrama;
	}
	public double getLibra() {
		return libra;
	}
	public void setLibra(double libra) {
		this.libra = libra;
	}
	public double getTonelada() {
		return tonelada;
	}
	public void setTonelada(double tonelada) {
		this.tonelada = tonelada;
	}
	public double getPeso(int n)
	{
		switch (n)
		{
		case 1:
			return this.miliGrama;
		case 2:
			return this.grama;
		case 3:
			return this.kiloGrama;
		case 4:
			return this.libra;
		case 5:
			return this.tonelada;
		
		}
		return 0;
	}
	
	
}
