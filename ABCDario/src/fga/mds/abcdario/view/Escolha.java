package fga.mds.abcdario.view.control;

import fga.mds.abcdario.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class Escolha extends Activity{
	
	private ImageView bt_123, bt_abc, bt_voltar;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.escolha);
		
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes(){
		bt_123 = (ImageView) findViewById(R.imgV.bt_123);
		bt_abc = (ImageView) findViewById(R.imgV.bt_abc);
		bt_voltar = (ImageView) findViewById(R.imgV.bt_voltar);
	}
	
	public void definirEventos(){
	bt_123.setOnClickListener(new View.OnClickListener(){			
		
		
		public void onClick(View view) {			 
			startActivity(new Intent(Escolha.this, Escolha_modo_123.class));
					 
		}
	});
	
	bt_abc.setOnClickListener(new View.OnClickListener(){			
		
		
		public void onClick(View view) {			 
			startActivity(new Intent(Escolha.this, Escolha_modo_ABC.class));
					 
		}
	});
	
	bt_voltar.setOnClickListener(new View.OnClickListener(){			
		
		
		public void onClick(View view) {			 
			finish();
					 
	     	}
	   });
	
	}
}
