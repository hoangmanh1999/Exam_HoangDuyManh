package com.example.hoangduymanh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
 EditText edUsername;
 EditText edEmail;
 EditText edPhone;
 RadioGroup grGender;
 RadioButton Male;
 RadioButton Female;
 Button btnAdd;
 Button btnSearch;
 AppDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = AppDatabase.getAppDatabase(this);
        edUsername = findViewById(R.id.edUsername);
        edEmail = findViewById(R.id.edEmail);
        edPhone = findViewById(R.id.edPhone);
        btnAdd = findViewById(R.id.btnAdd);
        btnSearch = findViewById(R.id.btnSearch);
        grGender = findViewById(R.id.grGender);
        Male = findViewById(R.id.Male);
        Female = findViewById(R.id.Female);
        btnAdd.setOnClickListener(this);
        btnSearch.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v == btnAdd) {
            onRegister();
        }
        else if(v== btnSearch){
            goSearch();
        }
        else{
            return;
        }
    }

    private void onRegister() {
        if (edUsername.getText().toString().isEmpty()) {
            Toast.makeText(this,"Please enter Customer Name", Toast.LENGTH_LONG).show();
            return;
        } else if (edEmail.getText().toString().isEmpty()) {
            Toast.makeText(this,"Please enter Email Address", Toast.LENGTH_LONG).show();
            return;
        } else if (edPhone.getText().toString().isEmpty()) {
            Toast.makeText(this,"Please enter Phone Number", Toast.LENGTH_LONG).show();
            return;
        } else if (grGender.getCheckedRadioButtonId() == -1){
            Toast.makeText(this,"Please select Gender", Toast.LENGTH_LONG).show();
            return;
        }
        else {
            insert();
        }
    }

    private void insert() {
        Customer c=new Customer();
        c.Name=edUsername.getText().toString();
        c.Email=edEmail.getText().toString();
        c.Phone=edPhone.getText().toString();
        c.Gender=grGender.getCheckedRadioButtonId();
        db.dao().insert(c);
    }

    private void goSearch(){
        Intent intent = new Intent(this,SearchActivity.class);
        startActivity(intent);
    }
}