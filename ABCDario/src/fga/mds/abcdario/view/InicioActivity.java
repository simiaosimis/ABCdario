package fga.mds.abcdario;

import fga.mds.abcdario.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class InicioActivity extends Activity {

	private ImageView bt_iniciar, bt_sair, bt_sobre;
	final Context context = this;
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inicio);
		
		inicializarComponentes();
		definirEventos();
	}
		public void inicializarComponentes(){
			bt_iniciar = (ImageView) findViewById(R.imgV.bt_iniciar);
			bt_sair = (ImageView) findViewById(R.imgV.bt_sair);
			bt_sobre = (ImageView) findViewById(R.imgV.bt_sobre);
		}
		
		public void definirEventos(){
		bt_iniciar.setOnClickListener(new View.OnClickListener(){			
			
			
			public void onClick(View arg0) {			 
				startActivity(new Intent(InicioActivity.this, Escolha.class));
						 
			}
		});
		
		bt_sair.setOnClickListener(new View.OnClickListener(){
			
			public void onClick(View arg0) {			 
				System.exit(0);
			 
			}
		});
		

		bt_sobre.setOnClickListener(new View.OnClickListener(){			
			
					public void onClick(View arg0) {			 
						startActivity(new Intent(InicioActivity.this, Sobre.class));
								 
					}
				});
	
			}
	}