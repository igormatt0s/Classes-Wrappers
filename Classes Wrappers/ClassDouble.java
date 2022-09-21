//Nome: Igor Araujo de Mattos - RA: 2346443

//A classe Double envolve um valor do tipo primitivo double. A classe fornece vários métodos
//para converter um double em uma String e uma String em um double, assim como outras constantes
//e métodos úteis com um double. 
//https://www.geeksforgeeks.org/java-lang-double-class-java/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ClassDouble{
	public static void main(String arg[]){

		System.out.println("\nInsira a media final do aluno: ");

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);

		String x = "";

		try{
			x = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}
		
		Double a = Double.valueOf(x);
		
		if(a >= 6){
			System.out.printf("\n Aprovado! Com a nota final de "+a);
		}else{
			System.out.printf("\n Reprovado! Com a nota final de "+a);
		}
	}
} 
