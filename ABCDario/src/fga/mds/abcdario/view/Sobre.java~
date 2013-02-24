package fga.mds.abcdario;

import fga.mds.abcdario.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;

public class Sobre extends Activity{
		
		private ImageView bt_voltar;
		
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.sobre);
			
			inicializarComponentes();
			definirEventos();
		}
		
		public void inicializarComponentes(){
			bt_voltar = (ImageView) findViewById(R.imgV.bt_voltar);
		}
		
		public void definirEventos(){
			
		bt_voltar.setOnClickListener(new View.OnClickListener(){			
			
			
			public void onClick(View view) {			 
				finish();
						 
		     	}
		   });
		
		}
	}

