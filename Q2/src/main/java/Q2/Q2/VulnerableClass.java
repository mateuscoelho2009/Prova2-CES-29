package Q2.Q2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VulnerableClass {
	// Retorna se operação foi feita com sucesso
	public boolean RorWMethod (String FILENAME) {
		Pattern pattern = Pattern.compile("[^A-Za-z0-9._]");
		Matcher matcher = pattern.matcher(FILENAME);
		
		if (matcher.find()) {
			return false;
		}
		
		Scanner console = new Scanner(System.in);
	    System.out.print("Digite a operacao desejada para realizar no arquivo <R para ler um arquivo, "
	    		+ "W para escrever em um arquivo>? ");
		
	    String opr= console.nextLine();
		console.close();
	    
	    if (opr.equals("R") || opr.equals("r")){
			 return read(FILENAME);
		}
		else if (opr.equals("W") || opr.equals("w")) {
			 return write(FILENAME);
		}
		else {
			// Defensiva
			System.out.println("Operacao invalida. Tente novamente.");
			return RorWMethod(FILENAME);
		}
	}
	
	boolean read (String FILENAME) {
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
			
			fr.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	boolean write (String FILENAME) {
		BufferedWriter buffWrite = null;
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(FILENAME, true);
			buffWrite = new BufferedWriter(fw);
			String linha = getStringFromUser();
		    buffWrite.append(linha + "\n");
		    buffWrite.close();
		    fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	String getStringFromUser () {
		String res = "";
		Scanner console = new Scanner(System.in);
		System.out.println("Escreva algo: ");
		res = console.nextLine();
		console.close();
	    return res;
	}
}
