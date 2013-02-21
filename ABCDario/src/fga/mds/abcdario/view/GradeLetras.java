package fga.mds.abcdario.view;



import fga.mds.abcdario.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout.LayoutParams;
import android.widget.GridView;
import android.widget.ImageView;
 
public class GradeLetras extends BaseAdapter {
	
	
    private Context contexto;
    //Iniciando botoes na grade
     public Integer[] botoesLetras = {
    		R.drawable.bt_a,R.drawable.bt_b,R.drawable.bt_c,R.drawable.bt_d,R.drawable.bt_e,
    		R.drawable.bt_f,R.drawable.bt_g,R.drawable.bt_h,R.drawable.bt_i,R.drawable.bt_j,
    		R.drawable.bt_k,R.drawable.bt_l,R.drawable.bt_m,R.drawable.bt_n,R.drawable.bt_o,
    		R.drawable.bt_p,R.drawable.bt_q,R.drawable.bt_r,R.drawable.bt_s,R.drawable.bt_t,
    		R.drawable.bt_u,R.drawable.bt_v,R.drawable.bt_x,R.drawable.bt_z,R.drawable.bt_w,
    		R.drawable.bt_y,
    };
 
    public GradeLetras(Context c){
    	contexto = c;
    }
 
    
    public int getCount() {
        return botoesLetras.length; //Obtendo quantidade de botoes presentes na grade
    }
 
    public Object getItem(int posicao) {
    	return botoesLetras[posicao]; //Obtendo o índice da posição de um botão na tela 
    }
 
    public long getItemId(int posicao) {
        return 0;
    }
 
      
    public View getView(int posicao, View convertView, ViewGroup parent) {    	//Setando na tela botoes e a Grade
    	
        ImageView imageView = new ImageView(contexto);
        imageView.setImageResource(botoesLetras[posicao]);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setLayoutParams(new GridView.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
        return imageView;
        
    }
    
    
 
}
