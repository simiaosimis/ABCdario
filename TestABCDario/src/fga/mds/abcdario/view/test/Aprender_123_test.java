package fga.mds.abcdario.view.test;

import com.jayway.android.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageView;
import fga.mds.abcdario.Aprender_123;
import fga.mds.abcdario.Escolha_modo_123;
import fga.mds.abcdario.R;


public class Aprender_123_test extends ActivityInstrumentationTestCase2<Aprender_123> {
	private ImageView bt_voltar;
	private Solo solo;

	
	public Aprender_123_test() {
		super(Aprender_123.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
		bt_voltar = (ImageView) solo.getView(R.imgV.bt_voltar);
		
	}
	
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
	
	public void testeBotao1Voltar(){
		solo.waitForActivity("Aprender_123");
		solo.assertCurrentActivity("Verifica tela Aprender", Aprender_123.class);	
		solo.clickOnView(bt_voltar);
		solo.assertCurrentActivity("Verifica tela menu 123", Escolha_modo_123.class);	
	}
		
	public void testeBotao1(){
		solo.waitForActivity("Aprender_123", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(1);
	}
	public void testeBotao2(){
		solo.waitForActivity("Aprender_123", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(2);
	}
	public void testeBotao3(){
		solo.waitForActivity("Aprender_123", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(3);
	}
	public void testeBotao4(){
		solo.waitForActivity("Aprender_123", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(4);
	}
	public void testeBotao5(){
		solo.waitForActivity("Aprender_123", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(5);
	}
	public void testeBotao6(){
		solo.waitForActivity("Aprender_123", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(6);
	}
	public void testeBotao7(){
		solo.waitForActivity("Aprender_123", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(7);
	}
	public void testeBotao8(){
		solo.waitForActivity("Aprender_123", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(8);
	}
	public void testeBotao9(){
		solo.waitForActivity("Aprender_123", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(9);
	}
	
	
	
	
	
	
}

