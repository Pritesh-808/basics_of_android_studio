 package com.example.first_course;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import static com.example.first_course.R.*;

 public class MainActivity extends AppCompatActivity {

    public void executeThis(View view)
    {
        EditText nameText = (EditText)findViewById(id.nameText); // retrieving text from TextView

        Log.i("Info","Button Pressed!");
        Log.i("name",nameText.getText().toString());

        Toast.makeText(this, "Hello "+nameText.getText().toString(),
                Toast.LENGTH_SHORT).show(); //displaying toast message for short amount of time

        //changing image dynamically
        ImageView image = (ImageView) findViewById(R.id.final0);
        image.setImageResource(R.drawable.final1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
    }
}