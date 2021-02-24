package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.loginkitkat.DisplayMessageActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
        // Button btnLogin = findViewById(R.id.btnLogin);
        // edtName.setText("Hello Dennis");
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText edtName = findViewById(R.id.edtName);
        String message = edtName.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}