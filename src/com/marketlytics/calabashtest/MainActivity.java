package com.marketlytics.calabashtest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private SharedPreferences mPreferences;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mPreferences = getSharedPreferences("User", MODE_PRIVATE);
		
		final Button button = (Button) findViewById(R.id.button1);
		final Button detailsButton = (Button) findViewById(R.id.button2);
		final TextView textView = (TextView) findViewById(R.id.textView1);
		final EditText textField = (EditText) findViewById(R.id.editText1);
		final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox1);
		
		String test = mPreferences.getString("username", "");
		if(test != "")
			textView.setText(test + " <-- User had put in text before! ");
		
		
		button.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View v) {
	        	 textView.setText("Hello World!");
	         }
	     });
		
		detailsButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent a = 
	                     new Intent(getApplicationContext(),DetailsActivity.class);
	        	 a.putExtra("INPUT", textField.getText().toString());
	        	 SharedPreferences.Editor editor = mPreferences.edit();
	        	 editor.putString("username", textField.getText().toString());
	     		 editor.commit();
	     		
	             a.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
	             startActivity(a);
			}
		});
		
		checkBox.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (v instanceof CheckBox) {
			        if (((CheckBox) v).isChecked()) {
			        	textView.setText("Checkbox is checked now...");
			        } else {
			        	textView.setText("Checkbox is not checked...");
			        }
			    }
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

/*public class AndroidButton extends Activity implements OnClickListener {
	
	Button btn;
	TextView tv;
	
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.my_button_interface);
       
       btn = (Button) findViewById(R.id.button1);
       tv = (TextView) findViewById(R.id.textView1);
       
       tv.setText("This is old text");
       btn.setOnClickListener(this);
   }

	@Override
	public void onClick(View v) {
	 // TODO Auto-generated method stub
	 if (v.getId() == R.id.myButton) {
	  tv.setText("This is new text");
	 }
	}
}*/
