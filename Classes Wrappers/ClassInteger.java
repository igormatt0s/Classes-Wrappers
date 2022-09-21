//Nome: Igor Araujo de Mattos - RA: 2346443

//A classe integer serve apenas para registrar números inteiros. As variáveis Integer
//podem ser usadas para representar valores enumerados.
//https://todasasrespostas.pt/qual-a-diferenca-entre-long-e-integer

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ClassInteger{
	public static void main(String arg[]){

		System.out.println("\nInsira um numero: ");

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
		int x = y * y;

		System.out.println("O numero "+y+" ao quadrado eh: "+x);
	}
} 
