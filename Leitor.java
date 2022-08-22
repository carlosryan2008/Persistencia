package leitor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Leitor {

	public static void main(int[] args) throws IOException{
		System.out.println("Digite o caminho do arquivo");
		Scanner ler = new Scanner(System.in);
		String caminho = ler.nextLine();
		
		InputStream is = new FileInputStream(caminho);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s;
		
		int n1 = args[0];
		int n2 = args[1];
		for(int x = 0; x < n2; x++) {
			s = br.readLine();
			if(x < n1-1) {
				continue;
			}
			else{
				System.out.println(s);
			}
		}
		
		
		
		br.close();
		ler.close();
	}

}


