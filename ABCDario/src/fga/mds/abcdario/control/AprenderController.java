package fga.mds.abcdario.control;

import java.util.ArrayList;

import fga.mds.abcdario.model.AprenderModel;
import fga.mds.abcdario.persistencia.AprenderPersistencia;

public class AprenderController {

	public AprenderController(){}
	
	private AprenderPersistencia acessar = AprenderPersistencia.getInstance();
	private AprenderModel tela;
	private ArrayList<Integer> cadastroPosicao= new ArrayList<Integer>();

	public int[] definirLetra(int letra){
		
		int id[] = new int[2];
		
		tela = acessar.getModelLetra(letra);
		
		id[0] = tela.getImagem();
		id[1] = tela.getAudio();
		
		return id;
	}

	public int[] definirNumero(int numero){

		int id[] = new int[2];
		
		tela = acessar.getModelNumero(numero);
		
		id[0] = tela.getImagem();
		id[1] = tela.getAudio();
		
		return id;
	}
	
	public int definirAcaoLetra(int posicao, int acao) {
		
		if (acao == 0){
			return posicao;
		}
		
		if (acao == 1){
			if(posicao == 25){
				posicao = 0;
				return posicao;
			}else{
				posicao++;
				return posicao;
			}
			
		}
		if (acao == 2){
			if(posicao == 0){
				posicao = 25;
				return posicao;
			}else{
				posicao--;
				return posicao;
			}
			
		}
		return 0;
	}
	
	public int definirAcaoNumero(int posicao, int acao) {
		
		if (acao == 0){
			return posicao;
		}
		
		if (acao == 1){
			if(posicao == 8){
				posicao = 0;
				return posicao;
			}else{
				posicao++;
				return posicao;
			}
			
		}
		if (acao == 2){
			if(posicao == 0){
				posicao = 8;
				return posicao;
			}else{
				posicao--;
				return posicao;
			}
			
		}
		return 0;
	}

	public void criandoPosicao(int posicao) {
		cadastroPosicao.add(posicao);		
	}
	
	public void alterandoPosicao(int posicao) {
		cadastroPosicao.set(0, posicao);		
	}
	
	public int retornandoPosicao() {
		
		return cadastroPosicao.get(0).intValue();		
	}
}
