 package com.example.intent;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       editText=findViewById(R.id.textmasseg);


    }

    public void onclick(View view) {
//        String string=editText.getText().toString();
//        Intent intent =new Intent(this, MainActivity2.class);
//        intent.putExtra("data",string);
        Intent intent =new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT,"THIS IS SIMPLE MEASAG");
        intent.putExtra(Intent.EXTRA_SUBJECT," HI WES");

        intent.setType("text/plain");
        Intent choser =Intent.createChooser(intent,null);
        startActivity(choser);




        startActivity(intent);

    }
}