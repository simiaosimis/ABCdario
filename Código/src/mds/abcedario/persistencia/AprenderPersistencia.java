package mds.tentandoasorte;

import java.util.ArrayList;
import java.util.Iterator;

public class AprenderPersistencia {

	private static AprenderPersistencia instance;
	
	/* Padrão Singleton - Apenas uma instância*/
	private AprenderPersistencia(){}
	
	public static AprenderPersistencia getInstance(){
		if(instance == null)
			instance = new AprenderPersistencia();
		
		return instance;
	}
	
	/*Declarando e instanciando os objetos do tipo AprenderModel*/
	static AprenderModel letra_b = new AprenderModel("b", R.drawable.letter_b , R.raw.chasing_the_sun );
	static AprenderModel letra_c = new AprenderModel("c", R.drawable.letter_c, R.raw.dont_you_worry_child);

	/*Declarando e intanciando um ArrayList que conterá todos os objetos do tipo AprenderModel*/
	static ArrayList<AprenderModel> lista = new ArrayList<AprenderModel>();
	/*Armazenando estaticamente*/
	static{
		lista.add(letra_b);
		lista.add(letra_c);
	}
	
	/*Função para retornar objeto do tipo AprenderModel a partir do envio da letra desejada*/
	public AprenderModel getModel(String letra){
		
		Iterator<AprenderModel> i = lista.iterator();
		
		while(i.hasNext()){
			
			AprenderModel am = (AprenderModel) i.next();
			
			String nome = am.getNome();
			
			if(nome.equalsIgnoreCase(letra))
				return am;
		}
		
		return null;
	}
	
}
