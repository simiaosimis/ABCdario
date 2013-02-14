package fga.mds.abcdario.test;

import com.jayway.android.robotium.solo.Solo;

import fga.mds.abcdario.Escolha;
import fga.mds.abcdario.Escolha_modo_123;
import fga.mds.abcdario.Escolha_modo_ABC;
import fga.mds.abcdario.InicioActivity;
import android.test.ActivityInstrumentationTestCase2;

public class Teste_Menus extends ActivityInstrumentationTestCase2<InicioActivity>{

	private Solo solo;
	
	public Teste_Menus() {
		super("fga.mds.abcdario", InicioActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		solo = new Solo(getInstrumentation(), getActivity());
	}

	
	public void testeMenu(){
		
		solo.assertCurrentActivity("Verifica tela inicial", InicioActivity.class);	
		solo.clickOnButton("Botao Iniciar");
		solo.assertCurrentActivity("Verifica tela escolha", Escolha.class);
		solo.clickOnButton("123 Escolha");
		solo.assertCurrentActivity("Verifica tela 123",Escolha_modo_123.class);
		solo.clickOnButton("Botao Voltar");
		solo.assertCurrentActivity("Verifica tela escolha", Escolha.class);
		solo.clickOnButton("Abc Escolha");
		solo.assertCurrentActivity("Verifica tela aprender", Escolha_modo_ABC.class);
		solo.clickOnButton("Botao Voltar");
		solo.assertCurrentActivity("Verifica tela escolha", Escolha.class);
		solo.clickOnButton("Botao Voltar");
		solo.assertCurrentActivity("Verifica tela inicial", InicioActivity.class);	
	}
	
}
