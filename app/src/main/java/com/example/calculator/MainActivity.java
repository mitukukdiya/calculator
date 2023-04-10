package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button one, two, three, four, five, six, seven, eight, nine, d_zero, zero, plus, mines, multipal, divide, point, equal, ac;
    TextView number;

    int first_number,second_number;

    char ope;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //number
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        d_zero = findViewById(R.id.d_zero);
        zero = findViewById(R.id.zero);
        equal = findViewById(R.id.equal);
        plus = findViewById(R.id.plus);
        mines = findViewById(R.id.mines);
        multipal = findViewById(R.id.multipal);
        divide = findViewById(R.id.divide);
        point = findViewById(R.id.point);
        ac = findViewById(R.id.ac);
        number = findViewById(R.id.number);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object string = null;
                String num = number.getText().toString();
                number.setText(num + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object string = null;
                String num = number.getText().toString();
                number.setText(num + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object string = null;
                String num = number.getText().toString();
                number.setText(num + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object string = null;
                String num = number.getText().toString();
                number.setText(num + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object string = null;
                String num = number.getText().toString();
                number.setText(num + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object string = null;
                String num = number.getText().toString();
                number.setText(num + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object string = null;
                String num = number.getText().toString();
                number.setText(num + "7");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object string = null;
                String num = number.getText().toString();
                number.setText(num + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object string = null;
                String num = number.getText().toString();
                number.setText(num + "9");
            }
        });
        d_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object string = null;
                String num = number.getText().toString();
                number.setText(num + "00");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object string = null;
                String num = number.getText().toString();
                number.setText(num + "0");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object string = null;
                String num = number.getText().toString();
                number.setText(num + ".");

            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_number = Integer.parseInt(number.getText().toString());
                number.setText("");
                ope = '+';
            }
        });

        mines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_number = Integer.parseInt(number.getText().toString());
                number.setText("");
                ope = '-';
            }
        });

        multipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_number = Integer.parseInt(number.getText().toString());
                number.setText("");
                ope = '*';
            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_number = Integer.parseInt(number.getText().toString());
                number.setText("");
                ope = '/';

            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                if (ope == '+') {
                    second_number = Integer.parseInt(number.getText().toString());
                    addition1();
                } else if (ope == '-') {

                    second_number = Integer.parseInt(number.getText().toString());
                    additional2();

                }
                if (ope == '*') {
                    second_number = Integer.parseInt(number.getText().toString());
                    addition3();
                } else if (ope == '/') {
                    second_number = Integer.parseInt(number.getText().toString());
                    addition4();
                }



            }
        });
    }

    void addition4() {
        int total = first_number / second_number;
        number.setText("" + total);

    }

    void addition3() {
        int total = first_number * second_number;
        number.setText("" + total);
    }

    void addition1(){
        int total = first_number+second_number;
        number.setText(" "+total);

    }
    void additional2 (){
        int total = first_number-second_number;
        number.setText(" "+total);
    }

}

