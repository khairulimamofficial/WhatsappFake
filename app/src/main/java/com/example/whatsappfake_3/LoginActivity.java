package com.example.whatsappfake_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    String[][] account = {{"admin", "admin"}, {"admin2", "admin2"}};
    private Button loginButton;
    private EditText usernameEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);

        loginButton = (Button)findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputUsername = usernameEditText.getText().toString();
                String inputPassword = usernameEditText.getText().toString();

                for (int i=0; i<account.length; i++){
                    if (inputUsername.equals(account[i][0]) && inputPassword.equals(account[i][1])){
                        openActivity();
                        break;
                    }
                    else {
                        Toast.makeText(LoginActivity.this,
                                "Tidak Valid",
                                Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
    }

    public void openActivity(){
        Intent intent = new Intent(this, InterestActivity.class);
        startActivity(intent);
    }

}