package fga.mds.abcdario.view.control;

import fga.mds.abcdario.R;

import fga.mds.abcdario.view.control.superclasses.AbstractActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class IniciarActivity extends AbstractActivity {

	//Atributos da GUI
	private ImageView imgIniciar;
	private ImageView imgSair;
	private ImageView imgInformativa;
	private MediaPlayer song;
	
	//método executado ao iniciar a activity
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//seta o arquivo xml
		setContentView(R.layout.activity_iniciar);
		
		//métodos da interface
		inicializarComponentes();
		definirEventos();
		
		//tocando a música
		song = MediaPlayer.create(IniciarActivity.this, R.raw.musica_tela_inicial);
        song.start();
	}

	//método para inicializar os componentes presentes na tela
	@Override
	public void inicializarComponentes() {
		
		//encontrando os componentes pelo id atribuido no arquivo xml
		imgIniciar = (ImageView) findViewById(R.imgV.Iniciar);
		imgInformativa = (ImageView) findViewById(R.imgV.Informativo);
		imgSair = (ImageView) findViewById(R.imgV.Sair);
		
	}

	// método para definir os eventos que ocorrerão (clicks nos botões especificados)
	@Override
	public void definirEventos() {
		
		//eventos relacionado ao click do botão iniciar
		imgIniciar.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				
				//linkando e iniciando a próxima activity
				startActivity(new Intent(IniciarActivity.this, MenuPrincipal.class));
			}
		});
		
		//eventos relacionado ao click do botão informativo
		imgInformativa.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view){
				
				//linkando e iniciando a próxima activity
				startActivity(new Intent(IniciarActivity.this, Informativo.class));
			}
		});
		
		//eventos relacionado ao click do botão sair
		imgSair.setOnClickListener(new OnClickListener() {
			
			@SuppressLint("ShowToast")
			public void onClick(View view){
				
				//exibindo mensagem de saida do aplicativo
				Toast.makeText(IniciarActivity.this, "Saindo do aplicativo", Toast.LENGTH_LONG).show();
				//saindo do aplicativo
				System.exit(0);
			}
		});
		
	}

}
