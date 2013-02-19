package fga.mds.abcdario.view.test;

import com.jayway.android.robotium.solo.Solo;

import fga.mds.abcdario.Escolha;
import fga.mds.abcdario.InicioActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageView;
import fga.mds.abcdario.R;

public class InicioTest extends ActivityInstrumentationTestCase2<InicioActivity>{

	private Solo solo;
	private ImageView bt_iniciar, bt_sobre;
	
	public InicioTest() {
		super("fga.mds.abcdario", InicioActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
		
		bt_iniciar = (ImageView) solo.getView(R.imgV.bt_iniciar);
		bt_sobre = (ImageView) solo.getView(R.imgV.bt_sobre);
	}
	
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
	

	public void testeBotaoIniciar(){
		solo.waitForActivity("InicioActivity");
		solo.assertCurrentActivity("Verifica tela inicial", InicioActivity.class);	
		solo.clickOnView(bt_iniciar);
		solo.assertCurrentActivity("Verifica tela escolha", Escolha.class);
		
	}

	public void testeBotaoInformativo(){
		solo.waitForActivity("InicioActivity");
		solo.assertCurrentActivity("Verifica tela inicial", InicioActivity.class);	
		solo.clickOnView(bt_sobre);
		solo.waitForDialogToClose(10);		
	}
	
}
