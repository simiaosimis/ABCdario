package fga.mds.abcdario.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import fga.mds.abcdario.model.JogoModel;
import fga.mds.abcdario.persistencia.JogoPersistencia;

public class JogoController {

	private JogoPersistencia acessar = JogoPersistencia.getInstance();
	
	private String lista_num[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private String lista_letra[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
			"m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	
	public JogoController(){}
	
	List<String> numero = new ArrayList<String>(Arrays.asList(lista_num));
	List<String> letra = new ArrayList<String>(Arrays.asList(lista_letra));
	
	public int[] getModelNumero(){
		
		Collections.shuffle(numero);
		
		JogoModel modelo = acessar.getModelNumero((String) numero.get(0));
		
		int[] id = new int[2];
		
		id[0] = modelo.getImagem();
		id[1] = modelo.getBotao();
		
		return id;
	}
	
	public int getIdBotaoNumero(){
		
		Collections.shuffle(numero);
		
		JogoModel modelo =  acessar.getModelNumero((String) numero.get(0));
		
		return modelo.getBotao();
	}
	
	public int[] getModelLetra(){
		
		Collections.shuffle(letra);
		
		JogoModel modelo = acessar.getModelLetra((String) letra.get(0));
		
		int[] id = new int[2];
		
		id[0] = modelo.getImagem();
		id[1] = modelo.getBotao();
		
		return id;
	}
	
	public int getIdBotaoLetra(){
		
		Collections.shuffle(letra);
		
		JogoModel modelo =  acessar.getModelLetra((String) letra.get(0));
		
		return modelo.getBotao();
	}
}
