package com.example.mobiletechnologiesassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMessage(View view) {
        EditText nameText = (EditText) findViewById(R.id.editText);
        String myName = nameText.getText().toString();

        final String displayString = "Hello " + myName + "\n" + "Welcome to COM594...";

        TextView displayText = (TextView) findViewById(R.id.textView2);
        displayText.setText(displayString);
    }
}
