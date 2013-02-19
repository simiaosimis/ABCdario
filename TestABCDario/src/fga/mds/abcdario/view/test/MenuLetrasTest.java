package fga.mds.abcdario.view.test;

import com.jayway.android.robotium.solo.Solo;
import fga.mds.abcdario.Escolha_modo_ABC;
import fga.mds.abcdario.Jogar_ABC;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageView;
import fga.mds.abcdario.R;

	public class MenuLetrasTest extends ActivityInstrumentationTestCase2<Escolha_modo_ABC>{

		private Solo solo;
		private ImageView bt_jogar;
		
		public MenuLetrasTest() {
			super("fga.mds.abcdario", Escolha_modo_ABC.class);
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
			solo.assertCurrentActivity("Verifica tela escolha letras", Escolha_modo_ABC.class);
			solo.clickOnView(bt_jogar);
			solo.assertCurrentActivity("Verifica tela jogar ABC", Jogar_ABC.class);
			
		}

}
