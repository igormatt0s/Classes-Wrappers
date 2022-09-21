//Nome: Igor Araujo de Mattos - RA: 2346443

//A classe Byte é uma classe para o tipo primitivo byte que contém vários
//métodos para lidar efetivamente com um valor de byte, como convertê-lo
//em uma representação de string e vice-versa.
//https://acervolima.com/classe-java-lang-byte-em-java/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ClassByte{
	public static void main(String arg[]){

		System.out.println("\nInforme a sua idade: ");

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);

		String x = "";

		try{
			x = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}

		byte a = Byte.valueOf(x);

		if(a >= 18){		
			System.out.printf("\nVoce eh maior de idade!");
		}else{
			System.out.printf("\nVoce eh menor de idade!");
		}
	}
} 
