package fga.mds.abcdario.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import fga.mds.abcdario.R;
import fga.mds.abcdario.view.superclasses.AbstractActivity;

public class JogoNumero extends AbstractActivity {

	private ImageView imagem_central, bt_1, bt_2, bt_voltar, bt_certo;
	private int cont_acerto = 0, cont_erro = 0;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jogo_numero);
		
//		inicializarComponentes();
//		definirEventos();
	}
	
	@Override
/*	public void inicializarComponentes() {	
		
	}
*/

	@Override
/*	public void definirEventos() {
		
		
		bt_voltar.setOnClickListener(new OnClickListener() {
			
		});
		
		bt_1.setOnClickListener(new OnClickListener() {
			
		});
		
		bt_2.setOnClickListener(new OnClickListener() {
			
		});
							});

					AlertDialog popUpImagem = alertDialogBuilder.create();

					popUpImagem.show();
				
				}
			}
		});
	}*/

	
}
