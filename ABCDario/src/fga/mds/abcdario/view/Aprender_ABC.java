package fga.mds.abcdario.view;

import fga.mds.abcdario.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;


public class Aprender_ABC extends Activity {

		
		
		private ImageView bt_voltar;
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.grade_letras);
	 
	       bt_voltar = (ImageView) findViewById(R.id.bt_voltar);
	      
	      
	      bt_voltar.setOnClickListener(new View.OnClickListener(){
	    	  
	    	  public void onClick(View arg0) {			 
	    		  System.exit(0);
	    		  
	    	  }
	      });
	 
	     
	         
	   
	          GridView gridView = (GridView) findViewById(R.id.aprender_grade);
	   
	          // Instance of ImageAdapter Class
	          gridView.setAdapter(new GradeLetras(this));
	          
	          gridView.setOnItemClickListener(new OnItemClickListener() {
	              @Override
	              public void onItemClick(AdapterView<?> parent, View v,
	                      int position, long id) {
	   
	                  // Sending image id to FullScreenActivity
	                  Intent i = new Intent(getApplicationContext(), Letra.class);
	                  // passing array index
	                  i.putExtra("id", position);
	                  startActivity(i);
	              }
	          });
	      }
	      
}
			
			
	    

