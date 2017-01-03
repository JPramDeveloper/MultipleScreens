package com.example.android.multiplescreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
       // This creates a TextView Object which lets us know
        TextView textView = new TextView(this); // it's a new object whithin this context.
        textView.setTextSize(40);
        textView.setText(message);// sets this TextView object to have the message from earlier implemented in it.


        TextView textView2 = new TextView(this);
        textView2.setTextSize(40);
        textView2.setText("Does this work? It should.");

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
        layout.addView(textView2);
    }
}
