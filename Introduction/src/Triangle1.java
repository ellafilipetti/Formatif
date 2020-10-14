import java.util.Scanner;

/*
* Author : ellafilipetti
*Date : 30-Sep-2020
*/
public class Triangle1
	{

		public static void main(String[] args)
		{
			int angle1, angle2, angle3;
			Scanner sc=new Scanner(System.in);
			angle1=sc.nextInt();
			angle2=sc.nextInt();
			angle3=sc.nextInt();
			int somme=angle1+angle2+angle3;
			if(somme==180)
				if((angle1==angle2)&&(angle2==angle3))
					System.out.print("Equilatéral");
				else
					if((angle1==angle2)||(angle2==angle3)||(angle3==angle1))
						System.out.print("Isocèle");
					else
						System.out.println("Scalène");
							
							
			else	
				System.out.print("Ce n'est pas un triangle");
			
			
			
			sc.close();
		}

	}
