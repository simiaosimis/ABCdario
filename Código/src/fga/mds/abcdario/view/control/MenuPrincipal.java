package fga.mds.abcdario.view.control;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import fga.mds.abcdario.R;
import fga.mds.abcdario.view.control.superclasses.AbstractActivity;

public class MenuPrincipal extends AbstractActivity {

	//Atributos da GUI
	private ImageView img_123;
	private ImageView img_abc;
	
	//método executado ao iniciar a activity
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
			
		//seta o arquivo xml
		setContentView(R.layout.menu_principal);
			
		//métodos da interface
		inicializarComponentes();
		definirEventos();

	}
	
	//método para inicializar os componentes presentes na tela
	@Override
	public void inicializarComponentes() {
		
		//encontrando os componentes pelo id atribuido no arquivo xml
		img_123 = (ImageView) findViewById(R.imgV.bt_123);
		img_abc = (ImageView) findViewById(R.imgV.bt_abc);
		
	}

	// método para definir os eventos que ocorrerão (clicks nos botões especificados)
	@Override
	public void definirEventos() {
		
		//eventos relacionado ao click do botão 123
		img_123.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				//linkando e iniciando a próxima activity
				startActivity(new Intent(MenuPrincipal.this, MenuNumerico.class));
			}
		});
		
		//eventos relacionado ao click do botão abc
		img_abc.setOnClickListener(new OnClickListener() {
					
			@Override
			public void onClick(View v) {
						
					//linkando e iniciando a próxima activity
					startActivity(new Intent(MenuPrincipal.this, MenuAlfabeto.class));
			}
		});
		
	}

}
