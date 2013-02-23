package fga.mds.abcdario.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;
import fga.mds.abcdario.R;
import fga.mds.abcdario.view.superclasses.AbstractActivity;

public class Aprender_123 extends AbstractActivity{

	private ImageView bt_voltar;
	private GridView gridView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade_numeros); 
      }

	@Override
	public void inicializarComponentes() {
		
		 bt_voltar = (ImageView) findViewById(R.id.bt_voltar);
		 gridView = (GridView) findViewById(R.id.aprender_grade);
		 
		 gridView.setAdapter(new GradeNumeros(this));
	}

	@Override
	public void definirEventos() {
		
		bt_voltar.setOnClickListener(new View.OnClickListener(){
	    	  
	    	  public void onClick(View arg0) {			 
	    		  startActivity(new Intent(Aprender_123.this, Escolha_modo_123.class));
	    	  }
	    });
		
		gridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                    int position, long id) {
 
                // Sending image id to FullScreenActivity
                Intent i = new Intent(getApplicationContext(), AprenderNumero.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });
	}
}
