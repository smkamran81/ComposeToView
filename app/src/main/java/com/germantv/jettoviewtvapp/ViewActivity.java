package com.germantv.jettoviewtvapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        // Update the View-based activity layout (activity_view.xml) if necessary
        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");
        Toast.makeText(getApplicationContext(),"message: "+message,Toast.LENGTH_LONG).show();
    }
}