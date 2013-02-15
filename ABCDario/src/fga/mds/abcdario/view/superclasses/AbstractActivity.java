package fga.mds.abcdario.view.control.superclasses;

import fga.mds.abcdario.view.control.interfaces.ComportamentoBase;
import android.app.Activity;

public abstract class AbstractActivity extends Activity implements ComportamentoBase {

	@Override
	public abstract void inicializarComponentes();

	@Override
	public abstract void definirEventos();
}
