

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Leitor {

	public static void main(String[] args) throws IOException{
		//Leitor do teclado
		System.out.println("Digite o caminho do arquivo");
		Scanner ler = new Scanner(System.in);
		String caminho = ler.nextLine();
		
		
		InputStream is = new FileInputStream(caminho);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		int cont = 0;
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		// Primeira versão
		//int n1 = 2;
		//int n2 = 6;
		/*for(int x = 0; x < n2; x++) {
			s = br.readLine();
			if(x < n1-1) {
				continue;
			}
			else{
				System.out.println(s);
			}
		}*/
		
		// Versão onde n1 <= 0 e n2 <= 0 representam a não definição
		while(s != null && cont < n2 || s != null && n2 < 0) {
			if(cont >= n1-1) 	System.out.println(s);
			cont++;
			s = br.readLine();
		}
		
		
		br.close();
		ler.close();
		
	}

}


