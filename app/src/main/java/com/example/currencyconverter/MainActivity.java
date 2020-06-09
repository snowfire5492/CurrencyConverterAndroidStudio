package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

        DecimalFormat df = new DecimalFormat("#.##");

        EditText currencyInput = (EditText) findViewById(R.id.editTextNumberDecimal);

        double usd = Double.parseDouble(currencyInput.getText().toString());

        double pounds = usd / 1.3;

        Toast.makeText(this, "£" + df.format(pounds), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}