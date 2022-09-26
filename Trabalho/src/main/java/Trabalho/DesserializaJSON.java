package Trabalho;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

	public class DesserializaJSON {
	    public static void main(String[] args) throws Exception {
	        File file = new File(args[0]);
	        
	        
	        //converter para .xml
	        ObjectMapper objMapper = new ObjectMapper();
	        TabelaPeriodica p = objMapper.readValue(file, TabelaPeriodica.class);	        
	        File f = new File("tabela.xml");
	        XmlMapper xm = new XmlMapper();
	        xm.enable(SerializationFeature.INDENT_OUTPUT);
	        xm.writeValue(f, p);
	        	        
	        
	        
	        //Converter para .csv
	        List<Elemento> lista = p.getTabelaPeriodica();
	        String f2 = ("tabela.csv");
	        OutputStream os = new FileOutputStream(f2);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("nome, símbolo, número atômico, massa atômica, período, grupo, família");
			bw.newLine();
			for(int i = 0; i < lista.size(); i++) {
				Elemento elemento = lista.get(i);
				bw.write(elemento.quebra());
				bw.newLine();
			}
			
			bw.close();
	    }

	}

