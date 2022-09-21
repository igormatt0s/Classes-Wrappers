//Nome: Igor Araujo de Mattos - RA: 2346443

//A classe Character fornece facilidade para manipular as variáveis do tipo char.
//http://www.bosontreinamentos.com.br/java/a-classe-character-em-java/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ClassCharacter{
	public static void main(String arg[]){

		System.out.println("\nInsira uma letra: ");

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);

		String x = "";

		try{
			x = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}
		
		char a = x.charAt(0);
		
		System.out.printf("\nConverter para maiusculo: %s", Character.toUpperCase(a));
		
		
	}
} 
