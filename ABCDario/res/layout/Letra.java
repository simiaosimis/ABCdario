package fga.mds.abcdario.view;

 


import fga.mds.abcdario.R;
import fga.mds.abcdario.control.AprenderController;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
 
public class Letra extends Activity {
 
	private AprenderController controller;	//Declarando a controladora Aprender
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Salvando situação da instancia
        setContentView(R.layout.letra); 	//Setando XML
        
        controller = new AprenderController();// Instanciando a controladora Aprender
 
        //Obtendo o intent dos dados anteriores
        Intent i = getIntent();
 
       
        int posicao = i.getExtras().getInt("id");  //Obtendo posicao do botao selecionado
        ImageView imageView = (ImageView) findViewById(R.id.imagem_selecionada); //Declarando uma ImageView de forma definida no xml
        
        //Setando na tela a imagem correspondente a letra selecionada
        imageView.setImageDrawable((getResources().getDrawable(controller.definirImagemLetraSetada(posicao))));
    }
 
}