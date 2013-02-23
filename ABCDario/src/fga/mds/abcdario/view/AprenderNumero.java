package fga.mds.abcdario.view;

import fga.mds.abcdario.R;
import fga.mds.abcdario.control.AprenderController;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class AprenderNumero extends Activity{

private AprenderController controller;	
	
	private ImageView bt_proximo, bt_anterior, bt_voltar, bt_som, imagem; 
	private Intent it;
	private Bundle params;
	private String numero;
	private int id[] = new int[2];
	private MediaPlayer musica;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.aprender); 	
        
        inicializarComponentes(null);
        definirEventos();
    }

	public void inicializarComponentes(String numero) {
		
		controller = new AprenderController();// Instanciando a controladora Aprender
		
		bt_proximo = (ImageView) findViewById(R.id.bt_proximo);
		bt_anterior = (ImageView) findViewById(R.id.bt_anterior);
		bt_voltar = (ImageView) findViewById(R.id.bt_voltar);
		bt_som = (ImageView) findViewById(R.id.bt_som);
		imagem = (ImageView) findViewById(R.id.imagem_selecionada);
		
		if(numero == null)
			numero = obterParamentro();
		
		id = controller.definirNumero(numero);
		
		definirImagem(id[0]);
		definirAudio(id[1]);
	}

	private void definirAudio(int id) {
		musica = MediaPlayer.create(this, id);
	}

	private void definirImagem(int id) {
		imagem.setImageResource(id);
	}

	private String obterParamentro() {
		
		it = getIntent();
		params = it.getExtras();
		
		numero = params.getString("OK");
		
		return numero;
	}

	public void definirEventos() {
		
		bt_voltar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(AprenderNumero.this, Aprender_123.class));
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
				
				//inicializarComponentes(letra+1);
			}
		});
		
		bt_anterior.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//inicializarComponentes();
			}
		});
	}
}
