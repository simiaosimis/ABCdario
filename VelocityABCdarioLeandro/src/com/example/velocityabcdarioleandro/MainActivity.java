package com.example.velocityabcdarioleandro;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity {
	
	
Button button_iniciar;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		button_iniciar = (Button) findViewById (R.id.button_iniciar);
		
		button_iniciar.setOnClickListener(new View.OnClickListener(){
				public void onClick(View arg0) {
				 
				Intent trocatela = new
				Intent(MainActivity.this,Escolha.class);
				MainActivity.this.startActivity(trocatela);
				
				 
				}
		});
		
	}

	
}
