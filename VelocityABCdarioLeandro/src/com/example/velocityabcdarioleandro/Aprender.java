package com.example.velocityabcdarioleandro;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Aprender extends Activity {
	
Button button_a, button_b, button_c, button_d, button_e;
final Context context = this;


public void onCreate(Bundle savedInstanceState) {

	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_aprender);

	button_a = (Button) findViewById(R.id.button_a);

	button_a.setOnClickListener(new OnClickListener() {

	
	public void onClick(View arg0) {

		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
			context);

		
		alertDialogBuilder.setTitle(" ");
		alertDialogBuilder		
		
			.setIcon(R.drawable.bt_a_abelha)		
			.setCancelable(false)
			.setNegativeButton("X",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
					
					dialog.cancel();
				}
			});

			
			AlertDialog popUpImagemA = alertDialogBuilder.create();
			
			popUpImagemA.show();
		}
	});
}
}
	