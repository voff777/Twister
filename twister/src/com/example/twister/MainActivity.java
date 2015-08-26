package com.example.twister;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnTouchListener {
	ImageButton btnStart, btnCancel;
	TextView txt;
	int step = -1;
    Random random = new Random();
	private Timer mTimer;
	private MyTimerTask mMyTimerTask;
	ImageView img;
	SharedPreferences sPref;
	int timer_pause, voice;
	MediaPlayer mp;
    @Override 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = (ImageButton) findViewById(R.id.imageButton1);
        btnCancel = (ImageButton) findViewById(R.id.imageButton2);
        txt = (TextView) findViewById(R.id.textView1);
        img = (ImageView)findViewById(R.id.imageView1);
        btnStart.setOnTouchListener(this);
        btnCancel.setOnTouchListener(this);
        
   
        sPref = getPreferences(MODE_PRIVATE);
        timer_pause = sPref.getInt("timer_pause", 10000);
        voice = sPref.getInt("voice", 1);
      //  txt.setText(""+timer_pause+"    "+voice);
      //  txt.setText("");
        
        if (savedInstanceState!=null){
        	step = savedInstanceState.getInt("step");
        	if (step==-1) img.setImageResource(R.drawable.welcome);else
        	generateStep(step);    	
        }
    }
	
	class MyTimerTask extends TimerTask {
		@Override
		public void run() {
			step = random.nextInt(16);					
			runOnUiThread(new Runnable() {	
			@Override
				public void run() {
					generateStep(step);
				}
			});
		}
	}
public void generateStep(int rand){
	switch (rand) {
	case 0:
		txt.setText("Левая рука красный цвет");
		img.setImageResource(R.drawable.left_arm_red);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.left_arm_red);
		mp.start();
		}
		break;
	case 1:
		txt.setText("Левая рука желтый цвет");
		img.setImageResource(R.drawable.left_arm_yellow);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.left_arm_yellow);
		mp.start();
		}
		break;
	case 2:
		txt.setText("Левая рука зеленый цвет");
		img.setImageResource(R.drawable.left_arm_green);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.left_arm_green);
		mp.start();
		}
		break;
	case 3:
		txt.setText("Левая рука синий цвет");
		img.setImageResource(R.drawable.left_arm_blue);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.left_arm_blue);
		mp.start();
		}
		break;
	case 4:
		txt.setText("Правая рука красный цвет");
		img.setImageResource(R.drawable.right_arm_red);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.right_arm_red);
		mp.start();
		}
		break;
	case 5:
		txt.setText("Правая рука желтый цвет");
		img.setImageResource(R.drawable.right_arm_yellow);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.right_arm_yellow);
		mp.start();
		}
		break;
	case 6:
		txt.setText("Правая рука зеленый цвет");
		img.setImageResource(R.drawable.right_arm_green);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.right_arm_green);
		mp.start();
		}
		break;
	case 7:
		txt.setText("Правая рука синий цвет");
		img.setImageResource(R.drawable.right_arm_blue);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.right_arm_blue);
		mp.start();
		}
		break;
	case 8:
		txt.setText("Левая нога красный цвет");
		img.setImageResource(R.drawable.left_leg_red);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.left_leg_red);
		mp.start();
		}
		break;
	case 9:
		txt.setText("Левая нога желтый цвет");
		img.setImageResource(R.drawable.left_leg_yellow);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.left_leg_yellow);
		mp.start();
		}
		break;
	case 10:
		txt.setText("Левая нога зеленый цвет");
		img.setImageResource(R.drawable.left_leg_green);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.left_leg_green);
		mp.start();
		}
		break;
	case 11:
		txt.setText("Левая нога синий цвет");
		img.setImageResource(R.drawable.left_leg_blue);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.left_leg_blue);
		mp.start();
		}
		break;
	case 12:
		txt.setText("Правая нога красный цвет");
		img.setImageResource(R.drawable.right_leg_red);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.right_leg_red);
		mp.start();
		}
		break;
	case 13:
		txt.setText("Правая нога желтый цвет");
		img.setImageResource(R.drawable.right_leg_yellow);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.right_leg_yellow);
		mp.start();
		}
		break;
	case 14:
		txt.setText("Правая нога зеленый цвет");
		img.setImageResource(R.drawable.right_leg_green);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.right_leg_green);
		mp.start();
		}
		break;
	case 15:
		txt.setText("Правая нога синий цвет");
		img.setImageResource(R.drawable.right_leg_blue);
		if (voice==1){
		mp = MediaPlayer.create(MainActivity.this, R.raw.right_leg_blue);
		mp.start();
		}
		break;

	default:
		break;
	}
}
@Override
protected void onSaveInstanceState(Bundle outState) {
	super.onSaveInstanceState(outState);
	outState.putInt("step", step);
	if (mTimer != null) {
		mTimer.cancel();
		mTimer = null;
	}
}
	
   @Override
public boolean onCreateOptionsMenu(Menu menu) {
	menu.add(0, 1, 0, "Настройка");
	menu.add(0, 2, 0, "О приложении");
	menu.add(0, 3, 0, "Выйти");
	return super.onCreateOptionsMenu(menu);
}
@Override
public boolean onOptionsItemSelected(MenuItem item) {
	switch (item.getItemId()) {
	case 1:
		btnStart.setBackgroundResource(R.drawable.play);
    	btnStart.setEnabled(true);
    	if (mTimer != null) {
			mTimer.cancel();
			mTimer = null;
		}
		Intent intent = new Intent(this, Settings.class);
		intent.putExtra("value_pause", timer_pause);
		intent.putExtra("voice_intent", voice);
		startActivityForResult(intent, 1);
		break;
	case 2:
		AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
		builder.setTitle("О приложении Твистер");
		builder.setMessage("Версия: 1.0\nИдея: Анастасия Лавриченко \nРазработка: Киселев Владимир\nvk.com/voff777\nПрограмма защищена авторским правом\n2015 год");
		builder.setCancelable(false);
		builder.setPositiveButton("Закрыть", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		});
		AlertDialog alert = builder.create();
		alert.show();
		
		break;
	case 3:
		finish();
		break;


	default:
		break;
	}
	return super.onOptionsItemSelected(item);
}   
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	super.onActivityResult(requestCode, resultCode, data);
	if ((requestCode==1) && (resultCode==RESULT_OK)){
	//txt.setText(""+data.getIntExtra("value_pause", 0)+"  "+data.getIntExtra("voice_intent", 1));
	sPref = getPreferences(MODE_PRIVATE);
	Editor ed = sPref.edit();
	ed.putInt("timer_pause", data.getIntExtra("value_pause", 0));
	ed.putInt("voice", data.getIntExtra("voice_intent", 1));
	ed.commit();
	timer_pause = data.getIntExtra("value_pause", 0);
	voice = data.getIntExtra("voice_intent", 1);
	}
}
@Override



public boolean onTouch(View v, MotionEvent event) {
	if (v.getId()==R.id.imageButton1){
	 switch (event.getAction()) {
	    case MotionEvent.ACTION_DOWN: // нажатие    	
	    	btnStart.setBackgroundResource(R.drawable.play_pressed);
	      break;
	    case MotionEvent.ACTION_UP: // отпускание
	    case MotionEvent.ACTION_CANCEL:  
	    	//btnStart.setBackgroundResource(R.drawable.play);
	    	btnStart.setEnabled(false);
	    	if (mTimer != null) {
				mTimer.cancel();
			}
			mTimer = new Timer();
			mMyTimerTask = new MyTimerTask();
			mTimer.schedule(mMyTimerTask, 0, timer_pause);	
	      break;
	    }
	}
	if (v.getId()==R.id.imageButton2){
		 switch (event.getAction()) {
		    case MotionEvent.ACTION_DOWN: // нажатие    	
		    	btnCancel.setBackgroundResource(R.drawable.stop_pressed);
		      break;
		    case MotionEvent.ACTION_UP: // отпускание
		    case MotionEvent.ACTION_CANCEL:  
		    	btnCancel.setBackgroundResource(R.drawable.stop);
		    	btnStart.setBackgroundResource(R.drawable.play);
		    	btnStart.setEnabled(true);
		    	if (mTimer != null) {
					mTimer.cancel();
					mTimer = null;
				}
		      break;
		    }
		}
	
	
	return false;
}
   

	
}
