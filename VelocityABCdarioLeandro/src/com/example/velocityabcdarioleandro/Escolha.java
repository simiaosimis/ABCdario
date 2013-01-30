package com.example.velocityabcdarioleandro;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.content.*;

public class Escolha extends Activity {
	
	
Button button_jogar, button_aprender;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_escolha);
		
		
		button_jogar = (Button) findViewById (R.id.button_jogar);
		
		button_aprender = (Button) findViewById (R.id.button_aprender);
		
		button_jogar.setOnClickListener(new View.OnClickListener(){
				public void onClick(View arg0) {
				 
				Intent trocatela = new
				Intent(Escolha.this,Jogar.class);
				Escolha.this.startActivity(trocatela);
								 
				}
		});
		
		
		button_aprender.setOnClickListener(new View.OnClickListener(){
				public void onClick(View arg0) {
				 
				Intent trocatela = new
				Intent(Escolha.this,Aprender.class);
				Escolha.this.startActivity(trocatela);
								 
				}
		});
		
	}

	
	
}
