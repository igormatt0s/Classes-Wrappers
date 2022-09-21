//Nome: Igor Araujo de Mattos - RA: 2346443

//A classe Long é uma classe para o tipo primitivo long que contém vários
//métodos para lidar efetivamente com um valor longo, como convertê-lo
//em uma representação de string e vice-versa.
//https://acervolima.com/classe-java-lang-long-em-java/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ClassLong{
	public static void main(String arg[]){

		System.out.println("\nInforme o numero que quer converter para bits: ");

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);

		String x = "";

		try{
			x = buff.readLine();
		}
		catch(IOException ioe){
			System.out.println("\nERRO de sistema: RAM - TECLADO");
		}

		long a = Long.valueOf(x);

		System.out.println("\nBinario: "+Long.toBinaryString(a));

		System.out.println("\nNumero de bits: "+Long.bitCount(a));

	}
} 
