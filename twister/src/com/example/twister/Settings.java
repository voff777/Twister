package com.example.twister;

import java.util.Timer;

import com.example.twister.MainActivity.MyTimerTask;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import android.view.View.OnTouchListener;

import android.widget.CheckBox;
import android.widget.ImageButton;

import android.widget.RadioGroup;
import android.widget.Toast;

public class Settings extends Activity implements OnTouchListener {
	ImageButton butSave, butCancel;
	RadioGroup radio;
	CheckBox chk;
	SharedPreferences sPref;
	int check, voice;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        butSave = (ImageButton) findViewById(R.id.imageButton1);
        butCancel = (ImageButton) findViewById(R.id.imageButton2);
        radio = (RadioGroup) findViewById(R.id.radioGroup1);
        chk = (CheckBox) findViewById(R.id.checkBox1);
        butSave.setOnTouchListener(this);
        butCancel.setOnTouchListener(this);
        
        Intent intent = getIntent();
        check=intent.getIntExtra("value_pause", 0);   
        voice=intent.getIntExtra("voice_intent", 1);
       // Toast.makeText(this, ""+check+"  "+voice, Toast.LENGTH_SHORT).show();
        if (check == 10000)
        	radio.check(R.id.radio0);else
        if (check == 15000)
           	radio.check(R.id.radio1);else
       if (check == 20000)
    		radio.check(R.id.radio2);
        if (check == 25000)
    		radio.check(R.id.radio3);
       if (voice==1) chk.setChecked(true); else
    	   chk.setChecked(false);
	}

/*	@Override
	public void onClick(View v) {
	if (v.getId()==R.id.button1){	
		if (radio.getCheckedRadioButtonId()==R.id.radio0){
			//Toast.makeText(this, "10s", Toast.LENGTH_SHORT).show();
			Intent intent = new Intent();
			intent.putExtra("value_pause", 10000);
			if (chk.isChecked()==true) intent.putExtra("voice_intent", 1);else
				intent.putExtra("voice_intent", 0);
			setResult(RESULT_OK, intent);
			finish();
		}
		if (radio.getCheckedRadioButtonId()==R.id.radio1){
			//Toast.makeText(this, "20s", Toast.LENGTH_SHORT).show();
			Intent intent = new Intent();
			intent.putExtra("value_pause", 15000);
			if (chk.isChecked()==true) intent.putExtra("voice_intent", 1);else
				intent.putExtra("voice_intent", 0);
			setResult(RESULT_OK, intent);
			finish();
		}
		if (radio.getCheckedRadioButtonId()==R.id.radio2){
			//Toast.makeText(this, "20s", Toast.LENGTH_SHORT).show();
			Intent intent = new Intent();
			intent.putExtra("value_pause", 20000);
			if (chk.isChecked()==true) intent.putExtra("voice_intent", 1);else
				intent.putExtra("voice_intent", 0);
			setResult(RESULT_OK, intent);
			finish();
		}
		if (radio.getCheckedRadioButtonId()==R.id.radio3){
			//Toast.makeText(this, "20s", Toast.LENGTH_SHORT).show();
			Intent intent = new Intent();
			intent.putExtra("value_pause", 25000);
			if (chk.isChecked()==true) intent.putExtra("voice_intent", 1);else
				intent.putExtra("voice_intent", 0);
			setResult(RESULT_OK, intent);
			finish();
		}
	    
	}else
		if (v.getId()==R.id.button2) finish();
	}*/

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		if (v.getId()==R.id.imageButton1){
			 switch (event.getAction()) {
			    case MotionEvent.ACTION_DOWN: // нажатие    	
			    	butSave.setBackgroundResource(R.drawable.save_pressed);			    	
			      break;
			    case MotionEvent.ACTION_UP: // отпускание
			    case MotionEvent.ACTION_CANCEL:  
			    	butSave.setBackgroundResource(R.drawable.save);
			    	if (radio.getCheckedRadioButtonId()==R.id.radio0){
						//Toast.makeText(this, "10s", Toast.LENGTH_SHORT).show();
						Intent intent = new Intent();
						intent.putExtra("value_pause", 10000);
						if (chk.isChecked()==true) intent.putExtra("voice_intent", 1);else
							intent.putExtra("voice_intent", 0);
						setResult(RESULT_OK, intent);
						finish();
					}
					if (radio.getCheckedRadioButtonId()==R.id.radio1){
						//Toast.makeText(this, "20s", Toast.LENGTH_SHORT).show();
						Intent intent = new Intent();
						intent.putExtra("value_pause", 15000);
						if (chk.isChecked()==true) intent.putExtra("voice_intent", 1);else
							intent.putExtra("voice_intent", 0);
						setResult(RESULT_OK, intent);
						finish();
					}
					if (radio.getCheckedRadioButtonId()==R.id.radio2){
						//Toast.makeText(this, "20s", Toast.LENGTH_SHORT).show();
						Intent intent = new Intent();
						intent.putExtra("value_pause", 20000);
						if (chk.isChecked()==true) intent.putExtra("voice_intent", 1);else
							intent.putExtra("voice_intent", 0);
						setResult(RESULT_OK, intent);
						finish();
					}
					if (radio.getCheckedRadioButtonId()==R.id.radio3){
						//Toast.makeText(this, "20s", Toast.LENGTH_SHORT).show();
						Intent intent = new Intent();
						intent.putExtra("value_pause", 25000);
						if (chk.isChecked()==true) intent.putExtra("voice_intent", 1);else
							intent.putExtra("voice_intent", 0);
						setResult(RESULT_OK, intent);
						finish();
					}
			      break;
			    }
			}
		
		if (v.getId()==R.id.imageButton2){
			 switch (event.getAction()) {
			    case MotionEvent.ACTION_DOWN: // нажатие    	
			    	butCancel.setBackgroundResource(R.drawable.cancel_pressed);
			      break;
			    case MotionEvent.ACTION_UP: // отпускание
			    case MotionEvent.ACTION_CANCEL:  
			    	butCancel.setBackgroundResource(R.drawable.cancel);
			    	finish();
			      break;
			    }
			}
		
		
		
		return false;
	}
}
