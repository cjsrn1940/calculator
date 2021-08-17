package com.javaex.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //필드
    private TextView result;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnDiv;

    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnMulti;

    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnMinus;

    private Button btnZero;
    private Button btnPlus;
    private Button btnCE;
    private Button btnEq;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {
            String str = "";

            @Override
            public void onClick(View view) {

                Log.d("javaStudy", "클릭이벤트 작동");

                switch(view.getId()) {
                    case R.id.btnNine:
                        Log.d("javaStudy", "9 클릭");
                        str += btnNine.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnEight:
                        Log.d("javaStudy", "8 클릭");
                        str += btnEight.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnSeven:
                        Log.d("javaStudy", "7 클릭");
                        str += btnSeven.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnSix:
                        Log.d("javaStudy", "6 클릭");
                        str += btnSix.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnFive:
                        Log.d("javaStudy", "5 클릭");
                        str += btnFive.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnFour:
                        Log.d("javaStudy", "4 클릭");
                        str += btnFour.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnThree:
                        Log.d("javaStudy", "3 클릭");
                        str += btnThree.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnTwo:
                        Log.d("javaStudy", "2 클릭");
                        str += btnTwo.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnOne:
                        Log.d("javaStudy", "1 클릭");
                        str += btnOne.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnZero:
                        Log.d("javaStudy", "0 클릭");
                        str += btnZero.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnDiv:
                        Log.d("javaStudy", "/ 클릭");
                        str += btnDiv.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnMulti:
                        Log.d("javaStudy", "* 클릭");
                        str += btnMulti.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnMinus:
                        Log.d("javaStudy", "- 클릭");
                        str += btnMinus.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnPlus:
                        Log.d("javaStudy", "+ 클릭");
                        str += btnPlus.getText().toString();
                        result.setText(str);
                        break;

                    case R.id.btnCE:
                        Log.d("javaStudy", "CE 클릭");
                        str = "";
                        result.setText(str);
                        break;

                    case R.id.btnEq:
                        Log.d("javaStudy", "= 클릭");
                        int calculation=0;

                        if(str.contains("+")) {
                            String[] num = str.split("\\+");
                            calculation = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
                        } else if(str.contains("-")) {
                            String[] num = str.split("-");
                            calculation = Integer.parseInt(num[0]) - Integer.parseInt(num[1]);
                        } else if(str.contains("*")) {
                            String[] num = str.split("\\*");
                            calculation = Integer.parseInt(num[0]) * Integer.parseInt(num[1]);
                        } else if(str.contains("/")) {
                            String[] num = str.split("/");
                            calculation = Integer.parseInt(num[0]) / Integer.parseInt(num[1]);
                        }

                        str += btnEq.getText().toString()+calculation;
                        result.setText(str);
                        break;

                }






            }
        };

        result = (TextView) findViewById(R.id.result);

        btnNine = (Button)findViewById(R.id.btnNine);
        btnNine.setOnClickListener(listener);

        btnEight = (Button)findViewById(R.id.btnEight);
        btnEight.setOnClickListener(listener);

        btnSeven = (Button)findViewById(R.id.btnSeven);
        btnSeven.setOnClickListener(listener);

        btnSix = (Button)findViewById(R.id.btnSix);
        btnSix.setOnClickListener(listener);

        btnFive = (Button)findViewById(R.id.btnFive);
        btnFive.setOnClickListener(listener);

        btnFour = (Button)findViewById(R.id.btnFour);
        btnFour.setOnClickListener(listener);

        btnThree = (Button)findViewById(R.id.btnThree);
        btnThree.setOnClickListener(listener);

        btnTwo = (Button)findViewById(R.id.btnTwo);
        btnTwo.setOnClickListener(listener);

        btnOne = (Button)findViewById(R.id.btnOne);
        btnOne.setOnClickListener(listener);

        btnZero = (Button)findViewById(R.id.btnZero);
        btnZero.setOnClickListener(listener);

        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(listener);

        btnMulti = (Button)findViewById(R.id.btnMulti);
        btnMulti.setOnClickListener(listener);

        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(listener);

        btnPlus = (Button)findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(listener);

        btnCE = (Button)findViewById(R.id.btnCE);
        btnCE.setOnClickListener(listener);

        btnEq = (Button)findViewById(R.id.btnEq);
        btnEq.setOnClickListener(listener);
    }
}