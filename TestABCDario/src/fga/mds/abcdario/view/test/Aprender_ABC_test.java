package fga.mds.abcdario.view.test;

import com.jayway.android.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageView;
import fga.mds.abcdario.Aprender_ABC;
import fga.mds.abcdario.Escolha_modo_ABC;
import fga.mds.abcdario.R;


public class Aprender_ABC_test extends ActivityInstrumentationTestCase2<Aprender_ABC> {
	private Solo solo;
	private ImageView bt_voltar;

	
	public Aprender_ABC_test() {
		super(Aprender_ABC.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
		bt_voltar = (ImageView) solo.getView(R.imgV.bt_voltar);
		
	}
	
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
	
	public void testeBotaoAVoltar(){
		solo.waitForActivity("Aprender_123");
		solo.assertCurrentActivity("Verifica tela Aprender", Aprender_ABC.class);	
		solo.clickOnView(bt_voltar);
		solo.assertCurrentActivity("Verifica tela menu ABC", Escolha_modo_ABC.class);	
	}
		
	public void testeBotaoA(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(1);
	}
	public void testeBotaoB(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(2);
	}
	public void testeBotaoC(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(3);
	}
	public void testeBotaoD(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(4);
	}
	public void testeBotaoE(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(5);
	}
	public void testeBotaoF(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(6);
	}
	public void testeBotaoG(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(7);
	}
	public void testeBotaoH(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(8);
	}
	public void testeBotaoI(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(9);
	}
	public void testeBotaoJ(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(10);
	}
	public void testeBotaoK(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(11);
	}
	public void testeBotaoL(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(12);
	}
	public void testeBotaoM(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(13);
	}
	public void testeBotaoN(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(14);
	}
	public void testeBotaoO(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(15);
	}
	public void testeBotaoP(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(16);
	}
	public void testeBotaoQ(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(17);
	}
	public void testeBotaoR(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(18);
	}
	public void testeBotaoS(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(19);
	}
	public void testeBotaoT(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(20);
	}
	public void testeBotaoU(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(21);
	}
	public void testeBotaoV(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(22);
	}
	public void testeBotaoW(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(23);
	}
	public void testeBotaoX(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(24);
	}
	public void testeBotaoY(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(25);
	}
	public void testeBotaoZ(){
		solo.waitForActivity("Aprender_ABC", 500);
		solo.setActivityOrientation(Solo.LANDSCAPE);
		solo.sleep(1000);
		solo.clickInList(26);
	}
	
}

