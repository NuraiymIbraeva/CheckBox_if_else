package com.nurayim.checkbox_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Получаем флажок
        checkBox1 = findViewById(R.id.ch1);
        checkBox2 = findViewById(R.id.ch2);
        checkBox3 = findViewById(R.id.ch3);
        checkBox4 = findViewById(R.id.ch4);
        checkBox5 = findViewById(R.id.ch5);
        textView = findViewById(R.id.selection);
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Получаем,отмечен ли данный  флажок
                if (checkBox1.isChecked()) {
                    textView.setText("Сделано");
                } else {
                    textView.setText("Не сделано");
                }

            }
        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox2.isChecked()) {
                    textView.setText("Сделано");
                } else {
                    textView.setText("Не сделано");
                }
            }
        });
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox3.isChecked()) {
                    textView.setText("Сделано");

                } else {
                    textView.setText("Не сделано");
                }
            }
        });
        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox4.isChecked()) {
                    textView.setText("Сделано");
                } else {
                    textView.setText("Не сделано");
                }
            }
        });

        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox5.isChecked()) {
                    textView.setText("Сделано");
                } else {
                    textView.setText("Не сделано");
                }
            }
        });
    }



} // CheckBox checkBox = (CheckBox) view;
// (View view)  сверху он имеет ввиду вот эту вьюшку то есть (CheckBox)
//первая вьюшка это и есть View что это общая вьюшка вторая вьюшка это именно
//CheckBox