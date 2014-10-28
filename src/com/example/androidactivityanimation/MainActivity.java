package com.example.androidactivityanimation;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button switchButton = (Button) findViewById(R.id.switchbutton);
		Button switchbutton2 = (Button) findViewById(R.id.switchbutton2);
		switchButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, Activity3.class);
				startActivity(intent);
				overridePendingTransition(R.anim.right_in, R.anim.left_out);
			}
		});

		switchbutton2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, Activity1.class);
				startActivity(intent);

			}
		});
	}

}
