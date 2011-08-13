package com.uuu;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class MyFirstAndroidProjectActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d("title", "details");
    }

	@Override
	public boolean isFinishing() {
		// TODO Auto-generated method stub
		return super.isFinishing();
	}
    
    
}