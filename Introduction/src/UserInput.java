import java.util.Scanner;

/*
* Author : ellafilipetti
*Date : 21-Sep-2020
*/
public class UserInput
	{

		public static void main(String[] args)
		{
			String monNom="";
			int a=0; int b=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Quel est ton nom :");
			monNom=sc.nextLine();
			System.out.println("année de naissance");
			a=sc.nextInt();
			System.out.println("mois de naissance");
			a=sc.nextInt();
			System.out.println("Bonjour " +monNom);
			
			
			
			
			
			sc.close();
		}

	}
