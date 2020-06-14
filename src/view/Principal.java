package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.iArquivosController;

public class Principal {

	public static void main(String[] args) {
		
		iArquivosController arqCont = new ArquivosController();
		String path = "C:\\TEMP";
		String nome = "relatorio.txt";
		String csv = "relatorio.csv";
		
		try {
			arqCont.readDir(path);
			arqCont.readFile(path, nome, csv);
			arqCont.openFile(path, csv);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
