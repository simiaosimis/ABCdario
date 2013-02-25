package fga.mds.abcdario.view;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import fga.mds.abcdario.R;
import fga.mds.abcdario.control.AprenderController;

public class AprenderLetra extends Activity{

	private AprenderController controller = new AprenderController();	
	
	private ImageView bt_proximo, bt_anterior, bt_voltar, bt_som, imagem; 
	private Intent it;
	private int id[] = new int[2];
	private MediaPlayer musica;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.aprender); 	
        
        inicializarComponentes(0,55);
        definirEventos();
    }

	public void inicializarComponentes(int acao, int posicao) {
		
		bt_proximo = (ImageView) findViewById(R.id.bt_proximo);
		bt_anterior = (ImageView) findViewById(R.id.bt_anterior);
		bt_voltar = (ImageView) findViewById(R.id.bt_voltar);
		bt_som = (ImageView) findViewById(R.id.bt_som);
		imagem = (ImageView) findViewById(R.id.imagem_selecionada);
		
		if(posicao == 55){
			posicao = obterParamentro();
			controller.criandoPosicao(posicao);
		}
		
		posicao = controller.definirAcaoLetra(posicao, acao);
		
		id = controller.definirLetra(posicao);
		
		definirImagem(id[0]);
		definirAudio(id[1]);
		
		controller.alterandoPosicao(posicao);
	}

	private void definirAudio(int id) {
		musica = MediaPlayer.create(this, id);
	}

	private void definirImagem(int id) {
		imagem.setImageResource(id);
	}

	private int obterParamentro() {
		
		it = getIntent();
		
		return it.getExtras().getInt("id");
	}

	public void definirEventos() {
		
		bt_voltar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(AprenderLetra.this, Aprender_ABC.class));
				finish();
			}
		});
		
		bt_som.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				musica.start();
			}
		});
		
		bt_proximo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				int posicao = controller.retornandoPosicao();
				inicializarComponentes(1,posicao);
			}
		});
		
		bt_anterior.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				int posicao = controller.retornandoPosicao();
				inicializarComponentes(2,posicao);
			}
		});
	}
}
