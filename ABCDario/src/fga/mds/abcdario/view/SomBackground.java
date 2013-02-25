package fga.mds.abcdario.view;

import fga.mds.abcdario.R;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class SomBackground extends Service  {

	MediaPlayer player;
	public IBinder onBind(Intent arg0) {

	    return null;
	}
	@Override
	public void onCreate() {
	    // TODO Auto-generated method stub
	    super.onCreate();
	       player = MediaPlayer.create(this, R.raw.musica_back);
	        player.setLooping(true); // Set looping
	        player.setVolume(0.35f , 0.35f);
	        player.start();
	}
	@SuppressWarnings("deprecation")
	@Override
	public void onStart(Intent intent, int startId) {
	    // TODO Auto-generated method stub
	    super.onStart(intent, startId);
	}
	public void onDestroy() {
	    // TODO Auto-generated method stub
		player.stop();
	    super.onDestroy();
	}
	
	public void onStop(){
	    player.stop();
	    player.release();
	}

	public void onPause(){

	    player.stop();
	    player.release();

	}

	protected void onNewIntent() {
		player.stop();
	    player.pause();
	}

}
