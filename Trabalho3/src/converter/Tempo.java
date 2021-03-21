package converter;

public class Tempo {
	
	private double miliSegundo;
	private double segundo;
	private double minuto;
	private double hora;
	private double dia;
	private double semana;
	private double mes;
	private double ano;
	
	// Fun��o usada para fazer as convers�es
	
	public void converteTempo(double valor, int unidadeMedida)
	{
		/* Esses longs armazenam valores grandes utilizados em algumas convers�es  */
		
		long duzentos62Elevado9 = 2628000000L;    // Representa o n�mero 2,628 x 10 elevado a 9
		long tresentos15Elevado10 = 31540000000L; // Repreesenta o n�mero 3,154 x 10 elevado a 10
		switch (unidadeMedida)
		{
		// Caso o usu�rio escolha milisegundos
		case 1:
			this.segundo = valor / 1000;
			this.minuto = valor / 60000;
			this.hora = valor / 3600000;                   // Em cada caso j� � calculado todas
			this.dia = valor / 86400000;				   //        as possibilidades
			this.semana = valor / 604800000; 
			this.mes = valor / duzentos62Elevado9;
			this.ano = valor / tresentos15Elevado10;
			break;
			
			
		// Caso o usu�rio escolha segundos
		case 2:
			this.miliSegundo = valor * 1000;
			this.minuto = valor / 60;
			this.hora = valor / 3600;
			this.dia = valor / 86400;
			this.semana = valor / 604800;
			this.mes = valor / 2628000;
			this.ano = valor / 31540000;
			break;
			
			
		// Caso o usu�rio escolha minutos
		case 3:
			this.miliSegundo = valor * 60000;
			this.segundo = valor * 60;
			this.hora = valor / 60;
			this.dia = valor / 1440;
			this.semana = valor / 10080;
			this.mes = valor / 43800;
			this.ano = valor / 525600;
			break;
			
						
		// Caso o usu�rio escolha horas
		case 4:
			this.miliSegundo = valor * 3600000;
			this.segundo = valor * 3600;
			this.minuto = valor * 60;
			this.dia = valor / 24;
			this.semana = valor / 168;
			this.mes = valor / 730;
			this.ano = valor / 8760;
			break;
			
			
		// Caso o usu�rio escolha dia
		case 5:
			this.miliSegundo = valor * 86400000;
			this.segundo = valor * 86400;
			this.minuto = valor * 1440;
			this.hora = valor * 24;
			this.semana = valor / 7;
			this.mes = valor / 30.417;
			this.ano = valor / 365;
			break;
			
			
		// Caso o usu�rio escolha semanas
		case 6:
			this.miliSegundo = valor * 604800000;
			this.segundo = valor * 604800;
			this.minuto = valor * 10080;
			this.hora = valor * 168;
			this.dia = valor * 7;
			this.mes = valor / 4.345;
			this.ano = valor / 52.143;
			break;
			
			
		// Caso o usu�rio escolha mes
		case 7:
			this.miliSegundo = valor * duzentos62Elevado9;
			this.segundo = valor * 2628000;
			this.minuto = valor * 43800;
			this.hora = valor * 730;
			this.dia = valor * 30.417;
			this.semana = valor * 4.345;
			this.ano = valor / 12;
			break;
			
			
		// Caso o usu�rio escolha ano
		case 8:
			this.miliSegundo = valor * tresentos15Elevado10;
			this.segundo = valor * 31540000;
			this.minuto = valor * 525600;
			this.hora = valor * 8760;
			this.dia = valor * 365;
			this.semana = valor * 52.1429;
			this.mes = valor * 12;
			break;
		
		}
	}
	
	
	
	// Abaixo consta os getters e setters
	
	
	public double getMiliSegundo() {
		return miliSegundo;
	}
	public void setMiliSegundo(double miliSegundo) {
		this.miliSegundo = miliSegundo;
	}
	public double getSegundo() {
		return segundo;
	}
	public void setSegundo(double segundo) {
		this.segundo = segundo;
	}
	public double getMinuto() {
		return minuto;
	}
	public void setMinuto(double minuto) {
		this.minuto = minuto;
	}
	public double getHora() {
		return hora;
	}
	public void setHora(double hora) {
		this.hora = hora;
	}
	public double getDia() {
		return dia;
	}
	public void setDia(double dia) {
		this.dia = dia;
	}
	public double getSemana() {
		return semana;
	}
	public void setSemana(double semana) {
		this.semana = semana;
	}
	public double getMes() {
		return mes;
	}
	public void setMes(double mes) {
		this.mes = mes;
	}
	public double getAno() {
		return ano;
	}
	public void setAno(double ano) {
		this.ano = ano;
	}
	public double getTempo(int n)
	{
		switch (n)
		{
		case 1:
			return this.miliSegundo;
		case 2:
			return this.segundo;
		case 3:
			return this.minuto;
		case 4:
			return this.hora;
		case 5:
			return this.dia;
		case 6:
			return this.semana;
		case 7:
			return this.mes;
		case 8:
			return this.ano;
		}
		return 0;
	}

}
