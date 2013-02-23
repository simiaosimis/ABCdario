package fga.mds.abcdario.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import fga.mds.abcdario.R;
import fga.mds.abcdario.control.JogoController;
import fga.mds.abcdario.view.superclasses.AbstractActivity;

public class JogoNumero extends AbstractActivity {

	private ImageView imagem_central, bt_1, bt_2, bt_voltar, bt_certo;
	private int cont_acerto = 0, cont_erro = 0;
	
	private JogoController controller;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jogo_numero);
		
		inicializarComponentes();
		definirEventos();
	}
	
	@Override
	public void inicializarComponentes() {	
		
		controller = new JogoController();
		int[] id = new int[2];
		int idBotao;
		
		imagem_central = (ImageView) findViewById(R.id.imagem_central);
		bt_1 = (ImageView) findViewById(R.id.bt_1);
		bt_2 = (ImageView) findViewById(R.id.bt_2);
		bt_voltar = (ImageView) findViewById(R.id.bt_voltar);
		
		id = controller.getModelNumero();
		idBotao = controller.getIdBotaoNumero();
		
		atualizarImagem(id[0]);
		atualizarBotao(id[1], idBotao);
	}

	private void atualizarBotao(int btModel, int bt) {
		
		while(btModel == bt)
			bt = controller.getIdBotaoNumero();
		
		if(controller.getIdBotaoNumero() % 2 == 0){
			bt_1.setImageResource(btModel);
			bt_2.setImageResource(bt);
			
			bt_certo = bt_1;
		} else{
			bt_2.setImageResource(btModel);
			bt_1.setImageResource(bt);
			
			bt_certo = bt_2;
		}
	}

	private void atualizarImagem(int id) {
		imagem_central.setImageResource(id);
	}

	@Override
	public void definirEventos() {
		
		
		bt_voltar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				Bundle params = new Bundle();
				Intent intent = new Intent(JogoNumero.this, Score.class);
				params.putInt("acertos" , cont_acerto);
                params.putInt("erros" , cont_erro);
                intent.putExtras(params);
                startActivity(intent);
                finish();
			}
		});
		
		bt_1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						JogoNumero.this);
				
				if(bt_1 == bt_certo){
					cont_acerto++;
  	
					alertDialogBuilder.setTitle(" ");

					alertDialogBuilder
				
						.setIcon(R.drawable.img_resposta_certa)    
						.setCancelable(false)
						.setNegativeButton("Voltar",new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,int id) {
								inicializarComponentes();
								dialog.cancel();
							}
							});

						AlertDialog popUpImagem = alertDialogBuilder.create();

						popUpImagem.show();
					  

				} else{
					cont_erro++;
					
						alertDialogBuilder.setTitle(" ");

						alertDialogBuilder
					
							.setIcon(R.drawable.img_resposta_errada)    
							.setCancelable(false)
							.setNegativeButton("Voltar",new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,int id) {
									inicializarComponentes();
									dialog.cancel();
								}
								});

							AlertDialog popUpImagem = alertDialogBuilder.create();

							popUpImagem.show();
				}
			}
			
		});
		
		bt_2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						JogoNumero.this);
				
				if(bt_2 == bt_certo){
					cont_acerto++;
	  	
						alertDialogBuilder.setTitle(" ");

						alertDialogBuilder
					
							.setIcon(R.drawable.img_resposta_certa)    
							.setCancelable(false)
							.setNegativeButton("Voltar",new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,int id) {
									inicializarComponentes();
									dialog.cancel();
								}
								});

							AlertDialog popUpImagem = alertDialogBuilder.create();

							popUpImagem.show();

				} else{
					cont_erro++;
			
					alertDialogBuilder.setTitle(" ");

					alertDialogBuilder
				
						.setIcon(R.drawable.img_resposta_errada)    
						.setCancelable(false)
						.setNegativeButton("Voltar",new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,int id) {
								inicializarComponentes();
								dialog.cancel();
							}
							});

					AlertDialog popUpImagem = alertDialogBuilder.create();

					popUpImagem.show();
				
				}
			}
		});
	}

	
}