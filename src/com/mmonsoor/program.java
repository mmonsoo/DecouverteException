/**
 * 
 */
package com.mmonsoor;
import java.io.File;
import java.text.ParseException;

/**
 * @author ACI
 * @version 1.0
 * @category Exerices JEE
 *
 */
public class program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Je d�clare une variable et je l'initialise
		byte choix=42;
		if(choix==0) {
			System.out.println("Ma valeur est de 0");
		}
		
		else {
			System.out.println("Ma valeur n'est pas 0");
		}
		//Appel de la fonction add
		int c=add(15,15);
		//J'affiche le r�sultat de l'addition
		System.out.println(c);
		byte v1=127;
		short var=v1;
		//Appel de la fonction Exception
		short age=25;
		verifierMajorite(age);
		
		
		// On essaie d'executer un bloc d'instructions...
		try {
		//Si l'execution , on va afficher l'erreur
			File.createTempFile("C:\\Users\\ACI\\monFichier", ".txt");
			
		} catch (Exception erreur) {
			// TODO: handle exception
			erreur.printStackTrace();
		}
		finally{
		    System.out.println("action faite syst�matiquement");
		  }
		
		 
		
		

	}
	
	private static int add(int a,int b) {
		return a+b;
	}
	
	
	/**
	 * Ca v�rifie l'�ge
	 * @param ageCopie
	 * @return
	 */
	private static int verifierMajorite(short ageCopie) {
		if(ageCopie<18) {
			System.out.println("Vous �tes mineur");
			return ageCopie;
		}
		else {
			System.out.println("Vous �tes majeur");
			return 0;
		}
	}
	

}
