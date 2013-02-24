package fga.mds.abcdario;

import fga.mds.abcdario.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class Escolha_modo_ABC extends Activity {

	private ImageView bt_voltar, bt_aprender, bt_jogar;

	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_abc);


		inicializarComponetes();
		definirEventos();

	}
	
	private void inicializarComponetes() {
		bt_voltar = (ImageView) findViewById(R.imgV.bt_voltar);
		bt_aprender = (ImageView) findViewById(R.imgV.bt_aprender);
		bt_jogar = (ImageView) findViewById(R.imgV.bt_jogar);
	}

	
	private void definirEventos() {

		bt_voltar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				startActivity(new Intent(Escolha_modo_ABC.this, Escolha.class));

			}
		});


		bt_aprender.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				startActivity(new Intent(Escolha_modo_ABC.this, Aprender_ABC.class));

			}

		});

		bt_jogar.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				startActivity(new Intent(Escolha_modo_ABC.this, Jogar_ABC.class));
			}

		});

	}

}