package fga.mds.abcdario.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import fga.mds.abcdario.R;
import fga.mds.abcdario.view.superclasses.AbstractActivity;

public class Informacao extends AbstractActivity{

private ImageView bt_voltar;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.informacao);
		
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes(){
		bt_voltar = (ImageView) findViewById(R.imgV.bt_voltar);
	}
	
	public void definirEventos(){
		
	bt_voltar.setOnClickListener(new View.OnClickListener(){			
		
		
		public void onClick(View view) {			 
			startActivity(new Intent(Informacao.this, InicioActivity.class));
					 
	     	}
	   });
	
	}
}
