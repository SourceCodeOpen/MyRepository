package com.example.callphone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_re = findViewById(R.id.button);
        EditText t_Id = findViewById(R.id.idEditText);
        EditText viewById = findViewById(R.id.editTextTextPassword);
        RadioButton radioButton = (RadioButton) findViewById(R.id.radioPro);
        btn_re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButton.isChecked())
                Toast.makeText(MainActivity.this,"id:"+t_Id.getText().toString()+'\n'+"password:"+viewById.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}