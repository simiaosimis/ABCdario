package com.example.velocityabcdarioleandro.test;

import com.example.velocityabcdarioleandro.Aprender;
import com.example.velocityabcdarioleandro.Escolha;
import com.example.velocityabcdarioleandro.Jogar;
import com.example.velocityabcdarioleandro.MainActivity;
import com.jayway.android.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class TesteABCVelocity extends
		ActivityInstrumentationTestCase2<MainActivity> {
	
	
	private Solo solo;

	public TesteABCVelocity() {
		super("com.example.velocityabcdarioleandro", MainActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		solo = new Solo(getInstrumentation(), getActivity());
	}

	
	public void testeABC(){
		
		solo.assertCurrentActivity("Verifica tela inicial", MainActivity.class);	
		solo.clickOnButton("Iniciar");
		solo.assertCurrentActivity("Verifica tela modo", Escolha.class);
		solo.clickOnButton("Jogar");
		solo.assertCurrentActivity("Verifica tela jogo", Jogar.class);
		solo.goBack();
		solo.assertCurrentActivity("Verifica tela jogo", Escolha.class);
		solo.clickOnButton("Aprender");
		solo.assertCurrentActivity("Verifica tela aprender", Aprender.class);
		solo.clickOnButton("B");
		solo.clickOnButton("C");
		solo.clickOnButton("D");
		solo.clickOnButton("E");
		solo.clickOnButton("A");
		solo.clickOnButton("X");
		solo.goBack();
				
	}
	
}
