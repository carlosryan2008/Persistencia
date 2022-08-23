

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Transferidor {

	public static void main(String[] args) throws IOException {
		//Leitura do arquivo original
		InputStream is = new FileInputStream(args[0]);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		
		OutputStream os = new FileOutputStream(args[1]);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		//copia para o arquivo escolhido
		String s = br.readLine();
		while(s != null) {
			
			bw.write(s);
			bw.newLine();
			s = br.readLine();
			
		}
		bw.close();
		br.close();
	}

}

