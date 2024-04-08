package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Toast;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private EditText emailEditText;
    private RadioGroup genderRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing data from GUI
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        emailEditText = findViewById(R.id.emailEditText);
        genderRadioGroup = findViewById(R.id.genRGrp);

        Button signUpButton = findViewById(R.id.signUpBtn);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = usernameEditText.getText().toString().trim();
                String pass = passwordEditText.getText().toString();
                String email = emailEditText.getText().toString().trim();

                // Check if any field is empty
                if (name.isEmpty() || email.isEmpty() || pass.isEmpty())
                {

                    Toast.makeText(MainActivity.this,"Please fill in all details", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Intent intent = new Intent(MainActivity.this, home.class);
                    startActivity(intent);
                }


            }
        });

        //for exit button
        Button exitButton = findViewById(R.id.exitBtn);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //close the app
                finish();
            }
        });
    }
}