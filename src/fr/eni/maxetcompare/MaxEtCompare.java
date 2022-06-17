package fr.eni.maxetcompare;

import java.util.Scanner;

public class MaxEtCompare {
	
	//fonction d'affichage d'un chiffre plus grand que l'autre.

	public static void plusGrandQue(float a, float b)
	{
		if(a>b)
		{
			System.out.println(a +" est plus grand que " +b );
		}else
			{
				System.out.println(b +" est plus grand que " +a );
			}
	}
	
	
	//fonction d'affichage 0 si les 2 valeurs sont égale / - 1 si la première valeur est plus grande / -1 si c'est la deuxieme qui est plus grande.
	
	public static void resultatChiffres(float a, float b)
		{
			if(a==b)
			{
				System.out.println("0 : les deux valeurs sont égales");
			}else if(a > b)
			{
				System.out.println("1 : la première valeur saisie est la plus grande");
			}else
			{
				System.out.println("-1 : la seconde valeur est la plus grande ");
			}
		}
	
	/*
	 * Code principale. appels des deux fonctions d'affichages plusGrandQue et resultatChiffres.
	 */
	
	public static void main(String[] args) {
				System.out.println("Merci de choisir la fonction à exécuter :");
				System.out.println(" 1: Plus grand que ?");
				System.out.println(" 2 : Comparaison 0 / 1 / -1");
				int saisie = SaisirInt();
				
				if(saisie == 1)
				{
					System.out.println("Merci de saisir la première valeur : ");
					float a = SaisirFloat();
					
					System.out.println("Merci de saisir la seconde valeur : ");
					float b = SaisirFloat();
					
					plusGrandQue(a,b);
				}else if(saisie ==2)
					{
						System.out.println("Merci de saisir la première valeur : ");
						float a2 = SaisirFloat();
						
						System.out.println("Merci de saisir la seconde valeur : ");
						float b2 = SaisirFloat();
						
						resultatChiffres(a2,b2);
												
					}

	}
	
	/*
	 * Fonction scanner.
	 */
	
	public static float SaisirFloat()
	{
		Scanner scan = new Scanner(System.in);
		float result = scan.nextFloat();
		return result;
	}
	
	public static int SaisirInt()
	{
		Scanner scan = new Scanner(System.in);
		int result = scan.nextInt();
		return result;
	}

}
