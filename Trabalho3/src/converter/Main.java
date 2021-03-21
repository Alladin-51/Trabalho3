package converter;
import java.lang.String;
import 	java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
// Variáveis de controle	
	Scanner ler = new Scanner(System.in);
	int escolhaUnidadeMedida1;
	int escolhaUnidadeMedida2;
	double valor;
	 
	// Abaixo constam as instanciações das clases
	Comprimento comprimento = new Comprimento();
	Menu menu = new Menu();
	Area area = new Area();
	Peso peso = new Peso();
	Volume volume = new Volume();
	Temperatura temperatura = new Temperatura();
	Tempo tempo = new Tempo();
	Velocidade velocidade = new Velocidade();
	Dados dados = new Dados();
	
	System.out.print("Escolha qual campo de medida deseja converter: ");
	menu.menuPrincipal();
	int escolhaMedida = ler.nextInt();
	
// Esse switch serve para direcionar ao campo de medida que o usuário escolher
	switch (escolhaMedida)
	{
	// Este é o campo de comprimento
	case 1:
		System.out.println("////// COMPRIMENTO //////");
		System.out.println("Escolha uma unidade de medida de COMPRIMENTO");
		menu.menuComprimento();
		escolhaUnidadeMedida1 = ler.nextInt();
		System.out.println("Escolha a unidade de medida que deseja converter");
		escolhaUnidadeMedida2 = ler.nextInt();
		System.out.println("Digite o valor a ser convertido");
		valor = ler.nextInt();	
		
		// Aqui é feito a conversão do valor
		comprimento.converteComp(valor, escolhaUnidadeMedida1); 
		
		// Aqui é feito a impressão do valor já convertido
		System.out.println(comprimento.getComp(escolhaUnidadeMedida2)); 
		break;
		
		
	// Este é o campo de área	
	case 2:
		System.out.println("////// AREA //////");
		System.out.println("Escolha uma unidade de medida de AREA");
		menu.menuArea();
		escolhaUnidadeMedida1 = ler.nextInt();
		System.out.println("Escolha a unidade de medida que deseja converter");
		escolhaUnidadeMedida2 = ler.nextInt();
		System.out.println("Digite o valor a ser convertido");
		valor = ler.nextInt();
		
		// Aqui é feito a conversão do valor
		area.converteArea(valor, escolhaUnidadeMedida1);
		
		// Aqui é feito a impressão do valor já convertido
		System.out.println(area.getArea(escolhaUnidadeMedida2));	
		break;
		
		
	// Este é o campo de peso	
	case 3:
		System.out.println("////// PESO //////");
		System.out.println("Escolha uma unidade de medida de PESO");
		menu.menuPeso();
		escolhaUnidadeMedida1 = ler.nextInt();
		System.out.println("Escolha a unidade de medida que deseja converter");
		escolhaUnidadeMedida2 = ler.nextInt();
		System.out.println("Digite o valor a ser convertido");
		valor = ler.nextInt();
		
		// Aqui é feito a conversão do valor
		peso.convertePeso(valor, escolhaUnidadeMedida1);
		
		// Aqui é feito a impressão do valor já convertido
		System.out.println(peso.getPeso(escolhaUnidadeMedida2));
		break;
		
		
	// Este é o campo de volume	
	case 4:
		System.out.println("////// VOLUME //////");
		System.out.println("Escolha uma unidade de medida de VOLUME");
		menu.menuVolume();
		escolhaUnidadeMedida1 = ler.nextInt();
		System.out.println("Escolha a unidade de medida que deseja converter");
		escolhaUnidadeMedida2 = ler.nextInt();
		System.out.println("Digite o valor a ser convertido");
		valor = ler.nextInt();
		
		// Aqui é feito a conversão do valor
		volume.converteVol(valor, escolhaUnidadeMedida1);
		
		// Aqui é feito a impressão do valor já convertido
		System.out.println(volume.getVol(escolhaUnidadeMedida2));
		break;
		
		
	// Este é o campo de temperatura	
	case 5:
		System.out.println("////// TEMPERATURA //////");
		System.out.println("Escolha uma unidade de medida de TEMPERATURA");
		menu.menuTemperatura();
		escolhaUnidadeMedida1 = ler.nextInt();
		System.out.println("Escolha a unidade de medida que deseja converter");
		escolhaUnidadeMedida2 = ler.nextInt();
		System.out.println("Digite o valor a ser convertido");
		valor = ler.nextInt();
		
		// Aqui é feito a conversão do valor
		temperatura.converteTemperatura(valor, escolhaUnidadeMedida1);
		
		// Aqui é feito a impressão do valor já convertido
		System.out.println(temperatura.getTemperatura(escolhaUnidadeMedida2));
		break;
		
		
	// Este é o campo de tempo	
	case 6:
		System.out.println("////// TEMPO //////");
		System.out.println("Escolha uma unidade de medida de TEMPO");
		menu.menuTempo();
		escolhaUnidadeMedida1 = ler.nextInt();
		System.out.println("Escolha a unidade de medida que deseja converter");
		escolhaUnidadeMedida2 = ler.nextInt();
		System.out.println("Digite o valor a ser convertido");
		valor = ler.nextInt();
		
		// Aqui é feito a conversão do valor
		tempo.converteTempo(valor, escolhaUnidadeMedida1);
		
		// Aqui é feito a impressão do valor já convertido
		System.out.println(tempo.getTempo(escolhaUnidadeMedida2));
		break;
		
		
	// Este é o campo de velocidade
	case 7:
		System.out.println("////// VELOCIDADE //////");
		System.out.println("Escolha uma unidade de medida de VELOCIDADE");
		menu.menuVelocidade();
		escolhaUnidadeMedida1 = ler.nextInt();
		System.out.println("Escolha a unidade de medida que deseja converter");
		escolhaUnidadeMedida2 = ler.nextInt();
		System.out.println("Digite o valor a ser convertido");
		valor = ler.nextInt();
		
		// Aqui é feito a conversão do valor
		velocidade.converteVelo(valor, escolhaUnidadeMedida1);
		
		// Aqui é feito a impressão do valor já convertido
		System.out.println(velocidade.getVelocidade(escolhaUnidadeMedida2));
		break;
		
		
	// Este é o campo de dados	
	case 8:
		System.out.println("////// DADOS //////");
		System.out.println("Escolha uma unidade de medida de DADOS");
		menu.menuDados();
		escolhaUnidadeMedida1 = ler.nextInt();
		System.out.println("Escolha a unidade de medida que deseja converter");
		escolhaUnidadeMedida2 = ler.nextInt();
		System.out.println("Digite o valor a ser convertido");
		valor = ler.nextInt();
		
		// Aqui é feito a conversão do valor
		dados.converteDado(valor, escolhaUnidadeMedida1);
		
		// Aqui é feito a impressão do valor já convertido
		System.out.println(dados.getDados(escolhaUnidadeMedida2));
		break;
	}
	

	}
	
}
