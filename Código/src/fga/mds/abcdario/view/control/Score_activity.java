package fga.mds.abcdario.view.control;

import fga.mds.abcdario.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class Score_activity extends Activity {

	private TextView campo_acertos, campo_erros;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.score_activity);
		campo_acertos = (TextView)findViewById(R.id.campo_acertos);
		campo_erros = (TextView)findViewById(R.id.campo_erros);
		
		Intent intent = getIntent();
		  
		 Bundle params = intent.getExtras();  
		   
		  if(params!=null);
		  {   
		   int mostraacertos = params.getInt("acertos");
		   String acertos = Integer.toString(mostraacertos);
		   campo_acertos.setText(acertos);
		  
		   
		   int mostraerros = params.getInt("erros");
		   String erros = Integer.toString(mostraerros);		   
		   campo_erros.setText(erros);
		   
		  }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.score_activity, menu);
		return true;
	}

}
