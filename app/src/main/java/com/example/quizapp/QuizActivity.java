package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {
    private Button submitButton;
    private int score = 0;
    private RadioGroup numOneRadioGroup, numTwoRadioGroup;
    private EditText editText;
    private CheckBox nit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        submitButton=findViewById(R.id.submit_button);
        nit= findViewById(R.id.nit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int firstAnswerId = numOneRadioGroup.getCheckedRadioButtonId();
                if(firstAnswerId == R.id.Antoine) {
                    score++;
                }

                int secondAnswerId = numTwoRadioGroup.getCheckedRadioButtonId();
                if(secondAnswerId == R.id.rbDmitriMendeleev) {
//                if (nit.isChecked()){
                    score += 1;
//                }
                }


                Intent intent= new Intent(QuizActivity.this, ScoreActivity.class);
                intent.putExtra("Score", score);
                startActivity(intent);
            }


        });

        numOneRadioGroup= findViewById(R.id.num_one_radio_group);
        numTwoRadioGroup= findViewById(R.id.num_two_radio_group);
        numOneRadioGroup.clearCheck();
        numTwoRadioGroup.clearCheck();
//        numOneRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (checkedId== R.id.Antoine)
//                    score +=1;
//
//            }
//        });

    }
}
