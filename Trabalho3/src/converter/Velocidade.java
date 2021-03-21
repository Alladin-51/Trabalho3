package converter;

public class Velocidade {

	private double pesSegundo;
	private double metroSegundo;
	private double kilometroSegundo;
	private double metroMinuto;
	private double kilometroMinuto;
	private double kilometroHora;
	private double milhaHora;
	
	
	// Fun��o usada para converter os valores de velocidade
	
public void converteVelo(double valor, int unidadeMedida) {
		
		switch (unidadeMedida)
		{
	// Caso o usu�rio escolha p�s por segundo
		case 1:
			this.metroSegundo = valor / 3.281;
			this.kilometroSegundo = valor / 3280.840;    // Em cada caso � calculados todos os
			this.metroMinuto = valor / 18.288;           //         valores poss�veis
			this.kilometroMinuto = valor / 54.681;
			this.kilometroHora = valor * 1.097;
			this.milhaHora = valor / 1.467;
			break;
			
			
	// Caso o usu�rio escolha metros por segundo
		case 2:
			this.pesSegundo = valor * 3.281;
			this.kilometroSegundo = valor / 1000;
			this.metroMinuto = valor * 60;
			this.kilometroMinuto = valor / 16.667;
			this.kilometroHora = valor * 3.6;
			this.milhaHora = valor * 2.237;
			break;
			
	// Caso o usu�rio escolha quil�metros por segundo
		case 3:
			this.pesSegundo = valor * 3281;
			this.metroSegundo = valor * 1000;
			this.metroMinuto = valor * 60000;
			this.kilometroMinuto = valor * 60;
			this.kilometroHora = valor * 3600;
			this.milhaHora = valor * 2237;
			break;
			
			
	// Caso o usu�rio escolha metros por minuto
		case 4:
			this.pesSegundo = valor / 18.228;
			this.metroSegundo = valor / 60;
			this.kilometroSegundo = valor / 60000;
			this.kilometroMinuto = valor / 1000;
			this.kilometroHora = valor / 16.667;
			this.milhaHora = valor / 26.822;
			break;
			
	// Caso o usu�rio escolha quil�metros por minuto
		case 5:
			this.pesSegundo = valor * 54.681;
			this.metroSegundo = valor * 16.667;
			this.kilometroSegundo = valor / 60;
			this.metroMinuto = valor * 1000;
			this.kilometroHora = valor * 60;
			this.milhaHora = valor * 37.282;
			break;
			
			
	// Caso o usu�rio escolha quil�metros por hora
		case 6:
			this.pesSegundo = valor / 1.097;
			this.metroSegundo = valor / 3.6;
			this.kilometroSegundo = valor / 3600;
			this.metroMinuto = valor * 16.667;
			this.kilometroMinuto = valor / 60;
			this.milhaHora = valor / 1.609;
			break;
			
			
	// Caso o usu�rio escolha milhas por hora
		case 7:
			this.pesSegundo = valor * 1.467;
			this.metroSegundo = valor / 2.237;
			this.kilometroSegundo = valor / 2237;
			this.metroMinuto = valor * 26.822;
			this.kilometroMinuto = valor / 37.282;
			this.kilometroHora = valor * 1.609;
			break;
		}
}

// Abaixo constam os getters e setters

public double getPesSegundo() {
	return pesSegundo;
}

public void setPesSegundo(double pesSegundo) {
	this.pesSegundo = pesSegundo;
}

public double getMetroSegundo() {
	return metroSegundo;
}

public void setMetroSegundo(double metroSegundo) {
	this.metroSegundo = metroSegundo;
}

public double getKilometroSegundo() {
	return kilometroSegundo;
}

public void setKilometroSegundo(double kilometroSegundo) {
	this.kilometroSegundo = kilometroSegundo;
}

public double getMetroMinuto() {
	return metroMinuto;
}

public void setMetroMinuto(double metroMinuto) {
	this.metroMinuto = metroMinuto;
}

public double getKilometroMinuto() {
	return kilometroMinuto;
}

public void setKilometroMinuto(double kilometroMinuto) {
	this.kilometroMinuto = kilometroMinuto;
}

public double getKilometroHora() {
	return kilometroHora;
}

public void setKilometroHora(double kilometroHora) {
	this.kilometroHora = kilometroHora;
}

public double getMilhaHora() {
	return milhaHora;
}

public void setMilhaHora(double milhaHora) {
	this.milhaHora = milhaHora;
}
public double getVelocidade(int n)
{
	switch (n)
	{
	case 1:
		return this.pesSegundo;
	case 2:
		return this.metroSegundo;
	case 3:
		return this.kilometroSegundo;
	case 4:
		return this.metroMinuto;
	case 5:
		return this.kilometroMinuto;
	case 6:
		return this.kilometroHora;
	case 7:
		return this.milhaHora;
	}
	return 0;
}
}

