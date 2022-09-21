//Nome: Igor Araujo de Mattos - RA: 2346443

//A classe Float é uma classe para o tipo primitivo float que contém vários
//métodos para lidar efetivamente com um valor float, como convertê-lo em uma
//representação de string e vice-versa.
//https://acervolima.com/classe-java-lang-float-em-java/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ClassFloat{
	public static void main(String arg[]){

		System.out.println("\nInforme sua altura em cm: ");

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);

		String x = "";

		try{
			x = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}

		float a = Float.valueOf(x);

		float b = a * 0.1f;
		float c = a * 10;

		System.out.println("\nSua altura em metros eh: "+b+"m");
		System.out.println("\nSua altura em milimetros eh: "+c+"mm");
	}
} 
