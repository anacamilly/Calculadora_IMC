package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		do {
		System.out.println("------------------------------------------------");
		System.out.println(" CALCULADORA DE IMC - ÍNDICE DE MASSA CORPORAL ");
		System.out.println("------------------------------------------------");
		System.out.println("1- Calcular IMC");
		System.out.println("2- Sair");
		System.out.println("------------------------------------------------");
		System.out.println("Escolha uma opção: ");
		opcao = teclado.nextInt();
		
		switch (opcao){
		case 1: 
			System.out.println("\n\n");
			System.out.println("------------------------------------------------");
			System.out.println("                  CALCULAR IMC:                 ");
			System.out.println("------------------------------------------------");
			System.out.println("Digite sua altura em metros: (Ex: 1,65)");
			double altura = teclado.nextDouble();
			System.out.println("------------------------------------------------");
			System.out.println("Digite seu peso em Kg: (Ex: 65)");
			int peso = teclado.nextInt();
			System.out.println("------------------------------------------------");
			System.out.println("Digite a opção referente ao seu gênero:"
					+ "\n1-Feminino"
					+ "\n2-Masculino");
			int genero = teclado.nextInt();
			System.out.println("------------------------------------------------");
			
			
			double resultado = (peso / (altura * altura)) ;
			
			
			System.out.println("O seu IMC é: ");
			System.out.println(resultado);
			System.out.println("------------------------------------------------");
			
			
			switch(genero) {
				case 1:
				if(resultado<=19.0) {
					System.out.println("Sua situação é: ");
					System.out.println("Abaixo do Peso");
					System.out.println("------------------------------------------------");
				} else
					if(resultado>=19.1 && resultado <=23.9) {
						System.out.println("Sua situação é: ");
						System.out.println("Peso Normal");
						System.out.println("------------------------------------------------");
					}else
						if(resultado>=24.0 && resultado <= 28.9) {
							System.out.println("Sua situação é: ");
							System.out.println("Obesidade Leve");
							System.out.println("------------------------------------------------");
						}else
							if(resultado>=29.0 && resultado <=38.9) {
								System.out.println("Sua situação é: ");
								System.out.println("Obesidade Moderada");
								System.out.println("------------------------------------------------");
								}else
									if(resultado >= 39.0) {
										System.out.println("Sua situação é: ");
										System.out.println("Obesidade Mórbida");
										System.out.println("------------------------------------------------");
									}
				double pesoIdealF;
				pesoIdealF = (53.695 + ((altura - 1.524) * 53.5433));
				System.out.println("Seu peso ideal é: ");
				System.out.println(pesoIdealF);
				System.out.println("\n\n\n\n");
				
					break;
				case 2:
					if(resultado<=20.0) {
						System.out.println("Sua situação é: ");
						System.out.println("Abaixo do Peso");
						System.out.println("------------------------------------------------");
					} else
						if(resultado>=20.1 && resultado <=24.9) {
							System.out.println("Sua situação é: ");
							System.out.println("Peso Normal");
							System.out.println("------------------------------------------------");
						}else
							if(resultado>=25.0 && resultado <= 29.9) {
								System.out.println("Sua situação é: ");
								System.out.println("Obesidade Leve");
								System.out.println("------------------------------------------------");
							}else
								if(resultado>=30.0 && resultado <=39.9) {
									System.out.println("Sua situação é: ");
									System.out.println("Obesidade Moderada");
									System.out.println("------------------------------------------------");
									}else
										if(resultado >= 40.0) {
											System.out.println("Sua situação é: ");
											System.out.println("Obesidade Mórbida");
											System.out.println("------------------------------------------------");
										}
					double pesoIdealM;
					pesoIdealM = 61.2328 + ((altura - 1.6002) * 53.5433);
					System.out.println("Seu peso ideal é:");
					System.out.println(pesoIdealM);
					System.out.println("\n\n\n\n");
						break;
			}
			

			break;
		case 2:
			System.out.println("------------------------------------------------");
			System.out.println("Saindo da calculadora... ");
			break;
		}
		
		
	}while(opcao!=2);
}
}
