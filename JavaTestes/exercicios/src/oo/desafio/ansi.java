package oo.desafio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ansi {

	public static void main(String[] args) throws IOException {

		String textBody = "Aguia amarela";
		
		OutputStreamWriter writer = new OutputStreamWriter(
                new FileOutputStream("/home/perkons/Desktop/aguia.txt", true), "windows-1252"
                );
		writer.append(textBody);
		writer.close();
		
	}

}
