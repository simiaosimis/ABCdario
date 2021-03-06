package fga.mds.abcdario.view.test;

import com.jayway.android.robotium.solo.Solo;

import fga.mds.abcdario.R;
import fga.mds.abcdario.view.JogoLetra;
import fga.mds.abcdario.view.JogoNumero;
import fga.mds.abcdario.view.Score;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageView;

public class TestJogoLetra extends ActivityInstrumentationTestCase2<JogoLetra> {

	public TestJogoLetra() {
		super("fga.mds.abcdario.view", JogoLetra.class);
	}

	private Solo solo;
	private ImageView bt1, bt2, bt_voltar;

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
		
		bt1 = (ImageView) solo.getView(R.id.bt_1);
		bt2 = (ImageView) solo.getView(R.id.bt_2);
		bt_voltar = (ImageView) solo.getView(R.id.bt_voltar);
	}

	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
	
	public void testBotao1() {
		
		solo.waitForActivity("JogoLetra");
		solo.assertCurrentActivity("JogoLetra activity", JogoLetra.class);
		
		solo.clickOnView(bt1);
		
		solo.waitForDialogToClose(10);
		
	}
	
	public void testBotao2() {
		
		solo.waitForActivity("JogoLetra");
		solo.assertCurrentActivity("JogoLetra activity", JogoLetra.class);
		
		solo.clickOnView(bt2);
		
		solo.waitForDialogToClose(10);
		
	}

	public void testBotaoVoltar() {
		
		solo.waitForActivity("JogoLetra");
		solo.assertCurrentActivity("JogoLetra activity", JogoLetra.class);
		
		solo.clickOnView(bt_voltar);
		
		solo.waitForActivity("Score");
		solo.assertCurrentActivity("Score Activity", Score.class);
		
	}
	
}
