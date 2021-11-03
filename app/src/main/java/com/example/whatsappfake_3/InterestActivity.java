package com.example.whatsappfake_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class InterestActivity extends AppCompatActivity {

    private CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8;
    private Button finishBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);

        init();

        finishBtn = (Button)findViewById(R.id.finishBtn);
        finishBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String sendData = checkBoxToast();
                    openHomeActivity(sendData);
                }
            });


    }

    private void openHomeActivity(String receiveData){
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("category", receiveData);
        startActivity(intent);
    }

    private String checkBoxToast(){
        StringBuffer result = new StringBuffer();
        result.append("Data: \n");
        if (cb1.isChecked()) {
            result.append(cb1.getText().toString()).append("\n");
        }
        if (cb2.isChecked()) {
            result.append(cb2.getText().toString()).append("\n");
        }
        if (cb3.isChecked()) {
            result.append(cb3.getText().toString()).append("\n");
        }
        if (cb4.isChecked()) {
            result.append(cb4.getText().toString()).append("\n");
        }
        if (cb5.isChecked()) {
            result.append(cb5.getText().toString()).append("\n");
        }
        if (cb6.isChecked()) {
            result.append(cb6.getText().toString()).append("\n");
        }
        if (cb7.isChecked()) {
            result.append(cb7.getText().toString()).append("\n");
        }
        if (cb8.isChecked()) {
            result.append(cb8.getText().toString()).append("\n");
        }

        Toast.makeText(InterestActivity.this,
                result.toString(),
                Toast.LENGTH_LONG).show();

        return result.toString();
    }

    private void init(){
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);
        cb6 = findViewById(R.id.cb6);
        cb7 = findViewById(R.id.cb7);
        cb8 = findViewById(R.id.cb8);
    }
}