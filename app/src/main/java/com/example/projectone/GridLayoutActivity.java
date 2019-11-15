package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GridLayoutActivity extends AppCompatActivity {
    Button btn0, btn1,btn2, btn3, btn4, btn5, btn6, btn7,btn8,btn9,btnPlus,btnMinus,btnDivide,
            btnMultiply,btnEquals,btnC;

    TextView txtResult;
    Integer valueOne, valueTwo;
    boolean addition, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnEquals = findViewById(R.id.btnEquals);
        btnC = findViewById(R.id.btnC);
        txtResult =  findViewById( R.id.txtResult);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText()+"0");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtResult == null) {
                    txtResult.setText("");
                } else {
                    valueOne = Integer.parseInt(txtResult.getText() + "");
                    addition = true;
                    txtResult.setText(null);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtResult == null) {
                    txtResult.setText("");
                } else {
                    valueOne = Integer.parseInt(txtResult.getText() + "");
                    subtract = true;
                    txtResult.setText(null);
                }
            }
        });


        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtResult == null) {
                    txtResult.setText("");
                } else {
                    valueOne = Integer.parseInt(txtResult.getText() + "");
                    multiply = true;
                    txtResult.setText(null);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtResult == null) {
                    txtResult.setText("");
                } else {
                    valueOne = Integer.parseInt(txtResult.getText() + "");
                    divide = true;
                    txtResult.setText(null);
                }
            }
        });

       //setting result to default i.e. 0
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("");
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Integer.parseInt(txtResult.getText() + "");

                // performing arithematic operations

                if (addition == true) {
                    txtResult.setText(valueOne + valueTwo+ "");
                    addition = false;
                }

                if (subtract == true) {
                    txtResult.setText(valueOne - valueTwo + "");
                    subtract = false;
                }

                if (multiply == true) {
                    txtResult.setText(valueOne * valueTwo + "");
                    multiply = false;
                }

                if (divide == true) {
                    txtResult.setText(valueOne / valueTwo + "");
                    divide = false;
                }
            }
        });


    }
}
