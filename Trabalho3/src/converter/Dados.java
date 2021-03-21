package converter;

public class Dados {

	private double bit;
	private double bytes;
	private double kiloByte;
	private double kibByte;
	private double kibBit;
	private double megaBit;
	private double gigaBit;
	
	// Função usada para fazer a conversão de dados
	
	public void converteDado(double valor, int unidadeMedida)
	{
		switch (unidadeMedida)
		{
	// Caso o usuário escolha bit
		case 1:
			this.bytes = valor / 8;
			this.kiloByte = valor / 8000;                // Em cada caso é calculado todos os 
			this.kibByte = valor / 8192;                 //         valores possíveis
			this.kibBit = valor / 1024;
			this.megaBit = valor / 1000000;
			this.gigaBit = valor / 1000000000;
			break;
			
			
	// Caso o usuário escolha byte
		case 2:
			this.bit = valor * 8;
			this.kiloByte = valor / 1000;
			this.kibByte = valor / 1024;
			this.kibBit = valor / 128;
			this.megaBit = valor / 125000;
			this.gigaBit = valor / 125000000;
			break;
			
			
	// Caso o usuário escolha kilobytes
		case 3:
			this.bit = valor * 8000;
			this.bytes = valor * 1000;
			this.kibByte = valor / 1.024;
			this.kibBit = valor * 7.812;
			this.megaBit = valor / 125;
			this.gigaBit = valor / 125000;
			break;
			
			
	// Caso o usuário escoolha kybibytes
		case 4:
			this.bit = valor * 8192;
			this.bytes = valor * 1024;
			this.kiloByte = valor * 1.024;
			this.kibBit = valor * 8;
			this.megaBit = valor / 122;
			this.gigaBit = valor / 122070;
			break;
			
			
	// Caso o usuário escolha kibibit
		case 5:
			this.bit = valor * 1024;
			this.bytes = valor * 128;
			this.kiloByte = valor / 7.812;
			this.kibByte = valor / 8;
			this.megaBit = valor / 977;
			this.gigaBit = valor / 976562;
			break;
			
			
	// Caso o usuário escolha megabit
		case 6:
			this.bit = valor * 1000000;
			this.bytes = valor * 125000;
			this.kiloByte = valor * 125;
			this.kibByte = valor * 122;
			this.kibBit = valor * 977;
			this.gigaBit = valor / 1000;
			break;
			
			
	// Caso o usuário escolha gigabit
		case 7:
			this.bit = valor * 1000000000;
			this.bytes = valor * 125000000;
			this.kiloByte = valor * 125000;
			this.kibByte = valor * 122070;
			this.kibBit = valor * 976563;
			this.megaBit = valor * 1000;
			break;
			
		}
	}
	
	// A baixo constam os getters e setters

	public double getBit() {
		return bit;
	}

	public void setBit(double bit) {
		this.bit = bit;
	}

	public double getBytes() {
		return bytes;
	}

	public void setBytes(double bytes) {
		this.bytes = bytes;
	}

	public double getKiloByte() {
		return kiloByte;
	}

	public void setKiloByte(double kiloByte) {
		this.kiloByte = kiloByte;
	}

	public double getKibByte() {
		return kibByte;
	}

	public void setKibByte(double kibByte) {
		this.kibByte = kibByte;
	}

	public double getKibBit() {
		return kibBit;
	}

	public void setKibBit(double kibBit) {
		this.kibBit = kibBit;
	}

	public double getMegaBit() {
		return megaBit;
	}

	public void setMegaBit(double megaBit) {
		this.megaBit = megaBit;
	}

	public double getGigaBit() {
		return gigaBit;
	}

	public void setGigaBit(double gigaBit) {
		this.gigaBit = gigaBit;
	}
	public double getDados(int n)
	{
		switch (n)
		{
		case 1:
			return this.bit;
		case 2:
			return this.bytes;
		case 3:
			return this.kiloByte;
		case 4:
			return this.kibByte;
		case 5:
			return this.kibBit;
		case 6:
			return this.megaBit;
		case 7:
			return this.gigaBit;
		}
		return 0;
	}
	
}
