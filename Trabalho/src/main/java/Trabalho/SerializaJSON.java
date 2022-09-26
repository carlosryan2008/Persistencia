package Trabalho;


import java.io.File;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class SerializaJSON {

    public static void main(String[] args) throws Exception {
    	
    	Scanner ler = new Scanner(System.in);
    	boolean sim = true;
    	List<Elemento> lista = new ArrayList<Elemento>();
    	while(sim == true) {
    		
    		System.out.print("Insira o nome do elemento");
    		String nome = ler.next();
    		System.out.print("Insira o simbolo");
    		String simbolo = ler.next();
    		System.out.print("Insira o numero atômico");
    		int numeroAtomico = ler.nextInt();
    		System.out.print("Insira a massa");
    		float massaAtomica = ler.nextFloat();
    		System.out.print("Insira o periodo");
    		int periodo = ler.nextInt();
    		System.out.print("Insira o grupo");
    		int grupo = ler.nextInt();
    		ler.nextLine();
    		System.out.print("Insira a familia");
    		String familia = ler.nextLine();
    		
    		Elemento elemento = new Elemento(nome, simbolo, numeroAtomico, massaAtomica,
    				periodo, grupo, familia);
    		
            lista.add(elemento);
           
            System.out.println("Inserir novo elemento? ");
    		sim = ler.nextBoolean();
    	}
    	
    	
        TabelaPeriodica p = new TabelaPeriodica(lista);
        File f = new File("TabelaPeriodica.json");
        ObjectMapper om = new ObjectMapper();
        om.enable(SerializationFeature.INDENT_OUTPUT);
        om.writeValue(f, p);
        
        ler.close();
      
    }
}

