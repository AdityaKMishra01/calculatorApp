package com.example.simplecalc;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView resultTv,solutionTv;
    MaterialButton buttonC,buttonBrackOpen,buttonBrackClose;
    MaterialButton buttonDivide,buttonMultiply,buttonPlus,buttonMinus,buttonEquals;
    MaterialButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    MaterialButton buttonAC,buttonDot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTv = findViewById(R.id.resultTV);
        solutionTv = findViewById(R.id.solTV);

        assignId(buttonC,R.id.btn_c);
        assignId(buttonBrackOpen,R.id.btn_opnBrc);
        assignId(buttonBrackClose,R.id.btn_closeBrc);
        assignId(buttonDivide,R.id.btn_divide);
        assignId(buttonMultiply,R.id.btn_multiply);
        assignId(buttonPlus,R.id.btn_add);
        assignId(buttonMinus,R.id.btn_minus);
        assignId(buttonEquals,R.id.btn_equal);
        assignId(button0,R.id.btn_0);
        assignId(button1,R.id.btn_1);
        assignId(button2,R.id.btn_2);
        assignId(button3,R.id.btn_3);
        assignId(button4,R.id.btn_4);
        assignId(button5,R.id.btn_5);
        assignId(button6,R.id.btn_6);
        assignId(button7,R.id.btn_7);
        assignId(button8,R.id.btn_8);
        assignId(button9,R.id.btn_9);
        assignId(buttonAC,R.id.btn_ac);
        assignId(buttonDot,R.id.btn_dot);





    }

    void assignId(MaterialButton btn,int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        MaterialButton button =(MaterialButton) view;
        String buttonText = button.getText().toString();
        String dataToCalculate = solutionTv.getText().toString();

        if(buttonText.equals("AC")){
            solutionTv.setText("");
            resultTv.setText("0");
            return;
        }
        if(buttonText.equals("=")){
            solutionTv.setText(resultTv.getText());
            return;
        }
        if(buttonText.equals("C")){
            dataToCalculate = dataToCalculate.substring(0,dataToCalculate.length()-1);
        }else{
            dataToCalculate = dataToCalculate+buttonText;
        }
        solutionTv.setText(dataToCalculate);

//        String finalResult = getResult(dataToCalculate);

        if(!finalResult.equals("Err")){
            resultTv.setText(finalResult);
        }

    }


}