package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //initialize the score variable
    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    int score4 = 0;
    int score5 = 0;
    int score6 = 0;
    int score7 = 0;
    int score8 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find question 1 options RadioButton
        RadioButton OptionOneARadioButton = findViewById(R.id.order_of_significance_button);
        RadioButton OptionOneBRadioButton = findViewById(R.id.operating_system_button);
        RadioButton OptionOneCRadioButton = findViewById(R.id.open_software_button);
        // question two options RadioButton
        RadioButton OptionTwoARadioButton = findViewById(R.id.lead_button);
        RadioButton OptionTwoBRadioButton = findViewById(R.id.silicon_button);
        RadioButton OptionTwoCRadioButton = findViewById(R.id.chromium_button);
        // Find question three options RadioButton
        RadioButton OptionThreeARadioButton = findViewById(R.id.wap_area_network_button);
        RadioButton OptionThreeBRadioButton = findViewById(R.id.wireless_area_network_button);
        RadioButton OptionThreeCRadioButton = findViewById(R.id.wide_area_network_button);
        //Find question four options RadioButton
        RadioButton OptionFourARadioButton = findViewById(R.id.temporary_button);
        RadioButton OptionFourBRadioButton = findViewById(R.id.permanent_button);
        RadioButton OptionFourCRadioButton = findViewById(R.id.volatile_button);
        // Find question five options RadioButton
        RadioButton OptionFiveARadioButton = findViewById(R.id.monitor_button);
        RadioButton OptionFiveBRadioButton = findViewById(R.id.keyboard_button);
        RadioButton OptionFiveCRadioButton = findViewById(R.id.cpu_button);
        // Find question 6 options RadioButton
        RadioButton OptionSixARadioButton = findViewById(R.id.static_button);
        RadioButton OptionSixBRadioButton = findViewById(R.id.logical_button);
        RadioButton OptionSixCRadioButton = findViewById(R.id.dynamic_button);
        // Find question 7 options RadioButton
        RadioButton OptionSevenARadioButton = findViewById(R.id.digital_computer_button);
        RadioButton OptionSevenBRadioButton = findViewById(R.id.super_computer_button);
        RadioButton OptionSevenCRadioButton = findViewById(R.id.mini_computer_button);
        // Find question 8 options RadioButton
        RadioButton OptionEightARadioButton = findViewById(R.id.option8A_button);
        RadioButton OptionEightBRadioButton = findViewById(R.id.option8B_button);
        RadioButton OptionEightCRadioButton = findViewById(R.id.option8C_button);

        RadioGroup radioGroup1 = findViewById(R.id.radiogroup1);
        RadioGroup radioGroup2 = findViewById(R.id.radiogroup2);
        RadioGroup radioGroup3 = findViewById(R.id.radiogroup3);
        RadioGroup radioGroup4 = findViewById(R.id.radiogroup4);
        RadioGroup radioGroup5 = findViewById(R.id.radiogroup5);
        RadioGroup radioGroup6 = findViewById(R.id.radiogroup6);
        RadioGroup radioGroup7 = findViewById(R.id.radiogroup7);
        RadioGroup radioGroup8 = findViewById(R.id.radiogroup8);
        // Register the onClick listener with the implementation
        OptionOneARadioButton.setOnClickListener(this);
        OptionOneBRadioButton.setOnClickListener(this);
        OptionOneCRadioButton.setOnClickListener(this);
        OptionTwoARadioButton.setOnClickListener(this);
        OptionTwoBRadioButton.setOnClickListener(this);
        OptionTwoCRadioButton.setOnClickListener(this);
        OptionThreeARadioButton.setOnClickListener(this);
        OptionThreeBRadioButton.setOnClickListener(this);
        OptionThreeCRadioButton.setOnClickListener(this);
        OptionFourARadioButton.setOnClickListener(this);
        OptionFourBRadioButton.setOnClickListener(this);
        OptionFourCRadioButton.setOnClickListener(this);
        OptionFiveARadioButton.setOnClickListener(this);
        OptionFiveBRadioButton.setOnClickListener(this);
        OptionFiveCRadioButton.setOnClickListener(this);
        OptionSixARadioButton.setOnClickListener(this);
        OptionSixBRadioButton.setOnClickListener(this);
        OptionSixCRadioButton.setOnClickListener(this);
        OptionSevenARadioButton.setOnClickListener(this);
        OptionSevenBRadioButton.setOnClickListener(this);
        OptionSevenCRadioButton.setOnClickListener(this);
        OptionEightARadioButton.setOnClickListener(this);
        OptionEightBRadioButton.setOnClickListener(this);
        OptionEightCRadioButton.setOnClickListener(this);
        radioGroup1.setOnClickListener(this);
        radioGroup2.setOnClickListener(this);
        radioGroup3.setOnClickListener(this);
        radioGroup4.setOnClickListener(this);
        radioGroup5.setOnClickListener(this);
        radioGroup6.setOnClickListener(this);
        radioGroup7.setOnClickListener(this);
        radioGroup8.setOnClickListener(this);


    }

    /**
     * implement the OnClickListener
     * @param view is the onClick view
     */
    @Override
    public void onClick(View view) {
        RadioGroup radioGroup1 = findViewById(R.id.radiogroup1);
        RadioGroup radioGroup2 = findViewById(R.id.radiogroup2);
        RadioGroup radioGroup3 = findViewById(R.id.radiogroup3);
        RadioGroup radioGroup4 = findViewById(R.id.radiogroup4);
        RadioGroup radioGroup5 = findViewById(R.id.radiogroup5);
        RadioGroup radioGroup6 = findViewById(R.id.radiogroup6);
        RadioGroup radioGroup7 = findViewById(R.id.radiogroup7);
        RadioGroup radioGroup8 = findViewById(R.id.radiogroup8);

        // creat a boolean variable checked
        boolean checked = ((RadioButton)view).isChecked();

        switch (view.getId() /*to get clicked view id**/) {
            case R.id.order_of_significance_button:
                if (checked) {
                    // Update score
                    score1 = 0;
                    //display Toast
                    Toast.makeText(this, "go to question 2", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.operating_system_button:
                if (checked)  {
                    // Update score
                    score1 += 1;
                    //display Toast
                    Toast.makeText(this, "go to question 2", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.open_software_button:
                if (checked) {
                    // Update score
                    score1 = 0;
                    //display Toast
                    Toast.makeText(this, "go to question 2", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.lead_button:
                if (checked) {
                    // Update score
                    score2 = 0;
                    //display Toast
                    Toast.makeText(this, "go to question 3", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.silicon_button:
                if (checked) {
                    // Update score
                    score2 += 1;
                    //display Toast
                    Toast.makeText(this, "go to question 3", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.chromium_button:
                if (checked) {
                    // Update score
                    score2 = 0;
                    //display Toast
                    Toast.makeText(this, "go to question 3", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.wap_area_network_button:
                if (checked) {
                    // Update score
                    score3 = 0;
                    //display Toast
                    Toast.makeText(this, "go to question 4", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.wireless_area_network_button:
                if (checked) {
                    // Update score
                    score3 = 0;
                    //display Toast
                    Toast.makeText(this, "go to question 4", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.wide_area_network_button:
                if (checked) {
                    // Update score
                    score3 += 1;
                    //display Toast
                    Toast.makeText(this, "go to question 4", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.temporary_button:
                if (checked) {
                    // Update score
                    score4 += 1;
                    //display Toast
                    Toast.makeText(this, "go to question 5", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.permanent_button:
                if (checked) {
                    // Update score
                    score4 = 0;
                    //display Toast
                    Toast.makeText(this, "go to question 5", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.volatile_button:
                if (checked) {
                    // Update score
                    score4 = 0;
                    //display Toast
                    Toast.makeText(this, "go to question 5", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.monitor_button:
                if (checked) {
                    // Update score
                    score5 = 0;
                    //display Toast
                    Toast.makeText(this, "go to question 6", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.keyboard_button:
                if (checked) {
                    // Update score
                    score5 = 0;
                    //display Toast
                    Toast.makeText(this, "go to question 6", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.cpu_button:
                if (checked) {
                    // Update score
                    score5 += 1;
                    //display Toast
                    Toast.makeText(this, "go to question 6", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.static_button:
                if (checked) {
                    // Update score
                    score6 = 0;
                    //display Toast
                    Toast.makeText(this, "go to question 7", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.logical_button:
                if (checked) {
                    // Update score
                    score6 += 1;
                    //display Toast
                    Toast.makeText(this, "go to question 7", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.dynamic_button:
                if (checked) {
                    // Update score
                    score6 = 0;
                    //display Toast
                    Toast.makeText(this, "go to question 7", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.digital_computer_button:
                if (checked) {
                    // Update score
                    score7 += 1;
                    //display Toast
                    Toast.makeText(this, "go to question 8", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.super_computer_button:
                if (checked) {
                    // Update score
                    score7 = 0;
                    //display Toast
                    Toast.makeText(this, "go to question 8", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.mini_computer_button:
                if (checked) {
                    // Update score
                    score7 = 0;
                    //display Toast
                    Toast.makeText(this, "go to question 8 ", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.option8A_button:
                if (checked) {
                    // Update score
                    score8 = 0;
                    //display Toast
                    Toast.makeText(this, "Click on the Submit button to complete test ", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.option8B_button:
                if (checked) {
                    // Update score
                    score8 += 1;
                    //display Toast
                    Toast.makeText(this, "Click on the Submit button to complete test ", Toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.option8C_button:
                if (checked) {
                    // Update score
                    score8 += 0;
                    //display Toast
                    Toast.makeText(this, "Click on the Submit button to complete test ", Toast.LENGTH_SHORT).show();
                    break;

                }

        }
    }

    /**
     * This method is called when the button is clicked
     *
     */

    public void submitOrder (View view) {
        int finalScore = 0;

        // find radiogroup id
        RadioGroup radioGroup1 = findViewById(R.id.radiogroup1);
        RadioGroup radioGroup2 = findViewById(R.id.radiogroup2);
        RadioGroup radioGroup3 = findViewById(R.id.radiogroup3);
        RadioGroup radioGroup4 = findViewById(R.id.radiogroup4);
        RadioGroup radioGroup5 = findViewById(R.id.radiogroup5);
        RadioGroup radioGroup6 = findViewById(R.id.radiogroup6);
        RadioGroup radioGroup7 = findViewById(R.id.radiogroup7);
        RadioGroup radioGroup8 = findViewById(R.id.radiogroup8);


        // call the Recheck method
        String crosscheck = Recheck();

        finalScore = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8;

        //display Toast
        Toast.makeText(this, "Congratulations!! Your Total Score is " + finalScore + "/8" + "\nCrosscheck the following: " + crosscheck , Toast.LENGTH_LONG).show();
        // clear radioGroup1 options
        radioGroup1.clearCheck();
        // clear radioGroup2 options
        radioGroup2.clearCheck();
        // clear radioGroup3 options
        radioGroup3.clearCheck();
        // clear radioGroup4 options
        radioGroup4.clearCheck();
        // clear radioGroup5 options
        radioGroup5.clearCheck();
        // clear radioGroup6 options
        radioGroup6.clearCheck();
        // clear radioGroup7 options
        radioGroup7.clearCheck();
        // clear radioGroup8 options
        radioGroup8.clearCheck();


        // reset score1
        score1=0;
        // reset score2
        score2 = 0;
        // reset score3
        score3 = 0;
        // reset score4
        score4 =0;
        // reset score5
        score5 = 0;
        // reset score6
        score6 = 0;
        // reset score7
        score7 = 0;
        // reset score8
        score8 = 0;




    }

    /**
     * This method compiles the wrong answers
     * @return it returns the wrong answers
     */
    private String Recheck(){
         String recheck = "Question : ";
         // check if score1 is zero
        if (score1  == 0) {
            recheck += "1, ";
        }
        // check if score2 is zero
        if (score2 == 0) {
            recheck +=  "2, ";
        }
        // check if score3 is zero
        if(score3 == 0) {
            recheck += "3, ";
        }
        // check if score4 is zero
        if (score4 == 0){
            recheck += "4, ";
        }
        // check if score5 is zero
        if (score5 == 0) {
            recheck += "5, ";
        }
        // check if score6 is zero
        if (score6 == 0) {
                recheck += "6,";
        }
        // check if score7 is zero
        if (score7 == 0) {
                recheck += "7, ";
        }
        // check if score8 is zero
        if (score8 == 0) {
            recheck += "8";
        }
        return recheck;
    }
}
