package com.example.ratingbarapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends Activity {

	RatingBar rb;
	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rb=(RatingBar)findViewById(R.id.ratingBar1);
		b = (Button)findViewById(R.id.button1);
		
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Float r = rb.getRating();
				Toast.makeText(getApplicationContext(), r+"", Toast.LENGTH_SHORT).show();
			}
		});
	}

	

}