package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mytext = findViewById(R.id.textview);
        EditText myedit = findViewById(R.id.edittext);
        Button mybutton = findViewById(R.id.mybutton);


        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edittext = myedit.getText().toString();
                mytext.setText("Your edit text has:" + edittext);
            }
        });

        CheckBox checkBox = findViewById(R.id.checkbox);
        Switch myswitch = findViewById(R.id.myswitch);
        RadioButton radio = findViewById(R.id.radio);

        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            myswitch.setChecked(isChecked);
            radio.setChecked(isChecked);
        });
        myswitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            checkBox.setChecked(isChecked);
            radio.setChecked(isChecked);
        });
        radio.setOnCheckedChangeListener((buttonView, isChecked) -> {
            myswitch.setChecked(isChecked);
            checkBox.setChecked(isChecked);
        });

    }
}