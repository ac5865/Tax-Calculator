package com.example.taxcalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txt_tax_amount, txt_total_amount;
EditText txt_amount, txt_tax_percent;
Button btn_calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_amount=findViewById(R.id.txt_amount);
        txt_tax_amount=findViewById(R.id.txt_tax_amount);
        txt_tax_percent=findViewById(R.id.txt_tax_percent);
        txt_total_amount=findViewById(R.id.txt_total_amount);
        btn_calculate=findViewById(R.id.btn_calculate);

        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float total=Float.parseFloat(txt_amount.getText().toString());
                float tax_percent=Float.parseFloat(txt_tax_percent.getText().toString());
                float tax_amount=(tax_percent/100)*total;
                txt_tax_amount.setText("Tax Amount is "+tax_amount);

                float total_amount=total+tax_amount;
                txt_total_amount.setText("Net Total Amount "+total_amount);
            }
        });



    }
}