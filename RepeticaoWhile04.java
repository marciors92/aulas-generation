package lacos_de_decisao;

import java.util.Scanner;

public class RepeticaoWhile04 {

	public static void main(String[] args) {
		
int idade,genero,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0,x=1;
		
		Scanner scan = new Scanner (System.in);
		
		while(x<=5)
		{
			System.out.println("\nEntre com a sua idade: ");
			idade = scan.nextInt();//-8
			while(idade<1 || idade>130)
			{
				System.out.println("\nEntre com uma nova idade: ");
				idade = scan.nextInt();// 150 77
			}
			System.out.println("\nEntre com o seu g�nero:\n1- Feminino\n2- Masculino\n3- Outros ");
			genero = scan.nextInt();
			while(genero<1 || genero>3)
			{
				System.out.println("\nEntre com um novo genero:\n1- Feminino\n2- Masculino\n3- Outros ");
				genero = scan.nextInt();
			}
			System.out.println("\nEntre com o seu fator psicol�gico:\n1- Calme\n2- Nervose\n3- Agressive ");
			fp = scan.nextInt();
			while(fp<1 || fp>3)
			{
				System.out.println("\nEntre com o seu novo fator psicol�gico:\n1- Calme\n2- Nervose\n3- Agressive ");
				fp = scan.nextInt();
			}
			
			if(fp==1) {
				contpc++;
			}
			if(genero==1 && fp == 2) {
				contmn++;
			}
			if(genero == 2 && fp == 3) {
				contha++;
			}
			if(genero == 3 && fp == 1) {
				contoc++;
			}
			if(fp == 2 && idade>40) {
				contpn40++;
			}
			if(fp == 1 && idade<18) {
				contpc18++;
			}
			x++;
		}
		System.out.println("\nQuantidade de pessoas calmas: "+contpc);
		System.out.println("\nQuantidade de mulheres nervosas: "+contmn);
		System.out.println("\nQuantidade de homens agressivos: "+contha);
		System.out.println("\nQuantidade de outros calmos: "+contoc);
		System.out.println("\nQuantidade de pessoas nervosas com mais de 40 anos: "+contpn40);
		System.out.println("\nQuantidade de pessoas calmas com menos de 18 anos: "+contpc18);
	}



	}

