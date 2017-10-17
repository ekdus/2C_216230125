package com.example.a2c_216230125_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Main3Activity extends AppCompatActivity {
    EditText e1, e2, e3;
    Button btn;
    CheckBox checkBox;
    TextView text1,text2;
    int STAKE = 49000, PASTA = 21000, SALAD = 19000;
    double DISCOUNT = 0.9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("order");

        init();

    }


    void init() {
        e1 = (EditText) findViewById(R.id.h3_edit);
        e2 = (EditText) findViewById(R.id.h3_edit2);
        e3 = (EditText) findViewById(R.id.h3_edit3);

        btn = (Button) findViewById(R.id.h3_btn);

        checkBox = (CheckBox) findViewById(R.id.checkBox);

        text1 = (TextView) findViewById(R.id.h3_text);
        text2 = (TextView) findViewById(R.id.h3_text2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int t1 = Integer.parseInt(e1.getText().toString());
                int t2 = Integer.parseInt(e2.getText().toString());
                int t3 = Integer.parseInt(e3.getText().toString());

                int result1 = t1 + t2 + t3;
                int result2 = t1 * STAKE + t2 * PASTA + t3 * SALAD;

                Toast.makeText(getApplicationContext(),"감사합니다. 주문이 완료되었습니다.",Toast.LENGTH_SHORT).show();


                if (checkBox.isChecked()) {
                    result2 = (int) (result2 * DISCOUNT);
                }

                text1.setText(result1+"");
                text2.setText(result2+"won");
            }
        });
    }
}

