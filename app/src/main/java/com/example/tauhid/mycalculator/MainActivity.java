package com.example.tauhid.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    EditText etxNumber1,etxNumber2;
    Button btnPlus,btnMinus,btnMulti,btnDiv,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link to java obj to xml
        txtResult=findViewById(R.id.txt_result);
        etxNumber1=findViewById(R.id.etxt_number1);
        etxNumber2=findViewById(R.id.etxt_number2);

        btnPlus=findViewById(R.id.btn_plus);
        btnMinus=findViewById(R.id.btn_minus);
        btnMulti=findViewById(R.id.btn_multi);
        btnDiv=findViewById(R.id.btn_div);
        btnClear=findViewById(R.id.btn_clear);


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etxNumber1.getText().toString();
                String number2=etxNumber2.getText().toString();
                if(!number1.isEmpty() && !number2.isEmpty())
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);
                    double result=value1+value2;
                    txtResult.setText(""+result);
                }
               else{

                    Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();


                }
            }
        });




        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etxNumber1.getText().toString();
                String number2=etxNumber2.getText().toString();
                if(!number1.isEmpty() && !number2.isEmpty())
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);
                    double result=value1-value2;
                    txtResult.setText(""+result);
                }
                else{

                    Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();


                }
            }
        });



        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etxNumber1.getText().toString();
                String number2=etxNumber2.getText().toString();
                if(!number1.isEmpty() && !number2.isEmpty())
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);
                    double result=value1*value2;
                    txtResult.setText(""+result);
                }
                else{

                    Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();


                }
            }
        });



        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etxNumber1.getText().toString();
                String number2=etxNumber2.getText().toString();
                if(!number1.isEmpty() && !number2.isEmpty())
                {
                    double value1=Double.parseDouble(number1);
                    double value2=Double.parseDouble(number2);
                    double result=value1/value2;
                    txtResult.setText(""+result);
                }
                else{

                    Toast.makeText(MainActivity.this, "Please enter number", Toast.LENGTH_SHORT).show();


                }
            }
        });


        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("0");
                etxNumber1.setText("");
                etxNumber2.setText("");
                }

        });





    }
}
