//Nome: Igor Araujo de Mattos - RA: 2346443

//A classe Short é uma classe para o tipo primitivo short que contém vários
//métodos para lidar efetivamente com um valor curto, como convertê-lo em uma
//representação de string e vice-versa.
//https://acervolima.com/classe-java-lang-short-em-java/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ClassShort{
	public static void main(String arg[]){

		System.out.println("\n Digite o numero 7: ");

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);

		String x = "";

		try{
			x = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}

		short a = Short.valueOf(x);

		short b = 7;

		if(a == b){
			System.out.println("Eles sao iguais");
		}
		else{
			System.out.println("Valores diferentes");
		}
	}
} 
