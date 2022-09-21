//Nome: Igor Araujo de Mattos - RA: 2346443

//A classe Boolean só aceita dois valores, True ou False (Verdadeiro ou Falso).
//https://pt.wikipedia.org/wiki/Boolean#:~:text=Em%20ci%C3%AAncia%20da%20computa%C3%A7%C3%A3o%2C%20boolean,na%20metade%20do%20s%C3%A9culo%20XIX.

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ClassBoolean{
	public static void main(String arg[]){

		System.out.println("\nInsira o maior numero: ");

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);

		String num = "";

		try{
			num = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}
		
		int y = Integer.parseInt(num);
		
		System.out.println("\nInsira o menor numero: ");

		InputStreamReader teclado1 = new InputStreamReader(System.in);
		BufferedReader buff1 = new BufferedReader(teclado1);

		String num1 = "";

		try{
			num1 = buff1.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}
		
		int x = Integer.parseInt(num1);
		
		boolean teste = y > x;

		if(teste){
			System.out.println("\nVerdadeiro!");
		}else{
			System.out.println("\nFalso!");
		}
	}
} 
