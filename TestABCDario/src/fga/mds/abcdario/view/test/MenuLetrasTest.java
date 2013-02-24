package fga.mds.abcdario.test;

import com.jayway.android.robotium.solo.Solo;
import fga.mds.abcdario.Escolha;
import fga.mds.abcdario.Escolha_modo_ABC;
import fga.mds.abcdario.Jogar_ABC;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageView;
import fga.mds.abcdario.R;

	public class MenuLetrasTest extends ActivityInstrumentationTestCase2<Escolha_modo_ABC>{

		private Solo solo;
		private ImageView bt_jogar, bt_voltar;
		
		public MenuLetrasTest() {
			super("fga.mds.abcdario", Escolha_modo_ABC.class);
		}

		protected void setUp() throws Exception {
			super.setUp();
			solo = new Solo(getInstrumentation(), getActivity());
			
			bt_jogar = (ImageView) solo.getView(R.imgV.bt_jogar);
			bt_voltar = (ImageView) solo.getView(R.imgV.bt_voltar);
		}
		
		public void tearDown() throws Exception {
			solo.finishOpenedActivities();
		}
		

		public void testeBotaoJogar(){
			solo.waitForActivity("Escolha Modo ABC");
			solo.assertCurrentActivity("Verifica tela escolha letras", Escolha_modo_ABC.class);
			solo.clickOnView(bt_jogar);
			solo.assertCurrentActivity("Verifica tela jogar ABC", Jogar_ABC.class);
			
		}
		
		public void testeBotaoVoltar(){
			solo.waitForActivity("Escolha modo ABC");
			solo.assertCurrentActivity("Verifica tela escolha", Escolha_modo_ABC.class);	
			solo.clickOnView(bt_voltar);
			solo.assertCurrentActivity("Verifica tela menu 123", Escolha.class);	
		}

}
