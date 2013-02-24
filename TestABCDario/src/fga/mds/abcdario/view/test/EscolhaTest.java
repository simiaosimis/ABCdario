package fga.mds.abcdario.test;

import com.jayway.android.robotium.solo.Solo;

import fga.mds.abcdario.Escolha;
import fga.mds.abcdario.Escolha_modo_123;
import fga.mds.abcdario.Escolha_modo_ABC;
import fga.mds.abcdario.InicioActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageView;
import fga.mds.abcdario.R;

public class EscolhaTest extends ActivityInstrumentationTestCase2<Escolha>{

	private Solo solo;
	private ImageView bt_123, bt_abc, bt_voltar;
	
	public EscolhaTest() {
		super("fga.mds.abcdario", Escolha.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
		
		bt_123 = (ImageView) solo.getView(R.imgV.bt_123);
		bt_abc = (ImageView) solo.getView(R.imgV.bt_abc);
		bt_voltar = (ImageView) solo.getView(R.imgV.bt_voltar);
	}
	
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
	

	public void testeBotao123(){
		solo.waitForActivity("Escolha");
		solo.assertCurrentActivity("Verifica tela escolha", Escolha.class);
		solo.clickOnView(bt_123);
		solo.assertCurrentActivity("Verifica tela menu 123", Escolha_modo_123.class);
		
	}

	public void testeBotaoABC(){
		solo.waitForActivity("Escolha");
		solo.assertCurrentActivity("Verifica tela escolha", Escolha.class);	
		solo.clickOnView(bt_abc);
		solo.assertCurrentActivity("Verifica tela menu 123", Escolha_modo_ABC.class);	
	}
	
	public void testeBotaoVoltar(){
		solo.waitForActivity("Escolha");
		solo.assertCurrentActivity("Verifica tela escolha", Escolha.class);	
		solo.clickOnView(bt_voltar);
		solo.assertCurrentActivity("Verifica tela menu 123", InicioActivity.class);	
	}
	
}