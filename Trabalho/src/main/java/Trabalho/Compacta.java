package Trabalho;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Compacta {
	public static void main(String[] args) throws IOException{
		
	Scanner ler = new Scanner(System.in);
	String caminho = ler.nextLine();
	FileInputStream fis = new FileInputStream(caminho);
    
    FileOutputStream fos = new FileOutputStream("arquivo.zip");
    ZipOutputStream zipOut = new ZipOutputStream( fos );
    
    zipOut.putNextEntry( new ZipEntry(caminho) );
              
    int content;
    while ((content = fis.read()) != -1) {
        zipOut.write(content );
    }
              
    zipOut.closeEntry();
    zipOut.close();
    ler.close();
          
    zipOut.close();
    fis.close();
	}
}
