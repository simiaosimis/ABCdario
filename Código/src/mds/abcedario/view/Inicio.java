package fga.mds.abcdario;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class Inicio extends Activity {


		private ImageView bt_iniciar, bt_sair;
		
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			
			bt_iniciar = (ImageView) findViewById(R.id.bt_iniciar);
			bt_sair = (ImageView) findViewById(R.id.bt_voltar);
			
			
			bt_iniciar.setOnClickListener(new View.OnClickListener(){			
				
				
				public void onClick(View arg0) {			 
					startActivity(new Intent(Inicio.this, Escolha.class));
							 
				}
			});
			
			bt_sair.setOnClickListener(new View.OnClickListener(){
				
				public void onClick(View arg0) {			 
					System.exit(0);
				 
				}
			});
			
		}

	}

