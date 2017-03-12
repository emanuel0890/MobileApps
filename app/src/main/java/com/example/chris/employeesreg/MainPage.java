package com.example.chris.employeesreg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {
    Button button = (Button) findViewById(R.id.addnewemployee);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Do something in response to button click
            }
        });
    }

    public void addNewEmployee(View view) {
        // Do something in response to button click
    }
}
