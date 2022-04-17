package br.edu.utfpr.martins.transientactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button buttonAbout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAbout = findViewById(R.id.buttonAbout);
    }

    public void activityAbout(View view){

        Intent intent = new Intent(this, AboutActivity.class);

        startActivity(intent);
    }



}