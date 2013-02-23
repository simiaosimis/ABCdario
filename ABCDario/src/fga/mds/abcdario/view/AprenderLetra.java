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

	private AprenderController controller;	
	
	private ImageView bt_proximo, bt_anterior, bt_voltar, bt_som, imagem; 
	private Intent it;
	private Bundle params;
	private String letra;
	private int id[] = new int[2];
	private MediaPlayer musica;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.aprender); 	
        
        inicializarComponentes(null);
        definirEventos();
    }

	public void inicializarComponentes(String letra) {
		
		controller = new AprenderController();// Instanciando a controladora Aprender
		
		bt_proximo = (ImageView) findViewById(R.id.bt_proximo);
		bt_anterior = (ImageView) findViewById(R.id.bt_anterior);
		bt_voltar = (ImageView) findViewById(R.id.bt_voltar);
		bt_som = (ImageView) findViewById(R.id.bt_som);
		imagem = (ImageView) findViewById(R.id.imagem_selecionada);
		
		if(letra == null)
			letra = obterParamentro();
		
		id = controller.definirLetra(letra);
		
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
		
		letra = params.getString("OK");
		
		return letra;
	}

	public void definirEventos() {
		
		bt_voltar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(AprenderLetra.this, Aprender_ABC.class));
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
