package fga.mds.abcdario.view.control;

import fga.mds.abcdario.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Score_activity extends Activity {

	// Declara��o das vari�veis, textView e Bundle.
	
	private TextView campo_acertos;		// Campo que informa quantidade de acertos realizados no jogo.
	private TextView campo_erros;  		// Campo que informa quantidade de erros realizados no jogo.
	private ImageView estrelas;    		// Imagem de estrela que varia de acordo com a porcentagem de acertos realizados no jogo.
	private ImageView bt_voltar;    	// Imagem utilizada como bot�o para retornar para tela anterior.
	private Bundle params;				// Declara��o de vari�vel do tipo Bundle para manipula��o de par�metros.
	private int qtd_acertos;			// Declara��o de vari�vel int para armazenar a quantidade de acertos realizados no jogo.
	private int qtd_erros;				// Declara��o de vari�vel int para armazenar a quantidade de erros realizados no jogo.
	private float porcentagemAcertos;	// Declara��o de vari�vel float para armazenar a procentagem de acertos.
		
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.score_activity); 		// Setando XML score_activity na Tela.
				
		inicializarComponentes(); 						// Chamando fun��o para iniciar os componentes de tela utilizando ID.
		params = obterParametros();						// Obtendo os parametros que a activity de jogo passou para o Bundle. 
		qtd_acertos = setandoNumerosAcertosTela(params);// Setando na tela, no campo de acertos a quantidade obtida.
		qtd_erros = setandoNumerosErrosTela(params);	// Setando na tela, no campo de erros a quantidade obtida.
		porcentagemAcertos = calculaPorcentagemAcertos(qtd_acertos, qtd_erros); // Calculando porcentagem de acertos.
		definirEventos();								// Definindo evento do bot�o voltar.
		}

	private void inicializarComponentes() {
		estrelas = (ImageView)findViewById(R.id.estrelas);
		bt_voltar = (ImageView)findViewById(R.id.bt_voltar);
		campo_acertos = (TextView)findViewById(R.id.campo_acertos);
		campo_erros = (TextView)findViewById(R.id.campo_erros);
	}
	
	private Bundle obterParametros() {		
		Intent intent = getIntent();		
		Bundle params = intent.getExtras();  
		return params;				
	}
	
	private int setandoNumerosAcertosTela(Bundle params) {
		if(params!=null);
		{   
			int mostraacertos = params.getInt("acertos");
			String acertos = Integer.toString(mostraacertos);
			campo_acertos.setText(acertos);
			return mostraacertos;
		}	
	}
	
	private int setandoNumerosErrosTela(Bundle params) {
		if(params!=null);
		{   
			int mostraerros = params.getInt("erros");
			String erros = Integer.toString(mostraerros);
			campo_erros.setText(erros);
			return mostraerros;
		}		
	}
	
	private float calculaPorcentagemAcertos(int qtd_acertos, int qtd_erros) {
		float qtd_total = qtd_acertos + qtd_erros;
		float porcentagem;		
		porcentagem = 100*qtd_acertos/qtd_total;		
		return porcentagem;				
	}
	
	
	private void definirEventos() {
		bt_voltar.setOnClickListener(new View.OnClickListener(){			
						
			public void onClick(View v) {				
				Intent intent = new Intent(Score_activity.this, Escolha.class);
				startActivity(intent);
				finish();        
			}
		});		
	}


}
