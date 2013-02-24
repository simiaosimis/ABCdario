package fga.mds.abcdario.view.test;

import com.jayway.android.robotium.solo.Solo;
import fga.mds.abcdario.Escolha;
import fga.mds.abcdario.Escolha_modo_123;
import fga.mds.abcdario.Jogar_123;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageView;
import fga.mds.abcdario.R;

	public class MenuNumerosTest extends ActivityInstrumentationTestCase2<Escolha_modo_123>{

		private Solo solo;
		private ImageView bt_jogar, bt_voltar;
		
		public MenuNumerosTest() {
			super("fga.mds.abcdario", Escolha_modo_123.class);
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
			solo.waitForActivity("Escolha Modo 123");
			solo.assertCurrentActivity("Verifica tela escolha letras", Escolha_modo_123.class);
			solo.clickOnView(bt_jogar);
			solo.assertCurrentActivity("Verifica tela jogar ABC", Jogar_123.class);
			
		}
		
		public void testeBotaoVoltar(){
			solo.waitForActivity("Escolha modo 123");
			solo.assertCurrentActivity("Verifica tela escolha", Escolha_modo_123.class);	
			solo.clickOnView(bt_voltar);
			solo.assertCurrentActivity("Verifica tela menu 123", Escolha.class);	
		}

}
