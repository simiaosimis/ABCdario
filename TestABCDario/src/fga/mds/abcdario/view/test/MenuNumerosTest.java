package fga.mds.abcdario.view.test;

import com.jayway.android.robotium.solo.Solo;
import fga.mds.abcdario.Escolha_modo_123;
import fga.mds.abcdario.Jogar_123;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageView;
import fga.mds.abcdario.R;

	public class MenuNumerosTest extends ActivityInstrumentationTestCase2<Escolha_modo_123>{

		private Solo solo;
		private ImageView bt_jogar;
		
		public MenuNumerosTest() {
			super("fga.mds.abcdario", Escolha_modo_123.class);
		}

		protected void setUp() throws Exception {
			super.setUp();
			solo = new Solo(getInstrumentation(), getActivity());
			
			bt_jogar = (ImageView) solo.getView(R.imgV.bt_jogar);
		}
		
		public void tearDown() throws Exception {
			solo.finishOpenedActivities();
		}
		

		public void testeBotaoJogar(){
			solo.waitForActivity("Escolha");
			solo.assertCurrentActivity("Verifica tela escolha letras", Escolha_modo_123.class);
			solo.clickOnView(bt_jogar);
			solo.assertCurrentActivity("Verifica tela jogar ABC", Jogar_123.class);
			
		}

}
