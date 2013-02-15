package fga.mds.abcdario.view.control;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import fga.mds.abcdario.R;

public class Teste_parametros extends Activity {
	
	private ImageView bt_voltar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teste_parametros_activity);
		
		bt_voltar = (ImageView) findViewById(R.id.bt_voltar);
		
		bt_voltar.setOnClickListener(new View.OnClickListener(){			
			
			
			public void onClick(View v) {
				
				Intent intent = new Intent(Teste_parametros.this, Score_activity.class);
                Bundle params = new Bundle();
                
                
                params.putInt("acertos" , 11);
                params.putInt("erros" , 2);
                intent.putExtras(params);
                startActivity(intent);
				
						 
			}
		});
		
		
	}

}